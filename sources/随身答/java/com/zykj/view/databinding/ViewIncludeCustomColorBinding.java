package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$layout;
import com.zykj.view.widget.customColor.CustomColorLayout;
import com.zykj.view.widget.customColor.LatestColorLayout;

/* loaded from: classes5.dex */
public abstract class ViewIncludeCustomColorBinding extends ViewDataBinding {

    /* renamed from: a */
    public final CustomColorLayout f12693a;

    /* renamed from: b */
    public final LatestColorLayout f12694b;

    /* renamed from: c */
    public final TextView f12695c;

    public ViewIncludeCustomColorBinding(Object obj, View view, int i9, CustomColorLayout customColorLayout, LatestColorLayout latestColorLayout, TextView textView) {
        super(obj, view, i9);
        this.f12693a = customColorLayout;
        this.f12694b = latestColorLayout;
        this.f12695c = textView;
    }

    /* renamed from: a */
    public static ViewIncludeCustomColorBinding m11908a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m11909c(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewIncludeCustomColorBinding m11909c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (ViewIncludeCustomColorBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_include_custom_color, viewGroup, z9, obj);
    }
}
