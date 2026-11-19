package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.textview.ExpandableTextView;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CourseDetailsBean;
import com.zykj.study.viewmodels.DictViewModel;

/* loaded from: classes3.dex */
public abstract class LayoutCourseSynopsisBinding extends ViewDataBinding {

    @NonNull
    public final ItemCourseStatusBtnBinding courseStatusBtn;

    @NonNull
    public final ImageButton expandCollapse;

    @NonNull
    public final ExpandableTextView expandTextView;

    @NonNull
    public final TextView expandableText;

    @NonNull
    public final ImageView imageView5;

    @NonNull
    public final ImageView imageView6;

    @NonNull
    public final ItemCourseTitleBinding itemCourseTitle;

    @NonNull
    public final ImageView ivCover;

    @Bindable
    protected DictViewModel mDictViewModel;

    @Bindable
    protected CourseDetailsBean mEntity;

    @Bindable
    protected UserBean mUserInfo;

    @NonNull
    public final TextView textView4;

    @NonNull
    public final TextView textView6;

    @NonNull
    public final TextView tvTeacherName;

    public LayoutCourseSynopsisBinding(Object obj, View view, int i10, ItemCourseStatusBtnBinding itemCourseStatusBtnBinding, ImageButton imageButton, ExpandableTextView expandableTextView, TextView textView, ImageView imageView, ImageView imageView2, ItemCourseTitleBinding itemCourseTitleBinding, ImageView imageView3, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i10);
        this.courseStatusBtn = itemCourseStatusBtnBinding;
        this.expandCollapse = imageButton;
        this.expandTextView = expandableTextView;
        this.expandableText = textView;
        this.imageView5 = imageView;
        this.imageView6 = imageView2;
        this.itemCourseTitle = itemCourseTitleBinding;
        this.ivCover = imageView3;
        this.textView4 = textView2;
        this.textView6 = textView3;
        this.tvTeacherName = textView4;
    }

    public static LayoutCourseSynopsisBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutCourseSynopsisBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public DictViewModel getDictViewModel() {
        return this.mDictViewModel;
    }

    @Nullable
    public CourseDetailsBean getEntity() {
        return this.mEntity;
    }

    @Nullable
    public UserBean getUserInfo() {
        return this.mUserInfo;
    }

    public abstract void setDictViewModel(@Nullable DictViewModel dictViewModel);

    public abstract void setEntity(@Nullable CourseDetailsBean courseDetailsBean);

    public abstract void setUserInfo(@Nullable UserBean userBean);

    @Deprecated
    public static LayoutCourseSynopsisBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutCourseSynopsisBinding) ViewDataBinding.bind(obj, view, R$layout.layout_course_synopsis);
    }

    @NonNull
    @Deprecated
    public static LayoutCourseSynopsisBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (LayoutCourseSynopsisBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_course_synopsis, viewGroup, z10, obj);
    }

    @NonNull
    public static LayoutCourseSynopsisBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutCourseSynopsisBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutCourseSynopsisBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_course_synopsis, null, false, obj);
    }
}
