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
import p370v2.InterfaceC11445p0;
import p438zb.AbstractC12036a;

/* loaded from: classes3.dex */
public abstract class Hilt_RecycleBinFragment<VM extends BaseFileViewModel, A extends PagingDataAdapter<MultiModeFileEntity, ?>, Binding extends ViewDataBinding> extends BaseDocumentFragment<VM, A, Binding> implements InterfaceC9220c {

    /* renamed from: f */
    public ContextWrapper f7385f;

    /* renamed from: g */
    public boolean f7386g;

    /* renamed from: h */
    public volatile C9021g f7387h;

    /* renamed from: i */
    public final Object f7388i = new Object();

    /* renamed from: j */
    public boolean f7389j = false;

    /* renamed from: Q */
    private void m5887Q() {
        if (this.f7385f == null) {
            this.f7385f = C9021g.m17620b(super.getContext(), this);
            this.f7386g = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f7387h == null) {
            synchronized (this.f7388i) {
                try {
                    if (this.f7387h == null) {
                        this.f7387h = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f7387h;
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
        if (super.getContext() == null && !this.f7386g) {
            return null;
        }
        m5887Q();
        return this.f7385f;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f7389j) {
            return;
        }
        this.f7389j = true;
        ((InterfaceC11445p0) generatedComponent()).mo25374o((RecycleBinFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5887Q();
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
        ContextWrapper contextWrapper = this.f7385f;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5887Q();
        inject();
    }
}
