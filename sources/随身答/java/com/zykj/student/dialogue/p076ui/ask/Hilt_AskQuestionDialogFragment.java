package com.zykj.student.dialogue.p076ui.ask;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProvider;
import p180m6.InterfaceC9010n;
import p245s7.AbstractC9589a;
import p275v7.AbstractC9769a;
import p285w7.C9841f;
import p305y7.AbstractC9967c;
import p305y7.AbstractC9968d;
import p305y7.InterfaceC9966b;

/* loaded from: classes5.dex */
public abstract class Hilt_AskQuestionDialogFragment extends DialogFragment implements InterfaceC9966b {

    /* renamed from: a */
    public ContextWrapper f10667a;

    /* renamed from: b */
    public boolean f10668b;

    /* renamed from: c */
    public volatile C9841f f10669c;

    /* renamed from: d */
    public final Object f10670d = new Object();

    /* renamed from: e */
    public boolean f10671e = false;

    /* renamed from: e */
    private void m10075e() {
        if (this.f10667a == null) {
            this.f10667a = C9841f.m16773b(super.getContext(), this);
            this.f10668b = AbstractC9589a.m15761a(super.getContext());
        }
    }

    /* renamed from: c */
    public final C9841f m10076c() {
        if (this.f10669c == null) {
            synchronized (this.f10670d) {
                try {
                    if (this.f10669c == null) {
                        this.f10669c = m10077d();
                    }
                } finally {
                }
            }
        }
        return this.f10669c;
    }

    /* renamed from: d */
    public C9841f m10077d() {
        return new C9841f(this);
    }

    /* renamed from: f */
    public void m10078f() {
        if (this.f10671e) {
            return;
        }
        this.f10671e = true;
        ((InterfaceC9010n) generatedComponent()).mo12844p((AskQuestionDialogFragment) AbstractC9968d.m17240a(this));
    }

    @Override // p305y7.InterfaceC9966b
    public final Object generatedComponent() {
        return m10076c().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f10668b) {
            return null;
        }
        m10075e();
        return this.f10667a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC9769a.m16551b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10075e();
        m10078f();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9841f.m16774c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f10667a;
        AbstractC9967c.m17239c(contextWrapper == null || C9841f.m16775d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10075e();
        m10078f();
    }
}
