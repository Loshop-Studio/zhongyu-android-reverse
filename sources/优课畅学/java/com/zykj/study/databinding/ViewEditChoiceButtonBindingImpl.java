package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.viewmodels.BaseTrainViewModel;

/* loaded from: classes3.dex */
public class ViewEditChoiceButtonBindingImpl extends ViewEditChoiceButtonBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    public ViewEditChoiceButtonBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean z10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        BaseTrainViewModel baseTrainViewModel = this.mViewModel;
        long j11 = j10 & 3;
        if (j11 != 0) {
            zM12024d = baseTrainViewModel != null ? baseTrainViewModel.m12024d() : false;
            z10 = !zM12024d;
        } else {
            z10 = false;
        }
        if (j11 != 0) {
            BindingAdaptersKt.visibleOrGone(this.btnComplete, Boolean.valueOf(zM12024d));
            BindingAdaptersKt.visibleOrGone(this.btnNext, Boolean.valueOf(z10));
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
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (59 != i10) {
            return false;
        }
        setViewModel((BaseTrainViewModel) obj);
        return true;
    }

    @Override // com.zykj.study.databinding.ViewEditChoiceButtonBinding
    public void setViewModel(@Nullable BaseTrainViewModel baseTrainViewModel) {
        this.mViewModel = baseTrainViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(59);
        super.requestRebind();
    }

    private ViewEditChoiceButtonBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundButton) objArr[2], (RoundButton) objArr[1]);
        this.mDirtyFlags = -1L;
        this.btnComplete.setTag(null);
        this.btnNext.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
