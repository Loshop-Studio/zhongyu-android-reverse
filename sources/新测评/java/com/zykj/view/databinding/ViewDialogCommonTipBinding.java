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
    public final Guideline f11321a;

    /* renamed from: b */
    public final TextView f11322b;

    /* renamed from: c */
    public final TextView f11323c;

    /* renamed from: d */
    public final TextView f11324d;

    public ViewDialogCommonTipBinding(Object obj, View view, int i10, Guideline guideline, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f11321a = guideline;
        this.f11322b = textView;
        this.f11323c = textView2;
        this.f11324d = textView3;
    }

    /* renamed from: a */
    public static ViewDialogCommonTipBinding m11386a(LayoutInflater layoutInflater) {
        return m11387j(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: j */
    public static ViewDialogCommonTipBinding m11387j(LayoutInflater layoutInflater, Object obj) {
        return (ViewDialogCommonTipBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_dialog_common_tip, null, false, obj);
    }
}
