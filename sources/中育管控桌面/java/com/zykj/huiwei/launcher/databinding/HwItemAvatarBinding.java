package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwItemAvatarBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivAvatar;

    @NonNull
    public final AppCompatImageView ivChecked;

    public HwItemAvatarBinding(Object obj, View view, int i6, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        super(obj, view, i6);
        this.ivAvatar = appCompatImageView;
        this.ivChecked = appCompatImageView2;
    }

    public static HwItemAvatarBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwItemAvatarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static HwItemAvatarBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwItemAvatarBinding) ViewDataBinding.bind(obj, view, R.layout.hw_item_avatar);
    }

    @NonNull
    @Deprecated
    public static HwItemAvatarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwItemAvatarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_item_avatar, viewGroup, z6, obj);
    }

    @NonNull
    public static HwItemAvatarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwItemAvatarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwItemAvatarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_item_avatar, null, false, obj);
    }
}
