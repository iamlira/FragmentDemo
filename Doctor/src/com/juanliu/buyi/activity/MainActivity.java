package com.juanliu.buyi.activity;

import com.example.doctor.R;
import com.juanliu.buyi.adapter.FragmentAdapter;
import com.juanliu.buyi.widget.CustomViewPager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.RadioButton;

public class MainActivity extends FragmentActivity implements OnClickListener {
	public final static int DOC_ORDER = 0;
	public final static int DOC_PATIENT = 1;
	public final static int DOC_MY = 2;

	private CustomViewPager mViewPager;
	private RadioButton rb_doc_order, rb_doc_patient, rb_doc_my;
	private FragmentAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		initView();
		addListener();
	}

	private void initView() {
		mViewPager = (CustomViewPager) findViewById(R.id.custom_viewpager);
		mViewPager.setOffscreenPageLimit(2);
		rb_doc_order = (RadioButton) findViewById(R.id.doc_order);
		rb_doc_patient = (RadioButton) findViewById(R.id.doc_my_patient);
		rb_doc_my = (RadioButton) findViewById(R.id.doc_my);
		rb_doc_order.setOnClickListener(this);
		rb_doc_patient.setOnClickListener(this);
		rb_doc_my.setOnClickListener(this);

		adapter = new FragmentAdapter(getSupportFragmentManager());
		mViewPager.setAdapter(adapter);
	}

	private void addListener() {
		mViewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int id) {
				switch (id) {
				case DOC_ORDER:
					rb_doc_order.setChecked(true);
					break;
				case DOC_PATIENT:
					rb_doc_patient.setChecked(true);
					break;
				case DOC_MY:
					rb_doc_my.setChecked(true);
					break;
				default:
					break;
				}
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.doc_order:
			mViewPager.setCurrentItem(DOC_ORDER);
			break;
		case R.id.doc_my_patient:
			mViewPager.setCurrentItem(DOC_PATIENT);
			break;
		case R.id.doc_my:
			mViewPager.setCurrentItem(DOC_MY);
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
