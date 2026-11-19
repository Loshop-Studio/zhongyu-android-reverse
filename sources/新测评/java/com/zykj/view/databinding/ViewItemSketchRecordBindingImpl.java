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
    public static final ViewDataBinding.IncludedLayouts f11560d = null;

    /* renamed from: e */
    public static final SparseIntArray f11561e;

    /* renamed from: b */
    public final LinearLayout f11562b;

    /* renamed from: c */
    public long f11563c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11561e = sparseIntArray;
        sparseIntArray.put(R$id.tv_commit, 1);
    }

    public ViewItemSketchRecordBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f11560d, f11561e));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f11563c = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f11563c != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f11563c = 1L;
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

    public ViewItemSketchRecordBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1]);
        this.f11563c = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f11562b = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
