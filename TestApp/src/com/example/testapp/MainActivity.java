package com.example.testapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {

//	GridLayout gridLayout;
//	String[] chars =new String[]{
//			"7","8","9","/",
//			"4","5","6","*",
//			"1","2","3","-",
//			".","0","=","+"
//	};
	RadioGroup rg;
	TextView show;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_layout);//72
		rg=(RadioGroup)findViewById(R.id.rg);
		show=(TextView)findViewById(R.id.show);
		//rg.setOnCheckedChangeListener(listener);
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener(){
			@Override
			public void onCheckedChanged(RadioGroup group,int checkedId){
				String tip =checkedId==R.id.male?"你的性别是男人":"你的性别是女人";
				show.setText(tip);
			}
		});
		Button bn=(Button)findViewById(R.id.bn);
		bn.setOnClickListener(new MyClickListener());
		
//		gridLayout=(GridLayout)findViewById(R.id.root);
//		for(int i=0;i<chars.length;i++){
//			Button bn=new Button(this);
//			bn.setText(chars[i]);
//			bn.setTextSize(40);
//			GridLayout.Spec rowSpec= GridLayout.spec(i/4+2);
//			GridLayout.Spec columnSpec=GridLayout.spec(i%4);
//			GridLayout.LayoutParams params=new GridLayout.LayoutParams(rowSpec,columnSpec);
//			params.setGravity(Gravity.FILL);
//			gridLayout.addView(bn,params);
//		}
	}
    class MyClickListener implements View.OnClickListener{
    	@Override
    	public void onClick(View v)
    	{
    		TextView textView =(TextView)findViewById(R.id.showclick);
    		textView.setText("注册成功");
    	}
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
