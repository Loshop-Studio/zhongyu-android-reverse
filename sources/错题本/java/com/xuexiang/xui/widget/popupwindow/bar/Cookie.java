package com.xuexiang.xui.widget.popupwindow.bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import kotlin.collections.AbstractC5806u;

/* loaded from: classes3.dex */
final class Cookie extends LinearLayout {

    /* renamed from: a */
    public final LinearLayout f4622a;

    /* renamed from: b */
    public final TextView f4623b;

    /* renamed from: c */
    public final TextView f4624c;

    /* renamed from: d */
    public final TextView f4625d;

    /* renamed from: e */
    public final int f4626e;

    public Cookie(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        if (this.f4626e == 48) {
            super.onLayout(z8, i, 0, i9, this.f4622a.getMeasuredHeight());
        } else {
            super.onLayout(z8, i, i8, i9, i10);
        }
    }

    public Cookie(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4626e = 80;
        View.inflate(getContext(), R$layout.xui_layout_cookie, this);
        this.f4622a = (LinearLayout) findViewById(R$id.cookie);
        this.f4623b = (TextView) findViewById(R$id.tv_title);
        this.f4624c = (TextView) findViewById(R$id.tv_message);
        this.f4625d = (TextView) findViewById(R$id.btn_action);
        int iM5252F = AbstractC5806u.m5252F(context, R$attr.cookieTitleColor, -1);
        int iM5252F2 = AbstractC5806u.m5252F(context, R$attr.cookieMessageColor, -1);
        int iM5252F3 = AbstractC5806u.m5252F(context, R$attr.cookieActionColor, -1);
        int iM5252F4 = AbstractC5806u.m5252F(context, R$attr.cookieBackgroundColor, ContextCompat.getColor(context, R$color.cookie_bar_default_bg_color));
        this.f4623b.setTextColor(iM5252F);
        this.f4624c.setTextColor(iM5252F2);
        this.f4625d.setTextColor(iM5252F3);
        this.f4622a.setBackgroundColor(iM5252F4);
    }
}
