package com.xuexiang.xui.widget.activity;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.xuexiang.xui.utils.AbstractC5860h;

/* loaded from: classes3.dex */
public abstract class BaseSplashActivity extends AppCompatActivity {

    /* renamed from: a */
    public LinearLayout f4537a;

    /* renamed from: n */
    private void m4441n() {
        this.f4537a = new LinearLayout(this);
        this.f4537a.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f4537a.setOrientation(1);
        setContentView(this.f4537a);
    }

    /* renamed from: l */
    public int m4442l() {
        return 0;
    }

    /* renamed from: m */
    public void m4443m(int i6) {
        if (i6 != 0) {
            AbstractC5860h.m4409m(this, this.f4537a, i6);
        }
    }

    /* renamed from: o */
    public abstract void m4444o();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m4441n();
        m4443m(m4442l());
        m4444o();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AbstractC5860h.m4408l(this.f4537a);
        super.onDestroy();
    }
}
