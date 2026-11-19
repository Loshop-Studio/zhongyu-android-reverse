package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.base.ext.BindingAdaptersKt;

/* loaded from: classes3.dex */
public class ItemMicroEditBindingImpl extends ItemMicroEditBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final ConstraintLayout mboundView0;

    @NonNull
    private final ImageView mboundView1;

    @NonNull
    private final RelativeLayout mboundView2;

    public ItemMicroEditBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        View.OnClickListener onClickListener = this.mDeleteClick;
        View.OnClickListener onClickListener2 = this.mPlayClick;
        String str = this.mUrl;
        long j11 = 9 & j10;
        long j12 = 10 & j10;
        long j13 = j10 & 12;
        if (j12 != 0) {
            this.mboundView0.setOnClickListener(onClickListener2);
        }
        if (j13 != 0) {
            BindingAdaptersKt.netUrl(this.mboundView1, str);
        }
        if (j11 != 0) {
            this.mboundView2.setOnClickListener(onClickListener);
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
            this.mDirtyFlags = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.zykj.study.databinding.ItemMicroEditBinding
    public void setDeleteClick(@Nullable View.OnClickListener onClickListener) {
        this.mDeleteClick = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(8);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemMicroEditBinding
    public void setPlayClick(@Nullable View.OnClickListener onClickListener) {
        this.mPlayClick = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(41);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemMicroEditBinding
    public void setUrl(@Nullable String str) {
        this.mUrl = str;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(54);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (8 == i10) {
            setDeleteClick((View.OnClickListener) obj);
            return true;
        }
        if (41 == i10) {
            setPlayClick((View.OnClickListener) obj);
            return true;
        }
        if (54 != i10) {
            return false;
        }
        setUrl((String) obj);
        return true;
    }

    private ItemMicroEditBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.mDirtyFlags = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.mboundView1 = imageView;
        imageView.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[2];
        this.mboundView2 = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
