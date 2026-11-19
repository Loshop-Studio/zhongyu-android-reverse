package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$layout;

/* loaded from: classes6.dex */
public abstract class ViewFragmentImagePickBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ImageView f20597c;

    /* renamed from: d */
    public final ImageView f20598d;

    /* renamed from: e */
    public final CheckBox f20599e;

    /* renamed from: f */
    public final View f20600f;

    /* renamed from: g */
    public final View f20601g;

    /* renamed from: h */
    public final PreviewView f20602h;

    /* renamed from: i */
    public final View f20603i;

    /* renamed from: j */
    public final View f20604j;

    public ViewFragmentImagePickBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, CheckBox checkBox, View view2, View view3, PreviewView previewView, View view4, View view5) {
        super(obj, view, i10);
        this.f20597c = imageView;
        this.f20598d = imageView2;
        this.f20599e = checkBox;
        this.f20600f = view2;
        this.f20601g = view3;
        this.f20602h = previewView;
        this.f20603i = view4;
        this.f20604j = view5;
    }

    /* renamed from: a */
    public static ViewFragmentImagePickBinding m17345a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m17346c(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewFragmentImagePickBinding m17346c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ViewFragmentImagePickBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_image_pick, viewGroup, z10, obj);
    }
}
