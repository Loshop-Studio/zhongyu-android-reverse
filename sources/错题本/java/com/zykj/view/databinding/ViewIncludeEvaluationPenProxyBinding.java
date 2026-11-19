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
public abstract class ViewIncludeEvaluationPenProxyBinding extends ViewDataBinding {

    @NonNull
    public final NormalColorRadioButton rbEvalProxyBlack;

    @NonNull
    public final NormalColorRadioButton rbEvalProxyBlue;

    @NonNull
    public final NormalColorRadioButton rbEvalProxyRed;

    @NonNull
    public final RadioGroup rgPenColorProxy;

    public ViewIncludeEvaluationPenProxyBinding(Object obj, View view, int i, NormalColorRadioButton normalColorRadioButton, NormalColorRadioButton normalColorRadioButton2, NormalColorRadioButton normalColorRadioButton3, RadioGroup radioGroup) {
        super(obj, view, i);
        this.rbEvalProxyBlack = normalColorRadioButton;
        this.rbEvalProxyBlue = normalColorRadioButton2;
        this.rbEvalProxyRed = normalColorRadioButton3;
        this.rgPenColorProxy = radioGroup;
    }

    public static ViewIncludeEvaluationPenProxyBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewIncludeEvaluationPenProxyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewIncludeEvaluationPenProxyBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewIncludeEvaluationPenProxyBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_include_evaluation_pen_proxy);
    }

    @NonNull
    @Deprecated
    public static ViewIncludeEvaluationPenProxyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewIncludeEvaluationPenProxyBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_evaluation_pen_proxy, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewIncludeEvaluationPenProxyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewIncludeEvaluationPenProxyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewIncludeEvaluationPenProxyBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_evaluation_pen_proxy, null, false, obj);
    }
}
