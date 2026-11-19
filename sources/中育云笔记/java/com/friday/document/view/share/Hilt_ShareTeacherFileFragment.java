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
import p399x2.InterfaceC11786w;
import p438zb.AbstractC12036a;

/* loaded from: classes3.dex */
public abstract class Hilt_ShareTeacherFileFragment extends ShareBaseFileFragment {

    /* renamed from: l */
    public ContextWrapper f7516l;

    /* renamed from: m */
    public boolean f7517m;

    /* renamed from: n */
    public boolean f7518n = false;

    /* renamed from: q */
    private void m6007q() {
        if (this.f7516l == null) {
            this.f7516l = C9021g.m17620b(super.getContext(), this);
            this.f7517m = AbstractC12036a.m26662a(super.getContext());
        }
    }

    @Override // com.friday.document.view.share.Hilt_ShareBaseFileFragment, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f7517m) {
            return null;
        }
        m6007q();
        return this.f7516l;
    }

    @Override // com.friday.document.view.share.Hilt_ShareBaseFileFragment
    public void inject() {
        if (this.f7518n) {
            return;
        }
        this.f7518n = true;
        ((InterfaceC11786w) ((InterfaceC9220c) AbstractC9222e.m18141a(this)).generatedComponent()).mo25831t((ShareTeacherFileFragment) AbstractC9222e.m18141a(this));
    }

    @Override // com.friday.document.view.share.Hilt_ShareBaseFileFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m6007q();
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
        ContextWrapper contextWrapper = this.f7516l;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m6007q();
        inject();
    }
}
