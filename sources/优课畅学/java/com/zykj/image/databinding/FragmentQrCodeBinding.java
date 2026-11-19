package com.zykj.image.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import androidx.databinding.ViewDataBinding;
import com.zykj.image.ViewfinderView;

/* loaded from: classes4.dex */
public abstract class FragmentQrCodeBinding extends ViewDataBinding {

    /* renamed from: a */
    public final ImageView f9826a;

    /* renamed from: b */
    public final PreviewView f9827b;

    /* renamed from: c */
    public final View f9828c;

    /* renamed from: d */
    public final ViewfinderView f9829d;

    public FragmentQrCodeBinding(Object obj, View view, int i10, ImageView imageView, PreviewView previewView, View view2, ViewfinderView viewfinderView) {
        super(obj, view, i10);
        this.f9826a = imageView;
        this.f9827b = previewView;
        this.f9828c = view2;
        this.f9829d = viewfinderView;
    }
}
