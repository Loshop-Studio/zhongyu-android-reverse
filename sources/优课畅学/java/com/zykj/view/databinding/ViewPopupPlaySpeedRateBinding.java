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
    public final RecyclerView f15522a;

    public ViewPopupPlaySpeedRateBinding(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f15522a = recyclerView;
    }

    /* renamed from: a */
    public static ViewPopupPlaySpeedRateBinding m13289a(LayoutInflater layoutInflater) {
        return m13290b(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: b */
    public static ViewPopupPlaySpeedRateBinding m13290b(LayoutInflater layoutInflater, Object obj) {
        return (ViewPopupPlaySpeedRateBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_popup_play_speed_rate, null, false, obj);
    }
}
