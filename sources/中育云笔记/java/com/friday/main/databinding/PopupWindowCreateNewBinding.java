package com.friday.main.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.friday.common.widget.FridayDrawableTextView;
import com.friday.main.R$layout;

/* loaded from: classes4.dex */
public abstract class PopupWindowCreateNewBinding extends ViewDataBinding {

    /* renamed from: c */
    public final FridayDrawableTextView f9210c;

    /* renamed from: d */
    public final FridayDrawableTextView f9211d;

    public PopupWindowCreateNewBinding(Object obj, View view, int i10, FridayDrawableTextView fridayDrawableTextView, FridayDrawableTextView fridayDrawableTextView2) {
        super(obj, view, i10);
        this.f9210c = fridayDrawableTextView;
        this.f9211d = fridayDrawableTextView2;
    }

    /* renamed from: a */
    public static PopupWindowCreateNewBinding m6944a(LayoutInflater layoutInflater) {
        return m6945c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static PopupWindowCreateNewBinding m6945c(LayoutInflater layoutInflater, Object obj) {
        return (PopupWindowCreateNewBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.popup_window_create_new, null, false, obj);
    }
}
