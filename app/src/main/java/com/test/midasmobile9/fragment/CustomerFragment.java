package com.test.midasmobile9.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.midasmobile9.R;
import com.test.midasmobile9.activity.AdminActivity;
import com.test.midasmobile9.activity.MainActivity;
import com.test.midasmobile9.adapter.CustomerRecyclerAdapter;
import com.test.midasmobile9.data.CustomerInfoItem;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class CustomerFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private Context mContext = null;
    private AdminActivity mActivity = null;

    Unbinder unbinder = null;

    @BindView(R.id.recyclerViewCustomer)
    RecyclerView recyclerViewCustomer;

    public CustomerFragment() {
        // Required empty public constructor
    }

    public static CustomerFragment newInstance(String param1, String param2) {
        CustomerFragment fragment = new CustomerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        this.mContext = context;
        this.mActivity = (AdminActivity)getActivity();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_customer, container, false);
        // 버터나이프
        unbinder = ButterKnife.bind(this, rootView);
        // 초기화
        init();

        return rootView;
    }

    @Override
    public void onDetach() {
        super.onDetach();

        // 버터나이프 해제
        unbinder.unbind();
        // mContext 해제
        this.mContext = null;
        // mActivity 해제
        this.mActivity = null;
    }

    private void init() {
        // 1. RecyclerView 크기 고정
        recyclerViewCustomer.setHasFixedSize(true);

        // 2. LayoutManager 설정
        LinearLayoutManager layoutManager = new LinearLayoutManager(mActivity.getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewCustomer.setLayoutManager(layoutManager);

        // 3. Adapter 설정
        CustomerRecyclerAdapter adapter = new CustomerRecyclerAdapter(mActivity, layoutManager);

        /********************************************************************************************/
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        adapter.addItem(new CustomerInfoItem(1, "tyrano09@gmail.com", "티라노", "baseprofile.png", "010-0000-0000", "모바일SW"));
        /********************************************************************************************/

        recyclerViewCustomer.setAdapter(adapter);
    }
}
