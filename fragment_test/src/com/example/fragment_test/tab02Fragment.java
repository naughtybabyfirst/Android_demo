package com.example.fragment_test;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.LinearLayout;

public class tab02Fragment extends Fragment implements OnClickListener {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.tab02, container, false);
	}

	private LinearLayout mTab02tab1;
	private LinearLayout mTab02tab2;

	private FragmentPagerAdapter fragmentPagerAdapter;
	private ViewPager viewPager;
	private List<Fragment> mFragment;

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		initView();
		initEvent();
		setSelect(0);

	}

	private void initEvent() {
		// TODO Auto-generated method stub
		mTab02tab1.setOnClickListener(this);
		mTab02tab2.setOnClickListener(this);
	}

	private void initView() {
		// TODO Auto-generated method stub
		viewPager = (ViewPager) getView().findViewById(R.id.id_tab2_viewpager);

		mTab02tab1 = (LinearLayout) getView().findViewById(R.id.id_tab02_tab1);
		mTab02tab2 = (LinearLayout) getView().findViewById(R.id.id_tab02_tab2);

		mFragment = new ArrayList<Fragment>();
		Fragment mTab0201 = new tab02tab1Fragment();
		Fragment mTab0202 = new tab02tab2Fragment();
		mFragment.add(mTab0201);
		mFragment.add(mTab0202);

		fragmentPagerAdapter = new FragmentPagerAdapter(getChildFragmentManager()) {

			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return mFragment.size();
			}

			@Override
			public Fragment getItem(int arg0) {
				// TODO Auto-generated method stub
				return mFragment.get(arg0);
			}
		};

		viewPager.setAdapter(fragmentPagerAdapter);

		viewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.id_tab02_tab1:
			setSelect(0);
			break;
		case R.id.id_tab02_tab2:
			setSelect(1);
			break;
		}
	}

	private void setSelect(int i) {
		// TODO Auto-generated method stub
		viewPager.setCurrentItem(i);
	}

}
