package com.zykj.mistake.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.mistake.widget.LineBottomProView;

/* loaded from: classes3.dex */
public abstract class DialogConvertBinding extends ViewDataBinding {

    /* renamed from: a */
    public final LinearLayout f6090a;

    /* renamed from: b */
    public final LineBottomProView f6091b;

    /* renamed from: c */
    public final TextView f6092c;

    /* renamed from: d */
    public final TextView f6093d;

    /* renamed from: e */
    public final TextView f6094e;

    /* renamed from: f */
    public final TextView f6095f;

    /* renamed from: g */
    public final TextView f6096g;

    public DialogConvertBinding(DataBindingComponent dataBindingComponent, View view, LinearLayout linearLayout, LineBottomProView lineBottomProView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super((Object) dataBindingComponent, view, 0);
        this.f6090a = linearLayout;
        this.f6091b = lineBottomProView;
        this.f6092c = textView;
        this.f6093d = textView2;
        this.f6094e = textView3;
        this.f6095f = textView4;
        this.f6096g = textView5;
    }
}
