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

/* loaded from: classes6.dex */
public class ViewDialogTextEditBindingImpl extends ViewDialogTextEditBinding {

    /* renamed from: j */
    public static final ViewDataBinding.IncludedLayouts f20544j = null;

    /* renamed from: k */
    public static final SparseIntArray f20545k;

    /* renamed from: i */
    public long f20546i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20545k = sparseIntArray;
        sparseIntArray.put(R$id.ll_edit, 1);
        sparseIntArray.put(R$id.btn_cancel, 2);
        sparseIntArray.put(R$id.et_input, 3);
        sparseIntArray.put(R$id.btn_confirm, 4);
        sparseIntArray.put(R$id.view_solid, 5);
    }

    public ViewDialogTextEditBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f20544j, f20545k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20546i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20546i != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20546i = 1L;
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
        this.f20546i = -1L;
        this.f20542g.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
