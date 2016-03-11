package com.weiteng.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.weiteng.widget.IconTextView;

public class MainActivity extends AppCompatActivity implements IconTextView.OnIconTextClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IconTextView iconTextView1 = (IconTextView) findViewById(R.id.icon_tv);
        IconTextView iconTextView2 = (IconTextView) findViewById(R.id.icon_tv2);
        IconTextView iconTextView3 = (IconTextView) findViewById(R.id.icon_tv3);
        IconTextView iconTextView4 = (IconTextView) findViewById(R.id.icon_tv4);
        IconTextView iconTextView = (IconTextView) findViewById(R.id.icon_tv5);

        iconTextView1.setOnIconTextClickListener(this);
        iconTextView2.setOnIconTextClickListener(this);
        iconTextView3.setOnIconTextClickListener(this);
        iconTextView4.setOnIconTextClickListener(this);

        iconTextView.setDirection(IconTextView.Direction.LEFT);
        iconTextView.setDrawable(getResources().getDrawable(R.mipmap.ic_launcher));
        iconTextView.setText("Android");
        iconTextView.setOnIconTextClickListener(new IconTextView.OnIconTextClickListener() {

            @Override
            public void onIconTextClick(IconTextView view) {

            }
        });
    }

    @Override
    public void onIconTextClick(IconTextView view) {
        String text = view.getText();
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
