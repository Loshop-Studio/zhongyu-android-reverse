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
    public final RecyclerView f15517a;

    public ViewPopupPlaySettingBinding(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f15517a = recyclerView;
    }

    /* renamed from: a */
    public static ViewPopupPlaySettingBinding m13287a(LayoutInflater layoutInflater) {
        return m13288b(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: b */
    public static ViewPopupPlaySettingBinding m13288b(LayoutInflater layoutInflater, Object obj) {
        return (ViewPopupPlaySettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_popup_play_setting, null, false, obj);
    }
}
