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
import com.zykj.study.viewmodels.ExerciseHistoryViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentExerciseHistoryBinding extends ViewDataBinding {

    @NonNull
    public final ItemExerciseHistoryBinding exercise;

    @NonNull
    public final LinearLayout fragmentExerciseHistory;

    @Bindable
    protected ExerciseHistoryViewModel mEntity;

    @Bindable
    protected WebViewControlViewModel mWebViewControlViewModel;

    @NonNull
    public final TitleBar toolbar;

    public FragmentExerciseHistoryBinding(Object obj, View view, int i10, ItemExerciseHistoryBinding itemExerciseHistoryBinding, LinearLayout linearLayout, TitleBar titleBar) {
        super(obj, view, i10);
        this.exercise = itemExerciseHistoryBinding;
        this.fragmentExerciseHistory = linearLayout;
        this.toolbar = titleBar;
    }

    public static FragmentExerciseHistoryBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentExerciseHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
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
    public static FragmentExerciseHistoryBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentExerciseHistoryBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_exercise_history);
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentExerciseHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_history, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentExerciseHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentExerciseHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentExerciseHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_exercise_history, null, false, obj);
    }
}
