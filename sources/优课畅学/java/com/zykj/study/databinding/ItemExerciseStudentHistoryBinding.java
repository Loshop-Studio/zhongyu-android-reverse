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
import com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;

/* loaded from: classes3.dex */
public abstract class ItemExerciseStudentHistoryBinding extends ViewDataBinding {

    @NonNull
    public final LayoutExerciseAnswerHistoryBinding exerciseAnswer;

    @NonNull
    public final LayoutExerciseSubjectBinding exerciseSubject;

    @Bindable
    protected ExerciseStudentHistoryViewModel mEntity;

    @Bindable
    protected boolean mIsTeacher;

    @Bindable
    protected WebViewControlViewModel mWebViewControlViewModel;

    @NonNull
    public final MultipleChoiceAnimationView multipleChoiceView;

    public ItemExerciseStudentHistoryBinding(Object obj, View view, int i10, LayoutExerciseAnswerHistoryBinding layoutExerciseAnswerHistoryBinding, LayoutExerciseSubjectBinding layoutExerciseSubjectBinding, MultipleChoiceAnimationView multipleChoiceAnimationView) {
        super(obj, view, i10);
        this.exerciseAnswer = layoutExerciseAnswerHistoryBinding;
        this.exerciseSubject = layoutExerciseSubjectBinding;
        this.multipleChoiceView = multipleChoiceAnimationView;
    }

    public static ItemExerciseStudentHistoryBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemExerciseStudentHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ExerciseStudentHistoryViewModel getEntity() {
        return this.mEntity;
    }

    public boolean getIsTeacher() {
        return this.mIsTeacher;
    }

    @Nullable
    public WebViewControlViewModel getWebViewControlViewModel() {
        return this.mWebViewControlViewModel;
    }

    public abstract void setEntity(@Nullable ExerciseStudentHistoryViewModel exerciseStudentHistoryViewModel);

    public abstract void setIsTeacher(boolean z10);

    public abstract void setWebViewControlViewModel(@Nullable WebViewControlViewModel webViewControlViewModel);

    @Deprecated
    public static ItemExerciseStudentHistoryBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemExerciseStudentHistoryBinding) ViewDataBinding.bind(obj, view, R$layout.item_exercise_student_history);
    }

    @NonNull
    @Deprecated
    public static ItemExerciseStudentHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemExerciseStudentHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_exercise_student_history, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemExerciseStudentHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemExerciseStudentHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemExerciseStudentHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_exercise_student_history, null, false, obj);
    }
}
