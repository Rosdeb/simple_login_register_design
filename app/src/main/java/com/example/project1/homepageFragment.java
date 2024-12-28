package com.example.project1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link homepageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class homepageFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    String[] newheading;
    int[] imageResoruce;
    private RecyclerView recyclerView;
    private ArrayList<News> newsArrayList;

    public homepageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment homepageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static homepageFragment newInstance(String param1, String param2) {
        homepageFragment fragment = new homepageFragment();
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
        return inflater.inflate(R.layout.fragment_homepage2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {


        datainitalize();



        recyclerView = view.findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));




    }

    private void datainitalize(){

        newsArrayList = new ArrayList<>();

        newheading = new String[]{

                getString(R.string.a),
                getString(R.string.d),
                getString(R.string.b),
                getString(R.string.c),
                getString(R.string.e),
                getString(R.string.f),
                getString(R.string.g),
                getString(R.string.h),
                getString(R.string.i)


        };
        imageResoruce = new int[]{
                R.drawable.g,R.drawable.f,R.drawable.women1,R.drawable.up,R.drawable.women2,
                R.drawable.file,R.drawable.h,R.drawable.fasion2};
        for (int i = 0; i<newheading.length;i++){

            News news=new News(newheading[i],imageResoruce[i]);
              newsArrayList.add(news);
        }


    }
}