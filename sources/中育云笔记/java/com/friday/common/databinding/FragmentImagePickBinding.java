package com.friday.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.friday.common.R$layout;
import com.friday.common.camera.ZoomControlView;

/* loaded from: classes3.dex */
public abstract class FragmentImagePickBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ImageView f5995c;

    /* renamed from: d */
    public final ImageView f5996d;

    /* renamed from: e */
    public final CheckBox f5997e;

    /* renamed from: f */
    public final CardView f5998f;

    /* renamed from: g */
    public final ZoomControlView f5999g;

    /* renamed from: h */
    public final View f6000h;

    /* renamed from: i */
    public final View f6001i;

    /* renamed from: j */
    public final PreviewView f6002j;

    /* renamed from: k */
    public final TextView f6003k;

    /* renamed from: l */
    public final View f6004l;

    /* renamed from: m */
    public final View f6005m;

    public FragmentImagePickBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, CheckBox checkBox, CardView cardView, ZoomControlView zoomControlView, View view2, View view3, PreviewView previewView, TextView textView, View view4, View view5) {
        super(obj, view, i10);
        this.f5995c = imageView;
        this.f5996d = imageView2;
        this.f5997e = checkBox;
        this.f5998f = cardView;
        this.f5999g = zoomControlView;
        this.f6000h = view2;
        this.f6001i = view3;
        this.f6002j = previewView;
        this.f6003k = textView;
        this.f6004l = view4;
        this.f6005m = view5;
    }

    /* renamed from: a */
    public static FragmentImagePickBinding m5236a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m5237c(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static FragmentImagePickBinding m5237c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (FragmentImagePickBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_image_pick, viewGroup, z10, obj);
    }
}
