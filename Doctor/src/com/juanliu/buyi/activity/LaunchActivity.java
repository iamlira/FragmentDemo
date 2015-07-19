package com.juanliu.buyi.activity;

import com.example.doctor.R;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;


/**
 * com.juanliu.buyi.activity.BaseActivity
 * 
 * @author Lei liu  <br/>
 */
public class LaunchActivity extends BaseActivity {
	@Override
	  protected void onCreate(Bundle savedInstanceState) {
	    // TODO Auto-generated method stub
	    super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setContentView(R.layout.launch_activity);
	    Runnable runnable=new Runnable(){
	      @Override
	      public void run() {
	                  Intent intent = new Intent(LaunchActivity.this, MainActivity.class);
	                  intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
	                  startActivity(intent);
	                  //startActivityForResult(intent, requestCode)带数据的跳转
	                  finish();
	          }
	      };
	    Handler handler = new Handler();
	    handler.postDelayed(runnable, 4500);
	  }

}
