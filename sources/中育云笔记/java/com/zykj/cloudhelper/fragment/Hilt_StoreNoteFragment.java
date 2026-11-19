package com.zykj.cloudhelper.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import cc.AbstractC5418a;
import p120dc.C9021g;
import p151fc.AbstractC9221d;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9220c;
import p438zb.AbstractC12036a;
import va.InterfaceC11570r;

/* loaded from: classes6.dex */
public abstract class Hilt_StoreNoteFragment<T extends ViewDataBinding> extends BaseNoteFragment<T> implements InterfaceC9220c {

    /* renamed from: e */
    public ContextWrapper f19508e;

    /* renamed from: f */
    public boolean f19509f;

    /* renamed from: g */
    public volatile C9021g f19510g;

    /* renamed from: h */
    public final Object f19511h = new Object();

    /* renamed from: i */
    public boolean f19512i = false;

    /* renamed from: v */
    private void m16435v() {
        if (this.f19508e == null) {
            this.f19508e = C9021g.m17620b(super.getContext(), this);
            this.f19509f = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f19510g == null) {
            synchronized (this.f19511h) {
                try {
                    if (this.f19510g == null) {
                        this.f19510g = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f19510g;
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
        if (super.getContext() == null && !this.f19509f) {
            return null;
        }
        m16435v();
        return this.f19508e;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f19512i) {
            return;
        }
        this.f19512i = true;
        ((InterfaceC11570r) generatedComponent()).mo25471l((StoreNoteFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m16435v();
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
        ContextWrapper contextWrapper = this.f19508e;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m16435v();
        inject();
    }
}
