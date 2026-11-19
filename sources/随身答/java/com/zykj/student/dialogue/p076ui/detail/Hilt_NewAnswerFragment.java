package com.zykj.student.dialogue.p076ui.detail;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import p200o6.InterfaceC9215p0;
import p245s7.AbstractC9589a;
import p275v7.AbstractC9769a;
import p285w7.C9841f;
import p305y7.AbstractC9967c;
import p305y7.AbstractC9968d;
import p305y7.InterfaceC9966b;

/* loaded from: classes5.dex */
public abstract class Hilt_NewAnswerFragment extends Fragment implements InterfaceC9966b {

    /* renamed from: a */
    public ContextWrapper f11037a;

    /* renamed from: b */
    public boolean f11038b;

    /* renamed from: c */
    public volatile C9841f f11039c;

    /* renamed from: d */
    public final Object f11040d = new Object();

    /* renamed from: e */
    public boolean f11041e = false;

    /* renamed from: e */
    private void m10365e() {
        if (this.f11037a == null) {
            this.f11037a = C9841f.m16773b(super.getContext(), this);
            this.f11038b = AbstractC9589a.m15761a(super.getContext());
        }
    }

    /* renamed from: c */
    public final C9841f m10366c() {
        if (this.f11039c == null) {
            synchronized (this.f11040d) {
                try {
                    if (this.f11039c == null) {
                        this.f11039c = m10367d();
                    }
                } finally {
                }
            }
        }
        return this.f11039c;
    }

    /* renamed from: d */
    public C9841f m10367d() {
        return new C9841f(this);
    }

    /* renamed from: f */
    public void m10368f() {
        if (this.f11041e) {
            return;
        }
        this.f11041e = true;
        ((InterfaceC9215p0) generatedComponent()).mo12838j((NewAnswerFragment) AbstractC9968d.m17240a(this));
    }

    @Override // p305y7.InterfaceC9966b
    public final Object generatedComponent() {
        return m10366c().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f11038b) {
            return null;
        }
        m10365e();
        return this.f11037a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC9769a.m16551b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10365e();
        m10368f();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9841f.m16774c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f11037a;
        AbstractC9967c.m17239c(contextWrapper == null || C9841f.m16775d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10365e();
        m10368f();
    }
}
