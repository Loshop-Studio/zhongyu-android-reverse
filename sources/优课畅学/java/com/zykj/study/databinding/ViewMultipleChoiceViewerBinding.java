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
import com.zykj.study.bean.exercise.ChoiceBean;

/* loaded from: classes3.dex */
public abstract class ViewMultipleChoiceViewerBinding extends ViewDataBinding {

    @Bindable
    protected ChoiceBean mEntity;

    @NonNull
    public final TextView tvTitle;

    public ViewMultipleChoiceViewerBinding(Object obj, View view, int i10, TextView textView) {
        super(obj, view, i10);
        this.tvTitle = textView;
    }

    public static ViewMultipleChoiceViewerBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewMultipleChoiceViewerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ChoiceBean getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable ChoiceBean choiceBean);

    @Deprecated
    public static ViewMultipleChoiceViewerBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewMultipleChoiceViewerBinding) ViewDataBinding.bind(obj, view, R$layout.view_multiple_choice_viewer);
    }

    @NonNull
    @Deprecated
    public static ViewMultipleChoiceViewerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ViewMultipleChoiceViewerBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_multiple_choice_viewer, viewGroup, z10, obj);
    }

    @NonNull
    public static ViewMultipleChoiceViewerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewMultipleChoiceViewerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewMultipleChoiceViewerBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_multiple_choice_viewer, null, false, obj);
    }
}
