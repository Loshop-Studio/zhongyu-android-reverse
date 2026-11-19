package com.zykj.study.p065ui.home.p066my;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.base.BaseFragment;
import p025b5.InterfaceC5197y0;
import p087e6.AbstractC8367a;
import p122h6.AbstractC8717a;
import p133i6.C8764f;
import p155k6.AbstractC9061c;
import p155k6.AbstractC9062d;
import p155k6.InterfaceC9060b;

/* loaded from: classes5.dex */
public abstract class Hilt_EditUserFragment<T extends ViewDataBinding> extends BaseFragment<T> implements InterfaceC9060b {

    /* renamed from: a */
    public ContextWrapper f13057a;

    /* renamed from: b */
    public boolean f13058b;

    /* renamed from: c */
    public volatile C8764f f13059c;

    /* renamed from: d */
    public final Object f13060d = new Object();

    /* renamed from: e */
    public boolean f13061e = false;

    /* renamed from: f */
    private void m11405f() {
        if (this.f13057a == null) {
            this.f13057a = C8764f.m14470b(super.getContext(), this);
            this.f13058b = AbstractC8367a.m13653a(super.getContext());
        }
    }

    public final C8764f componentManager() {
        if (this.f13059c == null) {
            synchronized (this.f13060d) {
                try {
                    if (this.f13059c == null) {
                        this.f13059c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f13059c;
    }

    public C8764f createComponentManager() {
        return new C8764f(this);
    }

    @Override // p155k6.InterfaceC9060b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f13058b) {
            return null;
        }
        m11405f();
        return this.f13057a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC8717a.m14222b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f13061e) {
            return;
        }
        this.f13061e = true;
        ((InterfaceC5197y0) generatedComponent()).mo2102O((EditUserFragment) AbstractC9062d.m15864a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m11405f();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C8764f.m14471c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f13057a;
        AbstractC9061c.m15863c(contextWrapper == null || C8764f.m14472d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m11405f();
        inject();
    }
}
