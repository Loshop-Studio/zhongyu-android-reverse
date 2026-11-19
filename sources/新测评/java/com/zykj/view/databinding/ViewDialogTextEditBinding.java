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
    public final Button f11329a;

    /* renamed from: b */
    public final Button f11330b;

    /* renamed from: c */
    public final LimitEditText f11331c;

    /* renamed from: d */
    public final LinearLayout f11332d;

    /* renamed from: e */
    public final ConstraintLayout f11333e;

    /* renamed from: f */
    public final View f11334f;

    public ViewDialogTextEditBinding(Object obj, View view, int i10, Button button, Button button2, LimitEditText limitEditText, LinearLayout linearLayout, ConstraintLayout constraintLayout, View view2) {
        super(obj, view, i10);
        this.f11329a = button;
        this.f11330b = button2;
        this.f11331c = limitEditText;
        this.f11332d = linearLayout;
        this.f11333e = constraintLayout;
        this.f11334f = view2;
    }
}
