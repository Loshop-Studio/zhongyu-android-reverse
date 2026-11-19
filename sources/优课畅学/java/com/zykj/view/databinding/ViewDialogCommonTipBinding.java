package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$layout;

/* loaded from: classes5.dex */
public abstract class ViewDialogCommonTipBinding extends ViewDataBinding {

    /* renamed from: a */
    public final Guideline f15319a;

    /* renamed from: b */
    public final TextView f15320b;

    /* renamed from: c */
    public final TextView f15321c;

    /* renamed from: d */
    public final TextView f15322d;

    public ViewDialogCommonTipBinding(Object obj, View view, int i10, Guideline guideline, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f15319a = guideline;
        this.f15320b = textView;
        this.f15321c = textView2;
        this.f15322d = textView3;
    }

    /* renamed from: a */
    public static ViewDialogCommonTipBinding m13258a(LayoutInflater layoutInflater) {
        return m13259b(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: b */
    public static ViewDialogCommonTipBinding m13259b(LayoutInflater layoutInflater, Object obj) {
        return (ViewDialogCommonTipBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_dialog_common_tip, null, false, obj);
    }
}
