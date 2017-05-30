package com.example.mike.michaelsinstantmessaging;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by mike on 8/10/2015.
 */
public class Splash extends Activity {

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.splash);

        //The thread acts as a timer to hold the splash screen for 3s
        Thread timer = new Thread(){
            public void run () {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    //creates an intent to open a new activity
                    Intent intent = new Intent("android.intent.action.MainActivity");
                    //starts the new activity
                    startActivity(intent);
                }
            }
        };
        //starts the thread
        timer.start();
    }
}
