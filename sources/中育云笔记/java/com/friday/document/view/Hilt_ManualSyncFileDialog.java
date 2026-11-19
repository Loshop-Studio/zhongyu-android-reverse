package com.friday.document.view;

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
import p355u2.InterfaceC11351o;
import p438zb.AbstractC12036a;

/* loaded from: classes3.dex */
public abstract class Hilt_ManualSyncFileDialog<Binding extends ViewDataBinding> extends BaseDialogFragment<Binding> implements InterfaceC9220c {

    /* renamed from: f */
    public ContextWrapper f7142f;

    /* renamed from: g */
    public boolean f7143g;

    /* renamed from: h */
    public volatile C9021g f7144h;

    /* renamed from: i */
    public final Object f7145i = new Object();

    /* renamed from: j */
    public boolean f7146j = false;

    /* renamed from: q */
    private void m5696q() {
        if (this.f7142f == null) {
            this.f7142f = C9021g.m17620b(super.getContext(), this);
            this.f7143g = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f7144h == null) {
            synchronized (this.f7145i) {
                try {
                    if (this.f7144h == null) {
                        this.f7144h = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f7144h;
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
        if (super.getContext() == null && !this.f7143g) {
            return null;
        }
        m5696q();
        return this.f7142f;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f7146j) {
            return;
        }
        this.f7146j = true;
        ((InterfaceC11351o) generatedComponent()).mo25275c((ManualSyncFileDialog) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5696q();
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
        ContextWrapper contextWrapper = this.f7142f;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5696q();
        inject();
    }
}
