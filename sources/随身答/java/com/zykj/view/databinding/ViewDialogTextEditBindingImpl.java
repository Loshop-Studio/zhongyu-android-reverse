package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;
import com.zykj.view.widget.LimitEditText;

/* loaded from: classes5.dex */
public class ViewDialogTextEditBindingImpl extends ViewDialogTextEditBinding {

    /* renamed from: h */
    public static final ViewDataBinding.IncludedLayouts f12579h = null;

    /* renamed from: i */
    public static final SparseIntArray f12580i;

    /* renamed from: g */
    public long f12581g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12580i = sparseIntArray;
        sparseIntArray.put(R$id.ll_edit, 1);
        sparseIntArray.put(R$id.btn_cancel, 2);
        sparseIntArray.put(R$id.et_input, 3);
        sparseIntArray.put(R$id.btn_confirm, 4);
        sparseIntArray.put(R$id.view_solid, 5);
    }

    public ViewDialogTextEditBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f12579h, f12580i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f12581g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f12581g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12581g = 1L;
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

    public ViewDialogTextEditBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Button) objArr[2], (Button) objArr[4], (LimitEditText) objArr[3], (LinearLayout) objArr[1], (ConstraintLayout) objArr[0], (View) objArr[5]);
        this.f12581g = -1L;
        this.f12577e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
