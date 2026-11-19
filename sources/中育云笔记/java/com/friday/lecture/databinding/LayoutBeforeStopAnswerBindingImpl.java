package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.lecture.R$id;

/* loaded from: classes4.dex */
public class LayoutBeforeStopAnswerBindingImpl extends LayoutBeforeStopAnswerBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f8526i = null;

    /* renamed from: j */
    public static final SparseIntArray f8527j;

    /* renamed from: g */
    public final ConstraintLayout f8528g;

    /* renamed from: h */
    public long f8529h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8527j = sparseIntArray;
        sparseIntArray.put(R$id.answer, 1);
        sparseIntArray.put(R$id.tv_submit_count_before, 2);
        sparseIntArray.put(R$id.tv_end_class_before, 3);
        sparseIntArray.put(R$id.tv_time_up_before, 4);
    }

    public LayoutBeforeStopAnswerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f8526i, f8527j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8529h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8529h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8529h = 1L;
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

    public LayoutBeforeStopAnswerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[4]);
        this.f8529h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f8528g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
