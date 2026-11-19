package com.friday.document.databinding;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;

/* loaded from: classes3.dex */
public abstract class SharePreviewFragmentBinding extends ViewDataBinding {

    /* renamed from: c */
    public final FragmentContainerView f6626c;

    /* renamed from: d */
    public final IncludePreviewTitleBinding f6627d;

    public SharePreviewFragmentBinding(Object obj, View view, int i10, FragmentContainerView fragmentContainerView, IncludePreviewTitleBinding includePreviewTitleBinding) {
        super(obj, view, i10);
        this.f6626c = fragmentContainerView;
        this.f6627d = includePreviewTitleBinding;
    }
}
