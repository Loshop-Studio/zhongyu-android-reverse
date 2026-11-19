package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.huiwei.launcher.p035ui.view.NoPaddingTextView;
import com.zykj.huiwei.launcher.viewmodels.HomeViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwIncludeHomeTitleBinding extends ViewDataBinding {

    @NonNull
    public final View clickUserInfo;

    @NonNull
    public final Group groupInfo;

    @NonNull
    public final AppCompatImageView ivAvatar;

    @NonNull
    public final View ivDot;

    @NonNull
    public final AppCompatImageView ivEnvelope;

    @NonNull
    public final AppCompatImageView ivWeather;

    @NonNull
    public final AppCompatImageView ivWeather2;

    @NonNull
    public final AppCompatImageView ivWeather3;

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected HomeViewModel mVm;

    @NonNull
    public final TextView tvClass;

    @NonNull
    public final TextView tvDate;

    @NonNull
    public final TextView tvLocation;

    @NonNull
    public final NoPaddingTextView tvName;

    @NonNull
    public final TextView tvStudyNo;

    @NonNull
    public final TextView tvTemp;

    @NonNull
    public final TextView tvTemp2;

    @NonNull
    public final TextView tvTemp3;

    @NonNull
    public final NoPaddingTextView tvTime;

    @NonNull
    public final TextView tvWeather;

    @NonNull
    public final TextView tvWeek2;

    @NonNull
    public final TextView tvWeek3;

    @NonNull
    public final Group weatherGroup;

    public HwIncludeHomeTitleBinding(Object obj, View view, int i6, View view2, Group group, AppCompatImageView appCompatImageView, View view3, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, TextView textView, TextView textView2, TextView textView3, NoPaddingTextView noPaddingTextView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, NoPaddingTextView noPaddingTextView2, TextView textView8, TextView textView9, TextView textView10, Group group2) {
        super(obj, view, i6);
        this.clickUserInfo = view2;
        this.groupInfo = group;
        this.ivAvatar = appCompatImageView;
        this.ivDot = view3;
        this.ivEnvelope = appCompatImageView2;
        this.ivWeather = appCompatImageView3;
        this.ivWeather2 = appCompatImageView4;
        this.ivWeather3 = appCompatImageView5;
        this.tvClass = textView;
        this.tvDate = textView2;
        this.tvLocation = textView3;
        this.tvName = noPaddingTextView;
        this.tvStudyNo = textView4;
        this.tvTemp = textView5;
        this.tvTemp2 = textView6;
        this.tvTemp3 = textView7;
        this.tvTime = noPaddingTextView2;
        this.tvWeather = textView8;
        this.tvWeek2 = textView9;
        this.tvWeek3 = textView10;
        this.weatherGroup = group2;
    }

    public static HwIncludeHomeTitleBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwIncludeHomeTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getClickListener() {
        return this.mClickListener;
    }

    @Nullable
    public HomeViewModel getVm() {
        return this.mVm;
    }

    public abstract void setClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setVm(@Nullable HomeViewModel homeViewModel);

    @Deprecated
    public static HwIncludeHomeTitleBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwIncludeHomeTitleBinding) ViewDataBinding.bind(obj, view, R.layout.hw_include_home_title);
    }

    @NonNull
    @Deprecated
    public static HwIncludeHomeTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwIncludeHomeTitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_include_home_title, viewGroup, z6, obj);
    }

    @NonNull
    public static HwIncludeHomeTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwIncludeHomeTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwIncludeHomeTitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_include_home_title, null, false, obj);
    }
}
