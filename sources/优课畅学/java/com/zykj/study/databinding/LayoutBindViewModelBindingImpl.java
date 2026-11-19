package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kunminx.architecture.p043ui.callback.ProtectedUnPeekLiveData;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.base.view.LoadingDialogView;
import com.zykj.study.view.SpecialToastView;
import p098f5.AbstractC8459t;

/* loaded from: classes3.dex */
public class LayoutBindViewModelBindingImpl extends LayoutBindViewModelBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final FrameLayout mboundView0;

    @NonNull
    private final SpecialToastView mboundView2;

    public LayoutBindViewModelBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    private boolean onChangeToastLiveData(ProtectedUnPeekLiveData<ToastMessage> protectedUnPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        Boolean bool = this.mIsDialogVisible;
        ProtectedUnPeekLiveData<ToastMessage> protectedUnPeekLiveData = this.mToastLiveData;
        long j11 = 6 & j10;
        long j12 = j10 & 5;
        if (j12 != 0 && protectedUnPeekLiveData != null) {
            protectedUnPeekLiveData.getValue();
        }
        if (j11 != 0) {
            BindingAdaptersKt.visibleOrGone(this.loadingDialogView, bool);
        }
        if (j12 != 0) {
            AbstractC8459t.m13787a(this.mboundView2, protectedUnPeekLiveData);
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
        if (i10 != 0) {
            return false;
        }
        return onChangeToastLiveData((ProtectedUnPeekLiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.LayoutBindViewModelBinding
    public void setIsDialogVisible(@Nullable Boolean bool) {
        this.mIsDialogVisible = bool;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(25);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.LayoutBindViewModelBinding
    public void setToastLiveData(@Nullable ProtectedUnPeekLiveData<ToastMessage> protectedUnPeekLiveData) {
        updateLiveDataRegistration(0, protectedUnPeekLiveData);
        this.mToastLiveData = protectedUnPeekLiveData;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(51);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (25 == i10) {
            setIsDialogVisible((Boolean) obj);
            return true;
        }
        if (51 != i10) {
            return false;
        }
        setToastLiveData((ProtectedUnPeekLiveData) obj);
        return true;
    }

    private LayoutBindViewModelBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (LoadingDialogView) objArr[1]);
        this.mDirtyFlags = -1L;
        this.loadingDialogView.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        SpecialToastView specialToastView = (SpecialToastView) objArr[2];
        this.mboundView2 = specialToastView;
        specialToastView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
