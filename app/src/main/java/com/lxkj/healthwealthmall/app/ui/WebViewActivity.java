package com.lxkj.healthwealthmall.app.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.lxkj.healthwealthmall.R;
import com.lxkj.healthwealthmall.app.view.MyWebView;


/**
 * webView
 * Created by Slingge on 2017/2/9 0009.
 */

public class WebViewActivity extends BaseActivity {

    private WebView webview;
    private int flag;
    //关于我们1,注册协议2,预约协议5,使用帮助6
    private final String webUrl = "http://59.110.163.144:8080/appoint/aboutus/disPlayDetail?id=";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        flag = getIntent().getIntExtra("flag", -303);
        init();
        initWeb();
    }

    private void init() {
        MyWebView myWebView = (MyWebView) findViewById(R.id.webView);
        webview = myWebView.getWebView();
        if (flag == -1) {
            initTitle(getIntent().getStringExtra("title"));
        }
    }

    private void initWeb() {
        WebSettings settings = webview.getSettings();
        // 设置可以支持缩放
        settings.setSupportZoom(true);
        // 设置支持js
        settings.setJavaScriptEnabled(true);
        // 关闭缓存
        settings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        // 支持自动加载图片
        settings.setLoadsImagesAutomatically(true);
        // 设置出现缩放工具
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        // 扩大比例的缩放
        settings.setUseWideViewPort(true);
        // 自适应屏幕
        settings.setLoadWithOverviewMode(true);

        if (flag == -1) {
            webview.loadUrl(getIntent().getStringExtra("url"));
        } else if (flag == 1) {
            webview.loadUrl(webUrl + flag);
            initTitle("关于我们");
        } else if (flag == 2) {
            webview.loadUrl(webUrl + flag);
            initTitle("注册协议");
            GoneRightImage();
        } else if (flag == 5) {
            webview.loadUrl(webUrl + flag);
            initTitle("预约协议");
        }else if (flag == 6) {
            webview.loadUrl(webUrl + flag);
            initTitle("使用帮助");
        }
    }


}
