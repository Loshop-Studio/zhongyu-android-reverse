package com.zykj.cloudhelper.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public abstract class FragmentPickNoteBinding extends ViewDataBinding {

    /* renamed from: c */
    public final RecyclerView f19465c;

    /* renamed from: d */
    public final TextView f19466d;

    /* renamed from: e */
    public final TextView f19467e;

    public FragmentPickNoteBinding(Object obj, View view, int i10, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f19465c = recyclerView;
        this.f19466d = textView;
        this.f19467e = textView2;
    }
}
