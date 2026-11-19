package com.friday.user.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import cc.AbstractC5418a;
import com.friday.common.base.SimpleFragment;
import p120dc.C9021g;
import p151fc.AbstractC9221d;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9220c;
import p172h4.InterfaceC9479l;
import p438zb.AbstractC12036a;

/* loaded from: classes5.dex */
public abstract class Hilt_HelpFragment extends SimpleFragment implements InterfaceC9220c {

    /* renamed from: f */
    public ContextWrapper f10636f;

    /* renamed from: g */
    public boolean f10637g;

    /* renamed from: h */
    public volatile C9021g f10638h;

    /* renamed from: i */
    public final Object f10639i = new Object();

    /* renamed from: j */
    public boolean f10640j = false;

    /* renamed from: p */
    private void m7782p() {
        if (this.f10636f == null) {
            this.f10636f = C9021g.m17620b(super.getContext(), this);
            this.f10637g = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f10638h == null) {
            synchronized (this.f10639i) {
                try {
                    if (this.f10638h == null) {
                        this.f10638h = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f10638h;
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
        if (super.getContext() == null && !this.f10637g) {
            return null;
        }
        m7782p();
        return this.f10636f;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f10640j) {
            return;
        }
        this.f10640j = true;
        ((InterfaceC9479l) generatedComponent()).mo18651d((HelpFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m7782p();
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
        ContextWrapper contextWrapper = this.f10636f;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m7782p();
        inject();
    }
}
