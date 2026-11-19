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
    public static final ViewDataBinding.IncludedLayouts f11335h = null;

    /* renamed from: i */
    public static final SparseIntArray f11336i;

    /* renamed from: g */
    public long f11337g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11336i = sparseIntArray;
        sparseIntArray.put(R$id.ll_edit, 1);
        sparseIntArray.put(R$id.btn_cancel, 2);
        sparseIntArray.put(R$id.et_input, 3);
        sparseIntArray.put(R$id.btn_confirm, 4);
        sparseIntArray.put(R$id.view_solid, 5);
    }

    public ViewDialogTextEditBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f11335h, f11336i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f11337g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f11337g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f11337g = 1L;
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

    public ViewDialogTextEditBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Button) objArr[2], (Button) objArr[4], (LimitEditText) objArr[3], (LinearLayout) objArr[1], (ConstraintLayout) objArr[0], (View) objArr[5]);
        this.f11337g = -1L;
        this.f11333e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
