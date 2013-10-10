package com.example.androidexamples;

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
	}

	@Override
	public void onClick(View arg0) {
		Log.i(TAG, "onClick");
		switch (arg0.getId()) {
		case R.id.brexample:
			Intent i = new Intent(this, com.example.broadcastreceiver.BroadcastReceiverActivity.class);
			startActivity(i);
		}
	}
}
