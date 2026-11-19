package com.friday.common.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.widget.LimitEditText;

/* loaded from: classes3.dex */
public abstract class DialogWithEditTextBinding extends ViewDataBinding {

    /* renamed from: c */
    public final LinearLayout f5977c;

    /* renamed from: d */
    public final TextView f5978d;

    /* renamed from: e */
    public final TextView f5979e;

    /* renamed from: f */
    public final LimitEditText f5980f;

    /* renamed from: g */
    public final TextView f5981g;

    /* renamed from: h */
    public final TextView f5982h;

    public DialogWithEditTextBinding(Object obj, View view, int i10, LinearLayout linearLayout, TextView textView, TextView textView2, LimitEditText limitEditText, TextView textView3, TextView textView4) {
        super(obj, view, i10);
        this.f5977c = linearLayout;
        this.f5978d = textView;
        this.f5979e = textView2;
        this.f5980f = limitEditText;
        this.f5981g = textView3;
        this.f5982h = textView4;
    }
}
