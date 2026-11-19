package com.friday.main.view;

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
import p371v3.InterfaceC11534x1;
import p438zb.AbstractC12036a;

/* loaded from: classes4.dex */
public abstract class Hilt_HuiweiAppUpdateDialog<Binding extends ViewDataBinding> extends BaseDialogFragment<Binding> implements InterfaceC9220c {

    /* renamed from: f */
    public ContextWrapper f9346f;

    /* renamed from: g */
    public boolean f9347g;

    /* renamed from: h */
    public volatile C9021g f9348h;

    /* renamed from: i */
    public final Object f9349i = new Object();

    /* renamed from: j */
    public boolean f9350j = false;

    /* renamed from: q */
    private void m7082q() {
        if (this.f9346f == null) {
            this.f9346f = C9021g.m17620b(super.getContext(), this);
            this.f9347g = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f9348h == null) {
            synchronized (this.f9349i) {
                try {
                    if (this.f9348h == null) {
                        this.f9348h = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f9348h;
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
        if (super.getContext() == null && !this.f9347g) {
            return null;
        }
        m7082q();
        return this.f9346f;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f9350j) {
            return;
        }
        this.f9350j = true;
        ((InterfaceC11534x1) generatedComponent()).mo25391g((HuiweiAppUpdateDialog) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m7082q();
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
        ContextWrapper contextWrapper = this.f9346f;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m7082q();
        inject();
    }
}
