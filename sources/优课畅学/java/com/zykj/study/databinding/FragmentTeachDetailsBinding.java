package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.TeachDetailsViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentTeachDetailsBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout fragmentTeachDetails;

    @NonNull
    public final ImageView imageView16;

    @NonNull
    public final ImageView imageView17;

    @Bindable
    protected TeachDetailsViewModel mViewModel;

    @NonNull
    public final MultipleStatusView multipleStatusView;

    @NonNull
    public final TitleBar toolbar;

    @NonNull
    public final TextView tvCourseProgress;

    @NonNull
    public final ViewPager2 viewPager;

    public FragmentTeachDetailsBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, MultipleStatusView multipleStatusView, TitleBar titleBar, TextView textView, ViewPager2 viewPager2) {
        super(obj, view, i10);
        this.fragmentTeachDetails = constraintLayout;
        this.imageView16 = imageView;
        this.imageView17 = imageView2;
        this.multipleStatusView = multipleStatusView;
        this.toolbar = titleBar;
        this.tvCourseProgress = textView;
        this.viewPager = viewPager2;
    }

    public static FragmentTeachDetailsBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentTeachDetailsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public TeachDetailsViewModel getViewModel() {
        return this.mViewModel;
    }

    public abstract void setViewModel(@Nullable TeachDetailsViewModel teachDetailsViewModel);

    @Deprecated
    public static FragmentTeachDetailsBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentTeachDetailsBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_teach_details);
    }

    @NonNull
    @Deprecated
    public static FragmentTeachDetailsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentTeachDetailsBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_teach_details, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentTeachDetailsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentTeachDetailsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentTeachDetailsBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_teach_details, null, false, obj);
    }
}
