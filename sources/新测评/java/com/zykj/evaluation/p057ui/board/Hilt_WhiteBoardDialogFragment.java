package com.zykj.evaluation.p057ui.board;

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
import p244t5.InterfaceC9404j0;

/* loaded from: classes4.dex */
public abstract class Hilt_WhiteBoardDialogFragment<T extends ViewDataBinding> extends BaseDialogFragment<T> implements InterfaceC8671b {

    /* renamed from: a */
    public ContextWrapper f9024a;

    /* renamed from: b */
    public boolean f9025b;

    /* renamed from: c */
    public volatile C8521f f9026c;

    /* renamed from: d */
    public final Object f9027d = new Object();

    /* renamed from: e */
    public boolean f9028e = false;

    /* renamed from: c */
    public final C8521f m9091c() {
        if (this.f9026c == null) {
            synchronized (this.f9027d) {
                try {
                    if (this.f9026c == null) {
                        this.f9026c = m9092d();
                    }
                } finally {
                }
            }
        }
        return this.f9026c;
    }

    /* renamed from: d */
    public C8521f m9092d() {
        return new C8521f(this);
    }

    /* renamed from: e */
    public final void m9093e() {
        if (this.f9024a == null) {
            this.f9024a = C8521f.m14006b(super.getContext(), this);
            this.f9025b = AbstractC7636a.m12619a(super.getContext());
        }
    }

    /* renamed from: f */
    public void m9094f() {
        if (this.f9028e) {
            return;
        }
        this.f9028e = true;
        ((InterfaceC9404j0) generatedComponent()).mo13487d((WhiteBoardDialogFragment) AbstractC8673d.m14278a(this));
    }

    @Override // p181n8.InterfaceC8671b
    public final Object generatedComponent() {
        return m9091c().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f9025b) {
            return null;
        }
        m9093e();
        return this.f9024a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7899a.m13518b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m9093e();
        m9094f();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C8521f.m14007c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f9024a;
        AbstractC8672c.m14277c(contextWrapper == null || C8521f.m14008d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m9093e();
        m9094f();
    }
}
