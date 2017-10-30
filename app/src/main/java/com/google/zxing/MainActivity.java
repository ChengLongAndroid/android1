package com.google.zxing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.zxing.client.android.CaptureActivity;
import com.google.zxing.client.android.R;

public class MainActivity extends AppCompatActivity {
    int REQUEST_CODE_SCAN=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onc(View view){


        Intent intent = new Intent(MainActivity.this,CaptureActivity.class);
        startActivityForResult(intent, REQUEST_CODE_SCAN);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // 扫描二维码/条码回传
        if (requestCode == REQUEST_CODE_SCAN && resultCode == RESULT_OK) {
            if (data != null) {
              //  String content = data.getStringExtra();
                //resultTv.setText("扫描结果为：" + content);
            }
        }
    }
}
