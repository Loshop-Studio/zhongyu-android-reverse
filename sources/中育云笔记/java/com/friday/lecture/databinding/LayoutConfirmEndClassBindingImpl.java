package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.lecture.R$id;

/* loaded from: classes4.dex */
public class LayoutConfirmEndClassBindingImpl extends LayoutConfirmEndClassBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f8532g = null;

    /* renamed from: h */
    public static final SparseIntArray f8533h;

    /* renamed from: e */
    public final ConstraintLayout f8534e;

    /* renamed from: f */
    public long f8535f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8533h = sparseIntArray;
        sparseIntArray.put(R$id.tv_end_class_ensure, 1);
        sparseIntArray.put(R$id.tv_end_class_cancel, 2);
    }

    public LayoutConfirmEndClassBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f8532g, f8533h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8535f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8535f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8535f = 1L;
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

    public LayoutConfirmEndClassBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2], (TextView) objArr[1]);
        this.f8535f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f8534e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
