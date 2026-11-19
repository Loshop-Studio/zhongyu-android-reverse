package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.view.PreviewView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5280R;

/* loaded from: classes3.dex */
public abstract class ViewFragmentImagePickBinding extends ViewDataBinding {

    @NonNull
    public final ImageView cancel;

    @NonNull
    public final ImageView capture;

    @NonNull
    public final CheckBox ckLight;

    @NonNull
    public final View hLine1;

    @NonNull
    public final View hLine2;

    @NonNull
    public final PreviewView prevView;

    @NonNull
    public final View vLine1;

    @NonNull
    public final View vLine2;

    public ViewFragmentImagePickBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, CheckBox checkBox, View view2, View view3, PreviewView previewView, View view4, View view5) {
        super(obj, view, i);
        this.cancel = imageView;
        this.capture = imageView2;
        this.ckLight = checkBox;
        this.hLine1 = view2;
        this.hLine2 = view3;
        this.prevView = previewView;
        this.vLine1 = view4;
        this.vLine2 = view5;
    }

    public static ViewFragmentImagePickBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewFragmentImagePickBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewFragmentImagePickBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewFragmentImagePickBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_fragment_image_pick);
    }

    @NonNull
    @Deprecated
    public static ViewFragmentImagePickBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewFragmentImagePickBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_fragment_image_pick, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewFragmentImagePickBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewFragmentImagePickBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewFragmentImagePickBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_fragment_image_pick, null, false, obj);
    }
}
