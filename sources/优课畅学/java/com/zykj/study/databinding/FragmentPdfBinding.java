package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.barteksc.pdfviewer.PDFView;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentPdfBinding extends ViewDataBinding {

    @NonNull
    public final PDFView pdfView;

    public FragmentPdfBinding(Object obj, View view, int i10, PDFView pDFView) {
        super(obj, view, i10);
        this.pdfView = pDFView;
    }

    public static FragmentPdfBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentPdfBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPdfBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentPdfBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_pdf);
    }

    @NonNull
    @Deprecated
    public static FragmentPdfBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentPdfBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_pdf, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentPdfBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentPdfBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentPdfBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_pdf, null, false, obj);
    }
}
