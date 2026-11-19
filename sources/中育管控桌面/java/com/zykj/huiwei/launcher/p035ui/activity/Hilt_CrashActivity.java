package com.zykj.huiwei.launcher.p035ui.activity;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import p178w4.AbstractC7815a;
import p185x4.C7856a;
import p185x4.C7863h;
import p198z3.InterfaceC7935a;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7948b;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_CrashActivity extends AppCompatActivity implements InterfaceC7949c {

    /* renamed from: a */
    public C7863h f6368a;

    /* renamed from: b */
    public volatile C7856a f6369b;

    /* renamed from: c */
    public final Object f6370c = new Object();

    /* renamed from: d */
    public boolean f6371d = false;

    /* renamed from: com.zykj.huiwei.launcher.ui.activity.Hilt_CrashActivity$a */
    public class C6098a implements OnContextAvailableListener {
        public C6098a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_CrashActivity.this.m5579p();
        }
    }

    public Hilt_CrashActivity() {
        m5575l();
    }

    /* renamed from: l */
    private void m5575l() {
        addOnContextAvailableListener(new C6098a());
    }

    /* renamed from: o */
    private void m5576o() {
        if (getApplication() instanceof InterfaceC7948b) {
            C7863h c7863hM9526b = m5577m().m9526b();
            this.f6368a = c7863hM9526b;
            if (c7863hM9526b.m9542b()) {
                this.f6368a.m9543c(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5577m().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9402a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: m */
    public final C7856a m5577m() {
        if (this.f6369b == null) {
            synchronized (this.f6370c) {
                try {
                    if (this.f6369b == null) {
                        this.f6369b = m5578n();
                    }
                } finally {
                }
            }
        }
        return this.f6369b;
    }

    /* renamed from: n */
    public C7856a m5578n() {
        return new C7856a(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m5576o();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C7863h c7863h = this.f6368a;
        if (c7863h != null) {
            c7863h.m9541a();
        }
    }

    /* renamed from: p */
    public void m5579p() {
        if (this.f6371d) {
            return;
        }
        this.f6371d = true;
        ((InterfaceC7935a) generatedComponent()).mo5216e((CrashActivity) AbstractC7951e.m9749a(this));
    }
}
