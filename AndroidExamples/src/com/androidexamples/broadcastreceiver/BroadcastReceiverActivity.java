package com.androidexamples.broadcastreceiver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.example.androidexamples.R;

public class BroadcastReceiverActivity extends Activity {
	public static String TAG = "BroadcastReceiverExample";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcastreceiver);        
        final EditText entry = (EditText) findViewById(R.id.entry);
        
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				String txt = entry.getText().toString();
				Intent intent = new Intent();
				intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
				intent.setAction("com.example.broadcastreceiver");
				intent.putExtra("payload", txt);
				sendBroadcast(intent);
				Log.i(TAG, "Broadcast Sent");
			}
        });
    }
}
