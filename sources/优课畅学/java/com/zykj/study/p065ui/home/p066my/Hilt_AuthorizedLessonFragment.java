package com.zykj.study.p065ui.home.p066my;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import p025b5.InterfaceC5082h;
import p087e6.AbstractC8367a;
import p122h6.AbstractC8717a;
import p133i6.C8764f;
import p155k6.AbstractC9061c;
import p155k6.AbstractC9062d;
import p155k6.InterfaceC9060b;

/* loaded from: classes5.dex */
public abstract class Hilt_AuthorizedLessonFragment extends Fragment implements InterfaceC9060b {

    /* renamed from: a */
    public ContextWrapper f13022a;

    /* renamed from: b */
    public boolean f13023b;

    /* renamed from: c */
    public volatile C8764f f13024c;

    /* renamed from: d */
    public final Object f13025d = new Object();

    /* renamed from: e */
    public boolean f13026e = false;

    /* renamed from: f */
    private void m11398f() {
        if (this.f13022a == null) {
            this.f13022a = C8764f.m14470b(super.getContext(), this);
            this.f13023b = AbstractC8367a.m13653a(super.getContext());
        }
    }

    public final C8764f componentManager() {
        if (this.f13024c == null) {
            synchronized (this.f13025d) {
                try {
                    if (this.f13024c == null) {
                        this.f13024c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f13024c;
    }

    public C8764f createComponentManager() {
        return new C8764f(this);
    }

    @Override // p155k6.InterfaceC9060b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f13023b) {
            return null;
        }
        m11398f();
        return this.f13022a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return AbstractC8717a.m14222b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.f13026e) {
            return;
        }
        this.f13026e = true;
        ((InterfaceC5082h) generatedComponent()).mo2084r0((AuthorizedLessonFragment) AbstractC9062d.m15864a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m11398f();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C8764f.m14471c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f13022a;
        AbstractC9061c.m15863c(contextWrapper == null || C8764f.m14472d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m11398f();
        inject();
    }
}
