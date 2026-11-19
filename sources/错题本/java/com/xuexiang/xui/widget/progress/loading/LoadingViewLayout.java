package com.xuexiang.xui.widget.progress.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$styleable;
import kotlin.collections.AbstractC5806u;
import p097k3.InterfaceC5754a;
import p169t6.AbstractC6600a;

/* loaded from: classes3.dex */
public class LoadingViewLayout extends LinearLayout {

    /* renamed from: a */
    public ARCLoadingView f4695a;

    /* renamed from: b */
    public TextView f4696b;

    public LoadingViewLayout(@NonNull Context context) {
        super(context);
        m3542b(context);
    }

    /* renamed from: a */
    public final void m3541a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingViewLayout);
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.LoadingViewLayout_lvl_message);
            if (!TextUtils.isEmpty(string) && this.f4696b != null) {
                if (TextUtils.isEmpty(string)) {
                    this.f4696b.setText("");
                    this.f4696b.setVisibility(8);
                } else {
                    this.f4696b.setText(string);
                    this.f4696b.setVisibility(0);
                }
            }
            getContext();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.LoadingViewLayout_lvl_icon);
            ARCLoadingView aRCLoadingView = this.f4695a;
            if (aRCLoadingView != null && drawable != null) {
                aRCLoadingView.f4691i = AbstractC6600a.m6232c(drawable);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public final void m3542b(Context context) {
        LayoutInflater.from(context).inflate(R$layout.xui_layout_loading_view, (ViewGroup) this, true);
        this.f4695a = (ARCLoadingView) findViewById(R$id.arc_loading_view);
        this.f4696b = (TextView) findViewById(R$id.tv_tip_message);
        setOrientation(1);
        setGravity(17);
        setVisibility(8);
        int iM5253G = AbstractC5806u.m5253G(context, R$attr.xui_dialog_loading_padding_size, -1);
        setPadding(iM5253G, iM5253G, iM5253G, iM5253G);
        int iM5253G2 = AbstractC5806u.m5253G(context, R$attr.xui_dialog_loading_min_size, -1);
        setMinimumHeight(iM5253G2);
        setMinimumWidth(iM5253G2);
    }

    public void setCancelable(boolean z8) {
    }

    public LoadingViewLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m3542b(context);
        m3541a(context, attributeSet);
    }

    public LoadingViewLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3542b(context);
        m3541a(context, attributeSet);
    }

    public void setLoadingCancelListener(InterfaceC5754a interfaceC5754a) {
    }
}
