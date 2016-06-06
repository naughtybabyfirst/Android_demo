package com.example.fragment_test;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.LinearLayout;

public class MainActivity extends FragmentActivity implements OnClickListener {
	
	private LinearLayout mTab01;
	private LinearLayout mTab02;
	private LinearLayout mTab03;
	
	private FragmentPagerAdapter fragmentPagerAdapter;
	private ViewPager viewPager;
	private List<Fragment> mFragment;
		

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		initView();
		initEvent();
		setSelect(0);
	}


	private void initEvent() {
		mTab01.setOnClickListener(this);
		mTab02.setOnClickListener(this);
		mTab03.setOnClickListener(this);
		
	}


	private void initView() {
		
		viewPager= (ViewPager) findViewById(R.id.id_viewpager);
		
		mTab01=(LinearLayout) findViewById(R.id.id_tab01);
		mTab02=(LinearLayout) findViewById(R.id.id_tab02);
		mTab03=(LinearLayout) findViewById(R.id.id_tab03);
		
		mFragment=new ArrayList<Fragment>();
		Fragment m01 = new tab01Fragment();
		Fragment m02 = new tab02Fragment();
		Fragment m03 = new tab03Fragment();
		mFragment.add(m01);
		mFragment.add(m02);
		mFragment.add(m03);
		
		fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
			
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
		switch (v.getId()) {
		case R.id.id_tab01:
			setSelect(0);
			break;
		case R.id.id_tab02:
			setSelect(1);
			break;
		case R.id.id_tab03:
			setSelect(2);
			break;
		}
	}

	private void setSelect(int i) {
		viewPager.setCurrentItem(i);
	}

}
