package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;
import com.zykj.view.widget.DoubleSeekBar;

/* loaded from: classes3.dex */
public abstract class ViewFragmentBlackboardCropBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final ImageView ivRecord;

    @NonNull
    public final DoubleSeekBar seekBar;

    @NonNull
    public final RelativeLayout sketchView;

    @NonNull
    public final TextView tvConfirm;

    @NonNull
    public final TextView tvTime;

    public ViewFragmentBlackboardCropBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, DoubleSeekBar doubleSeekBar, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ivBack = imageView;
        this.ivRecord = imageView2;
        this.seekBar = doubleSeekBar;
        this.sketchView = relativeLayout;
        this.tvConfirm = textView;
        this.tvTime = textView2;
    }

    public static ViewFragmentBlackboardCropBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewFragmentBlackboardCropBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewFragmentBlackboardCropBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewFragmentBlackboardCropBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_fragment_blackboard_crop);
    }

    @NonNull
    @Deprecated
    public static ViewFragmentBlackboardCropBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewFragmentBlackboardCropBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_fragment_blackboard_crop, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewFragmentBlackboardCropBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewFragmentBlackboardCropBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewFragmentBlackboardCropBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_fragment_blackboard_crop, null, false, obj);
    }
}
