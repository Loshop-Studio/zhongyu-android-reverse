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
    public final ImageView f11338a;

    /* renamed from: b */
    public final ImageView f11339b;

    /* renamed from: c */
    public final DoubleSeekBar f11340c;

    /* renamed from: d */
    public final RelativeLayout f11341d;

    /* renamed from: e */
    public final TextView f11342e;

    /* renamed from: f */
    public final TextView f11343f;

    public ViewFragmentBlackboardCropBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, DoubleSeekBar doubleSeekBar, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f11338a = imageView;
        this.f11339b = imageView2;
        this.f11340c = doubleSeekBar;
        this.f11341d = relativeLayout;
        this.f11342e = textView;
        this.f11343f = textView2;
    }

    /* renamed from: a */
    public static ViewFragmentBlackboardCropBinding m11388a(LayoutInflater layoutInflater) {
        return m11389j(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: j */
    public static ViewFragmentBlackboardCropBinding m11389j(LayoutInflater layoutInflater, Object obj) {
        return (ViewFragmentBlackboardCropBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_blackboard_crop, null, false, obj);
    }
}
