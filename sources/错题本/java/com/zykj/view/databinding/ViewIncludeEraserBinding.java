package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;

/* loaded from: classes3.dex */
public abstract class ViewIncludeEraserBinding extends ViewDataBinding {

    @NonNull
    public final RadioButton rbEraserSizeBig;

    @NonNull
    public final RadioButton rbEraserSizeLittle;

    @NonNull
    public final RadioButton rbEraserSizeMedium;

    @NonNull
    public final RadioGroup rgEraserSize;

    public ViewIncludeEraserBinding(Object obj, View view, int i, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup) {
        super(obj, view, i);
        this.rbEraserSizeBig = radioButton;
        this.rbEraserSizeLittle = radioButton2;
        this.rbEraserSizeMedium = radioButton3;
        this.rgEraserSize = radioGroup;
    }

    public static ViewIncludeEraserBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewIncludeEraserBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewIncludeEraserBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewIncludeEraserBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_include_eraser);
    }

    @NonNull
    @Deprecated
    public static ViewIncludeEraserBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewIncludeEraserBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_eraser, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewIncludeEraserBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewIncludeEraserBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewIncludeEraserBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_eraser, null, false, obj);
    }
}
