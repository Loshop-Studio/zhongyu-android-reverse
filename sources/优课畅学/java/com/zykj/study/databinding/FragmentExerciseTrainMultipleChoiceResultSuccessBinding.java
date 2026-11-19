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
public abstract class FragmentExerciseTrainMultipleChoiceResultSuccessBinding extends ViewDataBinding {

    @NonNull
    public final ViewEditChoiceBinding answerChoice;

    @NonNull
    public final ViewMicroBinding answerMicro;

    @NonNull
    public final ViewEditChoiceButtonBinding editChoiceButton;

    @Bindable
    protected BaseTrainViewModel mTrainViewModel;

    public FragmentExerciseTrainMultipleChoiceResultSuccessBinding(Object obj, View view, int i10, ViewEditChoiceBinding viewEditChoiceBinding, ViewMicroBinding viewMicroBinding, ViewEditChoiceButtonBinding viewEditChoiceButtonBinding) {
        super(obj, view, i10);
        this.answerChoice = viewEditChoiceBinding;
        this.answerMicro = viewMicroBinding;
        this.editChoiceButton = viewEditChoiceButtonBinding;
    }

    public static FragmentExerciseTrainMultipleChoiceResultSuccessBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseTrainMultipleChoiceResultSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseTrainViewModel getTrainViewModel() {
        return this.mTrainViewModel;
    }

    public abstract void setTrainViewModel(@Nullable BaseTrainViewModel baseTrainViewModel);

    @Deprecated
    public static FragmentExerciseTrainMultipleChoiceResultSuccessBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseTrainMultipleChoiceResultSuccessBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise_train_multiple_choice_result_success);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainMultipleChoiceResultSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseTrainMultipleChoiceResultSuccessBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train_multiple_choice_result_success, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseTrainMultipleChoiceResultSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainMultipleChoiceResultSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseTrainMultipleChoiceResultSuccessBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train_multiple_choice_result_success, null, false, obj);
    }
}
