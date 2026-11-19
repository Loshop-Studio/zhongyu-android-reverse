package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes5.dex */
public class ViewItemSketchRecordBindingImpl extends ViewItemSketchRecordBinding {

    /* renamed from: d */
    public static final ViewDataBinding.IncludedLayouts f12804d = null;

    /* renamed from: e */
    public static final SparseIntArray f12805e;

    /* renamed from: b */
    public final LinearLayout f12806b;

    /* renamed from: c */
    public long f12807c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12805e = sparseIntArray;
        sparseIntArray.put(R$id.tv_commit, 1);
    }

    public ViewItemSketchRecordBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f12804d, f12805e));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f12807c = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f12807c != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12807c = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        return true;
    }

    public ViewItemSketchRecordBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1]);
        this.f12807c = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f12806b = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
