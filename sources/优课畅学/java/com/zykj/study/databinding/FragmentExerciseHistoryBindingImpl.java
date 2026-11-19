package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.ExerciseHistoryViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;

/* loaded from: classes3.dex */
public class FragmentExerciseHistoryBindingImpl extends FragmentExerciseHistoryBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"item_exercise_history"}, new int[]{1}, new int[]{R$layout.item_exercise_history});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.toolbar, 2);
    }

    public FragmentExerciseHistoryBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    private boolean onChangeExercise(ItemExerciseHistoryBinding itemExerciseHistoryBinding, int i10) {
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
        ExerciseHistoryViewModel exerciseHistoryViewModel = this.mEntity;
        WebViewControlViewModel webViewControlViewModel = this.mWebViewControlViewModel;
        long j11 = 10 & j10;
        long j12 = j10 & 12;
        if (j11 != 0) {
            this.exercise.setEntity(exerciseHistoryViewModel);
        }
        if (j12 != 0) {
            this.exercise.setWebViewControlViewModel(webViewControlViewModel);
        }
        ViewDataBinding.executeBindingsOn(this.exercise);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.exercise.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 8L;
        }
        this.exercise.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return onChangeExercise((ItemExerciseHistoryBinding) obj, i11);
    }

    @Override // com.zykj.study.databinding.FragmentExerciseHistoryBinding
    public void setEntity(@Nullable ExerciseHistoryViewModel exerciseHistoryViewModel) {
        this.mEntity = exerciseHistoryViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.exercise.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 == i10) {
            setEntity((ExerciseHistoryViewModel) obj);
            return true;
        }
        if (60 != i10) {
            return false;
        }
        setWebViewControlViewModel((WebViewControlViewModel) obj);
        return true;
    }

    @Override // com.zykj.study.databinding.FragmentExerciseHistoryBinding
    public void setWebViewControlViewModel(@Nullable WebViewControlViewModel webViewControlViewModel) {
        this.mWebViewControlViewModel = webViewControlViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(60);
        super.requestRebind();
    }

    private FragmentExerciseHistoryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ItemExerciseHistoryBinding) objArr[1], (LinearLayout) objArr[0], (TitleBar) objArr[2]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.exercise);
        this.fragmentExerciseHistory.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
