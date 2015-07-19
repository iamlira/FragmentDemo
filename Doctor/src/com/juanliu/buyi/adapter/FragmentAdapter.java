package com.juanliu.buyi.adapter;

import com.juanliu.buyi.activity.MainActivity;
import com.juanliu.buyi.fragment.OrderFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FragmentAdapter extends FragmentStatePagerAdapter {
	public final static int TAB_COUNT=3;

	public FragmentAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int id) {
        switch (id) {
		case MainActivity.DOC_ORDER:
			OrderFragment orderfragment=new OrderFragment();
			return orderfragment;
		case MainActivity.DOC_PATIENT:
			OrderFragment orderfragment1=new OrderFragment();
			return orderfragment1;
		case MainActivity.DOC_MY:
			OrderFragment orderfragment2=new OrderFragment();
			return orderfragment2;
		default:
			break;
		}
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return TAB_COUNT;
	}

}
