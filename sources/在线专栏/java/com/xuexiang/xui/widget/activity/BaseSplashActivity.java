package com.xuexiang.xui.widget.activity;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.xuexiang.xui.utils.Utils;

/* loaded from: classes.dex */
public abstract class BaseSplashActivity extends AppCompatActivity {
    private static final int DEFAULT_SPLASH_DURATION_MILLIS = 500;
    protected LinearLayout mWelcomeLayout;

    private void initView() {
        this.mWelcomeLayout = new LinearLayout(this);
        this.mWelcomeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.mWelcomeLayout.setOrientation(1);
        setContentView(this.mWelcomeLayout);
    }

    private void startSplashAnim(Animation animation) {
        Utils.checkNull(animation, "Splash Animation can not be null");
        animation.setDuration(getSplashDurationMillis());
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.xuexiang.xui.widget.activity.BaseSplashActivity.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation2) {
                BaseSplashActivity.this.onSplashFinished();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation2) {
            }
        });
        this.mWelcomeLayout.startAnimation(animation);
    }

    protected long getSplashDurationMillis() {
        return 500L;
    }

    protected int getSplashImgResId() {
        return 0;
    }

    protected void initSplashView(int i4) {
        if (i4 != 0) {
            Utils.setBackground(this, this.mWelcomeLayout, i4);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        initSplashView(getSplashImgResId());
        onCreateActivity();
    }

    protected abstract void onCreateActivity();

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        Utils.recycleBackground(this.mWelcomeLayout);
        super.onDestroy();
    }

    protected abstract void onSplashFinished();

    protected void startSplash(boolean z3) {
        if (z3) {
            startSplashAnim(new AlphaAnimation(0.2f, 1.0f));
        } else {
            startSplashAnim(new AlphaAnimation(1.0f, 1.0f));
        }
    }
}
