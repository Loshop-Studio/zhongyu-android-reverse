package com.zykj.huiwei.launcher.p035ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.huiwei.launcher.base.CommonFragment;
import p057f4.InterfaceC6337l;
import p157t4.AbstractC7728a;
import p178w4.AbstractC7815a;
import p185x4.C7862g;
import p199z4.AbstractC7950d;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_HomeFragment<DataBinding extends ViewDataBinding> extends CommonFragment<DataBinding> implements InterfaceC7949c {

    /* renamed from: d */
    public ContextWrapper f6607d;

    /* renamed from: e */
    public boolean f6608e;

    /* renamed from: f */
    public volatile C7862g f6609f;

    /* renamed from: g */
    public final Object f6610g = new Object();

    /* renamed from: h */
    public boolean f6611h = false;

    /* renamed from: n */
    private void m5838n() {
        if (this.f6607d == null) {
            this.f6607d = C7862g.m9537b(super.getContext(), this);
            this.f6608e = AbstractC7728a.m9209a(super.getContext());
        }
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5839l().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f6608e) {
            return null;
        }
        m5838n();
        return this.f6607d;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9403b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: l */
    public final C7862g m5839l() {
        if (this.f6609f == null) {
            synchronized (this.f6610g) {
                try {
                    if (this.f6609f == null) {
                        this.f6609f = m5840m();
                    }
                } finally {
                }
            }
        }
        return this.f6609f;
    }

    /* renamed from: m */
    public C7862g m5840m() {
        return new C7862g(this);
    }

    /* renamed from: o */
    public void m5841o() {
        if (this.f6611h) {
            return;
        }
        this.f6611h = true;
        ((InterfaceC6337l) generatedComponent()).mo5234g((HomeFragment) AbstractC7951e.m9749a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5838n();
        m5841o();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C7862g.m9538c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f6607d;
        AbstractC7950d.m9748d(contextWrapper == null || C7862g.m9539d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5838n();
        m5841o();
    }
}
