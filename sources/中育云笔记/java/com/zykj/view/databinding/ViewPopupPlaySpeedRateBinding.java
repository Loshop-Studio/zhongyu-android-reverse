package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.view.R$layout;

/* loaded from: classes6.dex */
public abstract class ViewPopupPlaySpeedRateBinding extends ViewDataBinding {

    /* renamed from: c */
    public final RecyclerView f20733c;

    public ViewPopupPlaySpeedRateBinding(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f20733c = recyclerView;
    }

    /* renamed from: a */
    public static ViewPopupPlaySpeedRateBinding m17361a(LayoutInflater layoutInflater) {
        return m17362c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewPopupPlaySpeedRateBinding m17362c(LayoutInflater layoutInflater, Object obj) {
        return (ViewPopupPlaySpeedRateBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_popup_play_speed_rate, null, false, obj);
    }
}
