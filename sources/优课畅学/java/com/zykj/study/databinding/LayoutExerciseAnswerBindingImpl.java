package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import p231r4.ViewOnClickListenerC9912a;

/* loaded from: classes3.dex */
public class LayoutExerciseAnswerBindingImpl extends LayoutExerciseAnswerBinding implements ViewOnClickListenerC9912a.a {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;

    @Nullable
    private final View.OnClickListener mCallback9;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    @NonNull
    private final LinearLayout mboundView1;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"view_edit_choice", "view_micro"}, new int[]{3, 4}, new int[]{R$layout.view_edit_choice, R$layout.view_micro});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.btn_complete, 5);
        sparseIntArray.put(R$id.btn_submit, 6);
        sparseIntArray.put(R$id.btn_revision, 7);
    }

    public LayoutExerciseAnswerBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, sIncludes, sViewsWithIds));
    }

    private boolean onChangeAnswerChoice(ViewEditChoiceBinding viewEditChoiceBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
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

    @Override // p231r4.ViewOnClickListenerC9912a.a
    public final void _internalCallbackOnClick(int i10, View view) {
        ExerciseTrainViewModel exerciseTrainViewModel = this.mEntity;
        if (exerciseTrainViewModel != null) {
            exerciseTrainViewModel.m12013k();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        if ((j10 & 8) != 0) {
            this.btnNext.setOnClickListener(this.mCallback9);
        }
        ViewDataBinding.executeBindingsOn(this.answerChoice);
        ViewDataBinding.executeBindingsOn(this.answerMicro);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.answerChoice.hasPendingBindings() || this.answerMicro.hasPendingBindings();
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
        this.answerChoice.invalidateAll();
        this.answerMicro.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeAnswerMicro((ViewMicroBinding) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return onChangeAnswerChoice((ViewEditChoiceBinding) obj, i11);
    }

    @Override // com.zykj.study.databinding.LayoutExerciseAnswerBinding
    public void setEntity(@Nullable ExerciseTrainViewModel exerciseTrainViewModel) {
        this.mEntity = exerciseTrainViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.answerChoice.setLifecycleOwner(lifecycleOwner);
        this.answerMicro.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 != i10) {
            return false;
        }
        setEntity((ExerciseTrainViewModel) obj);
        return true;
    }

    private LayoutExerciseAnswerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (ViewEditChoiceBinding) objArr[3], (ViewMicroBinding) objArr[4], (RoundButton) objArr[5], (RoundButton) objArr[2], (RoundButton) objArr[7], (RoundButton) objArr[6]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.answerChoice);
        setContainedBinding(this.answerMicro);
        this.btnNext.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.mboundView1 = linearLayout2;
        linearLayout2.setTag(null);
        setRootTag(view);
        this.mCallback9 = new ViewOnClickListenerC9912a(this, 1);
        invalidateAll();
    }
}
