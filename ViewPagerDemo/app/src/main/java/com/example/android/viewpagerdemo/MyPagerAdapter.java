package com.example.android.viewpagerdemo;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {

	private List<Fragment> fragments;
	private Context context;

	public MyPagerAdapter(FragmentManager fm, Context context) {
		super(fm);
		this.fragments = new ArrayList<Fragment>();
		this.context = context;
		fragments.add(new FragmentBlue());
		fragments.add(new FragmentGreen());
		fragments.add(new FragmentPink());
	}

	@Override
	public Fragment getItem(int position) {
		return fragments.get(position);
	}

	@Override
	public int getCount() {
		return fragments.size();
	}
}
