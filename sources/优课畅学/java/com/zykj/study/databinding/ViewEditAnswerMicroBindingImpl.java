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
import com.google.android.material.imageview.ShapeableImageView;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$id;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import p086e5.C8360i;

/* loaded from: classes3.dex */
public class ViewEditAnswerMicroBindingImpl extends ViewEditAnswerMicroBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final RelativeLayout mboundView0;

    @NonNull
    private final TextView mboundView3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.iv_micro_dismiss_or_show, 4);
        sparseIntArray.put(R$id.iv_label_icon, 5);
        sparseIntArray.put(R$id.tv_micro_exercise_label, 6);
        sparseIntArray.put(R$id.rl_micro_edit, 7);
    }

    public ViewEditAnswerMicroBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean zM13634c;
        boolean z10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        String str = this.mSnapshotUrl;
        long j11 = j10 & 5;
        if (j11 != 0) {
            zM13634c = C8360i.f15886a.m13634c(str);
            z10 = !zM13634c;
        } else {
            zM13634c = false;
            z10 = false;
        }
        if (j11 != 0) {
            BindingAdaptersKt.visibleOrGone(this.ivHint, Boolean.valueOf(z10));
            BindingAdaptersKt.visibleOrGone(this.ivSnapshot, Boolean.valueOf(zM13634c));
            BindingAdaptersKt.visibleOrGone(this.mboundView3, Boolean.valueOf(z10));
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

    @Override // com.zykj.study.databinding.ViewEditAnswerMicroBinding
    public void setExerciseTrainViewModel(@Nullable ExerciseTrainViewModel exerciseTrainViewModel) {
        this.mExerciseTrainViewModel = exerciseTrainViewModel;
    }

    @Override // com.zykj.study.databinding.ViewEditAnswerMicroBinding
    public void setSnapshotUrl(@Nullable String str) {
        this.mSnapshotUrl = str;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(46);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (46 == i10) {
            setSnapshotUrl((String) obj);
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setExerciseTrainViewModel((ExerciseTrainViewModel) obj);
        return true;
    }

    private ViewEditAnswerMicroBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (ImageView) objArr[5], (ImageView) objArr[4], (ShapeableImageView) objArr[1], (RelativeLayout) objArr[7], (TextView) objArr[6]);
        this.mDirtyFlags = -1L;
        this.ivHint.setTag(null);
        this.ivSnapshot.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.mboundView3 = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
