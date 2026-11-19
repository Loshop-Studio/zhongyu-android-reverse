package com.zykj.huiwei.launcher.p035ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.huiwei.launcher.base.CommonDialogFragment;
import p019b4.InterfaceC4431l;
import p157t4.AbstractC7728a;
import p178w4.AbstractC7815a;
import p185x4.C7862g;
import p199z4.AbstractC7950d;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_CrashHintDialog<DataBinding extends ViewDataBinding> extends CommonDialogFragment<DataBinding> implements InterfaceC7949c {

    /* renamed from: b */
    public ContextWrapper f6451b;

    /* renamed from: c */
    public boolean f6452c;

    /* renamed from: d */
    public volatile C7862g f6453d;

    /* renamed from: e */
    public final Object f6454e = new Object();

    /* renamed from: f */
    public boolean f6455f = false;

    /* renamed from: l */
    private void m5659l() {
        if (this.f6451b == null) {
            this.f6451b = C7862g.m9537b(super.getContext(), this);
            this.f6452c = AbstractC7728a.m9209a(super.getContext());
        }
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5660j().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f6452c) {
            return null;
        }
        m5659l();
        return this.f6451b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9403b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: j */
    public final C7862g m5660j() {
        if (this.f6453d == null) {
            synchronized (this.f6454e) {
                try {
                    if (this.f6453d == null) {
                        this.f6453d = m5661k();
                    }
                } finally {
                }
            }
        }
        return this.f6453d;
    }

    /* renamed from: k */
    public C7862g m5661k() {
        return new C7862g(this);
    }

    /* renamed from: m */
    public void m5662m() {
        if (this.f6455f) {
            return;
        }
        this.f6455f = true;
        ((InterfaceC4431l) generatedComponent()).mo1499p((CrashHintDialog) AbstractC7951e.m9749a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5659l();
        m5662m();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C7862g.m9538c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f6451b;
        AbstractC7950d.m9748d(contextWrapper == null || C7862g.m9539d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5659l();
        m5662m();
    }
}
