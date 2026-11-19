package com.friday.document.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes3.dex */
public abstract class LayoutFileBrowserBinding extends ViewDataBinding {

    /* renamed from: c */
    public final TextView f6532c;

    /* renamed from: d */
    public final AppCompatImageView f6533d;

    /* renamed from: e */
    public final AppCompatImageView f6534e;

    /* renamed from: f */
    public final AppCompatImageView f6535f;

    /* renamed from: g */
    public final AppCompatImageView f6536g;

    /* renamed from: h */
    public final LinearLayoutCompat f6537h;

    /* renamed from: i */
    public final RecyclerView f6538i;

    /* renamed from: j */
    public final SwipeRefreshLayout f6539j;

    /* renamed from: k */
    public final AppCompatTextView f6540k;

    /* renamed from: l */
    public final AppCompatTextView f6541l;

    /* renamed from: m */
    public final AppCompatTextView f6542m;

    /* renamed from: n */
    public final AppCompatTextView f6543n;

    /* renamed from: o */
    public LiveData f6544o;

    /* renamed from: p */
    public LiveData f6545p;

    public LayoutFileBrowserBinding(Object obj, View view, int i10, TextView textView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        super(obj, view, i10);
        this.f6532c = textView;
        this.f6533d = appCompatImageView;
        this.f6534e = appCompatImageView2;
        this.f6535f = appCompatImageView3;
        this.f6536g = appCompatImageView4;
        this.f6537h = linearLayoutCompat;
        this.f6538i = recyclerView;
        this.f6539j = swipeRefreshLayout;
        this.f6540k = appCompatTextView;
        this.f6541l = appCompatTextView2;
        this.f6542m = appCompatTextView3;
        this.f6543n = appCompatTextView4;
    }

    /* renamed from: a */
    public abstract void mo5541a(LiveData liveData);

    /* renamed from: c */
    public abstract void mo5542c(LiveData liveData);
}
