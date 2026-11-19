package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.lecture.R$id;

/* loaded from: classes4.dex */
public class LayoutSubjectiveListBindingImpl extends LayoutSubjectiveListBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f8587k = null;

    /* renamed from: l */
    public static final SparseIntArray f8588l;

    /* renamed from: i */
    public final ConstraintLayout f8589i;

    /* renamed from: j */
    public long f8590j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8588l = sparseIntArray;
        sparseIntArray.put(R$id.answer, 1);
        sparseIntArray.put(R$id.tv_submit_count_after, 2);
        sparseIntArray.put(R$id.cv_end_class, 3);
        sparseIntArray.put(R$id.cv_stop_answer, 4);
        sparseIntArray.put(R$id.rv_answer, 5);
        sparseIntArray.put(R$id.iv_close_subjective, 6);
    }

    public LayoutSubjectiveListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f8587k, f8588l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8590j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8590j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8590j = 1L;
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

    public LayoutSubjectiveListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[1], (TextView) objArr[3], (TextView) objArr[4], (ImageView) objArr[6], (RecyclerView) objArr[5], (TextView) objArr[2]);
        this.f8590j = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f8589i = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
