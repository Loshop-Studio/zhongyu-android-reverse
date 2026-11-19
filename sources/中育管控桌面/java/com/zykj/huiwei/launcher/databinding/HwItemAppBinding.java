package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwItemAppBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivIcon;

    @NonNull
    public final TextView tvName;

    public HwItemAppBinding(Object obj, View view, int i6, AppCompatImageView appCompatImageView, TextView textView) {
        super(obj, view, i6);
        this.ivIcon = appCompatImageView;
        this.tvName = textView;
    }

    public static HwItemAppBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwItemAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static HwItemAppBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwItemAppBinding) ViewDataBinding.bind(obj, view, R.layout.hw_item_app);
    }

    @NonNull
    @Deprecated
    public static HwItemAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwItemAppBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_item_app, viewGroup, z6, obj);
    }

    @NonNull
    public static HwItemAppBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwItemAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwItemAppBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_item_app, null, false, obj);
    }
}
