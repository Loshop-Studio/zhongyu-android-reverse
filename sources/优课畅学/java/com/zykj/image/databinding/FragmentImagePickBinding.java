package com.zykj.image.databinding;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes4.dex */
public abstract class FragmentImagePickBinding extends ViewDataBinding {

    /* renamed from: a */
    public final ImageView f9818a;

    /* renamed from: b */
    public final ImageView f9819b;

    /* renamed from: c */
    public final CheckBox f9820c;

    /* renamed from: d */
    public final PreviewView f9821d;

    public FragmentImagePickBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, CheckBox checkBox, PreviewView previewView) {
        super(obj, view, i10);
        this.f9818a = imageView;
        this.f9819b = imageView2;
        this.f9820c = checkBox;
        this.f9821d = previewView;
    }
}
