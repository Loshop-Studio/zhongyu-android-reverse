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

/* loaded from: classes3.dex */
public abstract class FragmentExerciseTrainAnswerBinding extends ViewDataBinding {

    @NonNull
    public final ViewEditAnswerMicroBinding answerMicro;

    @NonNull
    public final RoundButton btnSubmit;

    @Bindable
    protected String mSnapshotUrl;

    public FragmentExerciseTrainAnswerBinding(Object obj, View view, int i10, ViewEditAnswerMicroBinding viewEditAnswerMicroBinding, RoundButton roundButton) {
        super(obj, view, i10);
        this.answerMicro = viewEditAnswerMicroBinding;
        this.btnSubmit = roundButton;
    }

    public static FragmentExerciseTrainAnswerBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseTrainAnswerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public String getSnapshotUrl() {
        return this.mSnapshotUrl;
    }

    public abstract void setSnapshotUrl(@Nullable String str);

    @Deprecated
    public static FragmentExerciseTrainAnswerBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseTrainAnswerBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise_train_answer);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainAnswerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseTrainAnswerBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train_answer, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseTrainAnswerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseTrainAnswerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseTrainAnswerBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_train_answer, null, false, obj);
    }
}
