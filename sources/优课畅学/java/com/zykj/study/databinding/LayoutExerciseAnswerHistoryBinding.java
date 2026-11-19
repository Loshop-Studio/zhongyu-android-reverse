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
import com.zykj.study.viewmodels.BaseExerciseViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;

/* loaded from: classes3.dex */
public abstract class LayoutExerciseAnswerHistoryBinding extends ViewDataBinding {

    @NonNull
    public final ViewMicroBinding answerMicro;

    @Bindable
    protected BaseExerciseViewModel mEntity;

    @Bindable
    protected boolean mIsTeacher;

    @Bindable
    protected WebViewControlViewModel mWebViewControlViewModel;

    @NonNull
    public final ViewAnswerMicroBinding myAnswerMicro;

    @NonNull
    public final ViewChoiceBinding viewChoice;

    public LayoutExerciseAnswerHistoryBinding(Object obj, View view, int i10, ViewMicroBinding viewMicroBinding, ViewAnswerMicroBinding viewAnswerMicroBinding, ViewChoiceBinding viewChoiceBinding) {
        super(obj, view, i10);
        this.answerMicro = viewMicroBinding;
        this.myAnswerMicro = viewAnswerMicroBinding;
        this.viewChoice = viewChoiceBinding;
    }

    public static LayoutExerciseAnswerHistoryBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutExerciseAnswerHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseExerciseViewModel getEntity() {
        return this.mEntity;
    }

    public boolean getIsTeacher() {
        return this.mIsTeacher;
    }

    @Nullable
    public WebViewControlViewModel getWebViewControlViewModel() {
        return this.mWebViewControlViewModel;
    }

    public abstract void setEntity(@Nullable BaseExerciseViewModel baseExerciseViewModel);

    public abstract void setIsTeacher(boolean z10);

    public abstract void setWebViewControlViewModel(@Nullable WebViewControlViewModel webViewControlViewModel);

    @Deprecated
    public static LayoutExerciseAnswerHistoryBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutExerciseAnswerHistoryBinding) ViewDataBinding.bind(obj, view, R$layout.layout_exercise_answer_history);
    }

    @NonNull
    @Deprecated
    public static LayoutExerciseAnswerHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (LayoutExerciseAnswerHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_exercise_answer_history, viewGroup, z10, obj);
    }

    @NonNull
    public static LayoutExerciseAnswerHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutExerciseAnswerHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutExerciseAnswerHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_exercise_answer_history, null, false, obj);
    }
}
