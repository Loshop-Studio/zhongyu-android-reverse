package com.zykj.evaluation.p057ui.datepicker;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.evaluation.base.BaseDialogFragment;
import p113h8.AbstractC7636a;
import p146k8.AbstractC7899a;
import p159l8.C8521f;
import p181n8.AbstractC8672c;
import p181n8.AbstractC8673d;
import p181n8.InterfaceC8671b;
import p255u5.InterfaceC9560l;

/* loaded from: classes4.dex */
public abstract class Hilt_DatePickerFragment<T extends ViewDataBinding> extends BaseDialogFragment<T> implements InterfaceC8671b {

    /* renamed from: a */
    public ContextWrapper f9088a;

    /* renamed from: b */
    public boolean f9089b;

    /* renamed from: c */
    public volatile C8521f f9090c;

    /* renamed from: d */
    public final Object f9091d = new Object();

    /* renamed from: e */
    public boolean f9092e = false;

    /* renamed from: e */
    private void m9247e() {
        if (this.f9088a == null) {
            this.f9088a = C8521f.m14006b(super.getContext(), this);
            this.f9089b = AbstractC7636a.m12619a(super.getContext());
        }
    }

    /* renamed from: c */
    public final C8521f m9248c() {
        if (this.f9090c == null) {
            synchronized (this.f9091d) {
                try {
                    if (this.f9090c == null) {
                        this.f9090c = m9249d();
                    }
                } finally {
                }
            }
        }
        return this.f9090c;
    }

    /* renamed from: d */
    public C8521f m9249d() {
        return new C8521f(this);
    }

    /* renamed from: f */
    public void m9250f() {
        if (this.f9092e) {
            return;
        }
        this.f9092e = true;
        ((InterfaceC9560l) generatedComponent()).mo13485b((DatePickerFragment) AbstractC8673d.m14278a(this));
    }

    @Override // p181n8.InterfaceC8671b
    public final Object generatedComponent() {
        return m9248c().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f9089b) {
            return null;
        }
        m9247e();
        return this.f9088a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7899a.m13518b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m9247e();
        m9250f();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C8521f.m14007c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f9088a;
        AbstractC8672c.m14277c(contextWrapper == null || C8521f.m14008d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9247e();
        m9250f();
    }
}
