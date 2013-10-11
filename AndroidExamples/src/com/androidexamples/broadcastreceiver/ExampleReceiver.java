package com.androidexamples.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ExampleReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		String msg = "Broadcast Intent Detected! Your input was: ";
		String payload = arg1.getExtras().getString("payload");
		msg += payload.equals("") ? "Not Entered" : payload;
		Toast.makeText(arg0, msg, Toast.LENGTH_LONG).show();		
	}

}
