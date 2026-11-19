package com.zykj.huiwei.launcher.p035ui;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.huiwei.launcher.base.CommonActivity;
import p178w4.AbstractC7815a;
import p185x4.C7856a;
import p185x4.C7863h;
import p191y3.InterfaceC7911n;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7948b;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_MainActivity<dataBinding extends ViewDataBinding> extends CommonActivity<dataBinding> implements InterfaceC7949c {

    /* renamed from: a */
    public C7863h f6284a;

    /* renamed from: b */
    public volatile C7856a f6285b;

    /* renamed from: c */
    public final Object f6286c = new Object();

    /* renamed from: d */
    public boolean f6287d = false;

    /* renamed from: com.zykj.huiwei.launcher.ui.Hilt_MainActivity$a */
    public class C6087a implements OnContextAvailableListener {
        public C6087a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_MainActivity.this.m5515p();
        }
    }

    public Hilt_MainActivity() {
        m5511l();
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5512m().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9402a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: l */
    public final void m5511l() {
        addOnContextAvailableListener(new C6087a());
    }

    /* renamed from: m */
    public final C7856a m5512m() {
        if (this.f6285b == null) {
            synchronized (this.f6286c) {
                try {
                    if (this.f6285b == null) {
                        this.f6285b = m5513n();
                    }
                } finally {
                }
            }
        }
        return this.f6285b;
    }

    /* renamed from: n */
    public C7856a m5513n() {
        return new C7856a(this);
    }

    /* renamed from: o */
    public final void m5514o() {
        if (getApplication() instanceof InterfaceC7948b) {
            C7863h c7863hM9526b = m5512m().m9526b();
            this.f6284a = c7863hM9526b;
            if (c7863hM9526b.m9542b()) {
                this.f6284a.m9543c(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // com.zykj.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m5514o();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C7863h c7863h = this.f6284a;
        if (c7863h != null) {
            c7863h.m9541a();
        }
    }

    /* renamed from: p */
    public void m5515p() {
        if (this.f6287d) {
            return;
        }
        this.f6287d = true;
        ((InterfaceC7911n) generatedComponent()).mo5217f((MainActivity) AbstractC7951e.m9749a(this));
    }
}
