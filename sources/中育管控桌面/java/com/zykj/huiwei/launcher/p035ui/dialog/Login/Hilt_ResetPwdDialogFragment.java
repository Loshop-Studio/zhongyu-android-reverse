package com.zykj.huiwei.launcher.p035ui.dialog.Login;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProvider;
import p027c4.InterfaceC4508v;
import p157t4.AbstractC7728a;
import p178w4.AbstractC7815a;
import p185x4.C7862g;
import p199z4.AbstractC7950d;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_ResetPwdDialogFragment extends DialogFragment implements InterfaceC7949c {

    /* renamed from: a */
    public ContextWrapper f6481a;

    /* renamed from: b */
    public boolean f6482b;

    /* renamed from: c */
    public volatile C7862g f6483c;

    /* renamed from: d */
    public final Object f6484d = new Object();

    /* renamed from: e */
    public boolean f6485e = false;

    /* renamed from: h */
    private void m5683h() {
        if (this.f6481a == null) {
            this.f6481a = C7862g.m9537b(super.getContext(), this);
            this.f6482b = AbstractC7728a.m9209a(super.getContext());
        }
    }

    /* renamed from: f */
    public final C7862g m5684f() {
        if (this.f6483c == null) {
            synchronized (this.f6484d) {
                try {
                    if (this.f6483c == null) {
                        this.f6483c = m5685g();
                    }
                } finally {
                }
            }
        }
        return this.f6483c;
    }

    /* renamed from: g */
    public C7862g m5685g() {
        return new C7862g(this);
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5684f().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f6482b) {
            return null;
        }
        m5683h();
        return this.f6481a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9403b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: i */
    public void m5686i() {
        if (this.f6485e) {
            return;
        }
        this.f6485e = true;
        ((InterfaceC4508v) generatedComponent()).mo1600c((ResetPwdDialogFragment) AbstractC7951e.m9749a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5683h();
        m5686i();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C7862g.m9538c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f6481a;
        AbstractC7950d.m9748d(contextWrapper == null || C7862g.m9539d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5683h();
        m5686i();
    }
}
