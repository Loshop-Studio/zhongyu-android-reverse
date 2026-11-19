package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class ActivityTeacherOnlyBindingImpl extends ActivityTeacherOnlyBinding {

    /* renamed from: s */
    public static final ViewDataBinding.IncludedLayouts f6317s = null;

    /* renamed from: t */
    public static final SparseIntArray f6318t;

    /* renamed from: q */
    public final ConstraintLayout f6319q;

    /* renamed from: r */
    public long f6320r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6318t = sparseIntArray;
        sparseIntArray.put(R$id.iv_border, 1);
        sparseIntArray.put(R$id.iv_sync, 2);
        sparseIntArray.put(R$id.tv_sync, 3);
        sparseIntArray.put(R$id.iv_completed, 4);
        sparseIntArray.put(R$id.group_syncing, 5);
        sparseIntArray.put(R$id.cl_list, 6);
        sparseIntArray.put(R$id.header, 7);
        sparseIntArray.put(R$id.tv_filename, 8);
        sparseIntArray.put(R$id.tv_modify_time, 9);
        sparseIntArray.put(R$id.tv_status, 10);
        sparseIntArray.put(R$id.rv_List, 11);
        sparseIntArray.put(R$id.group_retry, 12);
        sparseIntArray.put(R$id.tv_retry, 13);
        sparseIntArray.put(R$id.tv_exit, 14);
    }

    public ActivityTeacherOnlyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, f6317s, f6318t));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6320r = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6320r != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6320r = 1L;
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

    public ActivityTeacherOnlyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[6], (Group) objArr[12], (Group) objArr[5], (View) objArr[7], (ImageView) objArr[1], (ImageView) objArr[4], (ImageView) objArr[2], (RecyclerView) objArr[11], (TextView) objArr[14], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[13], (TextView) objArr[10], (TextView) objArr[3]);
        this.f6320r = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f6319q = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
