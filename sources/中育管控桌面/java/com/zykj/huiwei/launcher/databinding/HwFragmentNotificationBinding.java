package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwFragmentNotificationBinding extends ViewDataBinding {

    @Bindable
    protected View.OnClickListener mBackClickListener;

    @NonNull
    public final SwipeRefreshLayout refreshLayout;

    @NonNull
    public final RecyclerView rvNotification;

    @NonNull
    public final MultipleStatusView statusView;

    @NonNull
    public final TitleBar titleBar;

    public HwFragmentNotificationBinding(Object obj, View view, int i6, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView, MultipleStatusView multipleStatusView, TitleBar titleBar) {
        super(obj, view, i6);
        this.refreshLayout = swipeRefreshLayout;
        this.rvNotification = recyclerView;
        this.statusView = multipleStatusView;
        this.titleBar = titleBar;
    }

    public static HwFragmentNotificationBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwFragmentNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getBackClickListener() {
        return this.mBackClickListener;
    }

    public abstract void setBackClickListener(@Nullable View.OnClickListener onClickListener);

    @Deprecated
    public static HwFragmentNotificationBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwFragmentNotificationBinding) ViewDataBinding.bind(obj, view, R.layout.hw_fragment_notification);
    }

    @NonNull
    @Deprecated
    public static HwFragmentNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwFragmentNotificationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_fragment_notification, viewGroup, z6, obj);
    }

    @NonNull
    public static HwFragmentNotificationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwFragmentNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwFragmentNotificationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_fragment_notification, null, false, obj);
    }
}
