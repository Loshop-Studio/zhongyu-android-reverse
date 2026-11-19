package com.friday.document.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class FragmentPreviewTxtBinding extends ViewDataBinding {

    /* renamed from: c */
    public final NestedScrollView f6408c;

    /* renamed from: d */
    public final TextView f6409d;

    public FragmentPreviewTxtBinding(Object obj, View view, int i10, NestedScrollView nestedScrollView, TextView textView) {
        super(obj, view, i10);
        this.f6408c = nestedScrollView;
        this.f6409d = textView;
    }
}
