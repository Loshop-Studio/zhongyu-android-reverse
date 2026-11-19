package com.zykj.student.dialogue.p076ui.home;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import p244s6.InterfaceC9543o1;
import p245s7.AbstractC9589a;
import p275v7.AbstractC9769a;
import p285w7.C9841f;
import p305y7.AbstractC9967c;
import p305y7.AbstractC9968d;
import p305y7.InterfaceC9966b;

/* loaded from: classes5.dex */
public abstract class Hilt_HomeFragment extends Fragment implements InterfaceC9966b {

    /* renamed from: a */
    public ContextWrapper f11389a;

    /* renamed from: b */
    public boolean f11390b;

    /* renamed from: c */
    public volatile C9841f f11391c;

    /* renamed from: d */
    public final Object f11392d = new Object();

    /* renamed from: e */
    public boolean f11393e = false;

    /* renamed from: e */
    private void m10622e() {
        if (this.f11389a == null) {
            this.f11389a = C9841f.m16773b(super.getContext(), this);
            this.f11390b = AbstractC9589a.m15761a(super.getContext());
        }
    }

    /* renamed from: c */
    public final C9841f m10623c() {
        if (this.f11391c == null) {
            synchronized (this.f11392d) {
                try {
                    if (this.f11391c == null) {
                        this.f11391c = m10624d();
                    }
                } finally {
                }
            }
        }
        return this.f11391c;
    }

    /* renamed from: d */
    public C9841f m10624d() {
        return new C9841f(this);
    }

    /* renamed from: f */
    public void m10625f() {
        if (this.f11393e) {
            return;
        }
        this.f11393e = true;
        ((InterfaceC9543o1) generatedComponent()).mo12833e((HomeFragment) AbstractC9968d.m17240a(this));
    }

    @Override // p305y7.InterfaceC9966b
    public final Object generatedComponent() {
        return m10623c().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f11390b) {
            return null;
        }
        m10622e();
        return this.f11389a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC9769a.m16551b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10622e();
        m10625f();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9841f.m16774c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f11389a;
        AbstractC9967c.m17239c(contextWrapper == null || C9841f.m16775d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10622e();
        m10625f();
    }
}
