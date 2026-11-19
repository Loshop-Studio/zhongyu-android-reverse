package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;

/* loaded from: classes6.dex */
public class ViewActivityEzyCameraBindingImpl extends ViewActivityEzyCameraBinding {

    /* renamed from: e */
    public static final ViewDataBinding.IncludedLayouts f20517e = null;

    /* renamed from: f */
    public static final SparseIntArray f20518f = null;

    /* renamed from: d */
    public long f20519d;

    public ViewActivityEzyCameraBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f20517e, f20518f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20519d = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20519d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20519d = 1L;
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

    public ViewActivityEzyCameraBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FragmentContainerView) objArr[0]);
        this.f20519d = -1L;
        this.f20516c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
