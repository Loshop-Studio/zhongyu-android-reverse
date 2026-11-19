package com.friday.document.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class LayoutEmptyNoShareBinding extends ViewDataBinding {

    /* renamed from: c */
    public final AppCompatImageView f6520c;

    /* renamed from: d */
    public final LinearLayoutCompat f6521d;

    /* renamed from: e */
    public final TextView f6522e;

    public LayoutEmptyNoShareBinding(Object obj, View view, int i10, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, TextView textView) {
        super(obj, view, i10);
        this.f6520c = appCompatImageView;
        this.f6521d = linearLayoutCompat;
        this.f6522e = textView;
    }
}
