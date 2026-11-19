package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.BaseTrainViewModel;

/* loaded from: classes3.dex */
public class FragmentExerciseTrainMultipleChoiceResultSuccessBindingImpl extends FragmentExerciseTrainMultipleChoiceResultSuccessBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    @NonNull
    private final LinearLayout mboundView1;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_edit_choice_button"}, new int[]{4}, new int[]{R$layout.view_edit_choice_button});
        includedLayouts.setIncludes(1, new String[]{"view_edit_choice", "view_micro"}, new int[]{2, 3}, new int[]{R$layout.view_edit_choice, R$layout.view_micro});
        sViewsWithIds = null;
    }

    public FragmentExerciseTrainMultipleChoiceResultSuccessBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    private boolean onChangeAnswerChoice(ViewEditChoiceBinding viewEditChoiceBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeAnswerMicro(ViewMicroBinding viewMicroBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeEditChoiceButton(ViewEditChoiceButtonBinding viewEditChoiceButtonBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
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
        BaseTrainViewModel baseTrainViewModel = this.mTrainViewModel;
        if ((j10 & 24) != 0) {
            this.editChoiceButton.setViewModel(baseTrainViewModel);
        }
        ViewDataBinding.executeBindingsOn(this.answerChoice);
        ViewDataBinding.executeBindingsOn(this.answerMicro);
        ViewDataBinding.executeBindingsOn(this.editChoiceButton);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.answerChoice.hasPendingBindings() || this.answerMicro.hasPendingBindings() || this.editChoiceButton.hasPendingBindings();
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
        this.answerChoice.invalidateAll();
        this.answerMicro.invalidateAll();
        this.editChoiceButton.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeAnswerMicro((ViewMicroBinding) obj, i11);
        }
        if (i10 == 1) {
            return onChangeEditChoiceButton((ViewEditChoiceButtonBinding) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return onChangeAnswerChoice((ViewEditChoiceBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.answerChoice.setLifecycleOwner(lifecycleOwner);
        this.answerMicro.setLifecycleOwner(lifecycleOwner);
        this.editChoiceButton.setLifecycleOwner(lifecycleOwner);
    }

    @Override // com.zykj.study.databinding.FragmentExerciseTrainMultipleChoiceResultSuccessBinding
    public void setTrainViewModel(@Nullable BaseTrainViewModel baseTrainViewModel) {
        this.mTrainViewModel = baseTrainViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(53);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (53 != i10) {
            return false;
        }
        setTrainViewModel((BaseTrainViewModel) obj);
        return true;
    }

    private FragmentExerciseTrainMultipleChoiceResultSuccessBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (ViewEditChoiceBinding) objArr[2], (ViewMicroBinding) objArr[3], (ViewEditChoiceButtonBinding) objArr[4]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.answerChoice);
        setContainedBinding(this.answerMicro);
        setContainedBinding(this.editChoiceButton);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.mboundView1 = linearLayout2;
        linearLayout2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
