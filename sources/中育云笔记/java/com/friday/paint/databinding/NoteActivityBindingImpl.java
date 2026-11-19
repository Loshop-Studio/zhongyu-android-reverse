package com.friday.paint.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes4.dex */
public class NoteActivityBindingImpl extends NoteActivityBinding {

    /* renamed from: e */
    public static final ViewDataBinding.IncludedLayouts f9835e = null;

    /* renamed from: f */
    public static final SparseIntArray f9836f = null;

    /* renamed from: d */
    public long f9837d;

    public NoteActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, f9835e, f9836f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9837d = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9837d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9837d = 1L;
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

    public NoteActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[0]);
        this.f9837d = -1L;
        this.f9834c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
