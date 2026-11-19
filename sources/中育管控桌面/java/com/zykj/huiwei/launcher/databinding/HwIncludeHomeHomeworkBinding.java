package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.huiwei.launcher.viewmodels.HomeViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwIncludeHomeHomeworkBinding extends ViewDataBinding {

    @NonNull
    public final View homeWorkBg;

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected HomeViewModel mVm;

    @NonNull
    public final RecyclerView rvHomeWork;

    @NonNull
    public final TextView tvHomeWorkTitle;

    @NonNull
    public final TextView tvShowAll;

    public HwIncludeHomeHomeworkBinding(Object obj, View view, int i6, View view2, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i6);
        this.homeWorkBg = view2;
        this.rvHomeWork = recyclerView;
        this.tvHomeWorkTitle = textView;
        this.tvShowAll = textView2;
    }

    public static HwIncludeHomeHomeworkBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwIncludeHomeHomeworkBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
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
    public static HwIncludeHomeHomeworkBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwIncludeHomeHomeworkBinding) ViewDataBinding.bind(obj, view, R.layout.hw_include_home_homework);
    }

    @NonNull
    @Deprecated
    public static HwIncludeHomeHomeworkBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwIncludeHomeHomeworkBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_include_home_homework, viewGroup, z6, obj);
    }

    @NonNull
    public static HwIncludeHomeHomeworkBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwIncludeHomeHomeworkBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwIncludeHomeHomeworkBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_include_home_homework, null, false, obj);
    }
}
