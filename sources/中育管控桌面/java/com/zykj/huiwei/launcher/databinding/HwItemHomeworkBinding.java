package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwItemHomeworkBinding extends ViewDataBinding {

    @NonNull
    public final TextView tvTime;

    @NonNull
    public final TextView tvTitle;

    public HwItemHomeworkBinding(Object obj, View view, int i6, TextView textView, TextView textView2) {
        super(obj, view, i6);
        this.tvTime = textView;
        this.tvTitle = textView2;
    }

    public static HwItemHomeworkBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwItemHomeworkBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static HwItemHomeworkBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwItemHomeworkBinding) ViewDataBinding.bind(obj, view, R.layout.hw_item_homework);
    }

    @NonNull
    @Deprecated
    public static HwItemHomeworkBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwItemHomeworkBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_item_homework, viewGroup, z6, obj);
    }

    @NonNull
    public static HwItemHomeworkBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwItemHomeworkBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwItemHomeworkBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_item_homework, null, false, obj);
    }
}
