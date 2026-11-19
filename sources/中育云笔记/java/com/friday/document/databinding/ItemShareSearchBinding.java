package com.friday.document.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$layout;

/* loaded from: classes3.dex */
public abstract class ItemShareSearchBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ImageView f6512c;

    /* renamed from: d */
    public final ImageView f6513d;

    /* renamed from: e */
    public final LinearLayoutCompat f6514e;

    /* renamed from: f */
    public final TextView f6515f;

    /* renamed from: g */
    public final TextView f6516g;

    public ItemShareSearchBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, LinearLayoutCompat linearLayoutCompat, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f6512c = imageView;
        this.f6513d = imageView2;
        this.f6514e = linearLayoutCompat;
        this.f6515f = textView;
        this.f6516g = textView2;
    }

    /* renamed from: a */
    public static ItemShareSearchBinding m5539a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m5540c(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ItemShareSearchBinding m5540c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ItemShareSearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_share_search, viewGroup, z10, obj);
    }
}
