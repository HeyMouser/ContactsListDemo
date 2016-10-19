package com.yh.contactslistdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.yh.contactslistdemo.IndexBar.widget.IndexBar;
import com.yh.contactslistdemo.decoretion.DividerItemDecoration;
import com.yh.contactslistdemo.decoretion.TitleItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CityAdapter mAdapter;
    private RecyclerView mRv;
    private LinearLayoutManager mManager;
    private List<CityBean> mDatas;

    private TitleItemDecoration mDecoretion;

    /**
     * 右侧边栏导航区域
     */
    private IndexBar mIndexBar;

    /**
     * 显示指示器DialogText
     */
    private TextView mTvSideBarHint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRv = (RecyclerView) findViewById(R.id.rv);
        mManager = new LinearLayoutManager(this);
        mRv.setLayoutManager(mManager);
        initDatas(getResources().getStringArray(R.array.provinces));

        mAdapter = new CityAdapter(mDatas,this);
        mRv.setAdapter(mAdapter);
        mDecoretion = new TitleItemDecoration(this,mDatas);
        mRv.addItemDecoration(mDecoretion);

        mRv.addItemDecoration(new DividerItemDecoration(MainActivity.this,DividerItemDecoration.VERTICAL_LIST));

        //使用indexBar
        mTvSideBarHint = (TextView) findViewById(R.id.tvSideBarHint);
        mIndexBar = (IndexBar) findViewById(R.id.indexBar);
        mIndexBar.setmPressedShowTextView(mTvSideBarHint)
                .setNeedRealIndex(true)
                .setmLayoutManager(mManager)
                .setmSourceDatas(mDatas);
    }

    /**
     * 组织数据源
     *
     * @param data
     * @return
     */
    private void initDatas(String[] data) {
        mDatas = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            CityBean cityBean = new CityBean();
            cityBean.setCity(data[i]);//设置城市名称
            mDatas.add(cityBean);
        }
    }
}
