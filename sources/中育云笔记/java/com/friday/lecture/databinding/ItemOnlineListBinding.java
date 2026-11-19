package com.friday.lecture.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes4.dex */
public abstract class ItemOnlineListBinding extends ViewDataBinding {

    /* renamed from: c */
    public final CardView f8514c;

    /* renamed from: d */
    public final ImageView f8515d;

    /* renamed from: e */
    public final ImageView f8516e;

    /* renamed from: f */
    public final View f8517f;

    /* renamed from: g */
    public final TextView f8518g;

    public ItemOnlineListBinding(Object obj, View view, int i10, CardView cardView, ImageView imageView, ImageView imageView2, View view2, TextView textView) {
        super(obj, view, i10);
        this.f8514c = cardView;
        this.f8515d = imageView;
        this.f8516e = imageView2;
        this.f8517f = view2;
        this.f8518g = textView;
    }
}
