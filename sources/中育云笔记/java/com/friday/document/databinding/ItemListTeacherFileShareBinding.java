package com.friday.document.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.friday.document.R$layout;

/* loaded from: classes3.dex */
public abstract class ItemListTeacherFileShareBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ConstraintLayout f6476c;

    /* renamed from: d */
    public final ImageView f6477d;

    /* renamed from: e */
    public final TextView f6478e;

    /* renamed from: f */
    public final TextView f6479f;

    /* renamed from: g */
    public final TextView f6480g;

    public ItemListTeacherFileShareBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f6476c = constraintLayout;
        this.f6477d = imageView;
        this.f6478e = textView;
        this.f6479f = textView2;
        this.f6480g = textView3;
    }

    /* renamed from: a */
    public static ItemListTeacherFileShareBinding m5529a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return m5530c(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    /* renamed from: c */
    public static ItemListTeacherFileShareBinding m5530c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ItemListTeacherFileShareBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.item_list_teacher_file_share, viewGroup, z10, obj);
    }
}
