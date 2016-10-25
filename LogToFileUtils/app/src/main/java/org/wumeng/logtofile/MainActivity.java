package org.wumeng.logtofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.wumeng.logtofile.library.FileLogUtils;

public class MainActivity extends AppCompatActivity {


    private boolean isRun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FileLogUtils.init(this);

    }

    @Override
    protected void onResume() {
        isRun = true;


        Thread mThread = new Thread() {

            public void run() {

                while (isRun) {
                    FileLogUtils.write("哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

        };
        mThread.start();

        super.onResume();
    }


    @Override
    protected void onPause() {
        isRun = false;
        super.onPause();
    }
}
