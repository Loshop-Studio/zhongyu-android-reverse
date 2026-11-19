package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.view.MultipleStatusView;

/* loaded from: classes3.dex */
public abstract class FragmentStudyProgressBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout content;

    @NonNull
    public final ItemCourseStatusBtnBinding courseStatusBtn;

    @NonNull
    public final LinearLayout fragmentStudyProgress;

    @Bindable
    protected CourseDetailsBean mEntity;

    @Bindable
    protected UserBean mUserInfo;

    @NonNull
    public final MultipleStatusView multipleStatusView;

    @NonNull
    public final RecyclerView recyclerProgress;

    public FragmentStudyProgressBinding(Object obj, View view, int i10, LinearLayout linearLayout, ItemCourseStatusBtnBinding itemCourseStatusBtnBinding, LinearLayout linearLayout2, MultipleStatusView multipleStatusView, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.content = linearLayout;
        this.courseStatusBtn = itemCourseStatusBtnBinding;
        this.fragmentStudyProgress = linearLayout2;
        this.multipleStatusView = multipleStatusView;
        this.recyclerProgress = recyclerView;
    }

    public static FragmentStudyProgressBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentStudyProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CourseDetailsBean getEntity() {
        return this.mEntity;
    }

    @Nullable
    public UserBean getUserInfo() {
        return this.mUserInfo;
    }

    public abstract void setEntity(@Nullable CourseDetailsBean courseDetailsBean);

    public abstract void setUserInfo(@Nullable UserBean userBean);

    @Deprecated
    public static FragmentStudyProgressBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentStudyProgressBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_study_progress);
    }

    @NonNull
    @Deprecated
    public static FragmentStudyProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentStudyProgressBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_study_progress, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentStudyProgressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentStudyProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentStudyProgressBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_study_progress, null, false, obj);
    }
}
