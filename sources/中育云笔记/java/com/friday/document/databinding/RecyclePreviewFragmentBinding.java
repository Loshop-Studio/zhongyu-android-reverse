package com.friday.document.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class RecyclePreviewFragmentBinding extends ViewDataBinding {

    /* renamed from: c */
    public final LayoutEmptyPreviewBinding f6619c;

    /* renamed from: d */
    public final LayoutNotePreviewOthersBinding f6620d;

    /* renamed from: e */
    public final LayoutShareNotePreviewBinding f6621e;

    public RecyclePreviewFragmentBinding(Object obj, View view, int i10, LayoutEmptyPreviewBinding layoutEmptyPreviewBinding, LayoutNotePreviewOthersBinding layoutNotePreviewOthersBinding, LayoutShareNotePreviewBinding layoutShareNotePreviewBinding) {
        super(obj, view, i10);
        this.f6619c = layoutEmptyPreviewBinding;
        this.f6620d = layoutNotePreviewOthersBinding;
        this.f6621e = layoutShareNotePreviewBinding;
    }
}
