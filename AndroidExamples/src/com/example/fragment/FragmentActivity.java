package com.example.fragment;

import com.example.broadcastreceiverexample.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FragmentActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_example);
	}

}
