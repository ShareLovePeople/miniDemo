package com.example.minidemo;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.minidemo.model.BaseInfo;
import com.example.minidemo.recycler.adapter.Infoadapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Bob
 */
public class MainActivity extends BaseActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @BindView(R.id.recycler)
    RecyclerView recycler;
    private List<BaseInfo> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_activity_main);
        ButterKnife.bind(this);

        initData();
        initUi();
        // Example of a call to a native method
        /*TextView tv = findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());*/
    }

    /**
     * recyclerView 这篇讲的不错
     * https://blog.csdn.net/tuike/article/details/79064750
     */
    private void initUi() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recycler.setLayoutManager(layoutManager);
        Infoadapter infoadapter = new Infoadapter(this, data);
        recycler.setItemAnimator(new DefaultItemAnimator());
//        recycler.addItemDecoration(new RecyclerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recycler.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recycler.setAdapter(infoadapter);
    }

    private void initData() {
        data = new ArrayList<>(16);
        for (int i = 0; i < 10; i++) {
            i++;
            BaseInfo baseInfo = new BaseInfo((long) i, "" + i);
            data.add(baseInfo);
        }
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
