package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$id;
import com.zykj.study.view.CustomX5WebView;

/* loaded from: classes3.dex */
public class FragmentMicroCropExtraBindingImpl extends FragmentMicroCropExtraBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ImageView mboundView1;

    @NonNull
    private final ImageView mboundView2;

    @NonNull
    private final ImageView mboundView3;

    @NonNull
    private final ImageView mboundView4;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.web_view, 5);
    }

    public FragmentMicroCropExtraBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        View.OnClickListener onClickListener = this.mEnlargeListener;
        View.OnClickListener onClickListener2 = this.mTailoringListener;
        View.OnClickListener onClickListener3 = this.mCloseListener;
        View.OnClickListener onClickListener4 = this.mNarrowListener;
        long j11 = 17 & j10;
        long j12 = 18 & j10;
        long j13 = 20 & j10;
        long j14 = j10 & 24;
        if (j11 != 0) {
            this.mboundView1.setOnClickListener(onClickListener);
        }
        if (j14 != 0) {
            this.mboundView2.setOnClickListener(onClickListener4);
        }
        if (j12 != 0) {
            this.mboundView3.setOnClickListener(onClickListener2);
        }
        if (j13 != 0) {
            this.mboundView4.setOnClickListener(onClickListener3);
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
            this.mDirtyFlags = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.zykj.study.databinding.FragmentMicroCropExtraBinding
    public void setCloseListener(@Nullable View.OnClickListener onClickListener) {
        this.mCloseListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(6);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.FragmentMicroCropExtraBinding
    public void setEnlargeListener(@Nullable View.OnClickListener onClickListener) {
        this.mEnlargeListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(14);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.FragmentMicroCropExtraBinding
    public void setNarrowListener(@Nullable View.OnClickListener onClickListener) {
        this.mNarrowListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(34);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.FragmentMicroCropExtraBinding
    public void setTailoringListener(@Nullable View.OnClickListener onClickListener) {
        this.mTailoringListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(47);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (14 == i10) {
            setEnlargeListener((View.OnClickListener) obj);
            return true;
        }
        if (47 == i10) {
            setTailoringListener((View.OnClickListener) obj);
            return true;
        }
        if (6 == i10) {
            setCloseListener((View.OnClickListener) obj);
            return true;
        }
        if (34 != i10) {
            return false;
        }
        setNarrowListener((View.OnClickListener) obj);
        return true;
    }

    private FragmentMicroCropExtraBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RelativeLayout) objArr[0], (CustomX5WebView) objArr[5]);
        this.mDirtyFlags = -1L;
        this.fragmentMicroCropExtra.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.mboundView1 = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[2];
        this.mboundView2 = imageView2;
        imageView2.setTag(null);
        ImageView imageView3 = (ImageView) objArr[3];
        this.mboundView3 = imageView3;
        imageView3.setTag(null);
        ImageView imageView4 = (ImageView) objArr[4];
        this.mboundView4 = imageView4;
        imageView4.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
