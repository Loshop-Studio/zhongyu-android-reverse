package com.luck.picture.lib.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.luck.picture.lib.R$anim;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.BottomNavBarStyle;
import com.luck.picture.lib.style.SelectMainStyle;
import p008a7.AbstractC0082o;
import p008a7.AbstractC0084q;
import p359u6.AbstractC11370a;
import p434z6.C12023a;

/* loaded from: classes5.dex */
public class CompleteSelectView extends LinearLayout {

    /* renamed from: c */
    public TextView f12610c;

    /* renamed from: d */
    public TextView f12611d;

    /* renamed from: e */
    public Animation f12612e;

    /* renamed from: f */
    public PictureSelectionConfig f12613f;

    public CompleteSelectView(Context context) {
        super(context);
        m9612b();
    }

    /* renamed from: a */
    public void m9611a() {
        LayoutInflater.from(getContext()).inflate(R$layout.ps_complete_selected_layout, this);
    }

    /* renamed from: b */
    public final void m9612b() {
        m9611a();
        setOrientation(0);
        this.f12610c = (TextView) findViewById(R$id.ps_tv_select_num);
        this.f12611d = (TextView) findViewById(R$id.ps_tv_complete);
        setGravity(16);
        this.f12612e = AnimationUtils.loadAnimation(getContext(), R$anim.ps_anim_modal_in);
        this.f12613f = PictureSelectionConfig.m9328c();
    }

    /* renamed from: c */
    public void m9613c() {
        C12023a c12023a = PictureSelectionConfig.f12295P0;
        SelectMainStyle selectMainStyleM26627c = c12023a.m26627c();
        if (AbstractC0082o.m228c(selectMainStyleM26627c.m9515L())) {
            setBackgroundResource(selectMainStyleM26627c.m9515L());
        }
        String strM9516M = selectMainStyleM26627c.m9516M();
        if (AbstractC0082o.m231f(strM9516M)) {
            if (AbstractC0082o.m230e(strM9516M)) {
                this.f12611d.setText(String.format(strM9516M, Integer.valueOf(AbstractC11370a.m25304l()), Integer.valueOf(this.f12613f.f12355m)));
            } else {
                this.f12611d.setText(strM9516M);
            }
        }
        int iM9518O = selectMainStyleM26627c.m9518O();
        if (AbstractC0082o.m227b(iM9518O)) {
            this.f12611d.setTextSize(iM9518O);
        }
        int iM9517N = selectMainStyleM26627c.m9517N();
        if (AbstractC0082o.m228c(iM9517N)) {
            this.f12611d.setTextColor(iM9517N);
        }
        BottomNavBarStyle bottomNavBarStyleM26626b = c12023a.m26626b();
        if (bottomNavBarStyleM26626b.m9498v()) {
            int iM9495s = bottomNavBarStyleM26626b.m9495s();
            if (AbstractC0082o.m228c(iM9495s)) {
                this.f12610c.setBackgroundResource(iM9495s);
            }
            int iM9497u = bottomNavBarStyleM26626b.m9497u();
            if (AbstractC0082o.m227b(iM9497u)) {
                this.f12610c.setTextSize(iM9497u);
            }
            int iM9496t = bottomNavBarStyleM26626b.m9496t();
            if (AbstractC0082o.m228c(iM9496t)) {
                this.f12610c.setTextColor(iM9496t);
            }
        }
    }

    public void setSelectedChange(boolean z10) {
        C12023a c12023a = PictureSelectionConfig.f12295P0;
        SelectMainStyle selectMainStyleM26627c = c12023a.m26627c();
        if (AbstractC11370a.m25304l() > 0) {
            setEnabled(true);
            int iM9514K = selectMainStyleM26627c.m9514K();
            if (AbstractC0082o.m228c(iM9514K)) {
                setBackgroundResource(iM9514K);
            } else {
                setBackgroundResource(R$drawable.ps_ic_trans_1px);
            }
            String strM9519P = selectMainStyleM26627c.m9519P();
            if (!AbstractC0082o.m231f(strM9519P)) {
                this.f12611d.setText(getContext().getString(R$string.ps_completed));
            } else if (AbstractC0082o.m230e(strM9519P)) {
                this.f12611d.setText(String.format(strM9519P, Integer.valueOf(AbstractC11370a.m25304l()), Integer.valueOf(this.f12613f.f12355m)));
            } else {
                this.f12611d.setText(strM9519P);
            }
            int iM9521R = selectMainStyleM26627c.m9521R();
            if (AbstractC0082o.m227b(iM9521R)) {
                this.f12611d.setTextSize(iM9521R);
            }
            int iM9520Q = selectMainStyleM26627c.m9520Q();
            if (AbstractC0082o.m228c(iM9520Q)) {
                this.f12611d.setTextColor(iM9520Q);
            } else {
                this.f12611d.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_fa632d));
            }
            if (!c12023a.m26626b().m9498v()) {
                this.f12610c.setVisibility(8);
                return;
            }
            if (this.f12610c.getVisibility() == 8 || this.f12610c.getVisibility() == 4) {
                this.f12610c.setVisibility(0);
            }
            if (TextUtils.equals(AbstractC0084q.m242g(Integer.valueOf(AbstractC11370a.m25304l())), this.f12610c.getText())) {
                return;
            }
            this.f12610c.setText(AbstractC0084q.m242g(Integer.valueOf(AbstractC11370a.m25304l())));
            this.f12610c.startAnimation(this.f12612e);
            return;
        }
        if (z10 && selectMainStyleM26627c.m9524U()) {
            setEnabled(true);
            int iM9514K2 = selectMainStyleM26627c.m9514K();
            if (AbstractC0082o.m228c(iM9514K2)) {
                setBackgroundResource(iM9514K2);
            } else {
                setBackgroundResource(R$drawable.ps_ic_trans_1px);
            }
            int iM9520Q2 = selectMainStyleM26627c.m9520Q();
            if (AbstractC0082o.m228c(iM9520Q2)) {
                this.f12611d.setTextColor(iM9520Q2);
            } else {
                this.f12611d.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_9b));
            }
        } else {
            setEnabled(this.f12613f.f12325O);
            int iM9515L = selectMainStyleM26627c.m9515L();
            if (AbstractC0082o.m228c(iM9515L)) {
                setBackgroundResource(iM9515L);
            } else {
                setBackgroundResource(R$drawable.ps_ic_trans_1px);
            }
            int iM9517N = selectMainStyleM26627c.m9517N();
            if (AbstractC0082o.m228c(iM9517N)) {
                this.f12611d.setTextColor(iM9517N);
            } else {
                this.f12611d.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_9b));
            }
        }
        this.f12610c.setVisibility(8);
        String strM9516M = selectMainStyleM26627c.m9516M();
        if (!AbstractC0082o.m231f(strM9516M)) {
            this.f12611d.setText(getContext().getString(R$string.ps_please_select));
        } else if (AbstractC0082o.m230e(strM9516M)) {
            this.f12611d.setText(String.format(strM9516M, Integer.valueOf(AbstractC11370a.m25304l()), Integer.valueOf(this.f12613f.f12355m)));
        } else {
            this.f12611d.setText(strM9516M);
        }
        int iM9518O = selectMainStyleM26627c.m9518O();
        if (AbstractC0082o.m227b(iM9518O)) {
            this.f12611d.setTextSize(iM9518O);
        }
    }

    public CompleteSelectView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m9612b();
    }

    public CompleteSelectView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m9612b();
    }
}
