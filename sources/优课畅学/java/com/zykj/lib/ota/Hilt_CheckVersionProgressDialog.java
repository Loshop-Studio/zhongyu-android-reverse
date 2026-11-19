package com.zykj.lib.ota;

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
import p241s3.InterfaceC9975d;

/* loaded from: classes4.dex */
public abstract class Hilt_CheckVersionProgressDialog<T extends ViewDataBinding> extends BaseDialogFragment<T> implements InterfaceC9060b {

    /* renamed from: a */
    public ContextWrapper f10176a;

    /* renamed from: b */
    public boolean f10177b;

    /* renamed from: c */
    public volatile C8764f f10178c;

    /* renamed from: d */
    public final Object f10179d = new Object();

    /* renamed from: e */
    public boolean f10180e = false;

    /* renamed from: f */
    private void m9430f() {
        if (this.f10176a == null) {
            this.f10176a = C8764f.m14470b(super.getContext(), this);
            this.f10177b = AbstractC8367a.m13653a(super.getContext());
        }
    }

    public final C8764f componentManager() {
        if (this.f10178c == null) {
            synchronized (this.f10179d) {
                try {
                    if (this.f10178c == null) {
                        this.f10178c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f10178c;
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
        if (super.getContext() == null && !this.f10177b) {
            return null;
        }
        m9430f();
        return this.f10176a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC8717a.m14222b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f10180e) {
            return;
        }
        this.f10180e = true;
        ((InterfaceC9975d) generatedComponent()).mo9840Z((CheckVersionProgressDialog) AbstractC9062d.m15864a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m9430f();
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
        ContextWrapper contextWrapper = this.f10176a;
        AbstractC9061c.m15863c(contextWrapper == null || C8764f.m14472d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9430f();
        inject();
    }
}
