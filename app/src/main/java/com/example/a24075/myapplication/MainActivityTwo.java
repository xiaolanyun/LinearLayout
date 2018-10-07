package com.example.a24075.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivityTwo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_textviewtwo);

        final TextView textView = (TextView)findViewById(R.id.text01);
        Button button = (Button)findViewById(R.id.button01);
        ImageButton  imageButton= (ImageButton)findViewById(R.id.imagebutton01);

        textView.setText("你好，世界");

        //button.setText("Button按钮");
        imageButton.setImageResource(R.drawable.download);
        //点击事件
        textView.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                textView.setText("你好，世界");
            }
        });
        button.setOnClickListener(new View.OnClickListener()
        {
           public void onClick(View view)
           {
               textView.setText("Button按钮");
           }
        });
        imageButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                textView.setText("Imagebutton按钮");
            }
        });
    }

}
