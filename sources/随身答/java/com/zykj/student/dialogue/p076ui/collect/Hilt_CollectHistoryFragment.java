package com.zykj.student.dialogue.p076ui.collect;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import p190n6.InterfaceC9105f;
import p245s7.AbstractC9589a;
import p275v7.AbstractC9769a;
import p285w7.C9841f;
import p305y7.AbstractC9967c;
import p305y7.AbstractC9968d;
import p305y7.InterfaceC9966b;

/* loaded from: classes5.dex */
public abstract class Hilt_CollectHistoryFragment extends Fragment implements InterfaceC9966b {

    /* renamed from: a */
    public ContextWrapper f10783a;

    /* renamed from: b */
    public boolean f10784b;

    /* renamed from: c */
    public volatile C9841f f10785c;

    /* renamed from: d */
    public final Object f10786d = new Object();

    /* renamed from: e */
    public boolean f10787e = false;

    /* renamed from: e */
    private void m10139e() {
        if (this.f10783a == null) {
            this.f10783a = C9841f.m16773b(super.getContext(), this);
            this.f10784b = AbstractC9589a.m15761a(super.getContext());
        }
    }

    /* renamed from: c */
    public final C9841f m10140c() {
        if (this.f10785c == null) {
            synchronized (this.f10786d) {
                try {
                    if (this.f10785c == null) {
                        this.f10785c = m10141d();
                    }
                } finally {
                }
            }
        }
        return this.f10785c;
    }

    /* renamed from: d */
    public C9841f m10141d() {
        return new C9841f(this);
    }

    /* renamed from: f */
    public void m10142f() {
        if (this.f10787e) {
            return;
        }
        this.f10787e = true;
        ((InterfaceC9105f) generatedComponent()).mo12840l((CollectHistoryFragment) AbstractC9968d.m17240a(this));
    }

    @Override // p305y7.InterfaceC9966b
    public final Object generatedComponent() {
        return m10140c().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f10784b) {
            return null;
        }
        m10139e();
        return this.f10783a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC9769a.m16551b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10139e();
        m10142f();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9841f.m16774c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f10783a;
        AbstractC9967c.m17239c(contextWrapper == null || C9841f.m16775d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10139e();
        m10142f();
    }
}
