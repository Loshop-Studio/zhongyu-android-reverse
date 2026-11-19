package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$id;

/* loaded from: classes3.dex */
public class LayoutSelfCourseSubscriberListBindingImpl extends LayoutSelfCourseSubscriberListBinding {

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
        sparseIntArray.put(R$id.ll_self_course_no_group, 1);
        sparseIntArray.put(R$id.iv_self_list_no_group, 2);
        sparseIntArray.put(R$id.tv_self_list_no_group, 3);
        sparseIntArray.put(R$id.ll_self_course_no_select, 4);
        sparseIntArray.put(R$id.iv_self_course_no_select, 5);
        sparseIntArray.put(R$id.tv_self_course_no_select, 6);
        sparseIntArray.put(R$id.elv_self_group_list, 7);
    }

    public LayoutSelfCourseSubscriberListBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, sIncludes, sViewsWithIds));
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

    private LayoutSelfCourseSubscriberListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ExpandableListView) objArr[7], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[2], (LinearLayoutCompat) objArr[1], (LinearLayoutCompat) objArr[4], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[3]);
        this.mDirtyFlags = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.mboundView0 = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
