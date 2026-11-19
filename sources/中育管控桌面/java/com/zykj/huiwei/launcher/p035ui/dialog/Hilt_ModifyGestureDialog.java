package com.zykj.huiwei.launcher.p035ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.huiwei.launcher.base.CommonDialogFragment;
import p019b4.InterfaceC4433n;
import p157t4.AbstractC7728a;
import p178w4.AbstractC7815a;
import p185x4.C7862g;
import p199z4.AbstractC7950d;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_ModifyGestureDialog<DataBinding extends ViewDataBinding> extends CommonDialogFragment<DataBinding> implements InterfaceC7949c {

    /* renamed from: b */
    public ContextWrapper f6461b;

    /* renamed from: c */
    public boolean f6462c;

    /* renamed from: d */
    public volatile C7862g f6463d;

    /* renamed from: e */
    public final Object f6464e = new Object();

    /* renamed from: f */
    public boolean f6465f = false;

    /* renamed from: l */
    private void m5667l() {
        if (this.f6461b == null) {
            this.f6461b = C7862g.m9537b(super.getContext(), this);
            this.f6462c = AbstractC7728a.m9209a(super.getContext());
        }
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5668j().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f6462c) {
            return null;
        }
        m5667l();
        return this.f6461b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9403b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: j */
    public final C7862g m5668j() {
        if (this.f6463d == null) {
            synchronized (this.f6464e) {
                try {
                    if (this.f6463d == null) {
                        this.f6463d = m5669k();
                    }
                } finally {
                }
            }
        }
        return this.f6463d;
    }

    /* renamed from: k */
    public C7862g m5669k() {
        return new C7862g(this);
    }

    /* renamed from: m */
    public void m5670m() {
        if (this.f6465f) {
            return;
        }
        this.f6465f = true;
        ((InterfaceC4433n) generatedComponent()).mo1501s((ModifyGestureDialog) AbstractC7951e.m9749a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5667l();
        m5670m();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C7862g.m9538c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f6461b;
        AbstractC7950d.m9748d(contextWrapper == null || C7862g.m9539d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5667l();
        m5670m();
    }
}
