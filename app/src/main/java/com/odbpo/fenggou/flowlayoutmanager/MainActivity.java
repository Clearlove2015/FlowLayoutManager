package com.odbpo.fenggou.flowlayoutmanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.mcxtzhang.layoutmanager.flow.FlowLayoutManager;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.rv)
    RecyclerView rv;
    private List<String> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initData();
        initRecyclerView();
    }

    public void initData() {
        for (int i = 0; i < 20; i++) {
            mData.add("Android");
            mData.add("Kotlin");
            mData.add("Java");
            mData.add("IOS");
            mData.add("Swift");
            mData.add("C++");
            mData.add("C");
            mData.add("PHP");
            mData.add("Python");
            mData.add("C#");
        }
    }

    public void initRecyclerView() {
        rv.setLayoutManager(new FlowLayoutManager());
        rv.setAdapter(new MyAdapter(mData));
    }

}
