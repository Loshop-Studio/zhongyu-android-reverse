package com.zykj.huiwei.launcher.p035ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.huiwei.launcher.base.CommonDialogFragment;
import p019b4.InterfaceC4436q;
import p157t4.AbstractC7728a;
import p178w4.AbstractC7815a;
import p185x4.C7862g;
import p199z4.AbstractC7950d;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_ModifyPasswordDialog<DataBinding extends ViewDataBinding> extends CommonDialogFragment<DataBinding> implements InterfaceC7949c {

    /* renamed from: b */
    public ContextWrapper f6466b;

    /* renamed from: c */
    public boolean f6467c;

    /* renamed from: d */
    public volatile C7862g f6468d;

    /* renamed from: e */
    public final Object f6469e = new Object();

    /* renamed from: f */
    public boolean f6470f = false;

    /* renamed from: l */
    private void m5671l() {
        if (this.f6466b == null) {
            this.f6466b = C7862g.m9537b(super.getContext(), this);
            this.f6467c = AbstractC7728a.m9209a(super.getContext());
        }
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5672j().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f6467c) {
            return null;
        }
        m5671l();
        return this.f6466b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9403b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: j */
    public final C7862g m5672j() {
        if (this.f6468d == null) {
            synchronized (this.f6469e) {
                try {
                    if (this.f6468d == null) {
                        this.f6468d = m5673k();
                    }
                } finally {
                }
            }
        }
        return this.f6468d;
    }

    /* renamed from: k */
    public C7862g m5673k() {
        return new C7862g(this);
    }

    /* renamed from: m */
    public void m5674m() {
        if (this.f6470f) {
            return;
        }
        this.f6470f = true;
        ((InterfaceC4436q) generatedComponent()).mo1502q((ModifyPasswordDialog) AbstractC7951e.m9749a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5671l();
        m5674m();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C7862g.m9538c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f6466b;
        AbstractC7950d.m9748d(contextWrapper == null || C7862g.m9539d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5671l();
        m5674m();
    }
}
