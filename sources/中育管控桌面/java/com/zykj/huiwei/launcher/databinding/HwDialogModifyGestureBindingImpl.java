package com.zykj.huiwei.launcher.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.manage.R;
import p078i4.AbstractC6538h;

/* loaded from: classes4.dex */
public class HwDialogModifyGestureBindingImpl extends HwDialogModifyGestureBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final FrameLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tvTitle, 4);
        sparseIntArray.put(R.id.tvContent1, 5);
        sparseIntArray.put(R.id.tvContent2, 6);
    }

    public HwDialogModifyGestureBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j6;
        synchronized (this) {
            j6 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        View.OnClickListener onClickListener = this.mOnClickListener;
        long j7 = 3 & j6;
        if ((j6 & 2) != 0) {
            AppCompatImageView appCompatImageView = this.ivClose;
            AbstractC6538h.m7318a(appCompatImageView, appCompatImageView.getResources().getDimension(R.dimen.pt7));
        }
        if (j7 != 0) {
            AbstractC6538h.m7324g(this.ivClose, onClickListener);
            AbstractC6538h.m7324g(this.tvCancel, onClickListener);
            AbstractC6538h.m7324g(this.tvReset, onClickListener);
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
            this.mDirtyFlags = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i6, Object obj, int i7) {
        return false;
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwDialogModifyGestureBinding
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(6);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i6, @Nullable Object obj) {
        if (6 != i6) {
            return false;
        }
        setOnClickListener((View.OnClickListener) obj);
        return true;
    }

    private HwDialogModifyGestureBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[1], (TextView) objArr[3], (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[2], (TextView) objArr[4]);
        this.mDirtyFlags = -1L;
        this.ivClose.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        this.tvCancel.setTag(null);
        this.tvReset.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
