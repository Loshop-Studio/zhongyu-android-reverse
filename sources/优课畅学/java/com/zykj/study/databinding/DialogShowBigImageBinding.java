package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.imageview.photoview.PhotoView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class DialogShowBigImageBinding extends ViewDataBinding {

    @NonNull
    public final PhotoView ivShow;

    public DialogShowBigImageBinding(Object obj, View view, int i10, PhotoView photoView) {
        super(obj, view, i10);
        this.ivShow = photoView;
    }

    public static DialogShowBigImageBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DialogShowBigImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogShowBigImageBinding bind(@NonNull View view, @Nullable Object obj) {
        return (DialogShowBigImageBinding) ViewDataBinding.bind(obj, view, R$layout.dialog_show_big_image);
    }

    @NonNull
    @Deprecated
    public static DialogShowBigImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (DialogShowBigImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.dialog_show_big_image, viewGroup, z10, obj);
    }

    @NonNull
    public static DialogShowBigImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DialogShowBigImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DialogShowBigImageBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.dialog_show_big_image, null, false, obj);
    }
}
