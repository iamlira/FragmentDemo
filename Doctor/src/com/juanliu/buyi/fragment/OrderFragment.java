package com.juanliu.buyi.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.doctor.R;

public class OrderFragment extends BaseFragment {
	private View mview;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mview=inflater.inflate(R.layout.fragment_doc_order, container,false);
		initView();
		return mview;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	private void initView() {
	}
}
