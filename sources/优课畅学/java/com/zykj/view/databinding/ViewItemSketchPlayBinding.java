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
    public final Group f15488a;

    /* renamed from: b */
    public final ImageView f15489b;

    /* renamed from: c */
    public final ImageView f15490c;

    /* renamed from: d */
    public final SeekBar f15491d;

    /* renamed from: e */
    public final TextView f15492e;

    /* renamed from: f */
    public final TextView f15493f;

    /* renamed from: g */
    public final View f15494g;

    public ViewItemSketchPlayBinding(Object obj, View view, int i10, Group group, ImageView imageView, ImageView imageView2, SeekBar seekBar, TextView textView, TextView textView2, View view2) {
        super(obj, view, i10);
        this.f15488a = group;
        this.f15489b = imageView;
        this.f15490c = imageView2;
        this.f15491d = seekBar;
        this.f15492e = textView;
        this.f15493f = textView2;
        this.f15494g = view2;
    }
}
