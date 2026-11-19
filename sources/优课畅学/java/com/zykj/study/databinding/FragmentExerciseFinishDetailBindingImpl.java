package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.base.ext.BindingAdaptersKt;

/* loaded from: classes3.dex */
public class FragmentExerciseFinishDetailBindingImpl extends FragmentExerciseFinishDetailBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final FrameLayout mboundView0;

    @NonNull
    private final LinearLayoutCompat mboundView2;

    public FragmentExerciseFinishDetailBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        Boolean bool = this.mIsEmpty;
        long j11 = j10 & 3;
        boolean z10 = j11 != 0 ? !ViewDataBinding.safeUnbox(bool) : false;
        if (j11 != 0) {
            BindingAdaptersKt.visibleOrGone(this.mboundView2, bool);
            BindingAdaptersKt.visibleOrGone(this.recyclerViewStudent, Boolean.valueOf(z10));
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

    @Override // com.zykj.study.databinding.FragmentExerciseFinishDetailBinding
    public void setIsEmpty(@Nullable Boolean bool) {
        this.mIsEmpty = bool;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(26);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (26 != i10) {
            return false;
        }
        setIsEmpty((Boolean) obj);
        return true;
    }

    private FragmentExerciseFinishDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[1]);
        this.mDirtyFlags = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[2];
        this.mboundView2 = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        this.recyclerViewStudent.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
