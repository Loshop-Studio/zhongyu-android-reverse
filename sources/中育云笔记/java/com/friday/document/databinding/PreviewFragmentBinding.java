package com.friday.document.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class PreviewFragmentBinding extends ViewDataBinding {

    /* renamed from: c */
    public final LayoutEmptyPreviewBinding f6612c;

    /* renamed from: d */
    public final LayoutNotePreviewBinding f6613d;

    /* renamed from: e */
    public final LayoutNotePreviewOthersBinding f6614e;

    public PreviewFragmentBinding(Object obj, View view, int i10, LayoutEmptyPreviewBinding layoutEmptyPreviewBinding, LayoutNotePreviewBinding layoutNotePreviewBinding, LayoutNotePreviewOthersBinding layoutNotePreviewOthersBinding) {
        super(obj, view, i10);
        this.f6612c = layoutEmptyPreviewBinding;
        this.f6613d = layoutNotePreviewBinding;
        this.f6614e = layoutNotePreviewOthersBinding;
    }
}
