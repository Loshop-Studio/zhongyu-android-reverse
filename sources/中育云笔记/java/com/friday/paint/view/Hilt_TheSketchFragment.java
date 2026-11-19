package com.friday.paint.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import cc.AbstractC5418a;
import com.friday.common.base.BaseFragment;
import p042c4.InterfaceC5393w1;
import p120dc.C9021g;
import p151fc.AbstractC9221d;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9220c;
import p438zb.AbstractC12036a;

/* loaded from: classes4.dex */
public abstract class Hilt_TheSketchFragment<Binding extends ViewDataBinding> extends BaseFragment<Binding> implements InterfaceC9220c {

    /* renamed from: d */
    public ContextWrapper f9897d;

    /* renamed from: e */
    public boolean f9898e;

    /* renamed from: f */
    public volatile C9021g f9899f;

    /* renamed from: g */
    public final Object f9900g = new Object();

    /* renamed from: h */
    public boolean f9901h = false;

    /* renamed from: q */
    private void m7337q() {
        if (this.f9897d == null) {
            this.f9897d = C9021g.m17620b(super.getContext(), this);
            this.f9898e = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f9899f == null) {
            synchronized (this.f9900g) {
                try {
                    if (this.f9899f == null) {
                        this.f9899f = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f9899f;
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
        if (super.getContext() == null && !this.f9898e) {
            return null;
        }
        m7337q();
        return this.f9897d;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f9901h) {
            return;
        }
        this.f9901h = true;
        ((InterfaceC5393w1) generatedComponent()).mo2824E((TheSketchFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m7337q();
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
        ContextWrapper contextWrapper = this.f9897d;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m7337q();
        inject();
    }
}
