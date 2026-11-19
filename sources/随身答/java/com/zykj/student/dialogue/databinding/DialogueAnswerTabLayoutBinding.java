package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public abstract class DialogueAnswerTabLayoutBinding extends ViewDataBinding {

    /* renamed from: a */
    public final AppCompatTextView f10372a;

    public DialogueAnswerTabLayoutBinding(Object obj, View view, int i9, AppCompatTextView appCompatTextView) {
        super(obj, view, i9);
        this.f10372a = appCompatTextView;
    }

    /* renamed from: a */
    public static DialogueAnswerTabLayoutBinding m9932a(LayoutInflater layoutInflater) {
        return m9933c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static DialogueAnswerTabLayoutBinding m9933c(LayoutInflater layoutInflater, Object obj) {
        return (DialogueAnswerTabLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialogue_answer_tab_layout, null, false, obj);
    }
}
