package com.androidexamples;

import com.androidexamples.broadcastreceiver.BroadcastReceiverActivity;
import com.androidexamples.fragment.FragmentActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LauncherActivity extends Activity implements OnClickListener {
	public static final String TAG = "@LauncherActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launcher);
		
		Button brExample = (Button) findViewById(R.id.brexample);
		brExample.setOnClickListener(this);
		
		Button frExample = (Button) findViewById(R.id.fragmentexample);
		frExample.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		Intent i = new Intent();
		
		switch (arg0.getId()) {

		case R.id.fragmentexample:
			i.setClass(this, FragmentActivity.class);
			Log.i(TAG, "Starting FragmentActivity");
			startActivity(i);
			break;
		
		case R.id.brexample:
			i.setClass(this, BroadcastReceiverActivity.class);
			Log.i(TAG, "Starting BroadcastReceiverActivity");
			startActivity(i);
			break;
		}
	}
}
