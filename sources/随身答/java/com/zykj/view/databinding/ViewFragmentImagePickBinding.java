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

/* loaded from: classes5.dex */
public abstract class ViewFragmentImagePickBinding extends ViewDataBinding {

    /* renamed from: a */
    public final ImageView f12641a;

    /* renamed from: b */
    public final ImageView f12642b;

    /* renamed from: c */
    public final CheckBox f12643c;

    /* renamed from: d */
    public final View f12644d;

    /* renamed from: e */
    public final View f12645e;

    /* renamed from: f */
    public final PreviewView f12646f;

    /* renamed from: g */
    public final View f12647g;

    /* renamed from: h */
    public final View f12648h;

    public ViewFragmentImagePickBinding(Object obj, View view, int i9, ImageView imageView, ImageView imageView2, CheckBox checkBox, View view2, View view3, PreviewView previewView, View view4, View view5) {
        super(obj, view, i9);
        this.f12641a = imageView;
        this.f12642b = imageView2;
        this.f12643c = checkBox;
        this.f12644d = view2;
        this.f12645e = view3;
        this.f12646f = previewView;
        this.f12647g = view4;
        this.f12648h = view5;
    }

    /* renamed from: a */
    public static ViewFragmentImagePickBinding m11894a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m11895c(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewFragmentImagePickBinding m11895c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (ViewFragmentImagePickBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_image_pick, viewGroup, z9, obj);
    }
}
