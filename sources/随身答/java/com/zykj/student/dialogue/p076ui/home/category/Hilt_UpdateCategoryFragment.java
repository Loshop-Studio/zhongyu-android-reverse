package com.zykj.student.dialogue.p076ui.home.category;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.base.BaseFragment;
import p245s7.AbstractC9589a;
import p254t6.InterfaceC9633p;
import p275v7.AbstractC9769a;
import p285w7.C9841f;
import p305y7.AbstractC9967c;
import p305y7.AbstractC9968d;
import p305y7.InterfaceC9966b;

/* loaded from: classes5.dex */
public abstract class Hilt_UpdateCategoryFragment<T extends ViewDataBinding> extends BaseFragment<T> implements InterfaceC9966b {

    /* renamed from: a */
    public ContextWrapper f11830a;

    /* renamed from: b */
    public boolean f11831b;

    /* renamed from: c */
    public volatile C9841f f11832c;

    /* renamed from: d */
    public final Object f11833d = new Object();

    /* renamed from: e */
    public boolean f11834e = false;

    /* renamed from: e */
    private void m10973e() {
        if (this.f11830a == null) {
            this.f11830a = C9841f.m16773b(super.getContext(), this);
            this.f11831b = AbstractC9589a.m15761a(super.getContext());
        }
    }

    /* renamed from: c */
    public final C9841f m10974c() {
        if (this.f11832c == null) {
            synchronized (this.f11833d) {
                try {
                    if (this.f11832c == null) {
                        this.f11832c = m10975d();
                    }
                } finally {
                }
            }
        }
        return this.f11832c;
    }

    /* renamed from: d */
    public C9841f m10975d() {
        return new C9841f(this);
    }

    /* renamed from: f */
    public void m10976f() {
        if (this.f11834e) {
            return;
        }
        this.f11834e = true;
        ((InterfaceC9633p) generatedComponent()).mo12834f((UpdateCategoryFragment) AbstractC9968d.m17240a(this));
    }

    @Override // p305y7.InterfaceC9966b
    public final Object generatedComponent() {
        return m10974c().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f11831b) {
            return null;
        }
        m10973e();
        return this.f11830a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC9769a.m16551b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10973e();
        m10976f();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9841f.m16774c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f11830a;
        AbstractC9967c.m17239c(contextWrapper == null || C9841f.m16775d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10973e();
        m10976f();
    }
}
