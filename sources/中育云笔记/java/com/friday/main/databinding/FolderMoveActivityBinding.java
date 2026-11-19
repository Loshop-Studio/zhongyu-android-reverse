package com.friday.main.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class FolderMoveActivityBinding extends ViewDataBinding {

    /* renamed from: c */
    public final AppCompatImageView f9160c;

    /* renamed from: d */
    public final RecyclerView f9161d;

    /* renamed from: e */
    public final RecyclerView f9162e;

    /* renamed from: f */
    public final Toolbar f9163f;

    /* renamed from: g */
    public final TextView f9164g;

    /* renamed from: h */
    public final TextView f9165h;

    public FolderMoveActivityBinding(Object obj, View view, int i10, AppCompatImageView appCompatImageView, RecyclerView recyclerView, RecyclerView recyclerView2, Toolbar toolbar, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f9160c = appCompatImageView;
        this.f9161d = recyclerView;
        this.f9162e = recyclerView2;
        this.f9163f = toolbar;
        this.f9164g = textView;
        this.f9165h = textView2;
    }
}
