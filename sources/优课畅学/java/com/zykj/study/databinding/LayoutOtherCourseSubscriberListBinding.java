package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class LayoutOtherCourseSubscriberListBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivOther;

    @Bindable
    protected Integer mPeople;

    public LayoutOtherCourseSubscriberListBinding(Object obj, View view, int i10, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.ivOther = appCompatImageView;
    }

    public static LayoutOtherCourseSubscriberListBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutOtherCourseSubscriberListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public Integer getPeople() {
        return this.mPeople;
    }

    public abstract void setPeople(@Nullable Integer num);

    @Deprecated
    public static LayoutOtherCourseSubscriberListBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutOtherCourseSubscriberListBinding) ViewDataBinding.bind(obj, view, R$layout.layout_other_course_subscriber_list);
    }

    @NonNull
    @Deprecated
    public static LayoutOtherCourseSubscriberListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (LayoutOtherCourseSubscriberListBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_other_course_subscriber_list, viewGroup, z10, obj);
    }

    @NonNull
    public static LayoutOtherCourseSubscriberListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutOtherCourseSubscriberListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutOtherCourseSubscriberListBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_other_course_subscriber_list, null, false, obj);
    }
}
