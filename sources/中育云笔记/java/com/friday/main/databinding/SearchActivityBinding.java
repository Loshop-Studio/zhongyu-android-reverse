package com.friday.main.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.main.viewmodel.HomeViewModel;

/* loaded from: classes4.dex */
public abstract class SearchActivityBinding extends ViewDataBinding {

    /* renamed from: c */
    public final RecyclerView f9230c;

    /* renamed from: d */
    public final SearchView f9231d;

    /* renamed from: e */
    public final Toolbar f9232e;

    /* renamed from: f */
    public final ImageView f9233f;

    /* renamed from: g */
    public final TextView f9234g;

    /* renamed from: h */
    public HomeViewModel f9235h;

    public SearchActivityBinding(Object obj, View view, int i10, RecyclerView recyclerView, SearchView searchView, Toolbar toolbar, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.f9230c = recyclerView;
        this.f9231d = searchView;
        this.f9232e = toolbar;
        this.f9233f = imageView;
        this.f9234g = textView;
    }
}
