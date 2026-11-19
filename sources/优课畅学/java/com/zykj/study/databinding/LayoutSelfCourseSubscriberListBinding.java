package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class LayoutSelfCourseSubscriberListBinding extends ViewDataBinding {

    @NonNull
    public final ExpandableListView elvSelfGroupList;

    @NonNull
    public final AppCompatImageView ivSelfCourseNoSelect;

    @NonNull
    public final AppCompatImageView ivSelfListNoGroup;

    @NonNull
    public final LinearLayoutCompat llSelfCourseNoGroup;

    @NonNull
    public final LinearLayoutCompat llSelfCourseNoSelect;

    @NonNull
    public final AppCompatTextView tvSelfCourseNoSelect;

    @NonNull
    public final AppCompatTextView tvSelfListNoGroup;

    public LayoutSelfCourseSubscriberListBinding(Object obj, View view, int i10, ExpandableListView expandableListView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.elvSelfGroupList = expandableListView;
        this.ivSelfCourseNoSelect = appCompatImageView;
        this.ivSelfListNoGroup = appCompatImageView2;
        this.llSelfCourseNoGroup = linearLayoutCompat;
        this.llSelfCourseNoSelect = linearLayoutCompat2;
        this.tvSelfCourseNoSelect = appCompatTextView;
        this.tvSelfListNoGroup = appCompatTextView2;
    }

    public static LayoutSelfCourseSubscriberListBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutSelfCourseSubscriberListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSelfCourseSubscriberListBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutSelfCourseSubscriberListBinding) ViewDataBinding.bind(obj, view, R$layout.layout_self_course_subscriber_list);
    }

    @NonNull
    @Deprecated
    public static LayoutSelfCourseSubscriberListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (LayoutSelfCourseSubscriberListBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_self_course_subscriber_list, viewGroup, z10, obj);
    }

    @NonNull
    public static LayoutSelfCourseSubscriberListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutSelfCourseSubscriberListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutSelfCourseSubscriberListBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_self_course_subscriber_list, null, false, obj);
    }
}
