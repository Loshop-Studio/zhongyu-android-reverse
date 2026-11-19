package com.zykj.evaluation.p057ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import p113h8.AbstractC7636a;
import p146k8.AbstractC7899a;
import p159l8.C8521f;
import p181n8.AbstractC8672c;
import p181n8.AbstractC8673d;
import p181n8.InterfaceC8671b;
import p233s5.InterfaceC9216p3;

/* loaded from: classes4.dex */
public abstract class Hilt_MainFragment extends Fragment implements InterfaceC8671b {

    /* renamed from: a */
    public ContextWrapper f8981a;

    /* renamed from: b */
    public boolean f8982b;

    /* renamed from: c */
    public volatile C8521f f8983c;

    /* renamed from: d */
    public final Object f8984d = new Object();

    /* renamed from: e */
    public boolean f8985e = false;

    /* renamed from: e */
    private void m8832e() {
        if (this.f8981a == null) {
            this.f8981a = C8521f.m14006b(super.getContext(), this);
            this.f8982b = AbstractC7636a.m12619a(super.getContext());
        }
    }

    /* renamed from: c */
    public final C8521f m8833c() {
        if (this.f8983c == null) {
            synchronized (this.f8984d) {
                try {
                    if (this.f8983c == null) {
                        this.f8983c = m8834d();
                    }
                } finally {
                }
            }
        }
        return this.f8983c;
    }

    /* renamed from: d */
    public C8521f m8834d() {
        return new C8521f(this);
    }

    /* renamed from: f */
    public void m8835f() {
        if (this.f8985e) {
            return;
        }
        this.f8985e = true;
        ((InterfaceC9216p3) generatedComponent()).mo13486c((MainFragment) AbstractC8673d.m14278a(this));
    }

    @Override // p181n8.InterfaceC8671b
    public final Object generatedComponent() {
        return m8833c().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f8982b) {
            return null;
        }
        m8832e();
        return this.f8981a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7899a.m13518b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m8832e();
        m8835f();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C8521f.m14007c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f8981a;
        AbstractC8672c.m14277c(contextWrapper == null || C8521f.m14008d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m8832e();
        m8835f();
    }
}
