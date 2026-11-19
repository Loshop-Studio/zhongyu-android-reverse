package com.friday.main.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes4.dex */
public abstract class HomeActivityBinding extends ViewDataBinding {

    /* renamed from: c */
    public final CardView f9185c;

    /* renamed from: d */
    public final LayoutTabBinding f9186d;

    /* renamed from: e */
    public final ImageView f9187e;

    /* renamed from: f */
    public final ViewPager2 f9188f;

    public HomeActivityBinding(Object obj, View view, int i10, CardView cardView, LayoutTabBinding layoutTabBinding, ImageView imageView, ViewPager2 viewPager2) {
        super(obj, view, i10);
        this.f9185c = cardView;
        this.f9186d = layoutTabBinding;
        this.f9187e = imageView;
        this.f9188f = viewPager2;
    }
}
