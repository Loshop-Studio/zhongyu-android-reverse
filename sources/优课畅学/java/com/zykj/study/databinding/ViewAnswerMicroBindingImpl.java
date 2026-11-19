package com.zykj.study.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.google.android.material.imageview.ShapeableImageView;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$id;
import com.zykj.study.R$string;

/* loaded from: classes3.dex */
public class ViewAnswerMicroBindingImpl extends ViewAnswerMicroBinding {

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
        sparseIntArray.put(R$id.iv_micro_dismiss_or_show, 5);
        sparseIntArray.put(R$id.iv_label_icon, 6);
        sparseIntArray.put(R$id.rl_micro_edit, 7);
    }

    public ViewAnswerMicroBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() throws Resources.NotFoundException {
        long j10;
        boolean zIsEmpty;
        boolean z10;
        String string;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        String str = this.mSnapshotUrl;
        boolean z11 = this.mIsTeacher;
        if ((j10 & 5) != 0) {
            zIsEmpty = str != null ? str.isEmpty() : false;
            z10 = !zIsEmpty;
        } else {
            zIsEmpty = false;
            z10 = false;
        }
        long j11 = j10 & 6;
        if (j11 != 0) {
            boolean z12 = z11;
            if (j11 != 0) {
                j10 |= z12 ? 16L : 8L;
            }
            string = this.tvMicroExerciseLabel.getResources().getString(z12 ? R$string.student_answer : R$string.my_answer);
        } else {
            string = null;
        }
        if ((5 & j10) != 0) {
            BindingAdaptersKt.visibleOrGone(this.ivHint, Boolean.valueOf(zIsEmpty));
            BindingAdaptersKt.visibleOrGone(this.ivSnapshot, Boolean.valueOf(z10));
            BindingAdaptersKt.visibleOrGone(this.mboundView3, Boolean.valueOf(zIsEmpty));
        }
        if ((j10 & 6) != 0) {
            TextViewBindingAdapter.setText(this.tvMicroExerciseLabel, string);
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

    @Override // com.zykj.study.databinding.ViewAnswerMicroBinding
    public void setIsTeacher(boolean z10) {
        this.mIsTeacher = z10;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(29);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ViewAnswerMicroBinding
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
        if (29 != i10) {
            return false;
        }
        setIsTeacher(((Boolean) obj).booleanValue());
        return true;
    }

    private ViewAnswerMicroBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (ImageView) objArr[6], (ImageView) objArr[5], (ShapeableImageView) objArr[4], (RelativeLayout) objArr[7], (TextView) objArr[1]);
        this.mDirtyFlags = -1L;
        this.ivHint.setTag(null);
        this.ivSnapshot.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.mboundView3 = textView;
        textView.setTag(null);
        this.tvMicroExerciseLabel.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
