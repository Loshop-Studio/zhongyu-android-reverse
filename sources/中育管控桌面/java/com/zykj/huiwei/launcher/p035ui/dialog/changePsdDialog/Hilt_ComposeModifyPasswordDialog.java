package com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProvider;
import p043d4.InterfaceC6243w;
import p157t4.AbstractC7728a;
import p178w4.AbstractC7815a;
import p185x4.C7862g;
import p199z4.AbstractC7950d;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_ComposeModifyPasswordDialog extends DialogFragment implements InterfaceC7949c {

    /* renamed from: a */
    public ContextWrapper f6566a;

    /* renamed from: b */
    public boolean f6567b;

    /* renamed from: c */
    public volatile C7862g f6568c;

    /* renamed from: d */
    public final Object f6569d = new Object();

    /* renamed from: e */
    public boolean f6570e = false;

    /* renamed from: h */
    private void m5776h() {
        if (this.f6566a == null) {
            this.f6566a = C7862g.m9537b(super.getContext(), this);
            this.f6567b = AbstractC7728a.m9209a(super.getContext());
        }
    }

    /* renamed from: f */
    public final C7862g m5777f() {
        if (this.f6568c == null) {
            synchronized (this.f6569d) {
                try {
                    if (this.f6568c == null) {
                        this.f6568c = m5778g();
                    }
                } finally {
                }
            }
        }
        return this.f6568c;
    }

    /* renamed from: g */
    public C7862g m5778g() {
        return new C7862g(this);
    }

    @Override // p199z4.InterfaceC7948b
    public final Object generatedComponent() {
        return m5777f().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f6567b) {
            return null;
        }
        m5776h();
        return this.f6566a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC7815a.m9403b(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: i */
    public void m5779i() {
        if (this.f6570e) {
            return;
        }
        this.f6570e = true;
        ((InterfaceC6243w) generatedComponent()).mo5232d((ComposeModifyPasswordDialog) AbstractC7951e.m9749a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5776h();
        m5779i();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C7862g.m9538c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f6566a;
        AbstractC7950d.m9748d(contextWrapper == null || C7862g.m9539d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5776h();
        m5779i();
    }
}
