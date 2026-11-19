package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentExerciseTrainSingleChoiceResultFailBinding extends ViewDataBinding {

    @NonNull
    public final ViewEditChoiceBinding answerChoice;

    @NonNull
    public final ViewMicroBinding answerMicro;

    @NonNull
    public final RoundButton btnRevision;

    public FragmentExerciseTrainSingleChoiceResultFailBinding(Object obj, View view, int i10, ViewEditChoiceBinding viewEditChoiceBinding, ViewMicroBinding viewMicroBinding, RoundButton roundButton) {
        super(obj, view, i10);
        this.answerChoice = viewEditChoiceBinding;
        this.answerMicro = viewMicroBinding;
        this.btnRevision = roundButton;
    }

    public static FragmentExerciseTrainSingleChoiceResultFailBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseTrainSingleChoiceResultFailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentExerciseTrainSingleChoiceResultFailBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseTrainSingleChoiceResultFailBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise_train_single_choice_result_fail);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainSingleChoiceResultFailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseTrainSingleChoiceResultFailBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train_single_choice_result_fail, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseTrainSingleChoiceResultFailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainSingleChoiceResultFailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseTrainSingleChoiceResultFailBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train_single_choice_result_fail, null, false, obj);
    }
}
