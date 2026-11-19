package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.view.R$layout;

/* loaded from: classes5.dex */
public abstract class ViewPopupPlaySpeedRateBinding extends ViewDataBinding {

    /* renamed from: a */
    public final RecyclerView f11569a;

    public ViewPopupPlaySpeedRateBinding(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f11569a = recyclerView;
    }

    /* renamed from: a */
    public static ViewPopupPlaySpeedRateBinding m11422a(LayoutInflater layoutInflater) {
        return m11423j(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: j */
    public static ViewPopupPlaySpeedRateBinding m11423j(LayoutInflater layoutInflater, Object obj) {
        return (ViewPopupPlaySpeedRateBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_popup_play_speed_rate, null, false, obj);
    }
}
