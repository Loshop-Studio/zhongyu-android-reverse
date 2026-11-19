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
import com.zykj.study.bean.exercise.ChoiceBean;

/* loaded from: classes3.dex */
public abstract class ViewMultipleChoiceAnimationViewerBinding extends ViewDataBinding {

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected ChoiceBean mEntity;

    @Bindable
    protected boolean mIsSelected;

    @Bindable
    protected String mText;

    public ViewMultipleChoiceAnimationViewerBinding(Object obj, View view, int i10) {
        super(obj, view, i10);
    }

    public static ViewMultipleChoiceAnimationViewerBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewMultipleChoiceAnimationViewerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getClickListener() {
        return this.mClickListener;
    }

    @Nullable
    public ChoiceBean getEntity() {
        return this.mEntity;
    }

    public boolean getIsSelected() {
        return this.mIsSelected;
    }

    @Nullable
    public String getText() {
        return this.mText;
    }

    public abstract void setClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setEntity(@Nullable ChoiceBean choiceBean);

    public abstract void setIsSelected(boolean z10);

    public abstract void setText(@Nullable String str);

    @Deprecated
    public static ViewMultipleChoiceAnimationViewerBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewMultipleChoiceAnimationViewerBinding) ViewDataBinding.bind(obj, view, R$layout.view_multiple_choice_animation_viewer);
    }

    @NonNull
    @Deprecated
    public static ViewMultipleChoiceAnimationViewerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ViewMultipleChoiceAnimationViewerBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_multiple_choice_animation_viewer, viewGroup, z10, obj);
    }

    @NonNull
    public static ViewMultipleChoiceAnimationViewerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewMultipleChoiceAnimationViewerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewMultipleChoiceAnimationViewerBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_multiple_choice_animation_viewer, null, false, obj);
    }
}
