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
public abstract class ItemStuTabBinding extends ViewDataBinding {

    @NonNull
    public final TextView tvContent;

    public ItemStuTabBinding(Object obj, View view, int i10, TextView textView) {
        super(obj, view, i10);
        this.tvContent = textView;
    }

    public static ItemStuTabBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemStuTabBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemStuTabBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemStuTabBinding) ViewDataBinding.bind(obj, view, R$layout.item_stu_tab);
    }

    @NonNull
    @Deprecated
    public static ItemStuTabBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemStuTabBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_stu_tab, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemStuTabBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemStuTabBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemStuTabBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_stu_tab, null, false, obj);
    }
}
