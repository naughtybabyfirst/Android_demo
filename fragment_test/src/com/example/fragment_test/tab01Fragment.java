package com.example.fragment_test;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tab01Fragment extends Fragment {

	private ListView listView;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.tab01, container, false);
		listView = (ListView) view.findViewById(R.id.id_lv_01);
		
		initList();
		return view;
	}


	private void initList() {
		// TODO Auto-generated method stub
		List<String> items = new ArrayList<String>();
		for (int i = 0; i < 2; i++) {
			if(i == 0){
				items.add("课程表");
			}else{
				items.add("考试");
			}
		}
	
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(),
			android.R.layout.simple_list_item_1, items);
		listView.setAdapter(adapter);
	}
	
}
