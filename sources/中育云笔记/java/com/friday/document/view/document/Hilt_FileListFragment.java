package com.friday.document.view.document;

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
import p370v2.InterfaceC11436l;
import p438zb.AbstractC12036a;

/* loaded from: classes3.dex */
public abstract class Hilt_FileListFragment<Binding extends ViewDataBinding> extends BaseFragment<Binding> implements InterfaceC9220c {

    /* renamed from: d */
    public ContextWrapper f7370d;

    /* renamed from: e */
    public boolean f7371e;

    /* renamed from: f */
    public volatile C9021g f7372f;

    /* renamed from: g */
    public final Object f7373g = new Object();

    /* renamed from: h */
    public boolean f7374h = false;

    /* renamed from: q */
    private void m5884q() {
        if (this.f7370d == null) {
            this.f7370d = C9021g.m17620b(super.getContext(), this);
            this.f7371e = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f7372f == null) {
            synchronized (this.f7373g) {
                try {
                    if (this.f7372f == null) {
                        this.f7372f = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f7372f;
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
        if (super.getContext() == null && !this.f7371e) {
            return null;
        }
        m5884q();
        return this.f7370d;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f7374h) {
            return;
        }
        this.f7374h = true;
        ((InterfaceC11436l) generatedComponent()).mo25373i((FileListFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5884q();
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
        ContextWrapper contextWrapper = this.f7370d;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5884q();
        inject();
    }
}
