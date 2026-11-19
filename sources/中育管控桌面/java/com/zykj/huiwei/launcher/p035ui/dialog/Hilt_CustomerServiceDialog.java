package com.zykj.huiwei.launcher.p035ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.huiwei.launcher.base.CommonDialogFragment;
import p019b4.InterfaceC4432m;
import p157t4.AbstractC7728a;
import p178w4.AbstractC7815a;
import p185x4.C7862g;
import p199z4.AbstractC7950d;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_CustomerServiceDialog<DataBinding extends ViewDataBinding> extends CommonDialogFragment<DataBinding> implements InterfaceC7949c {

    /* renamed from: b */
    public ContextWrapper f6456b;

    /* renamed from: c */
    public boolean f6457c;

    /* renamed from: d */
    public volatile C7862g f6458d;

    /* renamed from: e */
    public final Object f6459e = new Object();

    /* renamed from: f */
    public boolean f6460f = false;

    /* renamed from: l */
    private void m5663l() {
        if (this.f6456b == null) {
            this.f6456b = C7862g.m9537b(super.getContext(), this);
            this.f6457c = AbstractC7728a.m9209a(super.getContext());
        }
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5664j().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f6457c) {
            return null;
        }
        m5663l();
        return this.f6456b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9403b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: j */
    public final C7862g m5664j() {
        if (this.f6458d == null) {
            synchronized (this.f6459e) {
                try {
                    if (this.f6458d == null) {
                        this.f6458d = m5665k();
                    }
                } finally {
                }
            }
        }
        return this.f6458d;
    }

    /* renamed from: k */
    public C7862g m5665k() {
        return new C7862g(this);
    }

    /* renamed from: m */
    public void m5666m() {
        if (this.f6460f) {
            return;
        }
        this.f6460f = true;
        ((InterfaceC4432m) generatedComponent()).mo1500f((CustomerServiceDialog) AbstractC7951e.m9749a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5663l();
        m5666m();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C7862g.m9538c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f6456b;
        AbstractC7950d.m9748d(contextWrapper == null || C7862g.m9539d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5663l();
        m5666m();
    }
}
