package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;

/* loaded from: classes3.dex */
public abstract class LayoutExerciseAnswerBinding extends ViewDataBinding {

    @NonNull
    public final ViewEditChoiceBinding answerChoice;

    @NonNull
    public final ViewMicroBinding answerMicro;

    @NonNull
    public final RoundButton btnComplete;

    @NonNull
    public final RoundButton btnNext;

    @NonNull
    public final RoundButton btnRevision;

    @NonNull
    public final RoundButton btnSubmit;

    @Bindable
    protected ExerciseTrainViewModel mEntity;

    public LayoutExerciseAnswerBinding(Object obj, View view, int i10, ViewEditChoiceBinding viewEditChoiceBinding, ViewMicroBinding viewMicroBinding, RoundButton roundButton, RoundButton roundButton2, RoundButton roundButton3, RoundButton roundButton4) {
        super(obj, view, i10);
        this.answerChoice = viewEditChoiceBinding;
        this.answerMicro = viewMicroBinding;
        this.btnComplete = roundButton;
        this.btnNext = roundButton2;
        this.btnRevision = roundButton3;
        this.btnSubmit = roundButton4;
    }

    public static LayoutExerciseAnswerBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutExerciseAnswerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ExerciseTrainViewModel getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable ExerciseTrainViewModel exerciseTrainViewModel);

    @Deprecated
    public static LayoutExerciseAnswerBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutExerciseAnswerBinding) ViewDataBinding.bind(obj, view, R$layout.layout_exercise_answer);
    }

    @NonNull
    @Deprecated
    public static LayoutExerciseAnswerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (LayoutExerciseAnswerBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_exercise_answer, viewGroup, z10, obj);
    }

    @NonNull
    public static LayoutExerciseAnswerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutExerciseAnswerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutExerciseAnswerBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_exercise_answer, null, false, obj);
    }
}
