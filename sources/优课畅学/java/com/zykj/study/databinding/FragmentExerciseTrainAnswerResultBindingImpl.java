package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.kunminx.architecture.p043ui.callback.UnPeekLiveData;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.BaseTrainViewModel;

/* loaded from: classes3.dex */
public class FragmentExerciseTrainAnswerResultBindingImpl extends FragmentExerciseTrainAnswerResultBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    @Nullable
    private final LayoutBindViewModelBinding mboundView01;

    @NonNull
    private final LinearLayout mboundView1;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_edit_answer_micro_button", "layout_bind_view_model"}, new int[]{4, 5}, new int[]{R$layout.view_edit_answer_micro_button, R$layout.layout_bind_view_model});
        includedLayouts.setIncludes(1, new String[]{"view_answer_micro", "view_micro"}, new int[]{2, 3}, new int[]{R$layout.view_answer_micro, R$layout.view_micro});
        sViewsWithIds = null;
    }

    public FragmentExerciseTrainAnswerResultBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    private boolean onChangeAnswerMicro(ViewMicroBinding viewMicroBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeEditAnswerMicro(ViewAnswerMicroBinding viewAnswerMicroBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeEditAnswerMicroButton(ViewEditAnswerMicroButtonBinding viewEditAnswerMicroButtonBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeTrainViewModelIsDialogVisible(UnPeekLiveData<Boolean> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeTrainViewModelToastLiveData(UnPeekLiveData<ToastMessage> unPeekLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        UnPeekLiveData<ToastMessage> toastLiveData;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        BaseTrainViewModel baseTrainViewModel = this.mTrainViewModel;
        Boolean value = null;
        if ((108 & j10) != 0) {
            if ((j10 & 100) != 0) {
                toastLiveData = baseTrainViewModel != null ? baseTrainViewModel.getToastLiveData() : null;
                updateLiveDataRegistration(2, toastLiveData);
                if (toastLiveData != null) {
                    toastLiveData.getValue();
                }
            } else {
                toastLiveData = null;
            }
            if ((j10 & 104) != 0) {
                LiveData<?> liveDataIsDialogVisible = baseTrainViewModel != null ? baseTrainViewModel.isDialogVisible() : null;
                updateLiveDataRegistration(3, liveDataIsDialogVisible);
                if (liveDataIsDialogVisible != null) {
                    value = liveDataIsDialogVisible.getValue();
                }
            }
        } else {
            toastLiveData = null;
        }
        if ((96 & j10) != 0) {
            this.editAnswerMicroButton.setViewModel(baseTrainViewModel);
        }
        if ((104 & j10) != 0) {
            this.mboundView01.setIsDialogVisible(value);
        }
        if ((j10 & 100) != 0) {
            this.mboundView01.setToastLiveData(toastLiveData);
        }
        ViewDataBinding.executeBindingsOn(this.editAnswerMicro);
        ViewDataBinding.executeBindingsOn(this.answerMicro);
        ViewDataBinding.executeBindingsOn(this.editAnswerMicroButton);
        ViewDataBinding.executeBindingsOn(this.mboundView01);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.editAnswerMicro.hasPendingBindings() || this.answerMicro.hasPendingBindings() || this.editAnswerMicroButton.hasPendingBindings() || this.mboundView01.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 64L;
        }
        this.editAnswerMicro.invalidateAll();
        this.answerMicro.invalidateAll();
        this.editAnswerMicroButton.invalidateAll();
        this.mboundView01.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeEditAnswerMicro((ViewAnswerMicroBinding) obj, i11);
        }
        if (i10 == 1) {
            return onChangeAnswerMicro((ViewMicroBinding) obj, i11);
        }
        if (i10 == 2) {
            return onChangeTrainViewModelToastLiveData((UnPeekLiveData) obj, i11);
        }
        if (i10 == 3) {
            return onChangeTrainViewModelIsDialogVisible((UnPeekLiveData) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return onChangeEditAnswerMicroButton((ViewEditAnswerMicroButtonBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.editAnswerMicro.setLifecycleOwner(lifecycleOwner);
        this.answerMicro.setLifecycleOwner(lifecycleOwner);
        this.editAnswerMicroButton.setLifecycleOwner(lifecycleOwner);
        this.mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override // com.zykj.study.databinding.FragmentExerciseTrainAnswerResultBinding
    public void setTrainViewModel(@Nullable BaseTrainViewModel baseTrainViewModel) {
        this.mTrainViewModel = baseTrainViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 32;
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

    private FragmentExerciseTrainAnswerResultBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 5, (ViewMicroBinding) objArr[3], (ViewAnswerMicroBinding) objArr[2], (ViewEditAnswerMicroButtonBinding) objArr[4]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.answerMicro);
        setContainedBinding(this.editAnswerMicro);
        setContainedBinding(this.editAnswerMicroButton);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        LayoutBindViewModelBinding layoutBindViewModelBinding = (LayoutBindViewModelBinding) objArr[5];
        this.mboundView01 = layoutBindViewModelBinding;
        setContainedBinding(layoutBindViewModelBinding);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.mboundView1 = linearLayout2;
        linearLayout2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
