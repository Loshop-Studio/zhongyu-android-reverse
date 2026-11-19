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
import p370v2.InterfaceC11452w;
import p438zb.AbstractC12036a;

/* loaded from: classes3.dex */
public abstract class Hilt_FolderFragment<VM extends BaseFileViewModel, A extends PagingDataAdapter<MultiModeFileEntity, ?>, Binding extends ViewDataBinding> extends BaseDocumentFragment<VM, A, Binding> implements InterfaceC9220c {

    /* renamed from: f */
    public ContextWrapper f7375f;

    /* renamed from: g */
    public boolean f7376g;

    /* renamed from: h */
    public volatile C9021g f7377h;

    /* renamed from: i */
    public final Object f7378i = new Object();

    /* renamed from: j */
    public boolean f7379j = false;

    /* renamed from: Q */
    private void m5885Q() {
        if (this.f7375f == null) {
            this.f7375f = C9021g.m17620b(super.getContext(), this);
            this.f7376g = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f7377h == null) {
            synchronized (this.f7378i) {
                try {
                    if (this.f7377h == null) {
                        this.f7377h = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f7377h;
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
        if (super.getContext() == null && !this.f7376g) {
            return null;
        }
        m5885Q();
        return this.f7375f;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f7379j) {
            return;
        }
        this.f7379j = true;
        ((InterfaceC11452w) generatedComponent()).mo25375x((FolderFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5885Q();
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
        ContextWrapper contextWrapper = this.f7375f;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5885Q();
        inject();
    }
}
