package com.zykj.study.p065ui.home.exercise.train;

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
import p297x4.InterfaceC10497a0;

/* loaded from: classes5.dex */
public abstract class Hilt_MicroPlayDialogFragment<T extends ViewDataBinding> extends BaseDialogFragment<T> implements InterfaceC9060b {

    /* renamed from: a */
    public ContextWrapper f12261a;

    /* renamed from: b */
    public boolean f12262b;

    /* renamed from: c */
    public volatile C8764f f12263c;

    /* renamed from: d */
    public final Object f12264d = new Object();

    /* renamed from: e */
    public boolean f12265e = false;

    /* renamed from: f */
    private void m10864f() {
        if (this.f12261a == null) {
            this.f12261a = C8764f.m14470b(super.getContext(), this);
            this.f12262b = AbstractC8367a.m13653a(super.getContext());
        }
    }

    public final C8764f componentManager() {
        if (this.f12263c == null) {
            synchronized (this.f12264d) {
                try {
                    if (this.f12263c == null) {
                        this.f12263c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f12263c;
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
        if (super.getContext() == null && !this.f12262b) {
            return null;
        }
        m10864f();
        return this.f12261a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC8717a.m14222b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f12265e) {
            return;
        }
        this.f12265e = true;
        ((InterfaceC10497a0) generatedComponent()).mo9838W((MicroPlayDialogFragment) AbstractC9062d.m15864a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10864f();
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
        ContextWrapper contextWrapper = this.f12261a;
        AbstractC9061c.m15863c(contextWrapper == null || C8764f.m14472d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10864f();
        inject();
    }
}
