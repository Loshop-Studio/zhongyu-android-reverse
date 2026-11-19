package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import com.zykj.huiwei.launcher.p035ui.adapter.HomeworkAdapter;
import com.zykj.huiwei.launcher.viewmodels.HomeViewModel;
import com.zykj.huiwei.launcher.viewmodels.MainViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwFragmentHomeBinding extends ViewDataBinding {

    @NonNull
    public final DrawerLayout drawLayout;

    @NonNull
    public final HwIncludeHomeAppBinding includeApp;

    @NonNull
    public final HwIncludeHomeHomeworkBinding includeHomework;

    @NonNull
    public final HwIncludeHomeSidebarBinding includeSideBar;

    @NonNull
    public final HwIncludeHomeTitleBinding includeTitle;

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected HomeworkAdapter mHomeworkAdapter;

    @Bindable
    protected MainViewModel mMainViewModel;

    @Bindable
    protected HomeViewModel mVm;

    public HwFragmentHomeBinding(Object obj, View view, int i6, DrawerLayout drawerLayout, HwIncludeHomeAppBinding hwIncludeHomeAppBinding, HwIncludeHomeHomeworkBinding hwIncludeHomeHomeworkBinding, HwIncludeHomeSidebarBinding hwIncludeHomeSidebarBinding, HwIncludeHomeTitleBinding hwIncludeHomeTitleBinding) {
        super(obj, view, i6);
        this.drawLayout = drawerLayout;
        this.includeApp = hwIncludeHomeAppBinding;
        this.includeHomework = hwIncludeHomeHomeworkBinding;
        this.includeSideBar = hwIncludeHomeSidebarBinding;
        this.includeTitle = hwIncludeHomeTitleBinding;
    }

    public static HwFragmentHomeBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwFragmentHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getClickListener() {
        return this.mClickListener;
    }

    @Nullable
    public HomeworkAdapter getHomeworkAdapter() {
        return this.mHomeworkAdapter;
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

    public abstract void setHomeworkAdapter(@Nullable HomeworkAdapter homeworkAdapter);

    public abstract void setMainViewModel(@Nullable MainViewModel mainViewModel);

    public abstract void setVm(@Nullable HomeViewModel homeViewModel);

    @Deprecated
    public static HwFragmentHomeBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwFragmentHomeBinding) ViewDataBinding.bind(obj, view, R.layout.hw_fragment_home);
    }

    @NonNull
    @Deprecated
    public static HwFragmentHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwFragmentHomeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_fragment_home, viewGroup, z6, obj);
    }

    @NonNull
    public static HwFragmentHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwFragmentHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwFragmentHomeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_fragment_home, null, false, obj);
    }
}
