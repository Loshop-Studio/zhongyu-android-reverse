package com.xuexiang.xui.widget.popupwindow.bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.utils.AbstractC8041g;

/* loaded from: classes5.dex */
final class Cookie extends LinearLayout {

    /* renamed from: c */
    public LinearLayout f16642c;

    /* renamed from: d */
    public TextView f16643d;

    /* renamed from: e */
    public TextView f16644e;

    /* renamed from: f */
    public ImageView f16645f;

    /* renamed from: g */
    public TextView f16646g;

    /* renamed from: h */
    public ImageView f16647h;

    /* renamed from: i */
    public long f16648i;

    /* renamed from: j */
    public int f16649j;

    public Cookie(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void m13047a(Context context) {
        int iM12218e = AbstractC8041g.m12218e(context, R$attr.cookieTitleColor, -1);
        int iM12218e2 = AbstractC8041g.m12218e(context, R$attr.cookieMessageColor, -1);
        int iM12218e3 = AbstractC8041g.m12218e(context, R$attr.cookieActionColor, -1);
        int iM12218e4 = AbstractC8041g.m12218e(context, R$attr.cookieBackgroundColor, ContextCompat.getColor(context, R$color.cookie_bar_default_bg_color));
        this.f16643d.setTextColor(iM12218e);
        this.f16644e.setTextColor(iM12218e2);
        this.f16646g.setTextColor(iM12218e3);
        this.f16642c.setBackgroundColor(iM12218e4);
    }

    /* renamed from: b */
    public final void m13048b(Context context) {
        View.inflate(getContext(), R$layout.xui_layout_cookie, this);
        this.f16642c = (LinearLayout) findViewById(R$id.cookie);
        this.f16643d = (TextView) findViewById(R$id.tv_title);
        this.f16644e = (TextView) findViewById(R$id.tv_message);
        this.f16645f = (ImageView) findViewById(R$id.iv_icon);
        this.f16646g = (TextView) findViewById(R$id.btn_action);
        this.f16647h = (ImageView) findViewById(R$id.btn_action_with_icon);
        m13047a(context);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f16649j == 48) {
            super.onLayout(z10, i10, 0, i12, this.f16642c.getMeasuredHeight());
        } else {
            super.onLayout(z10, i10, i11, i12, i13);
        }
    }

    public Cookie(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16648i = 2000L;
        this.f16649j = 80;
        m13048b(context);
    }
}
