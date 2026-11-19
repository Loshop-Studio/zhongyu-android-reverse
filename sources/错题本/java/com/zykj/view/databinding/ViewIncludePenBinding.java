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
import com.zykj.view.widget.radio.CustomColorRadioButton;

/* loaded from: classes3.dex */
public abstract class ViewIncludePenBinding extends ViewDataBinding {

    @NonNull
    public final CustomColorRadioButton rbCustomColor;

    @NonNull
    public final RadioButton rbPenCursor;

    @NonNull
    public final RadioButton rbPenCustom;

    @NonNull
    public final RadioButton rbPenDottedLine;

    @NonNull
    public final RadioButton rbPenHighlighter;

    @NonNull
    public final RadioButton rbPenLine;

    @NonNull
    public final RadioButton rbPenSizeBig;

    @NonNull
    public final RadioButton rbPenSizeLittle;

    @NonNull
    public final RadioButton rbPenSizeMedium;

    @NonNull
    public final RadioGroup rgPenColor;

    @NonNull
    public final RadioGroup rgPenSize;

    @NonNull
    public final RadioGroup rgPenType;

    @NonNull
    public final View viewLine;

    @NonNull
    public final View viewLine2;

    public ViewIncludePenBinding(Object obj, View view, int i, CustomColorRadioButton customColorRadioButton, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5, RadioButton radioButton6, RadioButton radioButton7, RadioButton radioButton8, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, View view2, View view3) {
        super(obj, view, i);
        this.rbCustomColor = customColorRadioButton;
        this.rbPenCursor = radioButton;
        this.rbPenCustom = radioButton2;
        this.rbPenDottedLine = radioButton3;
        this.rbPenHighlighter = radioButton4;
        this.rbPenLine = radioButton5;
        this.rbPenSizeBig = radioButton6;
        this.rbPenSizeLittle = radioButton7;
        this.rbPenSizeMedium = radioButton8;
        this.rgPenColor = radioGroup;
        this.rgPenSize = radioGroup2;
        this.rgPenType = radioGroup3;
        this.viewLine = view2;
        this.viewLine2 = view3;
    }

    public static ViewIncludePenBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewIncludePenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewIncludePenBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewIncludePenBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_include_pen);
    }

    @NonNull
    @Deprecated
    public static ViewIncludePenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewIncludePenBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_pen, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewIncludePenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewIncludePenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewIncludePenBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_pen, null, false, obj);
    }
}
