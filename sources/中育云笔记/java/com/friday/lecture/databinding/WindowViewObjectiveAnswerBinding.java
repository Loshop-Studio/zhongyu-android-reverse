package com.friday.lecture.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.friday.lecture.R$layout;

/* loaded from: classes4.dex */
public abstract class WindowViewObjectiveAnswerBinding extends ViewDataBinding {

    /* renamed from: c */
    public final LayoutBeforeStopAnswerBinding f8667c;

    /* renamed from: d */
    public final ImageView f8668d;

    /* renamed from: e */
    public final LayoutConfirmEndClassBinding f8669e;

    /* renamed from: f */
    public final LayoutConfirmTimeUpBinding f8670f;

    /* renamed from: g */
    public final View f8671g;

    public WindowViewObjectiveAnswerBinding(Object obj, View view, int i10, LayoutBeforeStopAnswerBinding layoutBeforeStopAnswerBinding, ImageView imageView, LayoutConfirmEndClassBinding layoutConfirmEndClassBinding, LayoutConfirmTimeUpBinding layoutConfirmTimeUpBinding, View view2) {
        super(obj, view, i10);
        this.f8667c = layoutBeforeStopAnswerBinding;
        this.f8668d = imageView;
        this.f8669e = layoutConfirmEndClassBinding;
        this.f8670f = layoutConfirmTimeUpBinding;
        this.f8671g = view2;
    }

    /* renamed from: a */
    public static WindowViewObjectiveAnswerBinding m6510a(View view) {
        return m6511c(view, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static WindowViewObjectiveAnswerBinding m6511c(View view, Object obj) {
        return (WindowViewObjectiveAnswerBinding) ViewDataBinding.bind(obj, view, R$layout.window_view_objective_answer);
    }
}
