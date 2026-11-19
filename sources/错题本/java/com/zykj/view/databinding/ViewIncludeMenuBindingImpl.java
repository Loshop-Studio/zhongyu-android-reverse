package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;

/* loaded from: classes3.dex */
public class ViewIncludeMenuBindingImpl extends ViewIncludeMenuBinding {

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
        sparseIntArray.put(C5280R.id.iv_withdraw, 1);
        sparseIntArray.put(C5280R.id.iv_recover, 2);
        sparseIntArray.put(C5280R.id.iv_select, 3);
        sparseIntArray.put(C5280R.id.iv_touch, 4);
        sparseIntArray.put(C5280R.id.iv_enlarge, 5);
        sparseIntArray.put(C5280R.id.iv_reduce, 6);
        sparseIntArray.put(C5280R.id.iv_pen, 7);
        sparseIntArray.put(C5280R.id.iv_eraser, 8);
        sparseIntArray.put(C5280R.id.iv_image_add, 9);
        sparseIntArray.put(C5280R.id.iv_background_color, 10);
        sparseIntArray.put(C5280R.id.iv_delete, 11);
    }

    public ViewIncludeMenuBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
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
    public boolean onFieldChange(int i, Object obj, int i8) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    private ViewIncludeMenuBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[11], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[9], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[1]);
        this.mDirtyFlags = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.mboundView0 = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
