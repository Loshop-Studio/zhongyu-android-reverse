package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.view.MultipleChoiceView;

/* loaded from: classes3.dex */
public abstract class ViewChoiceBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivDismissOrShow;

    @NonNull
    public final ImageView ivLabelIcon;

    @NonNull
    public final LinearLayout llChoice;

    @Bindable
    protected boolean mIsTeacher;

    @NonNull
    public final MultipleChoiceView recycler;

    @NonNull
    public final TextView titleWarn;

    @NonNull
    public final TextView tvChoiceLabel;

    @NonNull
    public final View viewTop;

    public ViewChoiceBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, MultipleChoiceView multipleChoiceView, TextView textView, TextView textView2, View view2) {
        super(obj, view, i10);
        this.ivDismissOrShow = imageView;
        this.ivLabelIcon = imageView2;
        this.llChoice = linearLayout;
        this.recycler = multipleChoiceView;
        this.titleWarn = textView;
        this.tvChoiceLabel = textView2;
        this.viewTop = view2;
    }

    public static ViewChoiceBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewChoiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    public boolean getIsTeacher() {
        return this.mIsTeacher;
    }

    public abstract void setIsTeacher(boolean z10);

    @Deprecated
    public static ViewChoiceBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewChoiceBinding) ViewDataBinding.bind(obj, view, R$layout.view_choice);
    }

    @NonNull
    @Deprecated
    public static ViewChoiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ViewChoiceBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_choice, viewGroup, z10, obj);
    }

    @NonNull
    public static ViewChoiceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewChoiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewChoiceBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_choice, null, false, obj);
    }
}
