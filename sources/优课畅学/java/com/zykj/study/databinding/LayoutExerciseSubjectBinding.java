package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.view.CustomWebView;
import com.zykj.study.viewmodels.BaseExerciseViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;

/* loaded from: classes3.dex */
public abstract class LayoutExerciseSubjectBinding extends ViewDataBinding {

    @Bindable
    protected BaseExerciseViewModel mEntity;

    @Bindable
    protected WebViewControlViewModel mWebViewControlViewModel;

    @NonNull
    public final TextView roundButton;

    @NonNull
    public final TextView roundButton2;

    @NonNull
    public final TextView tvNoAnalysis;

    @NonNull
    public final CustomWebView webView;

    @NonNull
    public final CustomWebView webViewAnalysis;

    @NonNull
    public final CustomWebView webViewCorrectAnswer;

    public LayoutExerciseSubjectBinding(Object obj, View view, int i10, TextView textView, TextView textView2, TextView textView3, CustomWebView customWebView, CustomWebView customWebView2, CustomWebView customWebView3) {
        super(obj, view, i10);
        this.roundButton = textView;
        this.roundButton2 = textView2;
        this.tvNoAnalysis = textView3;
        this.webView = customWebView;
        this.webViewAnalysis = customWebView2;
        this.webViewCorrectAnswer = customWebView3;
    }

    public static LayoutExerciseSubjectBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutExerciseSubjectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BaseExerciseViewModel getEntity() {
        return this.mEntity;
    }

    @Nullable
    public WebViewControlViewModel getWebViewControlViewModel() {
        return this.mWebViewControlViewModel;
    }

    public abstract void setEntity(@Nullable BaseExerciseViewModel baseExerciseViewModel);

    public abstract void setWebViewControlViewModel(@Nullable WebViewControlViewModel webViewControlViewModel);

    @Deprecated
    public static LayoutExerciseSubjectBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutExerciseSubjectBinding) ViewDataBinding.bind(obj, view, R$layout.layout_exercise_subject);
    }

    @NonNull
    @Deprecated
    public static LayoutExerciseSubjectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (LayoutExerciseSubjectBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_exercise_subject, viewGroup, z10, obj);
    }

    @NonNull
    public static LayoutExerciseSubjectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutExerciseSubjectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutExerciseSubjectBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_exercise_subject, null, false, obj);
    }
}
