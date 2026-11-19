package com.friday.document.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class ShareSearchActivityBinding extends ViewDataBinding {

    /* renamed from: c */
    public final RecyclerView f6632c;

    /* renamed from: d */
    public final SearchView f6633d;

    /* renamed from: e */
    public final Toolbar f6634e;

    /* renamed from: f */
    public final ImageView f6635f;

    /* renamed from: g */
    public final TextView f6636g;

    public ShareSearchActivityBinding(Object obj, View view, int i10, RecyclerView recyclerView, SearchView searchView, Toolbar toolbar, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.f6632c = recyclerView;
        this.f6633d = searchView;
        this.f6634e = toolbar;
        this.f6635f = imageView;
        this.f6636g = textView;
    }
}
