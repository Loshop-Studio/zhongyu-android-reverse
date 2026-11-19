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
public abstract class FragmentExerciseTrainSingleChoiceBinding extends ViewDataBinding {

    @NonNull
    public final ViewEditChoiceBinding answerChoice;

    @NonNull
    public final RoundButton btnSubmit;

    public FragmentExerciseTrainSingleChoiceBinding(Object obj, View view, int i10, ViewEditChoiceBinding viewEditChoiceBinding, RoundButton roundButton) {
        super(obj, view, i10);
        this.answerChoice = viewEditChoiceBinding;
        this.btnSubmit = roundButton;
    }

    public static FragmentExerciseTrainSingleChoiceBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseTrainSingleChoiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentExerciseTrainSingleChoiceBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseTrainSingleChoiceBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise_train_single_choice);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainSingleChoiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseTrainSingleChoiceBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train_single_choice, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseTrainSingleChoiceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainSingleChoiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseTrainSingleChoiceBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train_single_choice, null, false, obj);
    }
}
