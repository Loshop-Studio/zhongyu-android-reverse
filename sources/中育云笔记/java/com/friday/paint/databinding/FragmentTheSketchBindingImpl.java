package com.friday.paint.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.sketch.core.record.SketchRecorderView;

/* loaded from: classes4.dex */
public class FragmentTheSketchBindingImpl extends FragmentTheSketchBinding {

    /* renamed from: e */
    public static final ViewDataBinding.IncludedLayouts f9808e = null;

    /* renamed from: f */
    public static final SparseIntArray f9809f = null;

    /* renamed from: d */
    public long f9810d;

    public FragmentTheSketchBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f9808e, f9809f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9810d = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9810d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9810d = 1L;
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

    public FragmentTheSketchBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SketchRecorderView) objArr[0]);
        this.f9810d = -1L;
        this.f9807c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
