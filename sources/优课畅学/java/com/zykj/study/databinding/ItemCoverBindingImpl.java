package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.bean.ImageViewInfo;
import com.zykj.study.bean.SelectModel;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class ItemCoverBindingImpl extends ItemCoverBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final ConstraintLayout mboundView0;

    public ItemCoverBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        ImageViewInfo data;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        View.OnClickListener onClickListener = this.mClickListener;
        SelectModel<ImageViewInfo> selectModel = this.mEntity;
        long j11 = 5 & j10;
        long j12 = j10 & 6;
        String url = null;
        boolean zIsSelectModel = false;
        if (j12 != 0) {
            if (selectModel != null) {
                zIsSelectModel = selectModel.isSelectModel();
                data = selectModel.getData();
            } else {
                data = null;
            }
            if (data != null) {
                url = data.getUrl();
            }
        }
        if (j12 != 0) {
            BindingAdaptersKt.netUrl(this.imageView2, url);
            AbstractC8354c.m13617t(this.ivCheck, Boolean.valueOf(zIsSelectModel));
        }
        if (j11 != 0) {
            this.mboundView0.setOnClickListener(onClickListener);
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

    @Override // com.zykj.study.databinding.ItemCoverBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemCoverBinding
    public void setEntity(@Nullable SelectModel<ImageViewInfo> selectModel) {
        this.mEntity = selectModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (5 == i10) {
            setClickListener((View.OnClickListener) obj);
            return true;
        }
        if (15 != i10) {
            return false;
        }
        setEntity((SelectModel) obj);
        return true;
    }

    private ItemCoverBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (ImageView) objArr[2]);
        this.mDirtyFlags = -1L;
        this.imageView2.setTag(null);
        this.ivCheck.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
