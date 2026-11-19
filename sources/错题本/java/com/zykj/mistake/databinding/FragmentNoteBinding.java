package com.zykj.mistake.databinding;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class FragmentNoteBinding extends ViewDataBinding {

    /* renamed from: a */
    public final AppCompatImageView f6141a;

    /* renamed from: b */
    public final RecyclerView f6142b;

    public FragmentNoteBinding(DataBindingComponent dataBindingComponent, View view, AppCompatImageView appCompatImageView, RecyclerView recyclerView) {
        super((Object) dataBindingComponent, view, 0);
        this.f6141a = appCompatImageView;
        this.f6142b = recyclerView;
    }
}
