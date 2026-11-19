package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.study.R$id;
import com.zykj.study.view.SpecialToastView;
import com.zykj.study.viewmodels.ExerciseViewModel;
import p098f5.AbstractC8459t;

/* loaded from: classes3.dex */
public class FragmentExerciseBindingImpl extends FragmentExerciseBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final SpecialToastView mboundView1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.toolbar, 2);
        sparseIntArray.put(R$id.multiple_status_view, 3);
    }

    public FragmentExerciseBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, sIncludes, sViewsWithIds));
    }

    private boolean onChangeEntityToastLiveData(UnPeekLiveData<ToastMessage> unPeekLiveData, int i10) {
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
        ExerciseViewModel exerciseViewModel = this.mEntity;
        long j11 = j10 & 7;
        if (j11 != 0) {
            toastLiveData = exerciseViewModel != null ? exerciseViewModel.getToastLiveData() : null;
            updateLiveDataRegistration(0, toastLiveData);
            if (toastLiveData != null) {
                toastLiveData.getValue();
            }
        }
        if (j11 != 0) {
            AbstractC8459t.m13787a(this.mboundView1, toastLiveData);
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
        return onChangeEntityToastLiveData((UnPeekLiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.FragmentExerciseBinding
    public void setEntity(@Nullable ExerciseViewModel exerciseViewModel) {
        this.mEntity = exerciseViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 != i10) {
            return false;
        }
        setEntity((ExerciseViewModel) obj);
        return true;
    }

    private FragmentExerciseBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (LinearLayout) objArr[0], (MultipleStatusView) objArr[3], (TitleBar) objArr[2]);
        this.mDirtyFlags = -1L;
        this.fragmentExercise.setTag(null);
        SpecialToastView specialToastView = (SpecialToastView) objArr[1];
        this.mboundView1 = specialToastView;
        specialToastView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
