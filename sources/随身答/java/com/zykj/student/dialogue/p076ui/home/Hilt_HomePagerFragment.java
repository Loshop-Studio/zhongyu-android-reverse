package com.zykj.student.dialogue.p076ui.home;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import p244s6.InterfaceC9567u1;
import p245s7.AbstractC9589a;
import p275v7.AbstractC9769a;
import p285w7.C9841f;
import p305y7.AbstractC9967c;
import p305y7.AbstractC9968d;
import p305y7.InterfaceC9966b;

/* loaded from: classes5.dex */
public abstract class Hilt_HomePagerFragment extends Fragment implements InterfaceC9966b {

    /* renamed from: a */
    public ContextWrapper f11394a;

    /* renamed from: b */
    public boolean f11395b;

    /* renamed from: c */
    public volatile C9841f f11396c;

    /* renamed from: d */
    public final Object f11397d = new Object();

    /* renamed from: e */
    public boolean f11398e = false;

    /* renamed from: e */
    private void m10626e() {
        if (this.f11394a == null) {
            this.f11394a = C9841f.m16773b(super.getContext(), this);
            this.f11395b = AbstractC9589a.m15761a(super.getContext());
        }
    }

    /* renamed from: c */
    public final C9841f m10627c() {
        if (this.f11396c == null) {
            synchronized (this.f11397d) {
                try {
                    if (this.f11396c == null) {
                        this.f11396c = m10628d();
                    }
                } finally {
                }
            }
        }
        return this.f11396c;
    }

    /* renamed from: d */
    public C9841f m10628d() {
        return new C9841f(this);
    }

    /* renamed from: f */
    public void m10629f() {
        if (this.f11398e) {
            return;
        }
        this.f11398e = true;
        ((InterfaceC9567u1) generatedComponent()).mo12830b((HomePagerFragment) AbstractC9968d.m17240a(this));
    }

    @Override // p305y7.InterfaceC9966b
    public final Object generatedComponent() {
        return m10627c().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f11395b) {
            return null;
        }
        m10626e();
        return this.f11394a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC9769a.m16551b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10626e();
        m10629f();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9841f.m16774c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f11394a;
        AbstractC9967c.m17239c(contextWrapper == null || C9841f.m16775d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10626e();
        m10629f();
    }
}
