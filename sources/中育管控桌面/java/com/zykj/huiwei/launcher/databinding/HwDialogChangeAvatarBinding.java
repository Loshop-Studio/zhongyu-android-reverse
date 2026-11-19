package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.huiwei.launcher.viewmodels.ChangeAvatarViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwDialogChangeAvatarBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatImageView ivClose;

    @Bindable
    protected View.OnClickListener mOnClickListener;

    @Bindable
    protected ChangeAvatarViewModel mVm;

    @NonNull
    public final RecyclerView rvAvatar;

    @NonNull
    public final TextView tvModify;

    @NonNull
    public final TextView tvTitle;

    public HwDialogChangeAvatarBinding(Object obj, View view, int i6, AppCompatImageView appCompatImageView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i6);
        this.ivClose = appCompatImageView;
        this.rvAvatar = recyclerView;
        this.tvModify = textView;
        this.tvTitle = textView2;
    }

    public static HwDialogChangeAvatarBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwDialogChangeAvatarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getOnClickListener() {
        return this.mOnClickListener;
    }

    @Nullable
    public ChangeAvatarViewModel getVm() {
        return this.mVm;
    }

    public abstract void setOnClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setVm(@Nullable ChangeAvatarViewModel changeAvatarViewModel);

    @Deprecated
    public static HwDialogChangeAvatarBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwDialogChangeAvatarBinding) ViewDataBinding.bind(obj, view, R.layout.hw_dialog_change_avatar);
    }

    @NonNull
    @Deprecated
    public static HwDialogChangeAvatarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwDialogChangeAvatarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_dialog_change_avatar, viewGroup, z6, obj);
    }

    @NonNull
    public static HwDialogChangeAvatarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwDialogChangeAvatarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwDialogChangeAvatarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_dialog_change_avatar, null, false, obj);
    }
}
