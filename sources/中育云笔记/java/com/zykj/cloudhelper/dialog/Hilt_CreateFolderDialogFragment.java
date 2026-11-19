package com.zykj.cloudhelper.dialog;

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
import p349ta.InterfaceC11262c;
import p438zb.AbstractC12036a;

/* loaded from: classes6.dex */
public abstract class Hilt_CreateFolderDialogFragment<Binding extends ViewDataBinding> extends BaseDialogFragment<Binding> implements InterfaceC9220c {

    /* renamed from: f */
    public ContextWrapper f19502f;

    /* renamed from: g */
    public boolean f19503g;

    /* renamed from: h */
    public volatile C9021g f19504h;

    /* renamed from: i */
    public final Object f19505i = new Object();

    /* renamed from: j */
    public boolean f19506j = false;

    /* renamed from: q */
    private void m16429q() {
        if (this.f19502f == null) {
            this.f19502f = C9021g.m17620b(super.getContext(), this);
            this.f19503g = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f19504h == null) {
            synchronized (this.f19505i) {
                try {
                    if (this.f19504h == null) {
                        this.f19504h = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f19504h;
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
        if (super.getContext() == null && !this.f19503g) {
            return null;
        }
        m16429q();
        return this.f19502f;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f19506j) {
            return;
        }
        this.f19506j = true;
        ((InterfaceC11262c) generatedComponent()).mo25190r((CreateFolderDialogFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m16429q();
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
        ContextWrapper contextWrapper = this.f19502f;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m16429q();
        inject();
    }
}
