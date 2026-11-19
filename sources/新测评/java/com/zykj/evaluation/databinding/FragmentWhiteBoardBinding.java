package com.zykj.evaluation.databinding;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;

/* loaded from: classes4.dex */
public abstract class FragmentWhiteBoardBinding extends ViewDataBinding {

    /* renamed from: a */
    public final RelativeLayout f8757a;

    /* renamed from: b */
    public final FragmentContainerView f8758b;

    /* renamed from: c */
    public final TextView f8759c;

    public FragmentWhiteBoardBinding(Object obj, View view, int i10, RelativeLayout relativeLayout, FragmentContainerView fragmentContainerView, TextView textView) {
        super(obj, view, i10);
        this.f8757a = relativeLayout;
        this.f8758b = fragmentContainerView;
        this.f8759c = textView;
    }
}
