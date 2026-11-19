package com.friday.lecture.view;

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
import p232l3.InterfaceC10135g;
import p438zb.AbstractC12036a;

/* loaded from: classes4.dex */
public abstract class Hilt_LectureDialogFragment<Binding extends ViewDataBinding> extends BaseDialogFragment<Binding> implements InterfaceC9220c {

    /* renamed from: f */
    public ContextWrapper f8889f;

    /* renamed from: g */
    public boolean f8890g;

    /* renamed from: h */
    public volatile C9021g f8891h;

    /* renamed from: i */
    public final Object f8892i = new Object();

    /* renamed from: j */
    public boolean f8893j = false;

    /* renamed from: q */
    private void m6803q() {
        if (this.f8889f == null) {
            this.f8889f = C9021g.m17620b(super.getContext(), this);
            this.f8890g = AbstractC12036a.m26662a(super.getContext());
        }
    }

    public final C9021g componentManager() {
        if (this.f8891h == null) {
            synchronized (this.f8892i) {
                try {
                    if (this.f8891h == null) {
                        this.f8891h = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f8891h;
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
        if (super.getContext() == null && !this.f8890g) {
            return null;
        }
        m6803q();
        return this.f8889f;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC5418a.m2892b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f8893j) {
            return;
        }
        this.f8893j = true;
        ((InterfaceC10135g) generatedComponent()).mo21138j((LectureDialogFragment) AbstractC9222e.m18141a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m6803q();
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
        ContextWrapper contextWrapper = this.f8889f;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m6803q();
        inject();
    }
}
