package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.view.R$layout;

/* loaded from: classes5.dex */
public abstract class ViewPopupPlaySettingBinding extends ViewDataBinding {

    /* renamed from: a */
    public final RecyclerView f11564a;

    public ViewPopupPlaySettingBinding(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f11564a = recyclerView;
    }

    /* renamed from: a */
    public static ViewPopupPlaySettingBinding m11420a(LayoutInflater layoutInflater) {
        return m11421j(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: j */
    public static ViewPopupPlaySettingBinding m11421j(LayoutInflater layoutInflater, Object obj) {
        return (ViewPopupPlaySettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_popup_play_setting, null, false, obj);
    }
}
