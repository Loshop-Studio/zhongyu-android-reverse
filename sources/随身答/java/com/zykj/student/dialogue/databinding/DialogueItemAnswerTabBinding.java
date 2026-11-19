package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public abstract class DialogueItemAnswerTabBinding extends ViewDataBinding {

    /* renamed from: a */
    public final TextView f10487a;

    /* renamed from: b */
    public final TextView f10488b;

    /* renamed from: c */
    public final ConstraintLayout f10489c;

    /* renamed from: d */
    public final TextView f10490d;

    /* renamed from: e */
    public final TextView f10491e;

    public DialogueItemAnswerTabBinding(Object obj, View view, int i9, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, TextView textView4) {
        super(obj, view, i9);
        this.f10487a = textView;
        this.f10488b = textView2;
        this.f10489c = constraintLayout;
        this.f10490d = textView3;
        this.f10491e = textView4;
    }

    /* renamed from: a */
    public static DialogueItemAnswerTabBinding m9950a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m9951c(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static DialogueItemAnswerTabBinding m9951c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (DialogueItemAnswerTabBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialogue_item_answer_tab, viewGroup, z9, obj);
    }
}
