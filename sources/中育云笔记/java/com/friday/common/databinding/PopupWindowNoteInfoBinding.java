package com.friday.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.friday.common.R$layout;

/* loaded from: classes3.dex */
public abstract class PopupWindowNoteInfoBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ImageView f6010c;

    /* renamed from: d */
    public final LinearLayout f6011d;

    /* renamed from: e */
    public final TextView f6012e;

    /* renamed from: f */
    public final TextView f6013f;

    /* renamed from: g */
    public final TextView f6014g;

    /* renamed from: h */
    public final TextView f6015h;

    public PopupWindowNoteInfoBinding(Object obj, View view, int i10, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i10);
        this.f6010c = imageView;
        this.f6011d = linearLayout;
        this.f6012e = textView;
        this.f6013f = textView2;
        this.f6014g = textView3;
        this.f6015h = textView4;
    }

    /* renamed from: a */
    public static PopupWindowNoteInfoBinding m5238a(LayoutInflater layoutInflater) {
        return m5239c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static PopupWindowNoteInfoBinding m5239c(LayoutInflater layoutInflater, Object obj) {
        return (PopupWindowNoteInfoBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.popup_window_note_info, null, false, obj);
    }
}
