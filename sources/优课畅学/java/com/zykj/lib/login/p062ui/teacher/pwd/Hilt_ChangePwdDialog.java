package com.zykj.lib.login.p062ui.teacher.pwd;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.base.BaseDialogFragment;
import p087e6.AbstractC8367a;
import p122h6.AbstractC8717a;
import p133i6.C8764f;
import p155k6.AbstractC9061c;
import p155k6.AbstractC9062d;
import p155k6.InterfaceC9060b;
import p219q3.InterfaceC9793m;

/* loaded from: classes4.dex */
public abstract class Hilt_ChangePwdDialog<T extends ViewDataBinding> extends BaseDialogFragment<T> implements InterfaceC9060b {

    /* renamed from: a */
    public ContextWrapper f10074a;

    /* renamed from: b */
    public boolean f10075b;

    /* renamed from: c */
    public volatile C8764f f10076c;

    /* renamed from: d */
    public final Object f10077d = new Object();

    /* renamed from: e */
    public boolean f10078e = false;

    public final C8764f componentManager() {
        if (this.f10076c == null) {
            synchronized (this.f10077d) {
                try {
                    if (this.f10076c == null) {
                        this.f10076c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f10076c;
    }

    public C8764f createComponentManager() {
        return new C8764f(this);
    }

    /* renamed from: f */
    public final void m9360f() {
        if (this.f10074a == null) {
            this.f10074a = C8764f.m14470b(super.getContext(), this);
            this.f10075b = AbstractC8367a.m13653a(super.getContext());
        }
    }

    @Override // p155k6.InterfaceC9060b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f10075b) {
            return null;
        }
        m9360f();
        return this.f10074a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC8717a.m14222b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f10078e) {
            return;
        }
        this.f10078e = true;
        ((InterfaceC9793m) generatedComponent()).mo9864s((ChangePwdDialog) AbstractC9062d.m15864a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m9360f();
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
        ContextWrapper contextWrapper = this.f10074a;
        AbstractC9061c.m15863c(contextWrapper == null || C8764f.m14472d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9360f();
        inject();
    }
}
