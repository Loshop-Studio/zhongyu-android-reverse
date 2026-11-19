package com.zykj.view.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.widget.LimitEditText;

/* loaded from: classes5.dex */
public abstract class ViewDialogTextEditBinding extends ViewDataBinding {

    /* renamed from: a */
    public final Button f15327a;

    /* renamed from: b */
    public final Button f15328b;

    /* renamed from: c */
    public final LimitEditText f15329c;

    /* renamed from: d */
    public final LinearLayout f15330d;

    /* renamed from: e */
    public final ConstraintLayout f15331e;

    /* renamed from: f */
    public final View f15332f;

    public ViewDialogTextEditBinding(Object obj, View view, int i10, Button button, Button button2, LimitEditText limitEditText, LinearLayout linearLayout, ConstraintLayout constraintLayout, View view2) {
        super(obj, view, i10);
        this.f15327a = button;
        this.f15328b = button2;
        this.f15329c = limitEditText;
        this.f15330d = linearLayout;
        this.f15331e = constraintLayout;
        this.f15332f = view2;
    }
}
