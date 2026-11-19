package com.zykj.study.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.xuexiang.xui.widget.button.roundbutton.RoundButton;
import com.xuexiang.xui.widget.textview.supertextview.SuperTextView;
import com.zykj.policy.p064ui.PolicyCheckView;
import com.zykj.study.R$layout;
import com.zykj.study.viewmodels.SettingViewModel;

/* loaded from: classes3.dex */
public abstract class FragmentSettingBinding extends ViewDataBinding {

    @NonNull
    public final RoundButton btExit;

    @NonNull
    public final ConstraintLayout fragmentSetting;

    @Bindable
    protected Boolean mIsTeacher;

    @Bindable
    protected boolean mNeedShowPatch;

    @Bindable
    protected SettingViewModel mSettingViewModel;

    @Bindable
    protected String mTinkerId;

    @NonNull
    public final PolicyCheckView policyCheckView;

    @NonNull
    public final SuperTextView superAbout;

    @NonNull
    public final SuperTextView superCache;

    @NonNull
    public final SuperTextView superFeedback;

    @NonNull
    public final SuperTextView superMessage;

    @NonNull
    public final SuperTextView superSwitchMode;

    @NonNull
    public final SuperTextView superSwitchNet;

    @NonNull
    public final SuperTextView superVersion;

    @NonNull
    public final TextView textView5;

    @NonNull
    public final TextView tvAddHotfix;

    @NonNull
    public final TextView tvClearHotfix;

    public FragmentSettingBinding(Object obj, View view, int i10, RoundButton roundButton, ConstraintLayout constraintLayout, PolicyCheckView policyCheckView, SuperTextView superTextView, SuperTextView superTextView2, SuperTextView superTextView3, SuperTextView superTextView4, SuperTextView superTextView5, SuperTextView superTextView6, SuperTextView superTextView7, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.btExit = roundButton;
        this.fragmentSetting = constraintLayout;
        this.policyCheckView = policyCheckView;
        this.superAbout = superTextView;
        this.superCache = superTextView2;
        this.superFeedback = superTextView3;
        this.superMessage = superTextView4;
        this.superSwitchMode = superTextView5;
        this.superSwitchNet = superTextView6;
        this.superVersion = superTextView7;
        this.textView5 = textView;
        this.tvAddHotfix = textView2;
        this.tvClearHotfix = textView3;
    }

    public static FragmentSettingBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        return inflate(layoutInflater, viewGroup, z10, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public Boolean getIsTeacher() {
        return this.mIsTeacher;
    }

    public boolean getNeedShowPatch() {
        return this.mNeedShowPatch;
    }

    @Nullable
    public SettingViewModel getSettingViewModel() {
        return this.mSettingViewModel;
    }

    @Nullable
    public String getTinkerId() {
        return this.mTinkerId;
    }

    public abstract void setIsTeacher(@Nullable Boolean bool);

    public abstract void setNeedShowPatch(boolean z10);

    public abstract void setSettingViewModel(@Nullable SettingViewModel settingViewModel);

    public abstract void setTinkerId(@Nullable String str);

    @Deprecated
    public static FragmentSettingBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentSettingBinding) ViewDataBinding.bind(obj, view, R$layout.fragment_setting);
    }

    @NonNull
    @Deprecated
    public static FragmentSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (FragmentSettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_setting, viewGroup, z10, obj);
    }

    @NonNull
    public static FragmentSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentSettingBinding) ViewDataBinding.inflateInternal(layoutInflater, R$layout.fragment_setting, null, false, obj);
    }
}
