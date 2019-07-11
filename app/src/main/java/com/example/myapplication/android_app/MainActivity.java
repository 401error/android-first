package com.example.myapplication.android_app;


import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.CompoundButton;
        import android.widget.EditText;
        import android.widget.ImageView;
        import  android.widget.TextView;
        import android.graphics.drawable.Drawable;
        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Drawable> drawableList = new ArrayList<Drawable>();//存放图片
    int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawableList.add(getResources().getDrawable(R.drawable.m2));//图片01
        drawableList.add(getResources().getDrawable(R.drawable.m3));//图片02
        drawableList.add(getResources().getDrawable(R.drawable.m4));//图片03


        Button bt1 = findViewById(R.id.button);
        final TextView t1 = findViewById(R.id.views);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("字节跳动");
            }
        });
        Button bt2 = findViewById(R.id.button3);
        final ImageView v1 = findViewById(R.id.imageView2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setImageDrawable(drawableList.get(index++));
                if(index>=drawableList.size())//如果点击到达图片的末尾，则回到第一张图片
                {
                    index = 0;
                }

            }


        });


        CheckBox cbx = (CheckBox) findViewById(R.id.checkBox2);

        final String[] sex = new String[1];
        sex[0]="学历：非本科";
        cbx.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
                                           @Override
                                           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                               if (isChecked) {
                                                   String sex1 = "学历：本科";//do something
                                                   sex[0] = sex1;
                                               } else {
                                                   String sex1 = "学历：非本科";//do something
                                                   sex[0] = sex1;
                                               }
                                           }
                                       }
        );


        Button bt4 = findViewById(R.id.button2);
        final TextView T3 =findViewById(R.id.textView2);
        final EditText t2 =findViewById(R.id.editText2);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String q1,q2,q3;
                q2="你的名字是：";
                q1=q2+t2.getText().toString();
                T3.setText(q1+"\n"+sex[0]);
            }
        });




    }



}