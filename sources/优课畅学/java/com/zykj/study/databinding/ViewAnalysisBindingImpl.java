package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.image.R$dimen;
import com.zykj.study.R$id;
import com.zykj.study.view.CustomX5WebView;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class ViewAnalysisBindingImpl extends ViewAnalysisBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.iv_analysis_dismiss_or_show, 3);
        sparseIntArray.put(R$id.iv_label_icon, 4);
        sparseIntArray.put(R$id.tv_analysis_label, 5);
        sparseIntArray.put(R$id.ll_analysis, 6);
    }

    public ViewAnalysisBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        Boolean bool = this.mIsDataEmpty;
        long j11 = 3 & j10;
        boolean z10 = j11 != 0 ? !ViewDataBinding.safeUnbox(bool) : false;
        if (j11 != 0) {
            BindingAdaptersKt.visibleOrGone(this.tvNoAnalysis, bool);
            BindingAdaptersKt.visibleOrGone(this.webViewAnalysis, Boolean.valueOf(z10));
        }
        if ((j10 & 2) != 0) {
            CustomX5WebView customX5WebView = this.webViewAnalysis;
            AbstractC8354c.m13613p(customX5WebView, customX5WebView.getResources().getDimension(R$dimen.view_150));
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

    @Override // com.zykj.study.databinding.ViewAnalysisBinding
    public void setIsDataEmpty(@Nullable Boolean bool) {
        this.mIsDataEmpty = bool;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(24);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (24 != i10) {
            return false;
        }
        setIsDataEmpty((Boolean) obj);
        return true;
    }

    private ViewAnalysisBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (ImageView) objArr[4], (RelativeLayout) objArr[6], (TextView) objArr[5], (TextView) objArr[2], (CustomX5WebView) objArr[1]);
        this.mDirtyFlags = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
        this.tvNoAnalysis.setTag(null);
        this.webViewAnalysis.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
