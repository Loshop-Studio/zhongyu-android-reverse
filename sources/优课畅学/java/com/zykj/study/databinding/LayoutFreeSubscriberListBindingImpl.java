package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner;
import com.zykj.study.R$id;

/* loaded from: classes3.dex */
public class LayoutFreeSubscriberListBindingImpl extends LayoutFreeSubscriberListBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayoutCompat mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.ll_free_list_head, 1);
        sparseIntArray.put(R$id.ll_search, 2);
        sparseIntArray.put(R$id.iv_search, 3);
        sparseIntArray.put(R$id.tv_search, 4);
        sparseIntArray.put(R$id.sp_role_select, 5);
        sparseIntArray.put(R$id.tv_date_select, 6);
        sparseIntArray.put(R$id.bt_search, 7);
        sparseIntArray.put(R$id.bt_reset, 8);
        sparseIntArray.put(R$id.rv_free_subscriber_list, 9);
        sparseIntArray.put(R$id.ll_search_empty, 10);
        sparseIntArray.put(R$id.iv_search_empty, 11);
        sparseIntArray.put(R$id.tv_search_empty, 12);
        sparseIntArray.put(R$id.ll_batch_delete, 13);
        sparseIntArray.put(R$id.free_sub_number, 14);
        sparseIntArray.put(R$id.bt_batch_delete, 15);
    }

    public LayoutFreeSubscriberListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.mDirtyFlags != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        return true;
    }

    private LayoutFreeSubscriberListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatButton) objArr[15], (AppCompatButton) objArr[8], (AppCompatButton) objArr[7], (AppCompatTextView) objArr[14], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[11], (ConstraintLayout) objArr[13], (LinearLayoutCompat) objArr[1], (LinearLayoutCompat) objArr[2], (LinearLayoutCompat) objArr[10], (RecyclerView) objArr[9], (MaterialSpinner) objArr[5], (AppCompatTextView) objArr[6], (AppCompatEditText) objArr[4], (AppCompatTextView) objArr[12]);
        this.mDirtyFlags = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.mboundView0 = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
