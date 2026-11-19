package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.barteksc.pdfviewer.PDFView;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class DiscoveryFragmentPdfBinding extends ViewDataBinding {

    @NonNull
    public final PDFView fmContent;

    @NonNull
    public final TextView tvPageIndex;

    public DiscoveryFragmentPdfBinding(Object obj, View view, int i6, PDFView pDFView, TextView textView) {
        super(obj, view, i6);
        this.fmContent = pDFView;
        this.tvPageIndex = textView;
    }

    public static DiscoveryFragmentPdfBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DiscoveryFragmentPdfBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DiscoveryFragmentPdfBinding bind(@NonNull View view, @Nullable Object obj) {
        return (DiscoveryFragmentPdfBinding) ViewDataBinding.bind(obj, view, R.layout.discovery_fragment_pdf);
    }

    @NonNull
    @Deprecated
    public static DiscoveryFragmentPdfBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (DiscoveryFragmentPdfBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.discovery_fragment_pdf, viewGroup, z6, obj);
    }

    @NonNull
    public static DiscoveryFragmentPdfBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DiscoveryFragmentPdfBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DiscoveryFragmentPdfBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.discovery_fragment_pdf, null, false, obj);
    }
}
