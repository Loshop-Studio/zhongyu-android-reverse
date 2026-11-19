package com.xuexiang.xui.widget.activity;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.xuexiang.xui.utils.AbstractC3532g;

/* loaded from: classes2.dex */
public abstract class BaseSplashActivity extends AppCompatActivity {

    /* renamed from: a */
    public LinearLayout f3153a;

    /* renamed from: i */
    public int m4117i() {
        return 0;
    }

    /* renamed from: j */
    public void m4118j(int i4) {
        if (i4 != 0) {
            AbstractC3532g.m4090l(this, this.f3153a, i4);
        }
    }

    /* renamed from: k */
    public final void m4119k() {
        this.f3153a = new LinearLayout(this);
        this.f3153a.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f3153a.setOrientation(1);
        setContentView(this.f3153a);
    }

    /* renamed from: l */
    public abstract void m4120l();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m4119k();
        m4118j(m4117i());
        m4120l();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AbstractC3532g.m4089k(this.f3153a);
        super.onDestroy();
    }
}
