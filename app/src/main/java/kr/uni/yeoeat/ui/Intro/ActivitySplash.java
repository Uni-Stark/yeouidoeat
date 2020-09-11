package kr.uni.yeoeat.ui.Intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.lang.ref.WeakReference;

import kr.uni.yeoeat.R;
import kr.uni.yeoeat.ui.MainActivity;

public class ActivitySplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        WeakReference<Handler> handler = new WeakReference<>(new Handler());
        handler.get().postDelayed(new HandlerSplash(), 2000);
        System.gc();
    }

    private class HandlerSplash implements Runnable {
        @Override
        public void run() {
            startActivity(new Intent(ActivitySplash.this, MainActivity.class));
            ActivitySplash.this.finish();
        }
    }
}