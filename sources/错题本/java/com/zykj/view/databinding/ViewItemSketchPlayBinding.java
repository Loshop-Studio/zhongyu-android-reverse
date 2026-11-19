package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;

/* loaded from: classes3.dex */
public abstract class ViewItemSketchPlayBinding extends ViewDataBinding {

    @NonNull
    public final Group groupSeekBar;

    @NonNull
    public final ImageView ivFullscreen;

    @NonNull
    public final ImageView ivRecord;

    @NonNull
    public final SeekBar seekBar;

    @NonNull
    public final TextView tvSpeedRate;

    @NonNull
    public final TextView tvTime;

    @NonNull
    public final View viewBg;

    public ViewItemSketchPlayBinding(Object obj, View view, int i, Group group, ImageView imageView, ImageView imageView2, SeekBar seekBar, TextView textView, TextView textView2, View view2) {
        super(obj, view, i);
        this.groupSeekBar = group;
        this.ivFullscreen = imageView;
        this.ivRecord = imageView2;
        this.seekBar = seekBar;
        this.tvSpeedRate = textView;
        this.tvTime = textView2;
        this.viewBg = view2;
    }

    public static ViewItemSketchPlayBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewItemSketchPlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewItemSketchPlayBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewItemSketchPlayBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_item_sketch_play);
    }

    @NonNull
    @Deprecated
    public static ViewItemSketchPlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewItemSketchPlayBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_item_sketch_play, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewItemSketchPlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewItemSketchPlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewItemSketchPlayBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_item_sketch_play, null, false, obj);
    }
}
