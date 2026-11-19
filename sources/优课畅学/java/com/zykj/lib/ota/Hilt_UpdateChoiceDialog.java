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
import p241s3.InterfaceC9980i;

/* loaded from: classes4.dex */
public abstract class Hilt_UpdateChoiceDialog<T extends ViewDataBinding> extends BaseDialogFragment<T> implements InterfaceC9060b {

    /* renamed from: a */
    public ContextWrapper f10191a;

    /* renamed from: b */
    public boolean f10192b;

    /* renamed from: c */
    public volatile C8764f f10193c;

    /* renamed from: d */
    public final Object f10194d = new Object();

    /* renamed from: e */
    public boolean f10195e = false;

    /* renamed from: f */
    private void m9433f() {
        if (this.f10191a == null) {
            this.f10191a = C8764f.m14470b(super.getContext(), this);
            this.f10192b = AbstractC8367a.m13653a(super.getContext());
        }
    }

    public final C8764f componentManager() {
        if (this.f10193c == null) {
            synchronized (this.f10194d) {
                try {
                    if (this.f10193c == null) {
                        this.f10193c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f10193c;
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
        if (super.getContext() == null && !this.f10192b) {
            return null;
        }
        m9433f();
        return this.f10191a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC8717a.m14222b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f10195e) {
            return;
        }
        this.f10195e = true;
        ((InterfaceC9980i) generatedComponent()).mo9830L((UpdateChoiceDialog) AbstractC9062d.m15864a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m9433f();
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
        ContextWrapper contextWrapper = this.f10191a;
        AbstractC9061c.m15863c(contextWrapper == null || C8764f.m14472d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9433f();
        inject();
    }
}
