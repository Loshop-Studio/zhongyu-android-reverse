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
    public final CustomColorLayout f11449a;

    /* renamed from: b */
    public final LatestColorLayout f11450b;

    /* renamed from: c */
    public final TextView f11451c;

    public ViewIncludeCustomColorBinding(Object obj, View view, int i10, CustomColorLayout customColorLayout, LatestColorLayout latestColorLayout, TextView textView) {
        super(obj, view, i10);
        this.f11449a = customColorLayout;
        this.f11450b = latestColorLayout;
        this.f11451c = textView;
    }

    /* renamed from: a */
    public static ViewIncludeCustomColorBinding m11418a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m11419j(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: j */
    public static ViewIncludeCustomColorBinding m11419j(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (ViewIncludeCustomColorBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_include_custom_color, viewGroup, z9, obj);
    }
}
