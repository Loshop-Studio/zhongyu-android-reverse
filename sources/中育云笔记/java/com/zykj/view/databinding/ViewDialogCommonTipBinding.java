package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$layout;

/* loaded from: classes6.dex */
public abstract class ViewDialogCommonTipBinding extends ViewDataBinding {

    /* renamed from: c */
    public final Guideline f20530c;

    /* renamed from: d */
    public final TextView f20531d;

    /* renamed from: e */
    public final TextView f20532e;

    /* renamed from: f */
    public final TextView f20533f;

    public ViewDialogCommonTipBinding(Object obj, View view, int i10, Guideline guideline, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f20530c = guideline;
        this.f20531d = textView;
        this.f20532e = textView2;
        this.f20533f = textView3;
    }

    /* renamed from: a */
    public static ViewDialogCommonTipBinding m17330a(LayoutInflater layoutInflater) {
        return m17331c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewDialogCommonTipBinding m17331c(LayoutInflater layoutInflater, Object obj) {
        return (ViewDialogCommonTipBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_dialog_common_tip, null, false, obj);
    }
}
