package com.zykj.huiwei.launcher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.lljjcoder.style.citypickerview.widget.wheel.WheelView;
import com.zykj.manage.R;

/* loaded from: classes4.dex */
public final class HwViewCityPickerBinding implements ViewBinding {

    @NonNull
    public final WheelView idCity;

    @NonNull
    public final WheelView idDistrict;

    @NonNull
    public final WheelView idProvince;

    @NonNull
    public final LinearLayout llTitle;

    @NonNull
    public final LinearLayout llTitleBackground;

    @NonNull
    public final RelativeLayout rlTitle;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvConfirm;

    @NonNull
    public final TextView tvTitle;

    private HwViewCityPickerBinding(@NonNull LinearLayout linearLayout, @NonNull WheelView wheelView, @NonNull WheelView wheelView2, @NonNull WheelView wheelView3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.idCity = wheelView;
        this.idDistrict = wheelView2;
        this.idProvince = wheelView3;
        this.llTitle = linearLayout2;
        this.llTitleBackground = linearLayout3;
        this.rlTitle = relativeLayout;
        this.tvCancel = textView;
        this.tvConfirm = textView2;
        this.tvTitle = textView3;
    }

    @NonNull
    public static HwViewCityPickerBinding bind(@NonNull View view) {
        int i6 = R.id.id_city;
        WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, R.id.id_city);
        if (wheelView != null) {
            i6 = R.id.id_district;
            WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, R.id.id_district);
            if (wheelView2 != null) {
                i6 = R.id.id_province;
                WheelView wheelView3 = (WheelView) ViewBindings.findChildViewById(view, R.id.id_province);
                if (wheelView3 != null) {
                    i6 = R.id.ll_title;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_title);
                    if (linearLayout != null) {
                        LinearLayout linearLayout2 = (LinearLayout) view;
                        i6 = R.id.rl_title;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_title);
                        if (relativeLayout != null) {
                            i6 = R.id.tv_cancel;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
                            if (textView != null) {
                                i6 = R.id.tv_confirm;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_confirm);
                                if (textView2 != null) {
                                    i6 = R.id.tv_title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                    if (textView3 != null) {
                                        return new HwViewCityPickerBinding(linearLayout2, wheelView, wheelView2, wheelView3, linearLayout, linearLayout2, relativeLayout, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    @NonNull
    public static HwViewCityPickerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static HwViewCityPickerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z6) {
        View viewInflate = layoutInflater.inflate(R.layout.hw_view_city_picker, viewGroup, false);
        if (z6) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
