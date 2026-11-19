package com.zykj.huiwei.launcher.p035ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.huiwei.launcher.base.CommonDialogFragment;
import p019b4.InterfaceC4439t;
import p157t4.AbstractC7728a;
import p178w4.AbstractC7815a;
import p185x4.C7862g;
import p199z4.AbstractC7950d;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_UnAuthorDialog<DataBinding extends ViewDataBinding> extends CommonDialogFragment<DataBinding> implements InterfaceC7949c {

    /* renamed from: b */
    public ContextWrapper f6476b;

    /* renamed from: c */
    public boolean f6477c;

    /* renamed from: d */
    public volatile C7862g f6478d;

    /* renamed from: e */
    public final Object f6479e = new Object();

    /* renamed from: f */
    public boolean f6480f = false;

    /* renamed from: l */
    private void m5679l() {
        if (this.f6476b == null) {
            this.f6476b = C7862g.m9537b(super.getContext(), this);
            this.f6477c = AbstractC7728a.m9209a(super.getContext());
        }
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5680j().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f6477c) {
            return null;
        }
        m5679l();
        return this.f6476b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9403b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: j */
    public final C7862g m5680j() {
        if (this.f6478d == null) {
            synchronized (this.f6479e) {
                try {
                    if (this.f6478d == null) {
                        this.f6478d = m5681k();
                    }
                } finally {
                }
            }
        }
        return this.f6478d;
    }

    /* renamed from: k */
    public C7862g m5681k() {
        return new C7862g(this);
    }

    /* renamed from: m */
    public void m5682m() {
        if (this.f6480f) {
            return;
        }
        this.f6480f = true;
        ((InterfaceC4439t) generatedComponent()).mo1504l((UnAuthorDialog) AbstractC7951e.m9749a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5679l();
        m5682m();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C7862g.m9538c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f6476b;
        AbstractC7950d.m9748d(contextWrapper == null || C7862g.m9539d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5679l();
        m5682m();
    }
}
