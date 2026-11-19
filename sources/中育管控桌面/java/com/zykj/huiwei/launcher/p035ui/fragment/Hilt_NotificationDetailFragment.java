package com.zykj.huiwei.launcher.p035ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.huiwei.launcher.base.CommonFragment;
import p057f4.InterfaceC6328g0;
import p157t4.AbstractC7728a;
import p178w4.AbstractC7815a;
import p185x4.C7862g;
import p199z4.AbstractC7950d;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_NotificationDetailFragment<DataBinding extends ViewDataBinding> extends CommonFragment<DataBinding> implements InterfaceC7949c {

    /* renamed from: d */
    public ContextWrapper f6622d;

    /* renamed from: e */
    public boolean f6623e;

    /* renamed from: f */
    public volatile C7862g f6624f;

    /* renamed from: g */
    public final Object f6625g = new Object();

    /* renamed from: h */
    public boolean f6626h = false;

    /* renamed from: n */
    private void m5850n() {
        if (this.f6622d == null) {
            this.f6622d = C7862g.m9537b(super.getContext(), this);
            this.f6623e = AbstractC7728a.m9209a(super.getContext());
        }
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5851l().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f6623e) {
            return null;
        }
        m5850n();
        return this.f6622d;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9403b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: l */
    public final C7862g m5851l() {
        if (this.f6624f == null) {
            synchronized (this.f6625g) {
                try {
                    if (this.f6624f == null) {
                        this.f6624f = m5852m();
                    }
                } finally {
                }
            }
        }
        return this.f6624f;
    }

    /* renamed from: m */
    public C7862g m5852m() {
        return new C7862g(this);
    }

    /* renamed from: o */
    public void m5853o() {
        if (this.f6626h) {
            return;
        }
        this.f6626h = true;
        ((InterfaceC6328g0) generatedComponent()).mo5237k((NotificationDetailFragment) AbstractC7951e.m9749a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5850n();
        m5853o();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C7862g.m9538c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f6622d;
        AbstractC7950d.m9748d(contextWrapper == null || C7862g.m9539d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5850n();
        m5853o();
    }
}
