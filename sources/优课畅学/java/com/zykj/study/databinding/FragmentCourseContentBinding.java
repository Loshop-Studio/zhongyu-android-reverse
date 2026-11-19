package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.CourseContentViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentCourseContentBinding extends ViewDataBinding {

    @NonNull
    public final FrameLayout fmContent;

    @NonNull
    public final LinearLayout fragmentCourseContent;

    @Bindable
    protected CourseContentViewModel mEntity;

    @NonNull
    public final TitleBar toolbar;

    public FragmentCourseContentBinding(Object obj, View view, int i10, FrameLayout frameLayout, LinearLayout linearLayout, TitleBar titleBar) {
        super(obj, view, i10);
        this.fmContent = frameLayout;
        this.fragmentCourseContent = linearLayout;
        this.toolbar = titleBar;
    }

    public static FragmentCourseContentBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentCourseContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CourseContentViewModel getEntity() {
        return this.mEntity;
    }

    public abstract void setEntity(@Nullable CourseContentViewModel courseContentViewModel);

    @Deprecated
    public static FragmentCourseContentBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentCourseContentBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_course_content);
    }

    @NonNull
    @Deprecated
    public static FragmentCourseContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentCourseContentBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_course_content, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentCourseContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentCourseContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentCourseContentBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_course_content, null, false, obj);
    }
}
