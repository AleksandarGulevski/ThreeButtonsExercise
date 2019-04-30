package com.example.haselt_pc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.textView)
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.button)
    public void onClickButtonOne() {
        textView.setText(getString(R.string.buttonOne));
    }

    @OnClick(R.id.button2)
    public void onClickButtonTwo() {
        textView.setText(getString(R.string.buttonTwo));
    }

    @OnClick(R.id.button3)
    public void onClickButtonThree() {
        textView.setText(getString(R.string.buttonThree));
    }
}

