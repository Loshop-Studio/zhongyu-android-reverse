package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class DiscoveryIncludePdfPageBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout content;

    @NonNull
    public final AppCompatEditText etPage;

    @NonNull
    public final AppCompatImageView ivNext;

    @NonNull
    public final AppCompatImageView ivPrev;

    @NonNull
    public final TextView tvTotalPage;

    public DiscoveryIncludePdfPageBinding(Object obj, View view, int i6, LinearLayout linearLayout, AppCompatEditText appCompatEditText, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView) {
        super(obj, view, i6);
        this.content = linearLayout;
        this.etPage = appCompatEditText;
        this.ivNext = appCompatImageView;
        this.ivPrev = appCompatImageView2;
        this.tvTotalPage = textView;
    }

    public static DiscoveryIncludePdfPageBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static DiscoveryIncludePdfPageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DiscoveryIncludePdfPageBinding bind(@NonNull View view, @Nullable Object obj) {
        return (DiscoveryIncludePdfPageBinding) ViewDataBinding.bind(obj, view, R.layout.discovery_include_pdf_page);
    }

    @NonNull
    @Deprecated
    public static DiscoveryIncludePdfPageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (DiscoveryIncludePdfPageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.discovery_include_pdf_page, viewGroup, z6, obj);
    }

    @NonNull
    public static DiscoveryIncludePdfPageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DiscoveryIncludePdfPageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DiscoveryIncludePdfPageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.discovery_include_pdf_page, null, false, obj);
    }
}
