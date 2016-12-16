package com.baymax.udacity.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button projectMovieBtn = (Button) findViewById(R.id.btn_project_movie);
        projectMovieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"启动应用：热门电影", Toast.LENGTH_LONG).show();
            }
        });

        Button projectBlockBtn = (Button) findViewById(R.id.btn_project_block);
        projectBlockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"启动应用：股票雄鹰", Toast.LENGTH_LONG).show();
            }
        });

        Button projectReaderBtn = (Button) findViewById(R.id.btn_project_reader);
        projectReaderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"启动应用：XYZ阅读器", Toast.LENGTH_LONG).show();
            }
        });

        Button projectNewsBtn = (Button) findViewById(R.id.btn_project_news);
        projectNewsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"启动应用：最新闻", Toast.LENGTH_LONG).show();
            }
        });

        Button projectGraduateeBtn = (Button) findViewById(R.id.btn_project_graduate);
        projectGraduateeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"启动应用：毕业设计", Toast.LENGTH_LONG).show();
            }
        });
    }
}
