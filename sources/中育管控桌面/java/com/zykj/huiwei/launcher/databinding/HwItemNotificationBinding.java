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
import com.google.android.material.imageview.ShapeableImageView;
import com.zykj.huiwei.launcher.bean.resp.MessageInfo;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwItemNotificationBinding extends ViewDataBinding {

    @NonNull
    public final ShapeableImageView ivAvatar;

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected MessageInfo mMessageInfo;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvTitle;

    public HwItemNotificationBinding(Object obj, View view, int i6, ShapeableImageView shapeableImageView, TextView textView, TextView textView2) {
        super(obj, view, i6);
        this.ivAvatar = shapeableImageView;
        this.tvContent = textView;
        this.tvTitle = textView2;
    }

    public static HwItemNotificationBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwItemNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getClickListener() {
        return this.mClickListener;
    }

    @Nullable
    public MessageInfo getMessageInfo() {
        return this.mMessageInfo;
    }

    public abstract void setClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setMessageInfo(@Nullable MessageInfo messageInfo);

    @Deprecated
    public static HwItemNotificationBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwItemNotificationBinding) ViewDataBinding.bind(obj, view, R.layout.hw_item_notification);
    }

    @NonNull
    @Deprecated
    public static HwItemNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwItemNotificationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_item_notification, viewGroup, z6, obj);
    }

    @NonNull
    public static HwItemNotificationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwItemNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwItemNotificationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_item_notification, null, false, obj);
    }
}
