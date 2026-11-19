package com.friday.document.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$layout;

/* loaded from: classes3.dex */
public abstract class PopSortBinding extends ViewDataBinding {

    /* renamed from: c */
    public final RadioButton f6605c;

    /* renamed from: d */
    public final RadioButton f6606d;

    /* renamed from: e */
    public final RadioGroup f6607e;

    public PopSortBinding(Object obj, View view, int i10, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup) {
        super(obj, view, i10);
        this.f6605c = radioButton;
        this.f6606d = radioButton2;
        this.f6607e = radioGroup;
    }

    /* renamed from: a */
    public static PopSortBinding m5549a(LayoutInflater layoutInflater) {
        return m5550c(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static PopSortBinding m5550c(LayoutInflater layoutInflater, Object obj) {
        return (PopSortBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.pop_sort, null, false, obj);
    }
}
