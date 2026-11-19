package com.zykj.lib.login.p062ui.teacher.pwd;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProvider;
import p087e6.AbstractC8367a;
import p122h6.AbstractC8717a;
import p133i6.C8764f;
import p155k6.AbstractC9061c;
import p155k6.AbstractC9062d;
import p155k6.InterfaceC9060b;
import p219q3.InterfaceC9800t;

/* loaded from: classes4.dex */
public abstract class Hilt_ComposeModifyPasswordDialog extends DialogFragment implements InterfaceC9060b {

    /* renamed from: a */
    public ContextWrapper f10079a;

    /* renamed from: b */
    public boolean f10080b;

    /* renamed from: c */
    public volatile C8764f f10081c;

    /* renamed from: d */
    public final Object f10082d = new Object();

    /* renamed from: e */
    public boolean f10083e = false;

    /* renamed from: f */
    private void m9361f() {
        if (this.f10079a == null) {
            this.f10079a = C8764f.m14470b(super.getContext(), this);
            this.f10080b = AbstractC8367a.m13653a(super.getContext());
        }
    }

    public final C8764f componentManager() {
        if (this.f10081c == null) {
            synchronized (this.f10082d) {
                try {
                    if (this.f10081c == null) {
                        this.f10081c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f10081c;
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
        if (super.getContext() == null && !this.f10080b) {
            return null;
        }
        m9361f();
        return this.f10079a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC8717a.m14222b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f10083e) {
            return;
        }
        this.f10083e = true;
        ((InterfaceC9800t) generatedComponent()).mo9844c0((ComposeModifyPasswordDialog) AbstractC9062d.m15864a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m9361f();
        inject();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C8764f.m14471c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f10079a;
        AbstractC9061c.m15863c(contextWrapper == null || C8764f.m14472d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9361f();
        inject();
    }
}
