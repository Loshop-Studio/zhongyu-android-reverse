package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public abstract class DialogueFragmentPlayLessonBinding extends ViewDataBinding {

    /* renamed from: a */
    public final FrameLayout f10470a;

    public DialogueFragmentPlayLessonBinding(Object obj, View view, int i9, FrameLayout frameLayout) {
        super(obj, view, i9);
        this.f10470a = frameLayout;
    }

    /* renamed from: a */
    public static DialogueFragmentPlayLessonBinding m9948a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m9949c(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static DialogueFragmentPlayLessonBinding m9949c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (DialogueFragmentPlayLessonBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialogue_fragment_play_lesson, viewGroup, z9, obj);
    }
}
