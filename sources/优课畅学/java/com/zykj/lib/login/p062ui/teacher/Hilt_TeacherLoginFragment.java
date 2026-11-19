package com.zykj.lib.login.p062ui.teacher;

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
import p208p3.InterfaceC9645c;

/* loaded from: classes4.dex */
public abstract class Hilt_TeacherLoginFragment<T extends ViewDataBinding> extends BaseFragment<T> implements InterfaceC9060b {

    /* renamed from: a */
    public ContextWrapper f9956a;

    /* renamed from: b */
    public boolean f9957b;

    /* renamed from: c */
    public volatile C8764f f9958c;

    /* renamed from: d */
    public final Object f9959d = new Object();

    /* renamed from: e */
    public boolean f9960e = false;

    /* renamed from: f */
    private void m9310f() {
        if (this.f9956a == null) {
            this.f9956a = C8764f.m14470b(super.getContext(), this);
            this.f9957b = AbstractC8367a.m13653a(super.getContext());
        }
    }

    public final C8764f componentManager() {
        if (this.f9958c == null) {
            synchronized (this.f9959d) {
                try {
                    if (this.f9958c == null) {
                        this.f9958c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f9958c;
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
        if (super.getContext() == null && !this.f9957b) {
            return null;
        }
        m9310f();
        return this.f9956a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC8717a.m14222b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f9960e) {
            return;
        }
        this.f9960e = true;
        ((InterfaceC9645c) generatedComponent()).mo9822A((TeacherLoginFragment) AbstractC9062d.m15864a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m9310f();
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
        ContextWrapper contextWrapper = this.f9956a;
        AbstractC9061c.m15863c(contextWrapper == null || C8764f.m14472d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9310f();
        inject();
    }
}
