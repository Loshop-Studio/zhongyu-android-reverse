package com.zykj.study.p065ui.home.exercise.train;

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
import p297x4.InterfaceC10524n0;

/* loaded from: classes5.dex */
public abstract class Hilt_MultipleChoiceResultSuccessFragment<T extends ViewDataBinding> extends BaseFragment<T> implements InterfaceC9060b {

    /* renamed from: a */
    public ContextWrapper f12276a;

    /* renamed from: b */
    public boolean f12277b;

    /* renamed from: c */
    public volatile C8764f f12278c;

    /* renamed from: d */
    public final Object f12279d = new Object();

    /* renamed from: e */
    public boolean f12280e = false;

    /* renamed from: f */
    private void m10867f() {
        if (this.f12276a == null) {
            this.f12276a = C8764f.m14470b(super.getContext(), this);
            this.f12277b = AbstractC8367a.m13653a(super.getContext());
        }
    }

    public final C8764f componentManager() {
        if (this.f12278c == null) {
            synchronized (this.f12279d) {
                try {
                    if (this.f12278c == null) {
                        this.f12278c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f12278c;
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
        if (super.getContext() == null && !this.f12277b) {
            return null;
        }
        m10867f();
        return this.f12276a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC8717a.m14222b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f12280e) {
            return;
        }
        this.f12280e = true;
        ((InterfaceC10524n0) generatedComponent()).mo9824C((MultipleChoiceResultSuccessFragment) AbstractC9062d.m15864a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10867f();
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
        ContextWrapper contextWrapper = this.f12276a;
        AbstractC9061c.m15863c(contextWrapper == null || C8764f.m14472d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10867f();
        inject();
    }
}
