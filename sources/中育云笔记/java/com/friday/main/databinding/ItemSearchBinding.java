package com.friday.main.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.friday.main.R$layout;

/* loaded from: classes4.dex */
public abstract class ItemSearchBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ImageView f9193c;

    /* renamed from: d */
    public final ImageView f9194d;

    /* renamed from: e */
    public final LinearLayoutCompat f9195e;

    /* renamed from: f */
    public final TextView f9196f;

    /* renamed from: g */
    public final TextView f9197g;

    public ItemSearchBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, LinearLayoutCompat linearLayoutCompat, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f9193c = imageView;
        this.f9194d = imageView2;
        this.f9195e = linearLayoutCompat;
        this.f9196f = textView;
        this.f9197g = textView2;
    }

    /* renamed from: a */
    public static ItemSearchBinding m6942a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m6943c(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ItemSearchBinding m6943c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ItemSearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_search, viewGroup, z10, obj);
    }
}
