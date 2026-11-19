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
    public final Button f12573a;

    /* renamed from: b */
    public final Button f12574b;

    /* renamed from: c */
    public final LimitEditText f12575c;

    /* renamed from: d */
    public final LinearLayout f12576d;

    /* renamed from: e */
    public final ConstraintLayout f12577e;

    /* renamed from: f */
    public final View f12578f;

    public ViewDialogTextEditBinding(Object obj, View view, int i9, Button button, Button button2, LimitEditText limitEditText, LinearLayout linearLayout, ConstraintLayout constraintLayout, View view2) {
        super(obj, view, i9);
        this.f12573a = button;
        this.f12574b = button2;
        this.f12575c = limitEditText;
        this.f12576d = linearLayout;
        this.f12577e = constraintLayout;
        this.f12578f = view2;
    }
}
