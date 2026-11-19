package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.view.R$layout;

/* loaded from: classes6.dex */
public abstract class ViewPopupPlaySettingBinding extends ViewDataBinding {

    /* renamed from: c */
    public final RecyclerView f20728c;

    public ViewPopupPlaySettingBinding(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f20728c = recyclerView;
    }

    /* renamed from: a */
    public static ViewPopupPlaySettingBinding m17359a(LayoutInflater layoutInflater) {
        return m17360c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewPopupPlaySettingBinding m17360c(LayoutInflater layoutInflater, Object obj) {
        return (ViewPopupPlaySettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_popup_play_setting, null, false, obj);
    }
}
