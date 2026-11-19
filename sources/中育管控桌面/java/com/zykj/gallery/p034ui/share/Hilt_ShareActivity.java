package com.zykj.gallery.p034ui.share;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;
import p100l3.InterfaceC7302h;
import p178w4.AbstractC7815a;
import p185x4.C7856a;
import p185x4.C7863h;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7948b;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_ShareActivity extends ComponentActivity implements InterfaceC7949c {

    /* renamed from: a */
    public C7863h f5896a;

    /* renamed from: b */
    public volatile C7856a f5897b;

    /* renamed from: c */
    public final Object f5898c = new Object();

    /* renamed from: d */
    public boolean f5899d = false;

    /* renamed from: com.zykj.gallery.ui.share.Hilt_ShareActivity$a */
    public class C6033a implements OnContextAvailableListener {
        public C6033a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_ShareActivity.this.m5124l();
        }
    }

    public Hilt_ShareActivity() {
        m5120h();
    }

    /* renamed from: h */
    private void m5120h() {
        addOnContextAvailableListener(new C6033a());
    }

    /* renamed from: k */
    private void m5121k() {
        if (getApplication() instanceof InterfaceC7948b) {
            C7863h c7863hM9526b = m5122i().m9526b();
            this.f5896a = c7863hM9526b;
            if (c7863hM9526b.m9542b()) {
                this.f5896a.m9543c(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5122i().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9402a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: i */
    public final C7856a m5122i() {
        if (this.f5897b == null) {
            synchronized (this.f5898c) {
                try {
                    if (this.f5897b == null) {
                        this.f5897b = m5123j();
                    }
                } finally {
                }
            }
        }
        return this.f5897b;
    }

    /* renamed from: j */
    public C7856a m5123j() {
        return new C7856a(this);
    }

    /* renamed from: l */
    public void m5124l() {
        if (this.f5899d) {
            return;
        }
        this.f5899d = true;
        ((InterfaceC7302h) generatedComponent()).mo5213b((ShareActivity) AbstractC7951e.m9749a(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m5121k();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C7863h c7863h = this.f5896a;
        if (c7863h != null) {
            c7863h.m9541a();
        }
    }
}
