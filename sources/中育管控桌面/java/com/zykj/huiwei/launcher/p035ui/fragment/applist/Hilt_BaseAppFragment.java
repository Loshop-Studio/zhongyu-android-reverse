package com.zykj.huiwei.launcher.p035ui.fragment.applist;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.base.BaseFragment;
import p064g4.InterfaceC6408c;
import p157t4.AbstractC7728a;
import p178w4.AbstractC7815a;
import p185x4.C7862g;
import p199z4.AbstractC7950d;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_BaseAppFragment<T extends ViewDataBinding> extends BaseFragment<T> implements InterfaceC7949c {

    /* renamed from: a */
    public ContextWrapper f6810a;

    /* renamed from: b */
    public boolean f6811b;

    /* renamed from: c */
    public volatile C7862g f6812c;

    /* renamed from: d */
    public final Object f6813d = new Object();

    /* renamed from: e */
    public boolean f6814e = false;

    /* renamed from: h */
    private void m5991h() {
        if (this.f6810a == null) {
            this.f6810a = C7862g.m9537b(super.getContext(), this);
            this.f6811b = AbstractC7728a.m9209a(super.getContext());
        }
    }

    /* renamed from: f */
    public final C7862g m5992f() {
        if (this.f6812c == null) {
            synchronized (this.f6813d) {
                try {
                    if (this.f6812c == null) {
                        this.f6812c = m5993g();
                    }
                } finally {
                }
            }
        }
        return this.f6812c;
    }

    /* renamed from: g */
    public C7862g m5993g() {
        return new C7862g(this);
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5992f().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f6811b) {
            return null;
        }
        m5991h();
        return this.f6810a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9403b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: i */
    public void mo5994i() {
        if (this.f6814e) {
            return;
        }
        this.f6814e = true;
        ((InterfaceC6408c) generatedComponent()).mo5236j((BaseAppFragment) AbstractC7951e.m9749a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5991h();
        mo5994i();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C7862g.m9538c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f6810a;
        AbstractC7950d.m9748d(contextWrapper == null || C7862g.m9539d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5991h();
        mo5994i();
    }
}
