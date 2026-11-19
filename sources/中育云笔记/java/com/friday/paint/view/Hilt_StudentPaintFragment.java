package com.friday.paint.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import p042c4.InterfaceC5373q;
import p120dc.C9021g;
import p151fc.AbstractC9221d;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9220c;
import p438zb.AbstractC12036a;

/* loaded from: classes4.dex */
public abstract class Hilt_StudentPaintFragment extends ThePaintFragment {

    /* renamed from: o */
    public ContextWrapper f9889o;

    /* renamed from: p */
    public boolean f9890p;

    /* renamed from: q */
    public boolean f9891q = false;

    /* renamed from: q */
    private void m7335q() {
        if (this.f9889o == null) {
            this.f9889o = C9021g.m17620b(super.getContext(), this);
            this.f9890p = AbstractC12036a.m26662a(super.getContext());
        }
    }

    @Override // com.friday.paint.view.Hilt_ThePaintFragment, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f9890p) {
            return null;
        }
        m7335q();
        return this.f9889o;
    }

    @Override // com.friday.paint.view.Hilt_ThePaintFragment
    public void inject() {
        if (this.f9891q) {
            return;
        }
        this.f9891q = true;
        ((InterfaceC5373q) ((InterfaceC9220c) AbstractC9222e.m18141a(this)).generatedComponent()).mo2823b((StudentPaintFragment) AbstractC9222e.m18141a(this));
    }

    @Override // com.friday.paint.view.Hilt_ThePaintFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        m7335q();
        inject();
    }

    @Override // com.friday.paint.view.Hilt_ThePaintFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9021g.m17621c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // com.friday.paint.view.Hilt_ThePaintFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f9889o;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m7335q();
        inject();
    }
}
