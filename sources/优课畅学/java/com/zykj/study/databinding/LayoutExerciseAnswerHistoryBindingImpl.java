package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$layout;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.bean.exercise.QuestionType;
import com.zykj.study.viewmodels.BaseExerciseViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;

/* loaded from: classes3.dex */
public class LayoutExerciseAnswerHistoryBindingImpl extends LayoutExerciseAnswerHistoryBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    @NonNull
    private final LinearLayout mboundView1;

    @NonNull
    private final View mboundView2;

    @NonNull
    private final View mboundView3;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"view_choice", "view_answer_micro", "view_micro"}, new int[]{4, 5, 6}, new int[]{R$layout.view_choice, R$layout.view_answer_micro, R$layout.view_micro});
        sViewsWithIds = null;
    }

    public LayoutExerciseAnswerHistoryBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
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

    private boolean onChangeEntityCurrentQuestionLiveData(MutableLiveData<QuestionBean> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeMyAnswerMicro(ViewAnswerMicroBinding viewAnswerMicroBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewChoice(ViewChoiceBinding viewChoiceBinding, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean z10;
        boolean z11;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z12 = this.mIsTeacher;
        BaseExerciseViewModel baseExerciseViewModel = this.mEntity;
        long j11 = j10 & 168;
        boolean z13 = false;
        if (j11 != 0) {
            MutableLiveData mutableLiveDataM12008f = baseExerciseViewModel != null ? baseExerciseViewModel.m12008f() : null;
            updateLiveDataRegistration(3, mutableLiveDataM12008f);
            QuestionBean questionBean = mutableLiveDataM12008f != null ? (QuestionBean) mutableLiveDataM12008f.getValue() : null;
            questionType = questionBean != null ? questionBean.getQuestionType() : null;
            z10 = questionType == QuestionType.SINGLE_CHOICE;
            z11 = questionType == QuestionType.ANSWER;
            if (j11 != 0) {
                j10 = z10 ? j10 | 512 : j10 | 256;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z14 = (j10 & 256) != 0 && questionType == QuestionType.MULTIPLE_CHOICE;
        long j12 = 168 & j10;
        if (j12 != 0) {
            z13 = z10 ? true : z14;
        }
        if (j12 != 0) {
            BindingAdaptersKt.visibleOrGone(this.mboundView2, Boolean.valueOf(z13));
            BindingAdaptersKt.visibleOrGone(this.mboundView3, Boolean.valueOf(z11));
            BindingAdaptersKt.visibleOrGone(this.myAnswerMicro.getRoot(), Boolean.valueOf(z11));
            BindingAdaptersKt.visibleOrGone(this.viewChoice.getRoot(), Boolean.valueOf(z13));
        }
        if ((j10 & 144) != 0) {
            this.myAnswerMicro.setIsTeacher(z12);
            this.viewChoice.setIsTeacher(z12);
        }
        ViewDataBinding.executeBindingsOn(this.viewChoice);
        ViewDataBinding.executeBindingsOn(this.myAnswerMicro);
        ViewDataBinding.executeBindingsOn(this.answerMicro);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.viewChoice.hasPendingBindings() || this.myAnswerMicro.hasPendingBindings() || this.answerMicro.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 128L;
        }
        this.viewChoice.invalidateAll();
        this.myAnswerMicro.invalidateAll();
        this.answerMicro.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return onChangeAnswerMicro((ViewMicroBinding) obj, i11);
        }
        if (i10 == 1) {
            return onChangeMyAnswerMicro((ViewAnswerMicroBinding) obj, i11);
        }
        if (i10 == 2) {
            return onChangeViewChoice((ViewChoiceBinding) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return onChangeEntityCurrentQuestionLiveData((MutableLiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.LayoutExerciseAnswerHistoryBinding
    public void setEntity(@Nullable BaseExerciseViewModel baseExerciseViewModel) {
        this.mEntity = baseExerciseViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.LayoutExerciseAnswerHistoryBinding
    public void setIsTeacher(boolean z10) {
        this.mIsTeacher = z10;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(29);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.viewChoice.setLifecycleOwner(lifecycleOwner);
        this.myAnswerMicro.setLifecycleOwner(lifecycleOwner);
        this.answerMicro.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (29 == i10) {
            setIsTeacher(((Boolean) obj).booleanValue());
            return true;
        }
        if (15 == i10) {
            setEntity((BaseExerciseViewModel) obj);
            return true;
        }
        if (60 != i10) {
            return false;
        }
        setWebViewControlViewModel((WebViewControlViewModel) obj);
        return true;
    }

    @Override // com.zykj.study.databinding.LayoutExerciseAnswerHistoryBinding
    public void setWebViewControlViewModel(@Nullable WebViewControlViewModel webViewControlViewModel) {
        this.mWebViewControlViewModel = webViewControlViewModel;
    }

    private LayoutExerciseAnswerHistoryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 4, (ViewMicroBinding) objArr[6], (ViewAnswerMicroBinding) objArr[5], (ViewChoiceBinding) objArr[4]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.answerMicro);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.mboundView1 = linearLayout2;
        linearLayout2.setTag(null);
        View view2 = (View) objArr[2];
        this.mboundView2 = view2;
        view2.setTag(null);
        View view3 = (View) objArr[3];
        this.mboundView3 = view3;
        view3.setTag(null);
        setContainedBinding(this.myAnswerMicro);
        setContainedBinding(this.viewChoice);
        setRootTag(view);
        invalidateAll();
    }
}
