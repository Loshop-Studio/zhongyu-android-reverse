package com.zykj.huiwei.launcher.p035ui.fragment.applist;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import p064g4.InterfaceC6409d;
import p157t4.AbstractC7728a;
import p185x4.C7862g;
import p199z4.AbstractC7950d;
import p199z4.AbstractC7951e;
import p199z4.InterfaceC7949c;

/* loaded from: classes4.dex */
public abstract class Hilt_HuiWeiAppFragment extends BaseAppFragment {

    /* renamed from: g */
    public ContextWrapper f6815g;

    /* renamed from: h */
    public boolean f6816h;

    /* renamed from: i */
    public boolean f6817i = false;

    /* renamed from: h */
    private void m5995h() {
        if (this.f6815g == null) {
            this.f6815g = C7862g.m9537b(super.getContext(), this);
            this.f6816h = AbstractC7728a.m9209a(super.getContext());
        }
    }

    @Override // com.zykj.huiwei.launcher.p035ui.fragment.applist.Hilt_BaseAppFragment, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f6816h) {
            return null;
        }
        m5995h();
        return this.f6815g;
    }

    @Override // com.zykj.huiwei.launcher.p035ui.fragment.applist.Hilt_BaseAppFragment
    /* renamed from: i */
    public void mo5994i() {
        if (this.f6817i) {
            return;
        }
        this.f6817i = true;
        ((InterfaceC6409d) ((InterfaceC7949c) AbstractC7951e.m9749a(this)).generatedComponent()).mo5239n((HuiWeiAppFragment) AbstractC7951e.m9749a(this));
    }

    @Override // com.zykj.huiwei.launcher.p035ui.fragment.applist.Hilt_BaseAppFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m5995h();
        mo5994i();
    }

    @Override // com.zykj.huiwei.launcher.p035ui.fragment.applist.Hilt_BaseAppFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C7862g.m9538c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // com.zykj.huiwei.launcher.p035ui.fragment.applist.Hilt_BaseAppFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f6815g;
        AbstractC7950d.m9748d(contextWrapper == null || C7862g.m9539d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m5995h();
        mo5994i();
    }
}
