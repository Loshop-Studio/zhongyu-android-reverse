package com.xuexiang.xui.widget.activity;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.xuexiang.xui.utils.AbstractC6483h;

/* loaded from: classes4.dex */
public abstract class BaseSplashActivity extends AppCompatActivity {

    /* renamed from: a */
    public LinearLayout f5813a;

    /* renamed from: m */
    public int m5431m() {
        return 0;
    }

    /* renamed from: n */
    public void m5432n(int i10) {
        if (i10 != 0) {
            AbstractC6483h.m5403l(this, this.f5813a, i10);
        }
    }

    /* renamed from: o */
    public final void m5433o() {
        this.f5813a = new LinearLayout(this);
        this.f5813a.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f5813a.setOrientation(1);
        setContentView(this.f5813a);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m5433o();
        m5432n(m5431m());
        m5434p();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AbstractC6483h.m5402k(this.f5813a);
        super.onDestroy();
    }

    /* renamed from: p */
    public abstract void m5434p();
}
