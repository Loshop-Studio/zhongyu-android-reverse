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
import com.zykj.view.widget.radio.WithSelectedRadioButton;

/* loaded from: classes3.dex */
public abstract class ViewIncludeBackgroundColorBinding extends ViewDataBinding {

    @NonNull
    public final NormalColorRadioButton rbBackgroundBlack;

    @NonNull
    public final NormalColorRadioButton rbBackgroundBlue;

    @NonNull
    public final NormalColorRadioButton rbBackgroundGreen;

    @NonNull
    public final WithSelectedRadioButton rbBackgroundInterweave;

    @NonNull
    public final WithSelectedRadioButton rbBackgroundLine;

    @NonNull
    public final NormalColorRadioButton rbBackgroundWhite;

    @NonNull
    public final RadioGroup rgBackgroundColor;

    public ViewIncludeBackgroundColorBinding(Object obj, View view, int i, NormalColorRadioButton normalColorRadioButton, NormalColorRadioButton normalColorRadioButton2, NormalColorRadioButton normalColorRadioButton3, WithSelectedRadioButton withSelectedRadioButton, WithSelectedRadioButton withSelectedRadioButton2, NormalColorRadioButton normalColorRadioButton4, RadioGroup radioGroup) {
        super(obj, view, i);
        this.rbBackgroundBlack = normalColorRadioButton;
        this.rbBackgroundBlue = normalColorRadioButton2;
        this.rbBackgroundGreen = normalColorRadioButton3;
        this.rbBackgroundInterweave = withSelectedRadioButton;
        this.rbBackgroundLine = withSelectedRadioButton2;
        this.rbBackgroundWhite = normalColorRadioButton4;
        this.rgBackgroundColor = radioGroup;
    }

    public static ViewIncludeBackgroundColorBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewIncludeBackgroundColorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewIncludeBackgroundColorBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewIncludeBackgroundColorBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_include_background_color);
    }

    @NonNull
    @Deprecated
    public static ViewIncludeBackgroundColorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewIncludeBackgroundColorBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_background_color, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewIncludeBackgroundColorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewIncludeBackgroundColorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewIncludeBackgroundColorBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_include_background_color, null, false, obj);
    }
}
