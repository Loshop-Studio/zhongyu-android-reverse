package com.friday.document.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import cc.AbstractC5418a;
import com.friday.common.base.BaseFragment;
import p120dc.C9021g;
import p151fc.AbstractC9221d;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9220c;
import p355u2.InterfaceC11343k;
import p438zb.AbstractC12036a;

/* loaded from: classes3.dex */
public abstract class Hilt_FolderPreviewFragment<Binding extends ViewDataBinding> extends BaseFragment<Binding> implements InterfaceC9220c {

    /* renamed from: d */
    public ContextWrapper f7137d;

    /* renamed from: e */
    public boolean f7138e;

    /* renamed from: f */
    public volatile C9021g f7139f;

    /* renamed from: g */
    public final Object f7140g = new Object();

    /* renamed from: h */
    public boolean f7141h = false;

    /* renamed from: q */
    private void m5695q() {
        if (this.f7137d == null) {
            this.f7137d = C9021g.m17620b(super.getContext(), this);
            this.f7138e = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f7139f == null) {
            synchronized (this.f7140g) {
                try {
                    if (this.f7139f == null) {
                        this.f7139f = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f7139f;
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
        if (super.getContext() == null && !this.f7138e) {
            return null;
        }
        m5695q();
        return this.f7137d;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f7141h) {
            return;
        }
        this.f7141h = true;
        ((InterfaceC11343k) generatedComponent()).mo25273F((FolderPreviewFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5695q();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9021g.m17621c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f7137d;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5695q();
        inject();
    }
}
