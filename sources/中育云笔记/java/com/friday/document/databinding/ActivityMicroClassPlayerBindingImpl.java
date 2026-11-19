package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public class ActivityMicroClassPlayerBindingImpl extends ActivityMicroClassPlayerBinding {

    /* renamed from: e */
    public static final ViewDataBinding.IncludedLayouts f6293e = null;

    /* renamed from: f */
    public static final SparseIntArray f6294f = null;

    /* renamed from: c */
    public final ConstraintLayout f6295c;

    /* renamed from: d */
    public long f6296d;

    public ActivityMicroClassPlayerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f6293e, f6294f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6296d = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6296d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6296d = 1L;
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

    public ActivityMicroClassPlayerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f6296d = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f6295c = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
