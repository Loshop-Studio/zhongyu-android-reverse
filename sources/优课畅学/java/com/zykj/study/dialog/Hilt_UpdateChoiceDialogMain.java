package com.zykj.study.dialog;

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
import p209p4.InterfaceC9672x;

/* loaded from: classes3.dex */
public abstract class Hilt_UpdateChoiceDialogMain<T extends ViewDataBinding> extends BaseDialogFragment<T> implements InterfaceC9060b {

    /* renamed from: a */
    public ContextWrapper f11208a;

    /* renamed from: b */
    public boolean f11209b;

    /* renamed from: c */
    public volatile C8764f f11210c;

    /* renamed from: d */
    public final Object f11211d = new Object();

    /* renamed from: e */
    public boolean f11212e = false;

    /* renamed from: f */
    private void m10282f() {
        if (this.f11208a == null) {
            this.f11208a = C8764f.m14470b(super.getContext(), this);
            this.f11209b = AbstractC8367a.m13653a(super.getContext());
        }
    }

    public final C8764f componentManager() {
        if (this.f11210c == null) {
            synchronized (this.f11211d) {
                try {
                    if (this.f11210c == null) {
                        this.f11210c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f11210c;
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
        if (super.getContext() == null && !this.f11209b) {
            return null;
        }
        m10282f();
        return this.f11208a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC8717a.m14222b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f11212e) {
            return;
        }
        this.f11212e = true;
        ((InterfaceC9672x) generatedComponent()).mo9860o((UpdateChoiceDialogMain) AbstractC9062d.m15864a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10282f();
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
        ContextWrapper contextWrapper = this.f11208a;
        AbstractC9061c.m15863c(contextWrapper == null || C8764f.m14472d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10282f();
        inject();
    }
}
