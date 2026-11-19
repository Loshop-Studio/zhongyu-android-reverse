package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public abstract class DialogueItemEditBinding extends ViewDataBinding {

    /* renamed from: a */
    public final CardView f10495a;

    /* renamed from: b */
    public final Group f10496b;

    /* renamed from: c */
    public final ImageView f10497c;

    /* renamed from: d */
    public final ImageView f10498d;

    /* renamed from: e */
    public final TextView f10499e;

    /* renamed from: f */
    public final View f10500f;

    public DialogueItemEditBinding(Object obj, View view, int i9, CardView cardView, Group group, ImageView imageView, ImageView imageView2, TextView textView, View view2) {
        super(obj, view, i9);
        this.f10495a = cardView;
        this.f10496b = group;
        this.f10497c = imageView;
        this.f10498d = imageView2;
        this.f10499e = textView;
        this.f10500f = view2;
    }

    /* renamed from: a */
    public static DialogueItemEditBinding m9952a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m9953c(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static DialogueItemEditBinding m9953c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (DialogueItemEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialogue_item_edit, viewGroup, z9, obj);
    }
}
