package com.zykj.huiwei.launcher.p035ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.base.BaseFragment;
import p057f4.InterfaceC6351w;
import p157t4.AbstractC7728a;
import p178w4.AbstractC7815a;
import p185x4.C7862g;
import p199z4.AbstractC7950d;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_LoginFragment<T extends ViewDataBinding> extends BaseFragment<T> implements InterfaceC7949c {

    /* renamed from: a */
    public ContextWrapper f6612a;

    /* renamed from: b */
    public boolean f6613b;

    /* renamed from: c */
    public volatile C7862g f6614c;

    /* renamed from: d */
    public final Object f6615d = new Object();

    /* renamed from: e */
    public boolean f6616e = false;

    /* renamed from: h */
    private void m5842h() {
        if (this.f6612a == null) {
            this.f6612a = C7862g.m9537b(super.getContext(), this);
            this.f6613b = AbstractC7728a.m9209a(super.getContext());
        }
    }

    /* renamed from: f */
    public final C7862g m5843f() {
        if (this.f6614c == null) {
            synchronized (this.f6615d) {
                try {
                    if (this.f6614c == null) {
                        this.f6614c = m5844g();
                    }
                } finally {
                }
            }
        }
        return this.f6614c;
    }

    /* renamed from: g */
    public C7862g m5844g() {
        return new C7862g(this);
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5843f().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f6613b) {
            return null;
        }
        m5842h();
        return this.f6612a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9403b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: i */
    public void m5845i() {
        if (this.f6616e) {
            return;
        }
        this.f6616e = true;
        ((InterfaceC6351w) generatedComponent()).mo5233e((LoginFragment) AbstractC7951e.m9749a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5842h();
        m5845i();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C7862g.m9538c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f6612a;
        AbstractC7950d.m9748d(contextWrapper == null || C7862g.m9539d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5842h();
        m5845i();
    }
}
