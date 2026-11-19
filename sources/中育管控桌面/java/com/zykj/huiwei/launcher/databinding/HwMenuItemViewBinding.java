package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwMenuItemViewBinding extends ViewDataBinding {

    @NonNull
    public final Group groupEnter;

    @NonNull
    public final AppCompatImageView ivEnter;

    @NonNull
    public final AppCompatImageView ivIcon;

    @NonNull
    public final Space spacer;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvTitle;

    public HwMenuItemViewBinding(Object obj, View view, int i6, Group group, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, Space space, TextView textView, TextView textView2) {
        super(obj, view, i6);
        this.groupEnter = group;
        this.ivEnter = appCompatImageView;
        this.ivIcon = appCompatImageView2;
        this.spacer = space;
        this.tvContent = textView;
        this.tvTitle = textView2;
    }

    public static HwMenuItemViewBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwMenuItemViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static HwMenuItemViewBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwMenuItemViewBinding) ViewDataBinding.bind(obj, view, R.layout.hw_menu_item_view);
    }

    @NonNull
    @Deprecated
    public static HwMenuItemViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwMenuItemViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_menu_item_view, viewGroup, z6, obj);
    }

    @NonNull
    public static HwMenuItemViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwMenuItemViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwMenuItemViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_menu_item_view, null, false, obj);
    }
}
