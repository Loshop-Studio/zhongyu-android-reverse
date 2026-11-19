package com.zykj.study.p065ui.home.p066my;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.base.BaseFragment;
import p025b5.InterfaceC5051c3;
import p087e6.AbstractC8367a;
import p122h6.AbstractC8717a;
import p133i6.C8764f;
import p155k6.AbstractC9061c;
import p155k6.AbstractC9062d;
import p155k6.InterfaceC9060b;

/* loaded from: classes5.dex */
public abstract class Hilt_MyCourseDetailsFragment<T extends ViewDataBinding> extends BaseFragment<T> implements InterfaceC9060b {

    /* renamed from: a */
    public ContextWrapper f13077a;

    /* renamed from: b */
    public boolean f13078b;

    /* renamed from: c */
    public volatile C8764f f13079c;

    /* renamed from: d */
    public final Object f13080d = new Object();

    /* renamed from: e */
    public boolean f13081e = false;

    /* renamed from: f */
    private void m11409f() {
        if (this.f13077a == null) {
            this.f13077a = C8764f.m14470b(super.getContext(), this);
            this.f13078b = AbstractC8367a.m13653a(super.getContext());
        }
    }

    public final C8764f componentManager() {
        if (this.f13079c == null) {
            synchronized (this.f13080d) {
                try {
                    if (this.f13079c == null) {
                        this.f13079c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f13079c;
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
        if (super.getContext() == null && !this.f13078b) {
            return null;
        }
        m11409f();
        return this.f13077a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC8717a.m14222b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f13081e) {
            return;
        }
        this.f13081e = true;
        ((InterfaceC5051c3) generatedComponent()).mo2078e((MyCourseDetailsFragment) AbstractC9062d.m15864a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m11409f();
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
        ContextWrapper contextWrapper = this.f13077a;
        AbstractC9061c.m15863c(contextWrapper == null || C8764f.m14472d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m11409f();
        inject();
    }
}
