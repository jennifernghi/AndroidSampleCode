package com.example.android.viewpagerdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.support.v4.app.Fragment;

public class FragmentBlue extends Fragment implements FragmentLifecycle {

	private static final String TAG = FragmentBlue.class.getSimpleName();
	private Context context;

	public FragmentBlue(){

	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_blue, container, false);
		return view;
	}

	@Override
	public void onPauseFragment() {
		Log.i(TAG, "onPauseFragment()");
		//Toast.makeText(getContext(), "onPauseFragment():" + TAG, Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public void onResumeFragment() {
		Log.i(TAG, "onResumeFragment()");
		//Toast.makeText(getContext(), "onResumeFragment():" + TAG, Toast.LENGTH_SHORT).show();
	}


}
