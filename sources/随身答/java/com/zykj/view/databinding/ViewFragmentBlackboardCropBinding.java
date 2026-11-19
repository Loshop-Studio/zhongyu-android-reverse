package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$layout;
import com.zykj.view.widget.DoubleSeekBar;

/* loaded from: classes5.dex */
public abstract class ViewFragmentBlackboardCropBinding extends ViewDataBinding {

    /* renamed from: a */
    public final ImageView f12582a;

    /* renamed from: b */
    public final ImageView f12583b;

    /* renamed from: c */
    public final DoubleSeekBar f12584c;

    /* renamed from: d */
    public final RelativeLayout f12585d;

    /* renamed from: e */
    public final TextView f12586e;

    /* renamed from: f */
    public final TextView f12587f;

    public ViewFragmentBlackboardCropBinding(Object obj, View view, int i9, ImageView imageView, ImageView imageView2, DoubleSeekBar doubleSeekBar, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(obj, view, i9);
        this.f12582a = imageView;
        this.f12583b = imageView2;
        this.f12584c = doubleSeekBar;
        this.f12585d = relativeLayout;
        this.f12586e = textView;
        this.f12587f = textView2;
    }

    /* renamed from: a */
    public static ViewFragmentBlackboardCropBinding m11878a(LayoutInflater layoutInflater) {
        return m11879c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewFragmentBlackboardCropBinding m11879c(LayoutInflater layoutInflater, Object obj) {
        return (ViewFragmentBlackboardCropBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_blackboard_crop, null, false, obj);
    }
}
