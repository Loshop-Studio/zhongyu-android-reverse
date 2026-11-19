package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class ItemTitleListBinding extends ViewDataBinding {

    @NonNull
    public final TextView tvHead;

    @NonNull
    public final LinearLayout tvLinearlayout;

    public ItemTitleListBinding(Object obj, View view, int i10, TextView textView, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.tvHead = textView;
        this.tvLinearlayout = linearLayout;
    }

    public static ItemTitleListBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemTitleListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTitleListBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemTitleListBinding) ViewDataBinding.bind(obj, view, R$layout.item_title_list);
    }

    @NonNull
    @Deprecated
    public static ItemTitleListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (ItemTitleListBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_title_list, viewGroup, z10, obj);
    }

    @NonNull
    public static ItemTitleListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemTitleListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemTitleListBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_title_list, null, false, obj);
    }
}
