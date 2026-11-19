package com.zykj.student.dialogue.p076ui.detail;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.base.BaseDialogFragment;
import p200o6.InterfaceC9222u;
import p245s7.AbstractC9589a;
import p275v7.AbstractC9769a;
import p285w7.C9841f;
import p305y7.AbstractC9967c;
import p305y7.AbstractC9968d;
import p305y7.InterfaceC9966b;

/* loaded from: classes5.dex */
public abstract class Hilt_DeleteDialogFragment<T extends ViewDataBinding> extends BaseDialogFragment<T> implements InterfaceC9966b {

    /* renamed from: a */
    public ContextWrapper f11027a;

    /* renamed from: b */
    public boolean f11028b;

    /* renamed from: c */
    public volatile C9841f f11029c;

    /* renamed from: d */
    public final Object f11030d = new Object();

    /* renamed from: e */
    public boolean f11031e = false;

    /* renamed from: c */
    public final C9841f m10357c() {
        if (this.f11029c == null) {
            synchronized (this.f11030d) {
                try {
                    if (this.f11029c == null) {
                        this.f11029c = m10358d();
                    }
                } finally {
                }
            }
        }
        return this.f11029c;
    }

    /* renamed from: d */
    public C9841f m10358d() {
        return new C9841f(this);
    }

    /* renamed from: e */
    public final void m10359e() {
        if (this.f11027a == null) {
            this.f11027a = C9841f.m16773b(super.getContext(), this);
            this.f11028b = AbstractC9589a.m15761a(super.getContext());
        }
    }

    /* renamed from: f */
    public void m10360f() {
        if (this.f11031e) {
            return;
        }
        this.f11031e = true;
        ((InterfaceC9222u) generatedComponent()).mo12846r((DeleteDialogFragment) AbstractC9968d.m17240a(this));
    }

    @Override // p305y7.InterfaceC9966b
    public final Object generatedComponent() {
        return m10357c().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f11028b) {
            return null;
        }
        m10359e();
        return this.f11027a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC9769a.m16551b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10359e();
        m10360f();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9841f.m16774c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f11027a;
        AbstractC9967c.m17239c(contextWrapper == null || C9841f.m16775d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10359e();
        m10360f();
    }
}
