package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LiveData;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$layout;

/* loaded from: classes3.dex */
public abstract class FragmentMyBinding extends ViewDataBinding {

    @NonNull
    public final FragmentContainerView fragmentContainerMy;

    @NonNull
    public final LinearLayout fragmentMy;

    @NonNull
    public final LinearLayout llContainer;

    @Bindable
    protected LiveData<UserBean> mUserBean;

    @NonNull
    public final SwipeRefreshLayout swipe;

    @NonNull
    public final TextView tvMyProduct;

    @NonNull
    public final TextView tvSetting;

    @NonNull
    public final TextView tvTeacher;

    public FragmentMyBinding(Object obj, View view, int i10, FragmentContainerView fragmentContainerView, LinearLayout linearLayout, LinearLayout linearLayout2, SwipeRefreshLayout swipeRefreshLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.fragmentContainerMy = fragmentContainerView;
        this.fragmentMy = linearLayout;
        this.llContainer = linearLayout2;
        this.swipe = swipeRefreshLayout;
        this.tvMyProduct = textView;
        this.tvSetting = textView2;
        this.tvTeacher = textView3;
    }

    public static FragmentMyBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentMyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public LiveData<UserBean> getUserBean() {
        return this.mUserBean;
    }

    public abstract void setUserBean(@Nullable LiveData<UserBean> liveData);

    @Deprecated
    public static FragmentMyBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentMyBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_my);
    }

    @NonNull
    @Deprecated
    public static FragmentMyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentMyBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_my, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentMyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentMyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentMyBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_my, null, false, obj);
    }
}
