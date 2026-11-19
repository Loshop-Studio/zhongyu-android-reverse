package com.friday.document.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$layout;

/* loaded from: classes3.dex */
public abstract class ItemRecycleBinBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ConstraintLayout f6504c;

    /* renamed from: d */
    public final ImageView f6505d;

    /* renamed from: e */
    public final ImageView f6506e;

    /* renamed from: f */
    public final TextView f6507f;

    /* renamed from: g */
    public final TextView f6508g;

    public ItemRecycleBinBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f6504c = constraintLayout;
        this.f6505d = imageView;
        this.f6506e = imageView2;
        this.f6507f = textView;
        this.f6508g = textView2;
    }

    /* renamed from: a */
    public static ItemRecycleBinBinding m5537a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m5538c(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ItemRecycleBinBinding m5538c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ItemRecycleBinBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_recycle_bin, viewGroup, z10, obj);
    }
}
