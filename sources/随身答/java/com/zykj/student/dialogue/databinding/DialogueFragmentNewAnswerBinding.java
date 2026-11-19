package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public abstract class DialogueFragmentNewAnswerBinding extends ViewDataBinding {

    /* renamed from: a */
    public final FrameLayout f10466a;

    public DialogueFragmentNewAnswerBinding(Object obj, View view, int i9, FrameLayout frameLayout) {
        super(obj, view, i9);
        this.f10466a = frameLayout;
    }

    /* renamed from: a */
    public static DialogueFragmentNewAnswerBinding m9946a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m9947c(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static DialogueFragmentNewAnswerBinding m9947c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (DialogueFragmentNewAnswerBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialogue_fragment_new_answer, viewGroup, z9, obj);
    }
}
