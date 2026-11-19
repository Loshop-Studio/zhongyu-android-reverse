package com.friday.login.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import cc.AbstractC5418a;
import com.friday.common.base.BaseDialogFragment;
import p120dc.C9021g;
import p151fc.AbstractC9221d;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9220c;
import p287p3.InterfaceC10626l;
import p438zb.AbstractC12036a;

/* loaded from: classes4.dex */
public abstract class Hilt_SMSVerificationDialog<Binding extends ViewDataBinding> extends BaseDialogFragment<Binding> implements InterfaceC9220c {

    /* renamed from: f */
    public ContextWrapper f9037f;

    /* renamed from: g */
    public boolean f9038g;

    /* renamed from: h */
    public volatile C9021g f9039h;

    /* renamed from: i */
    public final Object f9040i = new Object();

    /* renamed from: j */
    public boolean f9041j = false;

    /* renamed from: q */
    private void m6870q() {
        if (this.f9037f == null) {
            this.f9037f = C9021g.m17620b(super.getContext(), this);
            this.f9038g = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f9039h == null) {
            synchronized (this.f9040i) {
                try {
                    if (this.f9039h == null) {
                        this.f9039h = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f9039h;
    }

    public C9021g createComponentManager() {
        return new C9021g(this);
    }

    @Override // p151fc.InterfaceC9219b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f9038g) {
            return null;
        }
        m6870q();
        return this.f9037f;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f9041j) {
            return;
        }
        this.f9041j = true;
        ((InterfaceC10626l) generatedComponent()).mo22466q((SMSVerificationDialog) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m6870q();
        inject();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9021g.m17621c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f9037f;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m6870q();
        inject();
    }
}
