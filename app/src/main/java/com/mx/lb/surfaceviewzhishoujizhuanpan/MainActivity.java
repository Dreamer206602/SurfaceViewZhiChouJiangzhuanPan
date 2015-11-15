package com.mx.lb.surfaceviewzhishoujizhuanpan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mx.lb.surfaceviewzhishoujizhuanpan.widget.LuckyPanView;

public class MainActivity extends AppCompatActivity {

    private LuckyPanView mLuckyPanView;
    private ImageView mStartBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mLuckyPanView= (LuckyPanView) findViewById(R.id.id_luckypan);

        mStartBtn= (ImageView) findViewById(R.id.id_start_btn);


        mStartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mLuckyPanView.isStart()){
                    mStartBtn.setImageResource(R.mipmap.stop);
                    mLuckyPanView.luckyStart(1);
                }else{
                    if(!mLuckyPanView.isShouldEnd()){
                        mStartBtn.setImageResource(R.mipmap.start);
                        mLuckyPanView.luckyEnd();
                    }
                }
            }
        });

    }
}
