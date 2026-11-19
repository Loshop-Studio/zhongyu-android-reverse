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
import com.zykj.study.viewmodels.ExerciseViewerViewModel;

/* loaded from: classes3.dex */
public abstract class LayoutExerciseAnswerViewerBinding extends ViewDataBinding {

    @NonNull
    public final ViewMicroBinding answerMicro;

    @Bindable
    protected ExerciseViewerViewModel mEntity;

    public LayoutExerciseAnswerViewerBinding(Object obj, View view, int i10, ViewMicroBinding viewMicroBinding) {
        super(obj, view, i10);
        this.answerMicro = viewMicroBinding;
    }

    public static LayoutExerciseAnswerViewerBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutExerciseAnswerViewerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ExerciseViewerViewModel getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable ExerciseViewerViewModel exerciseViewerViewModel);

    @Deprecated
    public static LayoutExerciseAnswerViewerBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutExerciseAnswerViewerBinding) ViewDataBinding.bind(obj, view, R$layout.layout_exercise_answer_viewer);
    }

    @NonNull
    @Deprecated
    public static LayoutExerciseAnswerViewerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (LayoutExerciseAnswerViewerBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_exercise_answer_viewer, viewGroup, z10, obj);
    }

    @NonNull
    public static LayoutExerciseAnswerViewerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutExerciseAnswerViewerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutExerciseAnswerViewerBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_exercise_answer_viewer, null, false, obj);
    }
}
