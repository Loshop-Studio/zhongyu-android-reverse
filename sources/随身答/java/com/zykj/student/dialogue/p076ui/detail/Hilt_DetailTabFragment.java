package com.zykj.student.dialogue.p076ui.detail;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import p200o6.InterfaceC9225x;
import p245s7.AbstractC9589a;
import p275v7.AbstractC9769a;
import p285w7.C9841f;
import p305y7.AbstractC9967c;
import p305y7.AbstractC9968d;
import p305y7.InterfaceC9966b;

/* loaded from: classes5.dex */
public abstract class Hilt_DetailTabFragment extends Fragment implements InterfaceC9966b {

    /* renamed from: a */
    public ContextWrapper f11032a;

    /* renamed from: b */
    public boolean f11033b;

    /* renamed from: c */
    public volatile C9841f f11034c;

    /* renamed from: d */
    public final Object f11035d = new Object();

    /* renamed from: e */
    public boolean f11036e = false;

    /* renamed from: e */
    private void m10361e() {
        if (this.f11032a == null) {
            this.f11032a = C9841f.m16773b(super.getContext(), this);
            this.f11033b = AbstractC9589a.m15761a(super.getContext());
        }
    }

    /* renamed from: c */
    public final C9841f m10362c() {
        if (this.f11034c == null) {
            synchronized (this.f11035d) {
                try {
                    if (this.f11034c == null) {
                        this.f11034c = m10363d();
                    }
                } finally {
                }
            }
        }
        return this.f11034c;
    }

    /* renamed from: d */
    public C9841f m10363d() {
        return new C9841f(this);
    }

    /* renamed from: f */
    public void m10364f() {
        if (this.f11036e) {
            return;
        }
        this.f11036e = true;
        ((InterfaceC9225x) generatedComponent()).mo12845q((DetailTabFragment) AbstractC9968d.m17240a(this));
    }

    @Override // p305y7.InterfaceC9966b
    public final Object generatedComponent() {
        return m10362c().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f11033b) {
            return null;
        }
        m10361e();
        return this.f11032a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC9769a.m16551b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10361e();
        m10364f();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9841f.m16774c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f11032a;
        AbstractC9967c.m17239c(contextWrapper == null || C9841f.m16775d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10361e();
        m10364f();
    }
}
