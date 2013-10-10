package com.example.fragment;

import android.app.Activity;
import android.os.Bundle;

import com.example.androidexamples.R;

public class FragmentActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_example);
	}

}
