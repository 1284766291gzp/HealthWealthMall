package com.lxkj.healthwealthmall.app.ui.mine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.lxkj.healthwealthmall.R;
import com.lxkj.healthwealthmall.app.ui.BaseActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * 意见反馈
 * Created by Administrator on 2017/5/10 0010.
 */

public class QuestionActivity extends BaseActivity implements View.OnClickListener{
    private EditText et_title;
    private EditText et_content;
    private TextView tvsubmit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        initTitle("意见反馈");
        initView();
        initData();
    }

    private void initView() {
//        et_content=(EditText)findViewById(R.id.et_content);
//        tvsubmit=(TextView)findViewById(R.id.tv_submit);
    }

    private void initData() {

    }

//    private void initEvent() {
//        tvsubmit.setOnClickListener(this);
//    }

//    private void submit(String title,String content){
//        Map<String, String> params = new HashMap<>();
//        String json = "{\"cmd\":\"feedback\",\"uid\":\"" +  MyApplication.uId + "\",\"title\":\"" + title + "\"" +
//                ",\"content\":\"" + content + "\"}";
//        params.put("json", json);
//        Log.i("TAG", "json=" + json);
//
//        OkHttpUtils
//                .post()
//                .params(params)
//                .url(UrlBean.BASE_URL)
//                .build()//
//                .execute(new StringCallback() {
//                    @Override
//                    public void onError(Call call, Exception e, int id) {
//
//                        Log.i("TAG", "e=" + e.getMessage());
//                    }
//
//                    @Override
//                    public void onResponse(String response, int id) {
//
//                        Log.i("TAG", "response=" + response);
//
//                        String result = "1";//返回码
//                        String resultNote = "";//错误信息
//
//                        try {
//                            JSONObject object = new JSONObject(response);
//                            if (object.has("result") && !object.isNull("result")) {
//                                result = object.getString("result");
//                            }
//
//                            if (object.has("resultNote") && !object.isNull("resultNote")) {
//                                resultNote = object.getString("resultNote");
//                            }
//
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//
//                        if (result.equals("0")) {
//
//                            Toast.makeText(QuestionActivity.this, resultNote, Toast.LENGTH_SHORT).show();
//                            finish();
//                        } else {
//                            Toast.makeText(QuestionActivity.this, resultNote, Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.tv_submit:

//                String title=et_title.getText().toString().toString();
//                String content=et_content.getText().toString().trim();

//                submit(title,content);

                break;
        }
    }
}
