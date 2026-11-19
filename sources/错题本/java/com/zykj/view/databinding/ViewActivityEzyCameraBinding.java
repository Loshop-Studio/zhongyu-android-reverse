package com.zykj.view.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.zykj.view.C5280R;

/* loaded from: classes3.dex */
public abstract class ViewActivityEzyCameraBinding extends ViewDataBinding {

    @NonNull
    public final FragmentContainerView fragmentContainer;

    public ViewActivityEzyCameraBinding(Object obj, View view, int i, FragmentContainerView fragmentContainerView) {
        super(obj, view, i);
        this.fragmentContainer = fragmentContainerView;
    }

    public static ViewActivityEzyCameraBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ViewActivityEzyCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8) {
        return inflate(layoutInflater, viewGroup, z8, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ViewActivityEzyCameraBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ViewActivityEzyCameraBinding) ViewDataBinding.bind(obj, view, C5280R.layout.view_activity_ezy_camera);
    }

    @NonNull
    @Deprecated
    public static ViewActivityEzyCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z8, @Nullable Object obj) {
        return (ViewActivityEzyCameraBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_activity_ezy_camera, viewGroup, z8, obj);
    }

    @NonNull
    public static ViewActivityEzyCameraBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ViewActivityEzyCameraBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ViewActivityEzyCameraBinding) ViewDataBinding.inflateInternal(layoutInflater, C5280R.layout.view_activity_ezy_camera, null, false, obj);
    }
}
