package com.zykj.lib.login.p062ui.student;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.base.BaseFragment;
import p087e6.AbstractC8367a;
import p122h6.AbstractC8717a;
import p133i6.C8764f;
import p155k6.AbstractC9061c;
import p155k6.AbstractC9062d;
import p155k6.InterfaceC9060b;
import p197o3.InterfaceC9517c;

/* loaded from: classes4.dex */
public abstract class Hilt_StudentLoginFragment<T extends ViewDataBinding> extends BaseFragment<T> implements InterfaceC9060b {

    /* renamed from: a */
    public ContextWrapper f9939a;

    /* renamed from: b */
    public boolean f9940b;

    /* renamed from: c */
    public volatile C8764f f9941c;

    /* renamed from: d */
    public final Object f9942d = new Object();

    /* renamed from: e */
    public boolean f9943e = false;

    /* renamed from: f */
    private void m9302f() {
        if (this.f9939a == null) {
            this.f9939a = C8764f.m14470b(super.getContext(), this);
            this.f9940b = AbstractC8367a.m13653a(super.getContext());
        }
    }

    public final C8764f componentManager() {
        if (this.f9941c == null) {
            synchronized (this.f9942d) {
                try {
                    if (this.f9941c == null) {
                        this.f9941c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f9941c;
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
        if (super.getContext() == null && !this.f9940b) {
            return null;
        }
        m9302f();
        return this.f9939a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC8717a.m14222b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f9943e) {
            return;
        }
        this.f9943e = true;
        ((InterfaceC9517c) generatedComponent()).mo9861p((StudentLoginFragment) AbstractC9062d.m15864a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m9302f();
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
        ContextWrapper contextWrapper = this.f9939a;
        AbstractC9061c.m15863c(contextWrapper == null || C8764f.m14472d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9302f();
        inject();
    }
}
