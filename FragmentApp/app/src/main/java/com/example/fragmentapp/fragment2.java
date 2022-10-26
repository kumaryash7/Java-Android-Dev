package com.example.fragmentapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment2 extends ListFragment {
 String[] AndroidApps = new String[]{
         "Master Android App","Master Android App pro","Master Flutter","Master Kotlin","Subscribe to our channel","Rate our app 5 stars"
 };



 String[] Descriptions = new String[]{
         "Over 900,000 users with 4.7 rating","Support us by buying this app","Learn Flutter from zero to hero ","Larn Kotlin form zero to hero","Get tutorials &source code code ","rate our app please"
 };
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment2 newInstance(String param1, String param2) {
        fragment2 fragment = new fragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment2,container,false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String >(getActivity(), android.R.layout.simple_list_item_1,AndroidApps);

        setListAdapter(adapter);

        return  view;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        fragment1 txt = (fragment1)
                  getParentFragmentManager().findFragmentById(R.id.fragment1);

           txt.change(AndroidApps[position],"Version:"+Descriptions );
           getListView().setSelector(android.R.color.holo_blue_dark);


    }
}