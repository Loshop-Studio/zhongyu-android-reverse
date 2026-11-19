package com.friday.cloudsnote.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public class MainActivityBindingImpl extends MainActivityBinding {

    /* renamed from: e */
    public static final ViewDataBinding.IncludedLayouts f5492e = null;

    /* renamed from: f */
    public static final SparseIntArray f5493f = null;

    /* renamed from: c */
    public final View f5494c;

    /* renamed from: d */
    public long f5495d;

    public MainActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f5492e, f5493f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f5495d = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f5495d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f5495d = 1L;
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

    public MainActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.f5495d = -1L;
        View view2 = (View) objArr[0];
        this.f5494c = view2;
        view2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
