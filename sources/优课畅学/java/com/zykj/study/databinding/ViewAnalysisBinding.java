package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.view.CustomX5WebView;

/* loaded from: classes3.dex */
public abstract class ViewAnalysisBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivAnalysisDismissOrShow;

    @NonNull
    public final ImageView ivLabelIcon;

    @NonNull
    public final RelativeLayout llAnalysis;

    @Bindable
    protected Boolean mIsDataEmpty;

    @NonNull
    public final TextView tvAnalysisLabel;

    @NonNull
    public final TextView tvNoAnalysis;

    @NonNull
    public final CustomX5WebView webViewAnalysis;

    public ViewAnalysisBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, TextView textView, TextView textView2, CustomX5WebView customX5WebView) {
        super(obj, view, i10);
        this.ivAnalysisDismissOrShow = imageView;
        this.ivLabelIcon = imageView2;
        this.llAnalysis = relativeLayout;
        this.tvAnalysisLabel = textView;
        this.tvNoAnalysis = textView2;
        this.webViewAnalysis = customX5WebView;
    }

    public static ViewAnalysisBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewAnalysisBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public Boolean getIsDataEmpty() {
        return this.mIsDataEmpty;
    }

    public abstract void setIsDataEmpty(@Nullable Boolean bool);

    @Deprecated
    public static ViewAnalysisBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewAnalysisBinding) ViewDataBinding.bind(obj, view, R$layout.view_analysis);
    }

    @NonNull
    @Deprecated
    public static ViewAnalysisBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ViewAnalysisBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_analysis, viewGroup, z10, obj);
    }

    @NonNull
    public static ViewAnalysisBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewAnalysisBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewAnalysisBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_analysis, null, false, obj);
    }
}
