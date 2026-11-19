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
import com.zykj.study.bean.course.CourseBean;

/* loaded from: classes3.dex */
public abstract class ItemCourseStatusBinding extends ViewDataBinding {

    @NonNull
    public final TextView courseStatus;

    @Bindable
    protected CourseBean mEntity;

    public ItemCourseStatusBinding(Object obj, View view, int i10, TextView textView) {
        super(obj, view, i10);
        this.courseStatus = textView;
    }

    public static ItemCourseStatusBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemCourseStatusBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CourseBean getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable CourseBean courseBean);

    @Deprecated
    public static ItemCourseStatusBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemCourseStatusBinding) ViewDataBinding.bind(obj, view, R$layout.item_course_status);
    }

    @NonNull
    @Deprecated
    public static ItemCourseStatusBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemCourseStatusBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_course_status, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemCourseStatusBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCourseStatusBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCourseStatusBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_course_status, null, false, obj);
    }
}
