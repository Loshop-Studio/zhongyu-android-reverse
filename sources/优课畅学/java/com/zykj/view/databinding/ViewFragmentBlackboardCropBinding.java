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
    public final ImageView f15336a;

    /* renamed from: b */
    public final ImageView f15337b;

    /* renamed from: c */
    public final DoubleSeekBar f15338c;

    /* renamed from: d */
    public final RelativeLayout f15339d;

    /* renamed from: e */
    public final TextView f15340e;

    /* renamed from: f */
    public final TextView f15341f;

    public ViewFragmentBlackboardCropBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, DoubleSeekBar doubleSeekBar, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f15336a = imageView;
        this.f15337b = imageView2;
        this.f15338c = doubleSeekBar;
        this.f15339d = relativeLayout;
        this.f15340e = textView;
        this.f15341f = textView2;
    }

    /* renamed from: a */
    public static ViewFragmentBlackboardCropBinding m13260a(LayoutInflater layoutInflater) {
        return m13261b(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: b */
    public static ViewFragmentBlackboardCropBinding m13261b(LayoutInflater layoutInflater, Object obj) {
        return (ViewFragmentBlackboardCropBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_blackboard_crop, null, false, obj);
    }
}
