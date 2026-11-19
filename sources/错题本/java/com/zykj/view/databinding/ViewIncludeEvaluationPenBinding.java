package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;
import com.zykj.view.widget.radio.NormalColorRadioButton;

/* loaded from: classes3.dex */
public abstract class ViewIncludeEvaluationPenBinding extends ViewDataBinding {

    @NonNull
    public final NormalColorRadioButton rbEvalPenBlack;

    @NonNull
    public final NormalColorRadioButton rbEvalPenBlue;

    @NonNull
    public final NormalColorRadioButton rbEvalPenRed;

    @NonNull
    public final RadioGroup rgPenColor;

    public ViewIncludeEvaluationPenBinding(Object obj, View view, int i, NormalColorRadioButton normalColorRadioButton, NormalColorRadioButton normalColorRadioButton2, NormalColorRadioButton normalColorRadioButton3, RadioGroup radioGroup) {
        super(obj, view, i);
        this.rbEvalPenBlack = normalColorRadioButton;
        this.rbEvalPenBlue = normalColorRadioButton2;
        this.rbEvalPenRed = normalColorRadioButton3;
        this.rgPenColor = radioGroup;
    }

    public static ViewIncludeEvaluationPenBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewIncludeEvaluationPenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewIncludeEvaluationPenBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewIncludeEvaluationPenBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_include_evaluation_pen);
    }

    @NonNull
    @Deprecated
    public static ViewIncludeEvaluationPenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewIncludeEvaluationPenBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_evaluation_pen, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewIncludeEvaluationPenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewIncludeEvaluationPenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewIncludeEvaluationPenBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_evaluation_pen, null, false, obj);
    }
}
