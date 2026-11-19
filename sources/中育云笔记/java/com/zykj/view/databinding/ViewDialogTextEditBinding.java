package com.zykj.view.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.widget.LimitEditText;

/* loaded from: classes6.dex */
public abstract class ViewDialogTextEditBinding extends ViewDataBinding {

    /* renamed from: c */
    public final Button f20538c;

    /* renamed from: d */
    public final Button f20539d;

    /* renamed from: e */
    public final LimitEditText f20540e;

    /* renamed from: f */
    public final LinearLayout f20541f;

    /* renamed from: g */
    public final ConstraintLayout f20542g;

    /* renamed from: h */
    public final View f20543h;

    public ViewDialogTextEditBinding(Object obj, View view, int i10, Button button, Button button2, LimitEditText limitEditText, LinearLayout linearLayout, ConstraintLayout constraintLayout, View view2) {
        super(obj, view, i10);
        this.f20538c = button;
        this.f20539d = button2;
        this.f20540e = limitEditText;
        this.f20541f = linearLayout;
        this.f20542g = constraintLayout;
        this.f20543h = view2;
    }
}
