package com.friday.paint.view.six;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import cc.AbstractC5418a;
import com.friday.common.base.BaseFragment;
import p112d4.InterfaceC8975s0;
import p120dc.C9021g;
import p151fc.AbstractC9221d;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9220c;
import p438zb.AbstractC12036a;

/* loaded from: classes4.dex */
public abstract class Hilt_NewPaintFragment<Binding extends ViewDataBinding> extends BaseFragment<Binding> implements InterfaceC9220c {
    private ContextWrapper componentContext;
    private volatile C9021g componentManager;
    private boolean disableGetContextFix;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    /* renamed from: q */
    private void m7538q() {
        if (this.componentContext == null) {
            this.componentContext = C9021g.m17620b(super.getContext(), this);
            this.disableGetContextFix = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public C9021g createComponentManager() {
        return new C9021g(this);
    }

    @Override // p151fc.InterfaceC9219b
    public final Object generatedComponent() {
        return m33977componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.disableGetContextFix) {
            return null;
        }
        m7538q();
        return this.componentContext;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((InterfaceC8975s0) generatedComponent()).mo17531f((NewPaintFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(Context context) {
        super.onAttach(context);
        m7538q();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9021g.m17621c(layoutInflaterOnGetLayoutInflater, this));
    }

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final C9021g m33977componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.componentManager;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.componentContext;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m7538q();
        inject();
    }
}
