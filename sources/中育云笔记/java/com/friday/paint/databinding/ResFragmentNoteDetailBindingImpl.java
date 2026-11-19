package com.friday.paint.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes4.dex */
public class ResFragmentNoteDetailBindingImpl extends ResFragmentNoteDetailBinding {

    /* renamed from: e */
    public static final ViewDataBinding.IncludedLayouts f9862e = null;

    /* renamed from: f */
    public static final SparseIntArray f9863f = null;

    /* renamed from: d */
    public long f9864d;

    public ResFragmentNoteDetailBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f9862e, f9863f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9864d = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9864d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9864d = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public ResFragmentNoteDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0]);
        this.f9864d = -1L;
        this.f9861c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
