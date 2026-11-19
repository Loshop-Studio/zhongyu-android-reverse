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
    public final Guideline f12565a;

    /* renamed from: b */
    public final TextView f12566b;

    /* renamed from: c */
    public final TextView f12567c;

    /* renamed from: d */
    public final TextView f12568d;

    public ViewDialogCommonTipBinding(Object obj, View view, int i9, Guideline guideline, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i9);
        this.f12565a = guideline;
        this.f12566b = textView;
        this.f12567c = textView2;
        this.f12568d = textView3;
    }

    /* renamed from: a */
    public static ViewDialogCommonTipBinding m11876a(LayoutInflater layoutInflater) {
        return m11877c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewDialogCommonTipBinding m11877c(LayoutInflater layoutInflater, Object obj) {
        return (ViewDialogCommonTipBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_dialog_common_tip, null, false, obj);
    }
}
