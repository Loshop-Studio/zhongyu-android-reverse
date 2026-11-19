package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.huiwei.launcher.p035ui.view.NoPaddingTextView;
import com.zykj.huiwei.launcher.viewmodels.HomeViewModel;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public abstract class HwIncludeHomeAppBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ImgAnswer;

    @NonNull
    public final View divider;

    @NonNull
    public final LinearLayoutCompat llNewArticle;

    @NonNull
    public final LinearLayoutCompat llNewReplay;

    @Bindable
    protected View.OnClickListener mClickListener;

    @Bindable
    protected HomeViewModel mVm;

    @NonNull
    public final TextView tvAnswer;

    @NonNull
    public final TextView tvBetterClass;

    @NonNull
    public final TextView tvGallery;

    @NonNull
    public final NoPaddingTextView tvNewArticle;

    @NonNull
    public final TextView tvNewArticleTitle;

    @NonNull
    public final NoPaddingTextView tvNewQuora;

    @NonNull
    public final TextView tvNewQuoraTitle;

    @NonNull
    public final NoPaddingTextView tvNewReplay;

    @NonNull
    public final TextView tvNewReplayTitle;

    @NonNull
    public final TextView tvNote;

    @NonNull
    public final TextView tvOnline;

    @NonNull
    public final TextView tvWrongBook;

    public HwIncludeHomeAppBinding(Object obj, View view, int i6, ImageView imageView, View view2, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, TextView textView, TextView textView2, TextView textView3, NoPaddingTextView noPaddingTextView, TextView textView4, NoPaddingTextView noPaddingTextView2, TextView textView5, NoPaddingTextView noPaddingTextView3, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        super(obj, view, i6);
        this.ImgAnswer = imageView;
        this.divider = view2;
        this.llNewArticle = linearLayoutCompat;
        this.llNewReplay = linearLayoutCompat2;
        this.tvAnswer = textView;
        this.tvBetterClass = textView2;
        this.tvGallery = textView3;
        this.tvNewArticle = noPaddingTextView;
        this.tvNewArticleTitle = textView4;
        this.tvNewQuora = noPaddingTextView2;
        this.tvNewQuoraTitle = textView5;
        this.tvNewReplay = noPaddingTextView3;
        this.tvNewReplayTitle = textView6;
        this.tvNote = textView7;
        this.tvOnline = textView8;
        this.tvWrongBook = textView9;
    }

    public static HwIncludeHomeAppBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HwIncludeHomeAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        return inflate(layoutInflater, viewGroup, z6, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener getClickListener() {
        return this.mClickListener;
    }

    @Nullable
    public HomeViewModel getVm() {
        return this.mVm;
    }

    public abstract void setClickListener(@Nullable View.OnClickListener onClickListener);

    public abstract void setVm(@Nullable HomeViewModel homeViewModel);

    @Deprecated
    public static HwIncludeHomeAppBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HwIncludeHomeAppBinding) ViewDataBinding.bind(obj, view, R.layout.hw_include_home_app);
    }

    @NonNull
    @Deprecated
    public static HwIncludeHomeAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6, @Nullable Object obj) {
        return (HwIncludeHomeAppBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_include_home_app, viewGroup, z6, obj);
    }

    @NonNull
    public static HwIncludeHomeAppBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HwIncludeHomeAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HwIncludeHomeAppBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.hw_include_home_app, null, false, obj);
    }
}
