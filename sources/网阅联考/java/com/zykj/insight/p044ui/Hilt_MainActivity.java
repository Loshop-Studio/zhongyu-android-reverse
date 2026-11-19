package com.zykj.insight.p044ui;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.managers.C3715a;
import p069h2.AbstractC3766a;
import p079j2.AbstractC3804d;
import p079j2.InterfaceC3802b;
import p132v1.InterfaceC4627a;

/* loaded from: classes2.dex */
public abstract class Hilt_MainActivity extends ComponentActivity implements InterfaceC3802b {

    /* renamed from: a */
    public volatile C3715a f4171a;

    /* renamed from: b */
    public final Object f4172b = new Object();

    /* renamed from: c */
    public boolean f4173c = false;

    /* renamed from: com.zykj.insight.ui.Hilt_MainActivity$a */
    public class C3663a implements OnContextAvailableListener {
        public C3663a() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_MainActivity.this.m4611h();
        }
    }

    public Hilt_MainActivity() {
        m4608e();
    }

    @Override // p079j2.InterfaceC3802b
    /* renamed from: a */
    public final Object mo4607a() {
        return m4609f().mo4607a();
    }

    /* renamed from: e */
    public final void m4608e() {
        addOnContextAvailableListener(new C3663a());
    }

    /* renamed from: f */
    public final C3715a m4609f() {
        if (this.f4171a == null) {
            synchronized (this.f4172b) {
                if (this.f4171a == null) {
                    this.f4171a = m4610g();
                }
            }
        }
        return this.f4171a;
    }

    /* renamed from: g */
    public C3715a m4610g() {
        return new C3715a(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC3766a.m4866a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: h */
    public void m4611h() {
        if (this.f4173c) {
            return;
        }
        this.f4173c = true;
        ((InterfaceC4627a) mo4607a()).mo6314b((MainActivity) AbstractC3804d.m4964a(this));
    }
}
