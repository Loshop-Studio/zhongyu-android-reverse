package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.zykj.study.R$id;
import com.zykj.study.bean.FreeSubscribe;

/* loaded from: classes3.dex */
public class ItemFreeSubscribeBindingImpl extends ItemFreeSubscribeBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ConstraintLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.iv_heard_portrait, 5);
    }

    public ItemFreeSubscribeBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String name;
        String role;
        String subTime;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        View.OnClickListener onClickListener = this.mDeleteClick;
        FreeSubscribe freeSubscribe = this.mData;
        long j11 = 5 & j10;
        long j12 = j10 & 6;
        if (j12 == 0 || freeSubscribe == null) {
            name = null;
            role = null;
            subTime = null;
        } else {
            name = freeSubscribe.getName();
            role = freeSubscribe.getRole();
            subTime = freeSubscribe.getSubTime();
        }
        if (j11 != 0) {
            this.tvDelete.setOnClickListener(onClickListener);
        }
        if (j12 != 0) {
            TextViewBindingAdapter.setText(this.tvSubscribeName, name);
            TextViewBindingAdapter.setText(this.tvSubscribeRole, role);
            TextViewBindingAdapter.setText(this.tvSubscribeTime, subTime);
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
            this.mDirtyFlags = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.zykj.study.databinding.ItemFreeSubscribeBinding
    public void setData(@Nullable FreeSubscribe freeSubscribe) {
        this.mData = freeSubscribe;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemFreeSubscribeBinding
    public void setDeleteClick(@Nullable View.OnClickListener onClickListener) {
        this.mDeleteClick = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(8);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (8 == i10) {
            setDeleteClick((View.OnClickListener) obj);
            return true;
        }
        if (7 != i10) {
            return false;
        }
        setData((FreeSubscribe) obj);
        return true;
    }

    private ItemFreeSubscribeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[3]);
        this.mDirtyFlags = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.tvDelete.setTag(null);
        this.tvSubscribeName.setTag(null);
        this.tvSubscribeRole.setTag(null);
        this.tvSubscribeTime.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
