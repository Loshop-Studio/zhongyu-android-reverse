package com.zykj.student.dialogue.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public abstract class DialogueFragmentCategoryListBinding extends ViewDataBinding {

    /* renamed from: a */
    public final TextView f10444a;

    /* renamed from: b */
    public final ImageView f10445b;

    /* renamed from: c */
    public final RecyclerView f10446c;

    /* renamed from: d */
    public final TextView f10447d;

    public DialogueFragmentCategoryListBinding(Object obj, View view, int i9, TextView textView, ImageView imageView, RecyclerView recyclerView, TextView textView2) {
        super(obj, view, i9);
        this.f10444a = textView;
        this.f10445b = imageView;
        this.f10446c = recyclerView;
        this.f10447d = textView2;
    }
}
