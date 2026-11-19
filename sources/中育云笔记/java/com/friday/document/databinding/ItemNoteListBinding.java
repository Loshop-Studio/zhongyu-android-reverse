package com.friday.document.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$layout;

/* loaded from: classes3.dex */
public abstract class ItemNoteListBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ConstraintLayout f6484c;

    /* renamed from: d */
    public final AppCompatImageView f6485d;

    /* renamed from: e */
    public final ImageView f6486e;

    /* renamed from: f */
    public final ImageView f6487f;

    /* renamed from: g */
    public final ImageView f6488g;

    /* renamed from: h */
    public final TextView f6489h;

    /* renamed from: i */
    public final TextView f6490i;

    public ItemNoteListBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f6484c = constraintLayout;
        this.f6485d = appCompatImageView;
        this.f6486e = imageView;
        this.f6487f = imageView2;
        this.f6488g = imageView3;
        this.f6489h = textView;
        this.f6490i = textView2;
    }

    /* renamed from: a */
    public static ItemNoteListBinding m5531a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m5532c(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ItemNoteListBinding m5532c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ItemNoteListBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_note_list, viewGroup, z10, obj);
    }
}
