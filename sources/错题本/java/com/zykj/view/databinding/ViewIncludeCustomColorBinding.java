package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;
import com.zykj.view.widget.customColor.CustomColorLayout;
import com.zykj.view.widget.customColor.LatestColorLayout;

/* loaded from: classes3.dex */
public abstract class ViewIncludeCustomColorBinding extends ViewDataBinding {

    @NonNull
    public final CustomColorLayout customColor;

    @NonNull
    public final LatestColorLayout latestColor;

    @NonNull
    public final TextView tvLatest;

    public ViewIncludeCustomColorBinding(Object obj, View view, int i, CustomColorLayout customColorLayout, LatestColorLayout latestColorLayout, TextView textView) {
        super(obj, view, i);
        this.customColor = customColorLayout;
        this.latestColor = latestColorLayout;
        this.tvLatest = textView;
    }

    public static ViewIncludeCustomColorBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewIncludeCustomColorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewIncludeCustomColorBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewIncludeCustomColorBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_include_custom_color);
    }

    @NonNull
    @Deprecated
    public static ViewIncludeCustomColorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewIncludeCustomColorBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_custom_color, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewIncludeCustomColorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewIncludeCustomColorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewIncludeCustomColorBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_custom_color, null, false, obj);
    }
}
