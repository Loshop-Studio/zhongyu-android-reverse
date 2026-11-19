package com.friday.common.camera;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import cc.AbstractC5418a;
import p028b2.InterfaceC5162s;
import p120dc.C9021g;
import p151fc.AbstractC9221d;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9220c;
import p438zb.AbstractC12036a;

/* loaded from: classes3.dex */
public abstract class Hilt_ImagePickFragment extends Fragment implements InterfaceC9220c {

    /* renamed from: d */
    public ContextWrapper f5673d;

    /* renamed from: e */
    public boolean f5674e;

    /* renamed from: f */
    public volatile C9021g f5675f;

    /* renamed from: g */
    public final Object f5676g = new Object();

    /* renamed from: h */
    public boolean f5677h = false;

    /* renamed from: o */
    private void m4834o() {
        if (this.f5673d == null) {
            this.f5673d = C9021g.m17620b(super.getContext(), this);
            this.f5674e = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f5675f == null) {
            synchronized (this.f5676g) {
                try {
                    if (this.f5675f == null) {
                        this.f5675f = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f5675f;
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
        if (super.getContext() == null && !this.f5674e) {
            return null;
        }
        m4834o();
        return this.f5673d;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f5677h) {
            return;
        }
        this.f5677h = true;
        ((InterfaceC5162s) generatedComponent()).mo2669B((ImagePickFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m4834o();
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
        ContextWrapper contextWrapper = this.f5673d;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m4834o();
        inject();
    }
}
