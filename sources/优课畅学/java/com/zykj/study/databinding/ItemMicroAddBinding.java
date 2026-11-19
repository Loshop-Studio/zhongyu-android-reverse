package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class ItemMicroAddBinding extends ViewDataBinding {

    @NonNull
    public final ImageView icon;

    @Bindable
    protected View.OnClickListener mAddClick;

    @NonNull
    public final TextView text;

    public ItemMicroAddBinding(Object obj, View view, int i10, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.icon = imageView;
        this.text = textView;
    }

    public static ItemMicroAddBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemMicroAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getAddClick() {
        return this.mAddClick;
    }

    public abstract void setAddClick(@Nullable View.OnClickListener onClickListener);

    @Deprecated
    public static ItemMicroAddBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemMicroAddBinding) ViewDataBinding.bind(obj, view, R$layout.item_micro_add);
    }

    @NonNull
    @Deprecated
    public static ItemMicroAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemMicroAddBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_micro_add, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemMicroAddBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemMicroAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemMicroAddBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_micro_add, null, false, obj);
    }
}
