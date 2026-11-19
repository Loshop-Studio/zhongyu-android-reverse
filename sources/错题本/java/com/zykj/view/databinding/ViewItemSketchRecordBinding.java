package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;

/* loaded from: classes3.dex */
public abstract class ViewItemSketchRecordBinding extends ViewDataBinding {

    @NonNull
    public final TextView tvCommit;

    public ViewItemSketchRecordBinding(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.tvCommit = textView;
    }

    public static ViewItemSketchRecordBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewItemSketchRecordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewItemSketchRecordBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewItemSketchRecordBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_item_sketch_record);
    }

    @NonNull
    @Deprecated
    public static ViewItemSketchRecordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewItemSketchRecordBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_item_sketch_record, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewItemSketchRecordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewItemSketchRecordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewItemSketchRecordBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_item_sketch_record, null, false, obj);
    }
}
