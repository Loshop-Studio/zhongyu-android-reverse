package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.BaseTrainViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentExerciseTrainAnswerResultBinding extends ViewDataBinding {

    @NonNull
    public final ViewMicroBinding answerMicro;

    @NonNull
    public final ViewAnswerMicroBinding editAnswerMicro;

    @NonNull
    public final ViewEditAnswerMicroButtonBinding editAnswerMicroButton;

    @Bindable
    protected BaseTrainViewModel mTrainViewModel;

    public FragmentExerciseTrainAnswerResultBinding(Object obj, View view, int i10, ViewMicroBinding viewMicroBinding, ViewAnswerMicroBinding viewAnswerMicroBinding, ViewEditAnswerMicroButtonBinding viewEditAnswerMicroButtonBinding) {
        super(obj, view, i10);
        this.answerMicro = viewMicroBinding;
        this.editAnswerMicro = viewAnswerMicroBinding;
        this.editAnswerMicroButton = viewEditAnswerMicroButtonBinding;
    }

    public static FragmentExerciseTrainAnswerResultBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseTrainAnswerResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseTrainViewModel getTrainViewModel() {
        return this.mTrainViewModel;
    }

    public abstract void setTrainViewModel(@Nullable BaseTrainViewModel baseTrainViewModel);

    @Deprecated
    public static FragmentExerciseTrainAnswerResultBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseTrainAnswerResultBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise_train_answer_result);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainAnswerResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseTrainAnswerResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train_answer_result, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseTrainAnswerResultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainAnswerResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseTrainAnswerResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train_answer_result, null, false, obj);
    }
}
