package com.xuexiang.xui.widget.activity;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.xuexiang.xui.utils.AbstractC6802h;

/* loaded from: classes4.dex */
public abstract class BaseSplashActivity extends AppCompatActivity {

    /* renamed from: a */
    public LinearLayout f7068a;

    /* renamed from: m */
    public int m6527m() {
        return 0;
    }

    /* renamed from: n */
    public void m6528n(int i9) {
        if (i9 != 0) {
            AbstractC6802h.m6500l(this, this.f7068a, i9);
        }
    }

    /* renamed from: o */
    public final void m6529o() {
        this.f7068a = new LinearLayout(this);
        this.f7068a.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f7068a.setOrientation(1);
        setContentView(this.f7068a);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m6529o();
        m6528n(m6527m());
        m6530p();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AbstractC6802h.m6499k(this.f7068a);
        super.onDestroy();
    }

    /* renamed from: p */
    public abstract void m6530p();
}
