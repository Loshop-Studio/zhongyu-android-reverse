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
import com.zykj.study.view.MultipleChoiceAnimationView;
import com.zykj.study.viewmodels.ExerciseHistoryViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;

/* loaded from: classes3.dex */
public abstract class ItemExerciseHistoryBinding extends ViewDataBinding {

    @NonNull
    public final LayoutExerciseAnswerHistoryBinding exerciseAnswer;

    @NonNull
    public final LayoutExerciseSubjectBinding exerciseSubject;

    @Bindable
    protected ExerciseHistoryViewModel mEntity;

    @Bindable
    protected WebViewControlViewModel mWebViewControlViewModel;

    @NonNull
    public final MultipleChoiceAnimationView multipleChoiceView;

    public ItemExerciseHistoryBinding(Object obj, View view, int i10, LayoutExerciseAnswerHistoryBinding layoutExerciseAnswerHistoryBinding, LayoutExerciseSubjectBinding layoutExerciseSubjectBinding, MultipleChoiceAnimationView multipleChoiceAnimationView) {
        super(obj, view, i10);
        this.exerciseAnswer = layoutExerciseAnswerHistoryBinding;
        this.exerciseSubject = layoutExerciseSubjectBinding;
        this.multipleChoiceView = multipleChoiceAnimationView;
    }

    public static ItemExerciseHistoryBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemExerciseHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ExerciseHistoryViewModel getEntity() {
        return this.mEntity;
    }

    @Nullable
    public WebViewControlViewModel getWebViewControlViewModel() {
        return this.mWebViewControlViewModel;
    }

    public abstract void setEntity(@Nullable ExerciseHistoryViewModel exerciseHistoryViewModel);

    public abstract void setWebViewControlViewModel(@Nullable WebViewControlViewModel webViewControlViewModel);

    @Deprecated
    public static ItemExerciseHistoryBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemExerciseHistoryBinding) ViewDataBinding.bind(obj, view, R$layout.item_exercise_history);
    }

    @NonNull
    @Deprecated
    public static ItemExerciseHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemExerciseHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_exercise_history, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemExerciseHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemExerciseHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemExerciseHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_exercise_history, null, false, obj);
    }
}
