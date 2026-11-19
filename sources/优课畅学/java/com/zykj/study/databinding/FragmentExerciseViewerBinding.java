package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.study.R$layout;
import com.zykj.study.view.MultipleStatusView;
import com.zykj.study.viewmodels.ExerciseViewerViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentExerciseViewerBinding extends ViewDataBinding {

    @NonNull
    public final LayoutExerciseAnswerViewerBinding exerciseAnswer;

    @NonNull
    public final LayoutExerciseSubjectBinding exerciseSubject;

    @NonNull
    public final LinearLayout fragmentViewer;

    @Bindable
    protected ExerciseViewerViewModel mEntity;

    @Bindable
    protected WebViewControlViewModel mWebViewControlViewModel;

    @NonNull
    public final MultipleStatusView multipleStatusView;

    @NonNull
    public final TitleBar toolbar;

    public FragmentExerciseViewerBinding(Object obj, View view, int i10, LayoutExerciseAnswerViewerBinding layoutExerciseAnswerViewerBinding, LayoutExerciseSubjectBinding layoutExerciseSubjectBinding, LinearLayout linearLayout, MultipleStatusView multipleStatusView, TitleBar titleBar) {
        super(obj, view, i10);
        this.exerciseAnswer = layoutExerciseAnswerViewerBinding;
        this.exerciseSubject = layoutExerciseSubjectBinding;
        this.fragmentViewer = linearLayout;
        this.multipleStatusView = multipleStatusView;
        this.toolbar = titleBar;
    }

    public static FragmentExerciseViewerBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseViewerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ExerciseViewerViewModel getEntity() {
        return this.mEntity;
    }

    @Nullable
    public WebViewControlViewModel getWebViewControlViewModel() {
        return this.mWebViewControlViewModel;
    }

    public abstract void setEntity(@Nullable ExerciseViewerViewModel exerciseViewerViewModel);

    public abstract void setWebViewControlViewModel(@Nullable WebViewControlViewModel webViewControlViewModel);

    @Deprecated
    public static FragmentExerciseViewerBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseViewerBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise_viewer);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseViewerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseViewerBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_viewer, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseViewerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseViewerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseViewerBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_viewer, null, false, obj);
    }
}
