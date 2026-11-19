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

/* loaded from: classes6.dex */
public abstract class ViewFragmentBlackboardCropBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ImageView f20547c;

    /* renamed from: d */
    public final ImageView f20548d;

    /* renamed from: e */
    public final DoubleSeekBar f20549e;

    /* renamed from: f */
    public final RelativeLayout f20550f;

    /* renamed from: g */
    public final TextView f20551g;

    /* renamed from: h */
    public final TextView f20552h;

    public ViewFragmentBlackboardCropBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, DoubleSeekBar doubleSeekBar, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f20547c = imageView;
        this.f20548d = imageView2;
        this.f20549e = doubleSeekBar;
        this.f20550f = relativeLayout;
        this.f20551g = textView;
        this.f20552h = textView2;
    }

    /* renamed from: a */
    public static ViewFragmentBlackboardCropBinding m17332a(LayoutInflater layoutInflater) {
        return m17333c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewFragmentBlackboardCropBinding m17333c(LayoutInflater layoutInflater, Object obj) {
        return (ViewFragmentBlackboardCropBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_fragment_blackboard_crop, null, false, obj);
    }
}
