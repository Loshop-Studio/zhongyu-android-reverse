package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.viewmodels.DictViewModel;

/* loaded from: classes3.dex */
public abstract class LayoutMyCourseSynopsisBinding extends ViewDataBinding {

    @NonNull
    public final Button btGrounding;

    @NonNull
    public final Button btUndercarriage;

    @NonNull
    public final View divider;

    @NonNull
    public final ImageButton expandCollapse;

    @NonNull
    public final ExpandableTextView expandTextView;

    @NonNull
    public final TextView expandableText;

    @NonNull
    public final ImageView imageView5;

    @NonNull
    public final ItemCourseTitleBinding itemCourseTitle;

    @NonNull
    public final ImageView ivCover;

    @Bindable
    protected DictViewModel mDictViewModel;

    @Bindable
    protected MyCourseEntity mEntity;

    @Bindable
    protected UserBean mUserInfo;

    @NonNull
    public final TextView textView4;

    @NonNull
    public final TextView tvTeacherName;

    public LayoutMyCourseSynopsisBinding(Object obj, View view, int i10, Button button, Button button2, View view2, ImageButton imageButton, ExpandableTextView expandableTextView, TextView textView, ImageView imageView, ItemCourseTitleBinding itemCourseTitleBinding, ImageView imageView2, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.btGrounding = button;
        this.btUndercarriage = button2;
        this.divider = view2;
        this.expandCollapse = imageButton;
        this.expandTextView = expandableTextView;
        this.expandableText = textView;
        this.imageView5 = imageView;
        this.itemCourseTitle = itemCourseTitleBinding;
        this.ivCover = imageView2;
        this.textView4 = textView2;
        this.tvTeacherName = textView3;
    }

    public static LayoutMyCourseSynopsisBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutMyCourseSynopsisBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public DictViewModel getDictViewModel() {
        return this.mDictViewModel;
    }

    @Nullable
    public MyCourseEntity getEntity() {
        return this.mEntity;
    }

    @Nullable
    public UserBean getUserInfo() {
        return this.mUserInfo;
    }

    public abstract void setDictViewModel(@Nullable DictViewModel dictViewModel);

    public abstract void setEntity(@Nullable MyCourseEntity myCourseEntity);

    public abstract void setUserInfo(@Nullable UserBean userBean);

    @Deprecated
    public static LayoutMyCourseSynopsisBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LayoutMyCourseSynopsisBinding) ViewDataBinding.bind(obj, view, R$layout.layout_my_course_synopsis);
    }

    @NonNull
    @Deprecated
    public static LayoutMyCourseSynopsisBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (LayoutMyCourseSynopsisBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_my_course_synopsis, viewGroup, z10, obj);
    }

    @NonNull
    public static LayoutMyCourseSynopsisBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutMyCourseSynopsisBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LayoutMyCourseSynopsisBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.layout_my_course_synopsis, null, false, obj);
    }
}
