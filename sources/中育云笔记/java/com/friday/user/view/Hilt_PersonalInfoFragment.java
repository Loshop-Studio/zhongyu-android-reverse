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
import p172h4.InterfaceC9484q;
import p438zb.AbstractC12036a;

/* loaded from: classes5.dex */
public abstract class Hilt_PersonalInfoFragment extends SimpleFragment implements InterfaceC9220c {

    /* renamed from: f */
    public ContextWrapper f10641f;

    /* renamed from: g */
    public boolean f10642g;

    /* renamed from: h */
    public volatile C9021g f10643h;

    /* renamed from: i */
    public final Object f10644i = new Object();

    /* renamed from: j */
    public boolean f10645j = false;

    /* renamed from: p */
    private void m7783p() {
        if (this.f10641f == null) {
            this.f10641f = C9021g.m17620b(super.getContext(), this);
            this.f10642g = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f10643h == null) {
            synchronized (this.f10644i) {
                try {
                    if (this.f10643h == null) {
                        this.f10643h = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f10643h;
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
        if (super.getContext() == null && !this.f10642g) {
            return null;
        }
        m7783p();
        return this.f10641f;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f10645j) {
            return;
        }
        this.f10645j = true;
        ((InterfaceC9484q) generatedComponent()).mo18652A((PersonalInfoFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m7783p();
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
        ContextWrapper contextWrapper = this.f10641f;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m7783p();
        inject();
    }
}
