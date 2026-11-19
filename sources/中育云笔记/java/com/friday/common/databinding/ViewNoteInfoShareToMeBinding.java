package com.friday.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.friday.common.R$layout;

/* loaded from: classes3.dex */
public abstract class ViewNoteInfoShareToMeBinding extends ViewDataBinding {

    /* renamed from: c */
    public final TextView f6020c;

    /* renamed from: d */
    public final TextView f6021d;

    public ViewNoteInfoShareToMeBinding(Object obj, View view, int i10, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f6020c = textView;
        this.f6021d = textView2;
    }

    /* renamed from: a */
    public static ViewNoteInfoShareToMeBinding m5240a(LayoutInflater layoutInflater) {
        return m5241c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ViewNoteInfoShareToMeBinding m5241c(LayoutInflater layoutInflater, Object obj) {
        return (ViewNoteInfoShareToMeBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.view_note_info_share_to_me, null, false, obj);
    }
}
