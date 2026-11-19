package com.friday.document.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.friday.common.widget.ScaleImageView;
import com.friday.document.R$layout;

/* loaded from: classes3.dex */
public abstract class ItemNoteThumbnailBinding extends ViewDataBinding {

    /* renamed from: c */
    public final FrameLayout f6494c;

    /* renamed from: d */
    public final ScaleImageView f6495d;

    public ItemNoteThumbnailBinding(Object obj, View view, int i10, FrameLayout frameLayout, ScaleImageView scaleImageView) {
        super(obj, view, i10);
        this.f6494c = frameLayout;
        this.f6495d = scaleImageView;
    }

    /* renamed from: a */
    public static ItemNoteThumbnailBinding m5533a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m5534c(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ItemNoteThumbnailBinding m5534c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ItemNoteThumbnailBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_note_thumbnail, viewGroup, z10, obj);
    }
}
