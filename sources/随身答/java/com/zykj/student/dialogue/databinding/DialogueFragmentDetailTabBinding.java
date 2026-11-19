package com.zykj.student.dialogue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public abstract class DialogueFragmentDetailTabBinding extends ViewDataBinding {

    /* renamed from: a */
    public final RecyclerView f10452a;

    /* renamed from: b */
    public final TextView f10453b;

    public DialogueFragmentDetailTabBinding(Object obj, View view, int i9, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i9);
        this.f10452a = recyclerView;
        this.f10453b = textView;
    }

    /* renamed from: a */
    public static DialogueFragmentDetailTabBinding m9944a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9) {
        return m9945c(layoutInflater, viewGroup, z9, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static DialogueFragmentDetailTabBinding m9945c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z9, Object obj) {
        return (DialogueFragmentDetailTabBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialogue_fragment_detail_tab, viewGroup, z9, obj);
    }
}
