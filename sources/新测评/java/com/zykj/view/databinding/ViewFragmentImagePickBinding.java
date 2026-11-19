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
    public final ImageView f11397a;

    /* renamed from: b */
    public final ImageView f11398b;

    /* renamed from: c */
    public final CheckBox f11399c;

    /* renamed from: d */
    public final View f11400d;

    /* renamed from: e */
    public final View f11401e;

    /* renamed from: f */
    public final PreviewView f11402f;

    /* renamed from: g */
    public final View f11403g;

    /* renamed from: h */
    public final View f11404h;

    public ViewFragmentImagePickBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, CheckBox checkBox, View view2, View view3, PreviewView previewView, View view4, View view5) {
        super(obj, view, i10);
        this.f11397a = imageView;
        this.f11398b = imageView2;
        this.f11399c = checkBox;
        this.f11400d = view2;
        this.f11401e = view3;
        this.f11402f = previewView;
        this.f11403g = view4;
        this.f11404h = view5;
    }

    /* renamed from: a */
    public static ViewFragmentImagePickBinding m11404a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m11405j(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: j */
    public static ViewFragmentImagePickBinding m11405j(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (ViewFragmentImagePickBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_image_pick, viewGroup, z9, obj);
    }
}
