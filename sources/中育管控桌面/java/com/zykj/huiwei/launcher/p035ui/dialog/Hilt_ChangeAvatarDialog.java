package com.zykj.huiwei.launcher.p035ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.zykj.huiwei.launcher.base.CommonDialogFragment;
import p019b4.InterfaceC4428i;
import p157t4.AbstractC7728a;
import p178w4.AbstractC7815a;
import p185x4.C7862g;
import p199z4.AbstractC7950d;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_ChangeAvatarDialog<DataBinding extends ViewDataBinding> extends CommonDialogFragment<DataBinding> implements InterfaceC7949c {

    /* renamed from: b */
    public ContextWrapper f6446b;

    /* renamed from: c */
    public boolean f6447c;

    /* renamed from: d */
    public volatile C7862g f6448d;

    /* renamed from: e */
    public final Object f6449e = new Object();

    /* renamed from: f */
    public boolean f6450f = false;

    /* renamed from: l */
    private void m5655l() {
        if (this.f6446b == null) {
            this.f6446b = C7862g.m9537b(super.getContext(), this);
            this.f6447c = AbstractC7728a.m9209a(super.getContext());
        }
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5656j().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f6447c) {
            return null;
        }
        m5655l();
        return this.f6446b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9403b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: j */
    public final C7862g m5656j() {
        if (this.f6448d == null) {
            synchronized (this.f6449e) {
                try {
                    if (this.f6448d == null) {
                        this.f6448d = m5657k();
                    }
                } finally {
                }
            }
        }
        return this.f6448d;
    }

    /* renamed from: k */
    public C7862g m5657k() {
        return new C7862g(this);
    }

    /* renamed from: m */
    public void m5658m() {
        if (this.f6450f) {
            return;
        }
        this.f6450f = true;
        ((InterfaceC4428i) generatedComponent()).mo1498o((ChangeAvatarDialog) AbstractC7951e.m9749a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5655l();
        m5658m();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C7862g.m9538c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f6446b;
        AbstractC7950d.m9748d(contextWrapper == null || C7862g.m9539d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5655l();
        m5658m();
    }
}
