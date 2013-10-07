package com.example.broadcastreceiver;

import com.example.broadcastreceiverexample.R;
import com.example.broadcastreceiverexample.R.id;
import com.example.broadcastreceiverexample.R.layout;
import com.example.broadcastreceiverexample.R.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	public static String TAG = "BroadcastReceiverExample";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.broadcast_receiver_example);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        
        final EditText entry = (EditText) findViewById(R.id.entry);
        
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				
				String txt = entry.getText().toString();
				
				Intent intent = new Intent();
				intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
				intent.setAction("com.example.broadcastreceiverexample");
				intent.putExtra("payload", txt);
				sendBroadcast(intent);
				Log.i(TAG, "Broadcast Sent");
			}
        	
        });
        
        return true;
    }
    
}
