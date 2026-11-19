package com.zykj.student.dialogue.p076ui.detail;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import p200o6.InterfaceC9218r;
import p245s7.AbstractC9589a;
import p275v7.AbstractC9769a;
import p285w7.C9841f;
import p305y7.AbstractC9967c;
import p305y7.AbstractC9968d;
import p305y7.InterfaceC9966b;

/* loaded from: classes5.dex */
public abstract class Hilt_AnswerTabFragment extends Fragment implements InterfaceC9966b {

    /* renamed from: a */
    public ContextWrapper f11022a;

    /* renamed from: b */
    public boolean f11023b;

    /* renamed from: c */
    public volatile C9841f f11024c;

    /* renamed from: d */
    public final Object f11025d = new Object();

    /* renamed from: e */
    public boolean f11026e = false;

    /* renamed from: e */
    private void m10353e() {
        if (this.f11022a == null) {
            this.f11022a = C9841f.m16773b(super.getContext(), this);
            this.f11023b = AbstractC9589a.m15761a(super.getContext());
        }
    }

    /* renamed from: c */
    public final C9841f m10354c() {
        if (this.f11024c == null) {
            synchronized (this.f11025d) {
                try {
                    if (this.f11024c == null) {
                        this.f11024c = m10355d();
                    }
                } finally {
                }
            }
        }
        return this.f11024c;
    }

    /* renamed from: d */
    public C9841f m10355d() {
        return new C9841f(this);
    }

    /* renamed from: f */
    public void m10356f() {
        if (this.f11026e) {
            return;
        }
        this.f11026e = true;
        ((InterfaceC9218r) generatedComponent()).mo12836h((AnswerTabFragment) AbstractC9968d.m17240a(this));
    }

    @Override // p305y7.InterfaceC9966b
    public final Object generatedComponent() {
        return m10354c().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f11023b) {
            return null;
        }
        m10353e();
        return this.f11022a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC9769a.m16551b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10353e();
        m10356f();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9841f.m16774c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f11022a;
        AbstractC9967c.m17239c(contextWrapper == null || C9841f.m16775d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10353e();
        m10356f();
    }
}
