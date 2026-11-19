package com.zykj.study.p065ui.home.exercise;

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
import p286w4.InterfaceC10322p;

/* loaded from: classes5.dex */
public abstract class Hilt_ExerciseHistoryFragment<T extends ViewDataBinding> extends BaseFragment<T> implements InterfaceC9060b {

    /* renamed from: a */
    public ContextWrapper f11983a;

    /* renamed from: b */
    public boolean f11984b;

    /* renamed from: c */
    public volatile C8764f f11985c;

    /* renamed from: d */
    public final Object f11986d = new Object();

    /* renamed from: e */
    public boolean f11987e = false;

    /* renamed from: f */
    private void m10707f() {
        if (this.f11983a == null) {
            this.f11983a = C8764f.m14470b(super.getContext(), this);
            this.f11984b = AbstractC8367a.m13653a(super.getContext());
        }
    }

    public final C8764f componentManager() {
        if (this.f11985c == null) {
            synchronized (this.f11986d) {
                try {
                    if (this.f11985c == null) {
                        this.f11985c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f11985c;
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
        if (super.getContext() == null && !this.f11984b) {
            return null;
        }
        m10707f();
        return this.f11983a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC8717a.m14222b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f11987e) {
            return;
        }
        this.f11987e = true;
        ((InterfaceC10322p) generatedComponent()).mo9828H((ExerciseHistoryFragment) AbstractC9062d.m15864a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10707f();
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
        ContextWrapper contextWrapper = this.f11983a;
        AbstractC9061c.m15863c(contextWrapper == null || C8764f.m14472d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10707f();
        inject();
    }
}
