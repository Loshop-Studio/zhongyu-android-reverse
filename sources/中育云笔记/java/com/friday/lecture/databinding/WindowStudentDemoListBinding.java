package com.friday.lecture.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.lecture.R$layout;

/* loaded from: classes4.dex */
public abstract class WindowStudentDemoListBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ConstraintLayout f8641c;

    /* renamed from: d */
    public final ConstraintLayout f8642d;

    /* renamed from: e */
    public final CardView f8643e;

    /* renamed from: f */
    public final ImageView f8644f;

    /* renamed from: g */
    public final LayoutRandomBinding f8645g;

    /* renamed from: h */
    public final RecyclerView f8646h;

    /* renamed from: i */
    public final RecyclerView f8647i;

    /* renamed from: j */
    public final TextView f8648j;

    /* renamed from: k */
    public final TextView f8649k;

    /* renamed from: l */
    public final TextView f8650l;

    /* renamed from: m */
    public final TextView f8651m;

    /* renamed from: n */
    public final TextView f8652n;

    /* renamed from: o */
    public final TextView f8653o;

    public WindowStudentDemoListBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, CardView cardView, ImageView imageView, LayoutRandomBinding layoutRandomBinding, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i10);
        this.f8641c = constraintLayout;
        this.f8642d = constraintLayout2;
        this.f8643e = cardView;
        this.f8644f = imageView;
        this.f8645g = layoutRandomBinding;
        this.f8646h = recyclerView;
        this.f8647i = recyclerView2;
        this.f8648j = textView;
        this.f8649k = textView2;
        this.f8650l = textView3;
        this.f8651m = textView4;
        this.f8652n = textView5;
        this.f8653o = textView6;
    }

    /* renamed from: a */
    public static WindowStudentDemoListBinding m6502a(View view) {
        return m6503c(view, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static WindowStudentDemoListBinding m6503c(View view, Object obj) {
        return (WindowStudentDemoListBinding) ViewDataBinding.bind(obj, view, R$layout.window_student_demo_list);
    }
}
