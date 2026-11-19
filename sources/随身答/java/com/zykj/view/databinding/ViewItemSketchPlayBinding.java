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
    public final Group f12779a;

    /* renamed from: b */
    public final ImageView f12780b;

    /* renamed from: c */
    public final ImageView f12781c;

    /* renamed from: d */
    public final SeekBar f12782d;

    /* renamed from: e */
    public final TextView f12783e;

    /* renamed from: f */
    public final TextView f12784f;

    /* renamed from: g */
    public final View f12785g;

    public ViewItemSketchPlayBinding(Object obj, View view, int i9, Group group, ImageView imageView, ImageView imageView2, SeekBar seekBar, TextView textView, TextView textView2, View view2) {
        super(obj, view, i9);
        this.f12779a = group;
        this.f12780b = imageView;
        this.f12781c = imageView2;
        this.f12782d = seekBar;
        this.f12783e = textView;
        this.f12784f = textView2;
        this.f12785g = view2;
    }
}
