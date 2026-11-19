package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.lecture.R$id;

/* loaded from: classes4.dex */
public class LayoutConfirmTimeUpBindingImpl extends LayoutConfirmTimeUpBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f8538g = null;

    /* renamed from: h */
    public static final SparseIntArray f8539h;

    /* renamed from: e */
    public final ConstraintLayout f8540e;

    /* renamed from: f */
    public long f8541f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8539h = sparseIntArray;
        sparseIntArray.put(R$id.tv_time_up_ensure, 1);
        sparseIntArray.put(R$id.tv_time_up_cancel, 2);
    }

    public LayoutConfirmTimeUpBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f8538g, f8539h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8541f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8541f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8541f = 1L;
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

    public LayoutConfirmTimeUpBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2], (TextView) objArr[1]);
        this.f8541f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f8540e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
