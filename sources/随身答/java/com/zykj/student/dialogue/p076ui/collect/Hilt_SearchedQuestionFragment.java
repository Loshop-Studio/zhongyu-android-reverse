package com.zykj.student.dialogue.p076ui.collect;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import p190n6.InterfaceC9122w;
import p245s7.AbstractC9589a;
import p275v7.AbstractC9769a;
import p285w7.C9841f;
import p305y7.AbstractC9967c;
import p305y7.AbstractC9968d;
import p305y7.InterfaceC9966b;

/* loaded from: classes5.dex */
public abstract class Hilt_SearchedQuestionFragment extends Fragment implements InterfaceC9966b {

    /* renamed from: a */
    public ContextWrapper f10788a;

    /* renamed from: b */
    public boolean f10789b;

    /* renamed from: c */
    public volatile C9841f f10790c;

    /* renamed from: d */
    public final Object f10791d = new Object();

    /* renamed from: e */
    public boolean f10792e = false;

    /* renamed from: e */
    private void m10143e() {
        if (this.f10788a == null) {
            this.f10788a = C9841f.m16773b(super.getContext(), this);
            this.f10789b = AbstractC9589a.m15761a(super.getContext());
        }
    }

    /* renamed from: c */
    public final C9841f m10144c() {
        if (this.f10790c == null) {
            synchronized (this.f10791d) {
                try {
                    if (this.f10790c == null) {
                        this.f10790c = m10145d();
                    }
                } finally {
                }
            }
        }
        return this.f10790c;
    }

    /* renamed from: d */
    public C9841f m10145d() {
        return new C9841f(this);
    }

    /* renamed from: f */
    public void m10146f() {
        if (this.f10792e) {
            return;
        }
        this.f10792e = true;
        ((InterfaceC9122w) generatedComponent()).mo12835g((SearchedQuestionFragment) AbstractC9968d.m17240a(this));
    }

    @Override // p305y7.InterfaceC9966b
    public final Object generatedComponent() {
        return m10144c().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f10789b) {
            return null;
        }
        m10143e();
        return this.f10788a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC9769a.m16551b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10143e();
        m10146f();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9841f.m16774c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f10788a;
        AbstractC9967c.m17239c(contextWrapper == null || C9841f.m16775d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10143e();
        m10146f();
    }
}
