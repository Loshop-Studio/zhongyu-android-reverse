package com.friday.document.view.share;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import p120dc.C9021g;
import p151fc.AbstractC9221d;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9220c;
import p399x2.InterfaceC11775l;
import p438zb.AbstractC12036a;

/* loaded from: classes3.dex */
public abstract class Hilt_ShareListFragment extends ShareBaseFileFragment {

    /* renamed from: l */
    public ContextWrapper f7508l;

    /* renamed from: m */
    public boolean f7509m;

    /* renamed from: n */
    public boolean f7510n = false;

    /* renamed from: q */
    private void m6004q() {
        if (this.f7508l == null) {
            this.f7508l = C9021g.m17620b(super.getContext(), this);
            this.f7509m = AbstractC12036a.m26662a(super.getContext());
        }
    }

    @Override // com.friday.document.view.share.Hilt_ShareBaseFileFragment, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f7509m) {
            return null;
        }
        m6004q();
        return this.f7508l;
    }

    @Override // com.friday.document.view.share.Hilt_ShareBaseFileFragment
    public void inject() {
        if (this.f7510n) {
            return;
        }
        this.f7510n = true;
        ((InterfaceC11775l) ((InterfaceC9220c) AbstractC9222e.m18141a(this)).generatedComponent()).mo25829n((ShareListFragment) AbstractC9222e.m18141a(this));
    }

    @Override // com.friday.document.view.share.Hilt_ShareBaseFileFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m6004q();
        inject();
    }

    @Override // com.friday.document.view.share.Hilt_ShareBaseFileFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9021g.m17621c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // com.friday.document.view.share.Hilt_ShareBaseFileFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f7508l;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m6004q();
        inject();
    }
}
