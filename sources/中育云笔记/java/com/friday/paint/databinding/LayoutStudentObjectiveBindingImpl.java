package com.friday.paint.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.paint.R$id;

/* loaded from: classes4.dex */
public class LayoutStudentObjectiveBindingImpl extends LayoutStudentObjectiveBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f9830i = null;

    /* renamed from: j */
    public static final SparseIntArray f9831j;

    /* renamed from: g */
    public final ConstraintLayout f9832g;

    /* renamed from: h */
    public long f9833h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9831j = sparseIntArray;
        sparseIntArray.put(R$id.tv_question_type, 1);
        sparseIntArray.put(R$id.tv_status, 2);
        sparseIntArray.put(R$id.rv_option_list, 3);
        sparseIntArray.put(R$id.tv_submit, 4);
    }

    public LayoutStudentObjectiveBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f9830i, f9831j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9833h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9833h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9833h = 1L;
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

    public LayoutStudentObjectiveBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[3], (TextView) objArr[1], (TextView) objArr[2], (TextView) objArr[4]);
        this.f9833h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f9832g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
