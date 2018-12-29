package com.example.quiz_contest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.main);
		Thread t=new Thread()
		{
			public void run()
			{
				try
				{
					Thread.sleep(3000);
					Intent intent=new Intent(getApplicationContext(), LoginScreen.class);
					startActivity(intent);
				}
				catch (Exception e) 
				{
					 e.printStackTrace();
				}
			}
		};
		t.start();
	}



}
