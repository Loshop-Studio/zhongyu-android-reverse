package com.friday.paint.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class LayoutStudentObjectiveBinding extends ViewDataBinding {

    /* renamed from: c */
    public final RecyclerView f9826c;

    /* renamed from: d */
    public final TextView f9827d;

    /* renamed from: e */
    public final TextView f9828e;

    /* renamed from: f */
    public final TextView f9829f;

    public LayoutStudentObjectiveBinding(Object obj, View view, int i10, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f9826c = recyclerView;
        this.f9827d = textView;
        this.f9828e = textView2;
        this.f9829f = textView3;
    }
}
