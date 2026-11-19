package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.bean.exercise.ChoiceBean;
import com.zykj.study.bean.exercise.ChoiceStatus;
import p086e5.AbstractC8354c;

/* loaded from: classes3.dex */
public class ViewMultipleChoiceAnimationViewerBindingImpl extends ViewMultipleChoiceAnimationViewerBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final RelativeLayout mboundView0;

    @NonNull
    private final TextView mboundView1;

    @NonNull
    private final TextView mboundView2;

    public ViewMultipleChoiceAnimationViewerBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z10 = this.mIsSelected;
        View.OnClickListener onClickListener = this.mClickListener;
        ChoiceBean choiceBean = this.mEntity;
        String str = this.mText;
        long j11 = 17 & j10;
        boolean z11 = j11 != 0 ? !z10 : false;
        long j12 = 18 & j10;
        long j13 = 20 & j10;
        ChoiceStatus showStatus = (j13 == 0 || choiceBean == null) ? null : choiceBean.getShowStatus();
        long j14 = j10 & 24;
        if (j12 != 0) {
            this.mboundView0.setOnClickListener(onClickListener);
        }
        if (j14 != 0) {
            TextViewBindingAdapter.setText(this.mboundView1, str);
            TextViewBindingAdapter.setText(this.mboundView2, str);
        }
        if (j13 != 0) {
            AbstractC8354c.m13606i(this.mboundView1, showStatus);
            AbstractC8354c.m13606i(this.mboundView2, showStatus);
        }
        if (j11 != 0) {
            BindingAdaptersKt.visibleOrGone(this.mboundView1, Boolean.valueOf(z11));
            BindingAdaptersKt.visibleOrGone(this.mboundView2, Boolean.valueOf(z10));
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

    @Override // com.zykj.study.databinding.ViewMultipleChoiceAnimationViewerBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ViewMultipleChoiceAnimationViewerBinding
    public void setEntity(@Nullable ChoiceBean choiceBean) {
        this.mEntity = choiceBean;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ViewMultipleChoiceAnimationViewerBinding
    public void setIsSelected(boolean z10) {
        this.mIsSelected = z10;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(28);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ViewMultipleChoiceAnimationViewerBinding
    public void setText(@Nullable String str) {
        this.mText = str;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(48);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (28 == i10) {
            setIsSelected(((Boolean) obj).booleanValue());
            return true;
        }
        if (5 == i10) {
            setClickListener((View.OnClickListener) obj);
            return true;
        }
        if (15 == i10) {
            setEntity((ChoiceBean) obj);
            return true;
        }
        if (48 != i10) {
            return false;
        }
        setText((String) obj);
        return true;
    }

    private ViewMultipleChoiceAnimationViewerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.mDirtyFlags = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.mboundView1 = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.mboundView2 = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
