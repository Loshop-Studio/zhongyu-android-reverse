package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;
import com.zykj.view.utils.ExtKt;
import com.zykj.view.widget.radio.NormalColorRadioButton;

/* loaded from: classes3.dex */
public class ViewIncludeEvaluationPenBindingImpl extends ViewIncludeEvaluationPenBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayoutCompat mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C5280R.id.rg_pen_color, 4);
    }

    public ViewIncludeEvaluationPenBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j7;
        synchronized (this) {
            j7 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        if ((j7 & 1) != 0) {
            ExtKt.setCustomColor(this.rbEvalPenBlack, "#000000");
            ExtKt.setCustomColor(this.rbEvalPenBlue, "#007DFE");
            ExtKt.setCustomColor(this.rbEvalPenRed, "#FE3720");
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
            this.mDirtyFlags = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i8) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    private ViewIncludeEvaluationPenBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (NormalColorRadioButton) objArr[1], (NormalColorRadioButton) objArr[2], (NormalColorRadioButton) objArr[3], (RadioGroup) objArr[4]);
        this.mDirtyFlags = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.mboundView0 = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        this.rbEvalPenBlack.setTag("#000000");
        this.rbEvalPenBlue.setTag("#007DFE");
        this.rbEvalPenRed.setTag("#FE3720");
        setRootTag(view);
        invalidateAll();
    }
}
