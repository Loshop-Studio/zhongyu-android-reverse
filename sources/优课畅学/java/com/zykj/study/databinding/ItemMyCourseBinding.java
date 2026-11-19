package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$layout;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.viewmodels.DictViewModel;

/* loaded from: classes3.dex */
public abstract class ItemMyCourseBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout container;

    @NonNull
    public final ItemCourseStatusBinding itemCourseStatus;

    @NonNull
    public final ItemCourseTitleBinding itemCourseTitle;

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected DictViewModel mDictViewModel;

    @Bindable
    protected MyCourseEntity mEntity;

    @Bindable
    protected UserBean mUserInfo;

    @NonNull
    public final RelativeLayout rlContainer;

    @NonNull
    public final TextView tvTeacherName;

    public ItemMyCourseBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, ItemCourseStatusBinding itemCourseStatusBinding, ItemCourseTitleBinding itemCourseTitleBinding, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i10);
        this.container = constraintLayout;
        this.itemCourseStatus = itemCourseStatusBinding;
        this.itemCourseTitle = itemCourseTitleBinding;
        this.rlContainer = relativeLayout;
        this.tvTeacherName = textView;
    }

    public static ItemMyCourseBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemMyCourseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getClickListener() {
        return this.mClickListener;
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

    public abstract void setClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setDictViewModel(@Nullable DictViewModel dictViewModel);

    public abstract void setEntity(@Nullable MyCourseEntity myCourseEntity);

    public abstract void setUserInfo(@Nullable UserBean userBean);

    @Deprecated
    public static ItemMyCourseBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemMyCourseBinding) ViewDataBinding.bind(obj, view, R$layout.item_my_course);
    }

    @NonNull
    @Deprecated
    public static ItemMyCourseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemMyCourseBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_my_course, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemMyCourseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemMyCourseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemMyCourseBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_my_course, null, false, obj);
    }
}
