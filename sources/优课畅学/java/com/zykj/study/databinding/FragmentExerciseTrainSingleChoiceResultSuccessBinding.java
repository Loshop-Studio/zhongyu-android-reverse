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
public abstract class FragmentExerciseTrainSingleChoiceResultSuccessBinding extends ViewDataBinding {

    @NonNull
    public final ViewEditChoiceBinding answerChoice;

    @NonNull
    public final ViewMicroBinding answerMicro;

    @NonNull
    public final ViewEditChoiceButtonBinding editChoiceButton;

    @Bindable
    protected BaseTrainViewModel mTrainViewModel;

    public FragmentExerciseTrainSingleChoiceResultSuccessBinding(Object obj, View view, int i10, ViewEditChoiceBinding viewEditChoiceBinding, ViewMicroBinding viewMicroBinding, ViewEditChoiceButtonBinding viewEditChoiceButtonBinding) {
        super(obj, view, i10);
        this.answerChoice = viewEditChoiceBinding;
        this.answerMicro = viewMicroBinding;
        this.editChoiceButton = viewEditChoiceButtonBinding;
    }

    public static FragmentExerciseTrainSingleChoiceResultSuccessBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseTrainSingleChoiceResultSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseTrainViewModel getTrainViewModel() {
        return this.mTrainViewModel;
    }

    public abstract void setTrainViewModel(@Nullable BaseTrainViewModel baseTrainViewModel);

    @Deprecated
    public static FragmentExerciseTrainSingleChoiceResultSuccessBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseTrainSingleChoiceResultSuccessBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise_train_single_choice_result_success);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainSingleChoiceResultSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseTrainSingleChoiceResultSuccessBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train_single_choice_result_success, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseTrainSingleChoiceResultSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainSingleChoiceResultSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseTrainSingleChoiceResultSuccessBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train_single_choice_result_success, null, false, obj);
    }
}
