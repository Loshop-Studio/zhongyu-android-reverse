package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class ItemStuNameBinding extends ViewDataBinding {

    @NonNull
    public final TextView tvName;

    public ItemStuNameBinding(Object obj, View view, int i10, TextView textView) {
        super(obj, view, i10);
        this.tvName = textView;
    }

    public static ItemStuNameBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemStuNameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemStuNameBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemStuNameBinding) ViewDataBinding.bind(obj, view, R$layout.item_stu_name);
    }

    @NonNull
    @Deprecated
    public static ItemStuNameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemStuNameBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_stu_name, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemStuNameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemStuNameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemStuNameBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_stu_name, null, false, obj);
    }
}
