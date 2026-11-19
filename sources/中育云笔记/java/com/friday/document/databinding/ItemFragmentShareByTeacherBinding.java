package com.friday.document.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$layout;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes3.dex */
public abstract class ItemFragmentShareByTeacherBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ShapeableImageView f6468c;

    /* renamed from: d */
    public final LinearLayout f6469d;

    /* renamed from: e */
    public final TextView f6470e;

    /* renamed from: f */
    public final TextView f6471f;

    public ItemFragmentShareByTeacherBinding(Object obj, View view, int i10, ShapeableImageView shapeableImageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f6468c = shapeableImageView;
        this.f6469d = linearLayout;
        this.f6470e = textView;
        this.f6471f = textView2;
    }

    /* renamed from: a */
    public static ItemFragmentShareByTeacherBinding m5527a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m5528c(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ItemFragmentShareByTeacherBinding m5528c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ItemFragmentShareByTeacherBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_fragment_share_by_teacher, viewGroup, z10, obj);
    }
}
