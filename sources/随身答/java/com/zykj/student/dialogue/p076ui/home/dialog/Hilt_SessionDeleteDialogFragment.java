package com.zykj.student.dialogue.p076ui.home.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProvider;
import p245s7.AbstractC9589a;
import p264u6.InterfaceC9716o;
import p275v7.AbstractC9769a;
import p285w7.C9841f;
import p305y7.AbstractC9967c;
import p305y7.AbstractC9968d;
import p305y7.InterfaceC9966b;

/* loaded from: classes5.dex */
public abstract class Hilt_SessionDeleteDialogFragment extends DialogFragment implements InterfaceC9966b {

    /* renamed from: a */
    public ContextWrapper f11854a;

    /* renamed from: b */
    public boolean f11855b;

    /* renamed from: c */
    public volatile C9841f f11856c;

    /* renamed from: d */
    public final Object f11857d = new Object();

    /* renamed from: e */
    public boolean f11858e = false;

    /* renamed from: e */
    private void m10992e() {
        if (this.f11854a == null) {
            this.f11854a = C9841f.m16773b(super.getContext(), this);
            this.f11855b = AbstractC9589a.m15761a(super.getContext());
        }
    }

    /* renamed from: c */
    public final C9841f m10993c() {
        if (this.f11856c == null) {
            synchronized (this.f11857d) {
                try {
                    if (this.f11856c == null) {
                        this.f11856c = m10994d();
                    }
                } finally {
                }
            }
        }
        return this.f11856c;
    }

    /* renamed from: d */
    public C9841f m10994d() {
        return new C9841f(this);
    }

    /* renamed from: f */
    public void m10995f() {
        if (this.f11858e) {
            return;
        }
        this.f11858e = true;
        ((InterfaceC9716o) generatedComponent()).mo12847s((SessionDeleteDialogFragment) AbstractC9968d.m17240a(this));
    }

    @Override // p305y7.InterfaceC9966b
    public final Object generatedComponent() {
        return m10993c().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f11855b) {
            return null;
        }
        m10992e();
        return this.f11854a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC9769a.m16551b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m10992e();
        m10995f();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9841f.m16774c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f11854a;
        AbstractC9967c.m17239c(contextWrapper == null || C9841f.m16775d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m10992e();
        m10995f();
    }
}
