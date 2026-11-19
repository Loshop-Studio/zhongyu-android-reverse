package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.huiwei.launcher.p035ui.view.MenuItemView;
import com.zykj.huiwei.launcher.p035ui.view.NoPaddingTextView;
import com.zykj.huiwei.launcher.viewmodels.HomeViewModel;
import com.zykj.huiwei.launcher.viewmodels.MainViewModel;
import com.zykj.manage.R;
import com.zykj.policy.p037ui.PolicyCheckView;

/* loaded from: classes4.dex */
public abstract class HwIncludeHomeSidebarBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivAvatar;

    @NonNull
    public final LinearLayout llMenu1;

    @NonNull
    public final LinearLayout llMenu2;

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected MainViewModel mMainViewModel;

    @Bindable
    protected HomeViewModel mVm;

    @NonNull
    public final MenuItemView menuCheckUpdate;

    @NonNull
    public final MenuItemView menuDeviceNo;

    @NonNull
    public final MenuItemView menuExit;

    @NonNull
    public final MenuItemView menuModifyGesture;

    @NonNull
    public final MenuItemView menuModifyPassword;

    @NonNull
    public final MenuItemView menuSchoolNotice;

    @NonNull
    public final MenuItemView menuService;

    @NonNull
    public final MenuItemView menuSystemMsg;

    @NonNull
    public final TextView tvClass;

    @NonNull
    public final NoPaddingTextView tvName;

    @NonNull
    public final PolicyCheckView tvPolicy;

    @NonNull
    public final TextView tvStudyNo;

    public HwIncludeHomeSidebarBinding(Object obj, View view, int i6, AppCompatImageView appCompatImageView, LinearLayout linearLayout, LinearLayout linearLayout2, MenuItemView menuItemView, MenuItemView menuItemView2, MenuItemView menuItemView3, MenuItemView menuItemView4, MenuItemView menuItemView5, MenuItemView menuItemView6, MenuItemView menuItemView7, MenuItemView menuItemView8, TextView textView, NoPaddingTextView noPaddingTextView, PolicyCheckView policyCheckView, TextView textView2) {
        super(obj, view, i6);
        this.ivAvatar = appCompatImageView;
        this.llMenu1 = linearLayout;
        this.llMenu2 = linearLayout2;
        this.menuCheckUpdate = menuItemView;
        this.menuDeviceNo = menuItemView2;
        this.menuExit = menuItemView3;
        this.menuModifyGesture = menuItemView4;
        this.menuModifyPassword = menuItemView5;
        this.menuSchoolNotice = menuItemView6;
        this.menuService = menuItemView7;
        this.menuSystemMsg = menuItemView8;
        this.tvClass = textView;
        this.tvName = noPaddingTextView;
        this.tvPolicy = policyCheckView;
        this.tvStudyNo = textView2;
    }

    public static HwIncludeHomeSidebarBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwIncludeHomeSidebarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getClickListener() {
        return this.mClickListener;
    }

    @Nullable
    public MainViewModel getMainViewModel() {
        return this.mMainViewModel;
    }

    @Nullable
    public HomeViewModel getVm() {
        return this.mVm;
    }

    public abstract void setClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setMainViewModel(@Nullable MainViewModel mainViewModel);

    public abstract void setVm(@Nullable HomeViewModel homeViewModel);

    @Deprecated
    public static HwIncludeHomeSidebarBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwIncludeHomeSidebarBinding) ViewDataBinding.bind(obj, view, R.layout.hw_include_home_sidebar);
    }

    @NonNull
    @Deprecated
    public static HwIncludeHomeSidebarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwIncludeHomeSidebarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_include_home_sidebar, viewGroup, z6, obj);
    }

    @NonNull
    public static HwIncludeHomeSidebarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwIncludeHomeSidebarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwIncludeHomeSidebarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_include_home_sidebar, null, false, obj);
    }
}
