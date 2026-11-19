package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;
import com.zykj.study.view.CustomX5WebView;

/* loaded from: classes3.dex */
public abstract class FragmentMicroCropExtraBinding extends ViewDataBinding {

    @NonNull
    public final RelativeLayout fragmentMicroCropExtra;

    @Bindable
    protected View.OnClickListener mCloseListener;

    @Bindable
    protected View.OnClickListener mEnlargeListener;

    @Bindable
    protected View.OnClickListener mNarrowListener;

    @Bindable
    protected View.OnClickListener mTailoringListener;

    @NonNull
    public final CustomX5WebView webView;

    public FragmentMicroCropExtraBinding(Object obj, View view, int i10, RelativeLayout relativeLayout, CustomX5WebView customX5WebView) {
        super(obj, view, i10);
        this.fragmentMicroCropExtra = relativeLayout;
        this.webView = customX5WebView;
    }

    public static FragmentMicroCropExtraBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentMicroCropExtraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getCloseListener() {
        return this.mCloseListener;
    }

    @Nullable
    public View.OnClickListener getEnlargeListener() {
        return this.mEnlargeListener;
    }

    @Nullable
    public View.OnClickListener getNarrowListener() {
        return this.mNarrowListener;
    }

    @Nullable
    public View.OnClickListener getTailoringListener() {
        return this.mTailoringListener;
    }

    public abstract void setCloseListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setEnlargeListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setNarrowListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setTailoringListener(@Nullable View.OnClickListener onClickListener);

    @Deprecated
    public static FragmentMicroCropExtraBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentMicroCropExtraBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_micro_crop_extra);
    }

    @NonNull
    @Deprecated
    public static FragmentMicroCropExtraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentMicroCropExtraBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_micro_crop_extra, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentMicroCropExtraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentMicroCropExtraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentMicroCropExtraBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_micro_crop_extra, null, false, obj);
    }
}
