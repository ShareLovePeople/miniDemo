package com.example.minidemo;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.minidemo.model.Info;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Bob
 */
public class MainActivity extends BaseAcivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @BindView(R.id.recycler)
    RecyclerView recycler;

    private List<Info> datas;
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

    private void initUi() {
    }

    private void initData() {
        datas = new ArrayList<>(16);
        for (int i = 0;i<10;i++ ) {
            i++;
            Info info =new Info(""+i,""+i);
            datas.add(info);
        }
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
