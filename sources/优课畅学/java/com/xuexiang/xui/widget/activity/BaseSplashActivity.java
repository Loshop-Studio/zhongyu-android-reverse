package com.xuexiang.xui.widget.activity;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.xuexiang.xui.utils.AbstractC6878h;

/* loaded from: classes4.dex */
public abstract class BaseSplashActivity extends AppCompatActivity {

    /* renamed from: a */
    public LinearLayout f7138a;

    /* renamed from: m */
    public int m6552m() {
        return 0;
    }

    /* renamed from: n */
    public void m6553n(int i10) {
        if (i10 != 0) {
            AbstractC6878h.m6502m(this, this.f7138a, i10);
        }
    }

    /* renamed from: o */
    public final void m6554o() {
        this.f7138a = new LinearLayout(this);
        this.f7138a.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f7138a.setOrientation(1);
        setContentView(this.f7138a);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m6554o();
        m6553n(m6552m());
        m6555p();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AbstractC6878h.m6501l(this.f7138a);
        super.onDestroy();
    }

    /* renamed from: p */
    public abstract void m6555p();
}
