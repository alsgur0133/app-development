package com.example.user.myapplication;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_next = (Button) findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);

                intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://hi.nhis.or.kr/bj/ggpbj001/ggpbj001_m01.do"));

                startActivity(intent);
            }

        });
        Button btn_hospital;
        btn_hospital = (Button) findViewById(R.id.btn_hospital);
        btn_hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);

                intent = new Intent(
                        intent.ACTION_VIEW,
                        Uri.parse("http://hi.nhis.or.kr/ca/ggpca001/ggpca001_m03.do"));
                startActivity(intent);
            }
        });
        Button btn_disaster;
        btn_disaster = (Button) findViewById(R.id.btn_disaster);
        btn_disaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);

                intent = new Intent(
                        intent.ACTION_VIEW,
                        Uri.parse("http://www.safekorea.go.kr/idsiSFK/126/menuMap.do?w2xPath=/idsiSFK/wq/sfk/cs/contents/prevent/prevent01.xml"));
                startActivity(intent);
            }
        });
        final String tel = "01020799705";
        Button btnCall;
        btnCall = (Button) findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = "tel:" + tel.trim();
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(uri));
                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(intent);
            }
        } );
        Button btn_food;
        btn_food = (Button) findViewById(R.id.btn_food);
        btn_food.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, SubActivity.class);

                    intent = new Intent(
                            intent.ACTION_VIEW,
                            Uri.parse("http://hi.nhis.or.kr/bj/ggpbj002/ggpbj002_m04.do"));
                    startActivity(intent);
                }
        });
        }   
        }
