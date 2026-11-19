package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;

/* loaded from: classes5.dex */
public class ViewActivityEzyCameraBindingImpl extends ViewActivityEzyCameraBinding {

    /* renamed from: c */
    public static final ViewDataBinding.IncludedLayouts f11308c = null;

    /* renamed from: d */
    public static final SparseIntArray f11309d = null;

    /* renamed from: b */
    public long f11310b;

    public ViewActivityEzyCameraBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f11308c, f11309d));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f11310b = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f11310b != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f11310b = 1L;
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
        this.f11310b = -1L;
        this.f11307a.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
