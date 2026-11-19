package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public abstract class DialogueFragmentAnswerTabBinding extends ViewDataBinding {

    /* renamed from: a */
    public final Guideline f10436a;

    /* renamed from: b */
    public final ImageView f10437b;

    /* renamed from: c */
    public final TabLayout f10438c;

    /* renamed from: d */
    public final ViewPager2 f10439d;

    public DialogueFragmentAnswerTabBinding(Object obj, View view, int i9, Guideline guideline, ImageView imageView, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(obj, view, i9);
        this.f10436a = guideline;
        this.f10437b = imageView;
        this.f10438c = tabLayout;
        this.f10439d = viewPager2;
    }

    /* renamed from: a */
    public static DialogueFragmentAnswerTabBinding m9942a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m9943c(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static DialogueFragmentAnswerTabBinding m9943c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (DialogueFragmentAnswerTabBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialogue_fragment_answer_tab, viewGroup, z9, obj);
    }
}
