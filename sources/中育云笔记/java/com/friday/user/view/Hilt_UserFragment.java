package com.friday.user.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import cc.AbstractC5418a;
import com.friday.common.base.BaseFragment;
import p120dc.C9021g;
import p151fc.AbstractC9221d;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9220c;
import p172h4.InterfaceC9490w;
import p438zb.AbstractC12036a;

/* loaded from: classes5.dex */
public abstract class Hilt_UserFragment<Binding extends ViewDataBinding> extends BaseFragment<Binding> implements InterfaceC9220c {

    /* renamed from: d */
    public ContextWrapper f10646d;

    /* renamed from: e */
    public boolean f10647e;

    /* renamed from: f */
    public volatile C9021g f10648f;

    /* renamed from: g */
    public final Object f10649g = new Object();

    /* renamed from: h */
    public boolean f10650h = false;

    /* renamed from: q */
    private void m7784q() {
        if (this.f10646d == null) {
            this.f10646d = C9021g.m17620b(super.getContext(), this);
            this.f10647e = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f10648f == null) {
            synchronized (this.f10649g) {
                try {
                    if (this.f10648f == null) {
                        this.f10648f = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f10648f;
    }

    public C9021g createComponentManager() {
        return new C9021g(this);
    }

    @Override // p151fc.InterfaceC9219b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f10647e) {
            return null;
        }
        m7784q();
        return this.f10646d;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f10650h) {
            return;
        }
        this.f10650h = true;
        ((InterfaceC9490w) generatedComponent()).mo18653I((UserFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m7784q();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9021g.m17621c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f10646d;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m7784q();
        inject();
    }
}
