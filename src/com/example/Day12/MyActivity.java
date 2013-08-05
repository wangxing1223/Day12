package com.example.Day12;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    Button button1 ;
    Button button2 ;
    Button button3 ;
    Button button4 ;
    Button button5 ;
    Button button6 ;
    Button button7 ;
    Button button8 ;
    Button button9 ;
    final String msg1 = "时间长";
    final String msg2 = "时间短";
    TextView textView ;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//        LinearLayout ad = (LinearLayout) findViewById(R.layout.linear);
//        TextView view =new TextView(this);
//        view.setText("Testview test......");
//        ad.addView(view);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setTitle("AlertDialog实例");
                builder.setMessage("真的要退出吗？");
                builder.setPositiveButton("是",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton("否", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        return;
                    }
                });
                AlertDialog ad = builder.create();
                ad.show();
            }
        });

        textView = (TextView) findViewById(R.id.textView);
        final String[]items = {"老北京杂酱面","全聚德烤鸭","东来顺饺子"};
        final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder1.setTitle("请点餐");
                builder1.setItems(items,new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        textView.setText(items[i]);
                    }
                });
            AlertDialog ad = builder1.create();
            ad.show();
            }

        });

        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t1 = Toast.makeText(MyActivity.this,msg1,Toast.LENGTH_LONG);
                t1.show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t2 = Toast.makeText(MyActivity.this,msg2,Toast.LENGTH_SHORT);
                t2.show();
            }
        });
        button5 = (Button) findViewById(R.id.button5);
        setLinear();

        button6 = (Button) findViewById(R.id.button6);
        setFrame();

        button7 = (Button) findViewById(R.id.button7);
        setTable1();

        button8 = (Button) findViewById(R.id.button8);
        setRelative();
        button9 = (Button) findViewById(R.id.button9);
        setAbsolute();


    }
    private void setLinear(){
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this,Linear.class);
                startActivity(intent);
            }
        });
    }
    private void setFrame(){
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this,Frame.class);
                startActivity(intent);
            }
        });
    }
    private void setTable1(){
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this,Table1.class);
                startActivity(intent);
            }
        });
    }
    private void setRelative(){
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this,Relative.class);
                startActivity(intent);
            }
        });
    }
    private void setAbsolute(){
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyActivity.this,Absolute.class);
                startActivity(intent);
            }
        });
    }
}
