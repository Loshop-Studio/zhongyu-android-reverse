package com.xuexiang.xui.widget.activity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes3.dex */
public abstract class BaseSplashActivity extends AppCompatActivity {

    /* renamed from: a */
    public LinearLayout f3986a;

    /* renamed from: o */
    public abstract void m3444o();

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3986a = new LinearLayout(this);
        this.f3986a.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f3986a.setOrientation(1);
        setContentView(this.f3986a);
        m3444o();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        Bitmap bitmap;
        LinearLayout linearLayout = this.f3986a;
        Drawable background = linearLayout.getBackground();
        linearLayout.setBackgroundResource(0);
        if (background != null && (background instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) background).getBitmap()) != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        if (background != null) {
            background.setCallback(null);
        }
        super.onDestroy();
    }
}
