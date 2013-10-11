package com.androidexamples.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.androidexamples.R;

public class FragmentActivity extends Activity implements OnClickListener {
	public static final String TAG = "@FragmentDemo";
	Fragment frag1, frag2;
	int currentFrag;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment);		
		
		Button swap = (Button) findViewById(R.id.swap);
		swap.setOnClickListener(this);
		
		FragmentManager fm = getFragmentManager();
		frag1 = new Fragment1();
		frag2 = new Fragment2();		
		fm.beginTransaction().add(R.id.frag_parent, frag1).commit();
		currentFrag = 1;
	}

	@Override
	public void onClick(View arg0) {
		FragmentManager fm = getFragmentManager();
		if (currentFrag == 1) {
			fm.beginTransaction().remove(frag1).commit();
			currentFrag = 2;
			fm.beginTransaction().add(R.id.frag_parent, frag2).commit();
			Log.i(TAG, "Switching to 2");
		} else {
			fm.beginTransaction().remove(frag2).commit();
			currentFrag = 1;
			fm.beginTransaction().add(R.id.frag_parent, frag1).commit();
			Log.i(TAG, "Switching to 1");
		}		
	}
}
