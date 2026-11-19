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
    public final RecyclerView f12808a;

    public ViewPopupPlaySettingBinding(Object obj, View view, int i9, RecyclerView recyclerView) {
        super(obj, view, i9);
        this.f12808a = recyclerView;
    }

    /* renamed from: a */
    public static ViewPopupPlaySettingBinding m11910a(LayoutInflater layoutInflater) {
        return m11911c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewPopupPlaySettingBinding m11911c(LayoutInflater layoutInflater, Object obj) {
        return (ViewPopupPlaySettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_popup_play_setting, null, false, obj);
    }
}
