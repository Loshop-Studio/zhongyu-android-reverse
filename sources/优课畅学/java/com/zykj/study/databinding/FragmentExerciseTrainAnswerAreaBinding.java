package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentExerciseTrainAnswerAreaBinding extends ViewDataBinding {
    public FragmentExerciseTrainAnswerAreaBinding(Object obj, View view, int i10) {
        super(obj, view, i10);
    }

    public static FragmentExerciseTrainAnswerAreaBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseTrainAnswerAreaBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentExerciseTrainAnswerAreaBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseTrainAnswerAreaBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise_train_answer_area);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainAnswerAreaBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseTrainAnswerAreaBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train_answer_area, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseTrainAnswerAreaBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainAnswerAreaBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseTrainAnswerAreaBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train_answer_area, null, false, obj);
    }
}
