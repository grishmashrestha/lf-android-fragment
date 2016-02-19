package com.example.grishma.fragmenttest;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import timber.log.Timber;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * Use the {@link ArticleListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ArticleListFragment extends Fragment {


    public ArticleListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment ArticleListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ArticleListFragment newInstance(String param1, String param2) {
        ArticleListFragment fragment = new ArticleListFragment();
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Timber.i("from onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.d("from onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_article_list, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Timber.i("from onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Timber.i("from onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Timber.i("from onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Timber.i("from onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Timber.i("from onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Timber.i("from onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Timber.i("from onDestroy");
    }

    @Override
    public void onDetach() {
        Timber.i("from onDetach");
        super.onDetach();
    }
}
