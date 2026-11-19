package com.zykj.view.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes6.dex */
public abstract class ViewItemSketchPlayBinding extends ViewDataBinding {

    /* renamed from: c */
    public final Group f20699c;

    /* renamed from: d */
    public final ImageView f20700d;

    /* renamed from: e */
    public final ImageView f20701e;

    /* renamed from: f */
    public final SeekBar f20702f;

    /* renamed from: g */
    public final TextView f20703g;

    /* renamed from: h */
    public final TextView f20704h;

    /* renamed from: i */
    public final View f20705i;

    public ViewItemSketchPlayBinding(Object obj, View view, int i10, Group group, ImageView imageView, ImageView imageView2, SeekBar seekBar, TextView textView, TextView textView2, View view2) {
        super(obj, view, i10);
        this.f20699c = group;
        this.f20700d = imageView;
        this.f20701e = imageView2;
        this.f20702f = seekBar;
        this.f20703g = textView;
        this.f20704h = textView2;
        this.f20705i = view2;
    }
}
