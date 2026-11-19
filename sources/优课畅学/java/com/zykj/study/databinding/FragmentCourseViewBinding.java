package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentCourseViewBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout fragmentCourseView;

    public FragmentCourseViewBinding(Object obj, View view, int i10, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.fragmentCourseView = linearLayout;
    }

    public static FragmentCourseViewBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentCourseViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCourseViewBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentCourseViewBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_course_view);
    }

    @NonNull
    @Deprecated
    public static FragmentCourseViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentCourseViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_course_view, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentCourseViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentCourseViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentCourseViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_course_view, null, false, obj);
    }
}
