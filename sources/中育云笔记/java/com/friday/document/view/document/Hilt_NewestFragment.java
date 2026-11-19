package com.friday.document.view.document;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import androidx.paging.PagingDataAdapter;
import cc.AbstractC5418a;
import com.friday.document.adapter.MultiModeFileEntity;
import com.friday.document.viewmodel.BaseFileViewModel;
import p120dc.C9021g;
import p151fc.AbstractC9221d;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9220c;
import p370v2.InterfaceC11429h0;
import p438zb.AbstractC12036a;

/* loaded from: classes3.dex */
public abstract class Hilt_NewestFragment<VM extends BaseFileViewModel, A extends PagingDataAdapter<MultiModeFileEntity, ?>, Binding extends ViewDataBinding> extends BaseDocumentFragment<VM, A, Binding> implements InterfaceC9220c {

    /* renamed from: f */
    public ContextWrapper f7380f;

    /* renamed from: g */
    public boolean f7381g;

    /* renamed from: h */
    public volatile C9021g f7382h;

    /* renamed from: i */
    public final Object f7383i = new Object();

    /* renamed from: j */
    public boolean f7384j = false;

    /* renamed from: Q */
    private void m5886Q() {
        if (this.f7380f == null) {
            this.f7380f = C9021g.m17620b(super.getContext(), this);
            this.f7381g = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f7382h == null) {
            synchronized (this.f7383i) {
                try {
                    if (this.f7382h == null) {
                        this.f7382h = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f7382h;
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
        if (super.getContext() == null && !this.f7381g) {
            return null;
        }
        m5886Q();
        return this.f7380f;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f7384j) {
            return;
        }
        this.f7384j = true;
        ((InterfaceC11429h0) generatedComponent()).mo25372D((NewestFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5886Q();
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
        ContextWrapper contextWrapper = this.f7380f;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5886Q();
        inject();
    }
}
