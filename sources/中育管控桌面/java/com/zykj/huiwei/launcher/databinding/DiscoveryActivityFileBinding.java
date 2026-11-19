package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class DiscoveryActivityFileBinding extends ViewDataBinding {

    @NonNull
    public final FrameLayout fragmentContainer;

    @NonNull
    public final DiscoveryIncludePdfPageBinding pdfPage;

    @NonNull
    public final TitleBar titleBar;

    public DiscoveryActivityFileBinding(Object obj, View view, int i6, FrameLayout frameLayout, DiscoveryIncludePdfPageBinding discoveryIncludePdfPageBinding, TitleBar titleBar) {
        super(obj, view, i6);
        this.fragmentContainer = frameLayout;
        this.pdfPage = discoveryIncludePdfPageBinding;
        this.titleBar = titleBar;
    }

    public static DiscoveryActivityFileBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DiscoveryActivityFileBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DiscoveryActivityFileBinding bind(@NonNull View view, @Nullable Object obj) {
        return (DiscoveryActivityFileBinding) ViewDataBinding.bind(obj, view, R.layout.discovery_activity_file);
    }

    @NonNull
    @Deprecated
    public static DiscoveryActivityFileBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (DiscoveryActivityFileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.discovery_activity_file, viewGroup, z6, obj);
    }

    @NonNull
    public static DiscoveryActivityFileBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DiscoveryActivityFileBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DiscoveryActivityFileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.discovery_activity_file, null, false, obj);
    }
}
