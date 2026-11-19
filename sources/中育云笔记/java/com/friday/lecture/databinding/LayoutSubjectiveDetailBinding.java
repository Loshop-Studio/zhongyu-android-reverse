package com.friday.lecture.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.friday.lecture.floatwindow.canvas.NonSlidableViewPager;

/* loaded from: classes4.dex */
public abstract class LayoutSubjectiveDetailBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ImageView f8573c;

    /* renamed from: d */
    public final ImageView f8574d;

    /* renamed from: e */
    public final TextView f8575e;

    /* renamed from: f */
    public final NonSlidableViewPager f8576f;

    public LayoutSubjectiveDetailBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, TextView textView, NonSlidableViewPager nonSlidableViewPager) {
        super(obj, view, i10);
        this.f8573c = imageView;
        this.f8574d = imageView2;
        this.f8575e = textView;
        this.f8576f = nonSlidableViewPager;
    }
}
