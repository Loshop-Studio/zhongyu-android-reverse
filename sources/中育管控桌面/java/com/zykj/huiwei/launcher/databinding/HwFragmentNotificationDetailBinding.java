package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.huiwei.launcher.viewmodels.NotificationViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwFragmentNotificationDetailBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayoutCompat flWithdrawPlaceholder;

    @Bindable
    protected NotificationViewModel mVm;

    @NonNull
    public final TitleBar titleBar;

    @NonNull
    public final TextView tvCreator;

    @NonNull
    public final TextView tvTime;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final WebView webView;

    public HwFragmentNotificationDetailBinding(Object obj, View view, int i6, LinearLayoutCompat linearLayoutCompat, TitleBar titleBar, TextView textView, TextView textView2, TextView textView3, WebView webView) {
        super(obj, view, i6);
        this.flWithdrawPlaceholder = linearLayoutCompat;
        this.titleBar = titleBar;
        this.tvCreator = textView;
        this.tvTime = textView2;
        this.tvTitle = textView3;
        this.webView = webView;
    }

    public static HwFragmentNotificationDetailBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwFragmentNotificationDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public NotificationViewModel getVm() {
        return this.mVm;
    }

    public abstract void setVm(@Nullable NotificationViewModel notificationViewModel);

    @Deprecated
    public static HwFragmentNotificationDetailBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwFragmentNotificationDetailBinding) ViewDataBinding.bind(obj, view, R.layout.hw_fragment_notification_detail);
    }

    @NonNull
    @Deprecated
    public static HwFragmentNotificationDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwFragmentNotificationDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_fragment_notification_detail, viewGroup, z6, obj);
    }

    @NonNull
    public static HwFragmentNotificationDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwFragmentNotificationDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwFragmentNotificationDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_fragment_notification_detail, null, false, obj);
    }
}
