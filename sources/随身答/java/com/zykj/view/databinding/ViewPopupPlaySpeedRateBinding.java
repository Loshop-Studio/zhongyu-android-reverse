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
    public final RecyclerView f12813a;

    public ViewPopupPlaySpeedRateBinding(Object obj, View view, int i9, RecyclerView recyclerView) {
        super(obj, view, i9);
        this.f12813a = recyclerView;
    }

    /* renamed from: a */
    public static ViewPopupPlaySpeedRateBinding m11912a(LayoutInflater layoutInflater) {
        return m11913c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewPopupPlaySpeedRateBinding m11913c(LayoutInflater layoutInflater, Object obj) {
        return (ViewPopupPlaySpeedRateBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_popup_play_speed_rate, null, false, obj);
    }
}
