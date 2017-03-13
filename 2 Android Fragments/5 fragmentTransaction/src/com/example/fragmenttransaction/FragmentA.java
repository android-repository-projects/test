package com.example.fragmenttransaction;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment{
	
	@Override
	public void onAttach(Activity activity) {
		Log.d("andre", "Fragment A onAttach");
		super.onAttach(activity);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d("andre", "Fragment A onCreate");
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_a, container, false);
		Log.d("andre", "Fragment A onCreateView");
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d("andre", "Fragment A onActivityCreated");
	}
	
	@Override
	public void onPause() {
		super.onPause();
		Log.d("andre", "Fragment A onPause");
	}
	
	@Override
	public void onStop() {
		super.onStop();
		Log.d("andre", "Fragment A onStop");
	}
	
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.d("andre", "Fragment A onDestroyView");
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d("andre", "Fragment A onDestroy");
	}
	
	@Override
	public void onDetach() {
		super.onDetach();
		Log.d("andre", "Fragment A onDetach");
	}
}
