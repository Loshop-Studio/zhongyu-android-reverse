package com.friday.user.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import cc.AbstractC5418a;
import p120dc.C9021g;
import p151fc.AbstractC9221d;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9220c;
import p172h4.InterfaceC9473f;
import p438zb.AbstractC12036a;

/* loaded from: classes5.dex */
public abstract class Hilt_AboutFragment extends Fragment implements InterfaceC9220c {

    /* renamed from: d */
    public ContextWrapper f10631d;

    /* renamed from: e */
    public boolean f10632e;

    /* renamed from: f */
    public volatile C9021g f10633f;

    /* renamed from: g */
    public final Object f10634g = new Object();

    /* renamed from: h */
    public boolean f10635h = false;

    /* renamed from: o */
    private void m7781o() {
        if (this.f10631d == null) {
            this.f10631d = C9021g.m17620b(super.getContext(), this);
            this.f10632e = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f10633f == null) {
            synchronized (this.f10634g) {
                try {
                    if (this.f10633f == null) {
                        this.f10633f = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f10633f;
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
        if (super.getContext() == null && !this.f10632e) {
            return null;
        }
        m7781o();
        return this.f10631d;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f10635h) {
            return;
        }
        this.f10635h = true;
        ((InterfaceC9473f) generatedComponent()).mo18650G((AboutFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m7781o();
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
        ContextWrapper contextWrapper = this.f10631d;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m7781o();
        inject();
    }
}
