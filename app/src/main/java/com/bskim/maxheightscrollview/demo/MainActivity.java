package com.bskim.maxheightscrollview.demo;

import android.app.Activity;
import android.os.Bundle;

import com.bskim.maxheightscrollview.widgets.MaxHeightScrollView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaxHeightScrollView sv = (MaxHeightScrollView) findViewById(R.id.programmaticScrollView);
        sv.setMaxHeightDp(60);
    }
}
