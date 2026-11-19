package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class DiscoveryFragmentImageBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivPrev;

    public DiscoveryFragmentImageBinding(Object obj, View view, int i6, ImageView imageView) {
        super(obj, view, i6);
        this.ivPrev = imageView;
    }

    public static DiscoveryFragmentImageBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DiscoveryFragmentImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DiscoveryFragmentImageBinding bind(@NonNull View view, @Nullable Object obj) {
        return (DiscoveryFragmentImageBinding) ViewDataBinding.bind(obj, view, R.layout.discovery_fragment_image);
    }

    @NonNull
    @Deprecated
    public static DiscoveryFragmentImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (DiscoveryFragmentImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.discovery_fragment_image, viewGroup, z6, obj);
    }

    @NonNull
    public static DiscoveryFragmentImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DiscoveryFragmentImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DiscoveryFragmentImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.discovery_fragment_image, null, false, obj);
    }
}
