package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.huiwei.launcher.viewmodels.ModifyPasswordViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwDialogModifyPasswordBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatEditText etNewPass;

    @NonNull
    public final AppCompatEditText etNewPass1;

    @NonNull
    public final AppCompatEditText etOldPass;

    @NonNull
    public final AppCompatImageView ivClose;

    @Bindable
    protected View.OnClickListener mOnClickListener;

    @Bindable
    protected ModifyPasswordViewModel mVm;

    @NonNull
    public final TextView tvModify;

    @NonNull
    public final TextView tvNewPassTips;

    @NonNull
    public final TextView tvNewPassTips1;

    @NonNull
    public final TextView tvNewPassTitle;

    @NonNull
    public final TextView tvNewPassTitle1;

    @NonNull
    public final TextView tvOldPassTitle;

    @NonNull
    public final TextView tvTitle;

    public HwDialogModifyPasswordBinding(Object obj, View view, int i6, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        super(obj, view, i6);
        this.etNewPass = appCompatEditText;
        this.etNewPass1 = appCompatEditText2;
        this.etOldPass = appCompatEditText3;
        this.ivClose = appCompatImageView;
        this.tvModify = textView;
        this.tvNewPassTips = textView2;
        this.tvNewPassTips1 = textView3;
        this.tvNewPassTitle = textView4;
        this.tvNewPassTitle1 = textView5;
        this.tvOldPassTitle = textView6;
        this.tvTitle = textView7;
    }

    public static HwDialogModifyPasswordBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwDialogModifyPasswordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getOnClickListener() {
        return this.mOnClickListener;
    }

    @Nullable
    public ModifyPasswordViewModel getVm() {
        return this.mVm;
    }

    public abstract void setOnClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setVm(@Nullable ModifyPasswordViewModel modifyPasswordViewModel);

    @Deprecated
    public static HwDialogModifyPasswordBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwDialogModifyPasswordBinding) ViewDataBinding.bind(obj, view, R.layout.hw_dialog_modify_password);
    }

    @NonNull
    @Deprecated
    public static HwDialogModifyPasswordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwDialogModifyPasswordBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_dialog_modify_password, viewGroup, z6, obj);
    }

    @NonNull
    public static HwDialogModifyPasswordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwDialogModifyPasswordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwDialogModifyPasswordBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_dialog_modify_password, null, false, obj);
    }
}
