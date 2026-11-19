package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.view.C5280R;

/* loaded from: classes3.dex */
public abstract class ViewPopupPlaySettingBinding extends ViewDataBinding {

    @NonNull
    public final RecyclerView recyclerView;

    public ViewPopupPlaySettingBinding(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.recyclerView = recyclerView;
    }

    public static ViewPopupPlaySettingBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewPopupPlaySettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewPopupPlaySettingBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewPopupPlaySettingBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_popup_play_setting);
    }

    @NonNull
    @Deprecated
    public static ViewPopupPlaySettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewPopupPlaySettingBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_popup_play_setting, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewPopupPlaySettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewPopupPlaySettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewPopupPlaySettingBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_popup_play_setting, null, false, obj);
    }
}
