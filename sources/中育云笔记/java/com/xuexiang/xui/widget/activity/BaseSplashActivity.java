package com.xuexiang.xui.widget.activity;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.xuexiang.xui.utils.AbstractC8042h;

/* loaded from: classes5.dex */
public abstract class BaseSplashActivity extends AppCompatActivity {

    /* renamed from: c */
    public LinearLayout f15358c;

    private void initView() {
        this.f15358c = new LinearLayout(this);
        this.f15358c.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f15358c.setOrientation(1);
        setContentView(this.f15358c);
    }

    /* renamed from: J */
    public int m12278J() {
        return 0;
    }

    /* renamed from: K */
    public void m12279K(int i10) {
        if (i10 != 0) {
            AbstractC8042h.m12237k(this, this.f15358c, i10);
        }
    }

    /* renamed from: L */
    public abstract void m12280L();

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        m12279K(m12278J());
        m12280L();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AbstractC8042h.m12236j(this.f15358c);
        super.onDestroy();
    }
}
