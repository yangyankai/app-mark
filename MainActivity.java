package com.example.appcommenttest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/** 一步打开应用*/
        startMarketActivity();

/** 先查询，后打开*/
//        ArrayList<String> strList = new ArrayList<>();
//        strList = MarketUtils.queryInstalledMarketPkgs(getApplicationContext());
//        strList.toString();
//        MarketUtils.launchAppDetail(getApplicationContext(), "com.wt.wutang", strList.get(0));
    }

    //    一步打开应用市场
    public void startMarketActivity() {
        Uri uri = Uri.parse("market://details?id=" + "com.wt.wutang");// getPackageName());
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
