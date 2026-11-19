package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CourseDetailsBean;

/* loaded from: classes3.dex */
public abstract class ItemCourseStatusBtnBinding extends ViewDataBinding {

    @NonNull
    public final Button btExistTeach;

    @NonNull
    public final Button btSubscribe;

    @NonNull
    public final Button btSubscribeCancel;

    @NonNull
    public final Button btnCanNotUnsubscribe;

    @NonNull
    public final Button btnChoiceToTeach;

    @NonNull
    public final View divider;

    @Bindable
    protected CourseDetailsBean mEntity;

    @Bindable
    protected UserBean mUserInfo;

    public ItemCourseStatusBtnBinding(Object obj, View view, int i10, Button button, Button button2, Button button3, Button button4, Button button5, View view2) {
        super(obj, view, i10);
        this.btExistTeach = button;
        this.btSubscribe = button2;
        this.btSubscribeCancel = button3;
        this.btnCanNotUnsubscribe = button4;
        this.btnChoiceToTeach = button5;
        this.divider = view2;
    }

    public static ItemCourseStatusBtnBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemCourseStatusBtnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
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
    public static ItemCourseStatusBtnBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemCourseStatusBtnBinding) ViewDataBinding.bind(obj, view, R$layout.item_course_status_btn);
    }

    @NonNull
    @Deprecated
    public static ItemCourseStatusBtnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemCourseStatusBtnBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_course_status_btn, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemCourseStatusBtnBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCourseStatusBtnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCourseStatusBtnBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_course_status_btn, null, false, obj);
    }
}
