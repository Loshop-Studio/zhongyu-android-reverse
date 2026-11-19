package com.zykj.view.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes5.dex */
public abstract class ViewItemSketchPlayBinding extends ViewDataBinding {

    /* renamed from: a */
    public final Group f11535a;

    /* renamed from: b */
    public final ImageView f11536b;

    /* renamed from: c */
    public final ImageView f11537c;

    /* renamed from: d */
    public final SeekBar f11538d;

    /* renamed from: e */
    public final TextView f11539e;

    /* renamed from: f */
    public final TextView f11540f;

    /* renamed from: g */
    public final View f11541g;

    public ViewItemSketchPlayBinding(Object obj, View view, int i10, Group group, ImageView imageView, ImageView imageView2, SeekBar seekBar, TextView textView, TextView textView2, View view2) {
        super(obj, view, i10);
        this.f11535a = group;
        this.f11536b = imageView;
        this.f11537c = imageView2;
        this.f11538d = seekBar;
        this.f11539e = textView;
        this.f11540f = textView2;
        this.f11541g = view2;
    }
}
