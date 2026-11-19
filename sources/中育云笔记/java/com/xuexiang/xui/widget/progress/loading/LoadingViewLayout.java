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
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import p133e9.InterfaceC9110a;

/* loaded from: classes5.dex */
public class LoadingViewLayout extends LinearLayout {

    /* renamed from: c */
    public ARCLoadingView f16751c;

    /* renamed from: d */
    public TextView f16752d;

    public LoadingViewLayout(@NonNull Context context) {
        super(context);
        m13104c(context);
        m13102a(context, null);
    }

    /* renamed from: a */
    public final void m13102a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingViewLayout);
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.LoadingViewLayout_lvl_message);
            if (!TextUtils.isEmpty(string)) {
                m13106e(string);
            }
            m13105d(AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.LoadingViewLayout_lvl_icon));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public final void m13103b(Context context) {
        setOrientation(1);
        setGravity(17);
        setVisibility(8);
        int iM12219f = AbstractC8041g.m12219f(context, R$attr.xui_dialog_loading_padding_size);
        setPadding(iM12219f, iM12219f, iM12219f, iM12219f);
        int iM12219f2 = AbstractC8041g.m12219f(context, R$attr.xui_dialog_loading_min_size);
        setMinimumHeight(iM12219f2);
        setMinimumWidth(iM12219f2);
    }

    /* renamed from: c */
    public final void m13104c(Context context) {
        LayoutInflater.from(context).inflate(R$layout.xui_layout_loading_view, (ViewGroup) this, true);
        this.f16751c = (ARCLoadingView) findViewById(R$id.arc_loading_view);
        this.f16752d = (TextView) findViewById(R$id.tv_tip_message);
        m13103b(context);
    }

    /* renamed from: d */
    public LoadingViewLayout m13105d(Drawable drawable) {
        ARCLoadingView aRCLoadingView = this.f16751c;
        if (aRCLoadingView != null) {
            aRCLoadingView.m13099g(drawable);
        }
        return this;
    }

    /* renamed from: e */
    public void m13106e(String str) {
        if (this.f16752d != null) {
            if (TextUtils.isEmpty(str)) {
                this.f16752d.setText("");
                this.f16752d.setVisibility(8);
            } else {
                this.f16752d.setText(str);
                this.f16752d.setVisibility(0);
            }
        }
    }

    public void setCancelable(boolean z10) {
    }

    public LoadingViewLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m13104c(context);
        m13102a(context, attributeSet);
    }

    public LoadingViewLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m13104c(context);
        m13102a(context, attributeSet);
    }

    public void setLoadingCancelListener(InterfaceC9110a interfaceC9110a) {
    }
}
