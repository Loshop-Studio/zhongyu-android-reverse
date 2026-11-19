package com.friday.paint.view.six;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import p112d4.InterfaceC8955i1;
import p120dc.C9021g;
import p151fc.AbstractC9221d;
import p151fc.AbstractC9222e;
import p151fc.InterfaceC9220c;
import p438zb.AbstractC12036a;

/* loaded from: classes4.dex */
public abstract class Hilt_NewStudentPaintFragment extends NewPaintFragment {
    private ContextWrapper componentContext;
    private boolean disableGetContextFix;
    private boolean injected = false;

    /* renamed from: q */
    private void m7539q() {
        if (this.componentContext == null) {
            this.componentContext = C9021g.m17620b(super.getContext(), this);
            this.disableGetContextFix = AbstractC12036a.m26662a(super.getContext());
        }
    }

    @Override // com.friday.paint.view.six.Hilt_NewPaintFragment, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.disableGetContextFix) {
            return null;
        }
        m7539q();
        return this.componentContext;
    }

    @Override // com.friday.paint.view.six.Hilt_NewPaintFragment
    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((InterfaceC8955i1) ((InterfaceC9220c) AbstractC9222e.m18141a(this)).generatedComponent()).mo17530k((NewStudentPaintFragment) AbstractC9222e.m18141a(this));
    }

    @Override // com.friday.paint.view.six.Hilt_NewPaintFragment, androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(Context context) {
        super.onAttach(context);
        m7539q();
        inject();
    }

    @Override // com.friday.paint.view.six.Hilt_NewPaintFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C9021g.m17621c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // com.friday.paint.view.six.Hilt_NewPaintFragment, androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.componentContext;
        AbstractC9221d.m18140d(contextWrapper == null || C9021g.m17622d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m7539q();
        inject();
    }
}
