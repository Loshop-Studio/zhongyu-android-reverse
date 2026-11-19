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
import com.zykj.study.bean.exercise.QuestionType;
import com.zykj.study.view.CustomX5WebView;

/* loaded from: classes3.dex */
public abstract class ViewRightKeyBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivLabelIcon;

    @NonNull
    public final ImageView ivRightKeyDismissOrShow;

    @NonNull
    public final RelativeLayout llAnalysis;

    @Bindable
    protected String mAnswerStandard;

    @Bindable
    protected QuestionType mQuestionType;

    @NonNull
    public final TextView tvRightKeyLabel;

    @NonNull
    public final CustomX5WebView wbRightKey;

    public ViewRightKeyBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, TextView textView, CustomX5WebView customX5WebView) {
        super(obj, view, i10);
        this.ivLabelIcon = imageView;
        this.ivRightKeyDismissOrShow = imageView2;
        this.llAnalysis = relativeLayout;
        this.tvRightKeyLabel = textView;
        this.wbRightKey = customX5WebView;
    }

    public static ViewRightKeyBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewRightKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public String getAnswerStandard() {
        return this.mAnswerStandard;
    }

    @Nullable
    public QuestionType getQuestionType() {
        return this.mQuestionType;
    }

    public abstract void setAnswerStandard(@Nullable String str);

    public abstract void setQuestionType(@Nullable QuestionType questionType);

    @Deprecated
    public static ViewRightKeyBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewRightKeyBinding) ViewDataBinding.bind(obj, view, R$layout.view_right_key);
    }

    @NonNull
    @Deprecated
    public static ViewRightKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ViewRightKeyBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_right_key, viewGroup, z10, obj);
    }

    @NonNull
    public static ViewRightKeyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewRightKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewRightKeyBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_right_key, null, false, obj);
    }
}
