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
    public final ImageView f15386a;

    /* renamed from: b */
    public final ImageView f15387b;

    /* renamed from: c */
    public final CheckBox f15388c;

    /* renamed from: d */
    public final View f15389d;

    /* renamed from: e */
    public final View f15390e;

    /* renamed from: f */
    public final PreviewView f15391f;

    /* renamed from: g */
    public final View f15392g;

    /* renamed from: h */
    public final View f15393h;

    public ViewFragmentImagePickBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, CheckBox checkBox, View view2, View view3, PreviewView previewView, View view4, View view5) {
        super(obj, view, i10);
        this.f15386a = imageView;
        this.f15387b = imageView2;
        this.f15388c = checkBox;
        this.f15389d = view2;
        this.f15390e = view3;
        this.f15391f = previewView;
        this.f15392g = view4;
        this.f15393h = view5;
    }

    /* renamed from: a */
    public static ViewFragmentImagePickBinding m13273a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m13274b(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: b */
    public static ViewFragmentImagePickBinding m13274b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ViewFragmentImagePickBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_image_pick, viewGroup, z10, obj);
    }
}
