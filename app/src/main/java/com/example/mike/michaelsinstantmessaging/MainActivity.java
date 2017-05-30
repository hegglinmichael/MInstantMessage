package com.example.mike.michaelsinstantmessaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //this button sends the message
    Button send = null;
    //this holds what you're typing
    EditText typing = null;
    //Scroll View holding all the messages
    LinearLayout scrollView = null;
    //holds all the messages sent
    ArrayList<TextView> textViewList = new ArrayList<TextView>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect send button to button in xml
        send = (Button)findViewById(R.id.send_button);
        //connect typing button to button in xml
        typing = (EditText)findViewById(R.id.message_entered);
        //connects the scrollview to the scrollview in xml
        scrollView = (LinearLayout)findViewById(R.id.scrollView);

        send.setOnClickListener(new Button.OnClickListener() {
                                    public void onClick(View v) {
                                        addtoScroll();
                                    }
                                }
        );
    }

    public void addtoScroll() {
        TextView tv = new TextView(getApplicationContext());
        tv.setText(typing.toString());
        scrollView.addView(tv);
        typing.setText("");
    }
}
