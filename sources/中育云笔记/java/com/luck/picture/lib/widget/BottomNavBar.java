package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.BottomNavBarStyle;
import p008a7.AbstractC0072e;
import p008a7.AbstractC0076i;
import p008a7.AbstractC0082o;
import p359u6.AbstractC11370a;

/* loaded from: classes5.dex */
public class BottomNavBar extends RelativeLayout implements View.OnClickListener {

    /* renamed from: c */
    public TextView f12604c;

    /* renamed from: d */
    public TextView f12605d;

    /* renamed from: e */
    public CheckBox f12606e;

    /* renamed from: f */
    public PictureSelectionConfig f12607f;

    /* renamed from: g */
    public C7508b f12608g;

    /* renamed from: com.luck.picture.lib.widget.BottomNavBar$a */
    public class C7507a implements CompoundButton.OnCheckedChangeListener {
        public C7507a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            BottomNavBar bottomNavBar = BottomNavBar.this;
            bottomNavBar.f12607f.f12330T = z10;
            bottomNavBar.f12606e.setChecked(BottomNavBar.this.f12607f.f12330T);
            C7508b c7508b = BottomNavBar.this.f12608g;
            if (c7508b != null) {
                c7508b.mo9009a();
                if (z10 && AbstractC11370a.m25304l() == 0) {
                    BottomNavBar.this.f12608g.mo9093c();
                }
            }
        }
    }

    /* renamed from: com.luck.picture.lib.widget.BottomNavBar$b */
    public static class C7508b {
        /* renamed from: a */
        public abstract void mo9009a();

        /* renamed from: b */
        public void mo9092b() {
        }

        /* renamed from: c */
        public void mo9093c() {
        }

        /* renamed from: d */
        public void mo9010d() {
        }
    }

    public BottomNavBar(Context context) {
        super(context);
        m9607e();
    }

    /* renamed from: b */
    public final void m9604b() {
        if (!this.f12607f.f12303C0) {
            this.f12606e.setText(getContext().getString(R$string.ps_default_original_image));
            return;
        }
        long jM9341B = 0;
        for (int i10 = 0; i10 < AbstractC11370a.m25304l(); i10++) {
            jM9341B += ((LocalMedia) AbstractC11370a.m25306n().get(i10)).m9341B();
        }
        if (jM9341B <= 0) {
            this.f12606e.setText(getContext().getString(R$string.ps_default_original_image));
        } else {
            this.f12606e.setText(getContext().getString(R$string.ps_original_image, AbstractC0076i.m200e(jM9341B)));
        }
    }

    /* renamed from: c */
    public void mo9605c() {
    }

    /* renamed from: d */
    public void m9606d() {
        View.inflate(getContext(), R$layout.ps_bottom_nav_bar, this);
    }

    /* renamed from: e */
    public void m9607e() {
        m9606d();
        setClickable(true);
        setFocusable(true);
        this.f12607f = PictureSelectionConfig.m9328c();
        this.f12604c = (TextView) findViewById(R$id.ps_tv_preview);
        this.f12605d = (TextView) findViewById(R$id.ps_tv_editor);
        this.f12606e = (CheckBox) findViewById(R$id.cb_original);
        this.f12604c.setOnClickListener(this);
        this.f12605d.setVisibility(8);
        setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_grey));
        this.f12606e.setChecked(this.f12607f.f12330T);
        this.f12606e.setOnCheckedChangeListener(new C7507a());
        mo9605c();
    }

    /* renamed from: f */
    public void mo9608f() {
        if (this.f12607f.f12339e) {
            setVisibility(8);
            return;
        }
        BottomNavBarStyle bottomNavBarStyleM26626b = PictureSelectionConfig.f12295P0.m26626b();
        if (this.f12607f.f12303C0) {
            this.f12606e.setVisibility(0);
            int iM9485i = bottomNavBarStyleM26626b.m9485i();
            if (AbstractC0082o.m228c(iM9485i)) {
                this.f12606e.setButtonDrawable(iM9485i);
            }
            String strM9486j = bottomNavBarStyleM26626b.m9486j();
            if (AbstractC0082o.m231f(strM9486j)) {
                this.f12606e.setText(strM9486j);
            }
            int iM9488l = bottomNavBarStyleM26626b.m9488l();
            if (AbstractC0082o.m227b(iM9488l)) {
                this.f12606e.setTextSize(iM9488l);
            }
            int iM9487k = bottomNavBarStyleM26626b.m9487k();
            if (AbstractC0082o.m228c(iM9487k)) {
                this.f12606e.setTextColor(iM9487k);
            }
        }
        int iM9484h = bottomNavBarStyleM26626b.m9484h();
        if (AbstractC0082o.m227b(iM9484h)) {
            getLayoutParams().height = iM9484h;
        } else {
            getLayoutParams().height = AbstractC0072e.m161a(getContext(), 46.0f);
        }
        int iM9483g = bottomNavBarStyleM26626b.m9483g();
        if (AbstractC0082o.m228c(iM9483g)) {
            setBackgroundColor(iM9483g);
        }
        int iM9491o = bottomNavBarStyleM26626b.m9491o();
        if (AbstractC0082o.m228c(iM9491o)) {
            this.f12604c.setTextColor(iM9491o);
        }
        int iM9492p = bottomNavBarStyleM26626b.m9492p();
        if (AbstractC0082o.m227b(iM9492p)) {
            this.f12604c.setTextSize(iM9492p);
        }
        String strM9490n = bottomNavBarStyleM26626b.m9490n();
        if (AbstractC0082o.m231f(strM9490n)) {
            this.f12604c.setText(strM9490n);
        }
        String strM9480a = bottomNavBarStyleM26626b.m9480a();
        if (AbstractC0082o.m231f(strM9480a)) {
            this.f12605d.setText(strM9480a);
        }
        int iM9482c = bottomNavBarStyleM26626b.m9482c();
        if (AbstractC0082o.m227b(iM9482c)) {
            this.f12605d.setTextSize(iM9482c);
        }
        int iM9481b = bottomNavBarStyleM26626b.m9481b();
        if (AbstractC0082o.m228c(iM9481b)) {
            this.f12605d.setTextColor(iM9481b);
        }
        int iM9485i2 = bottomNavBarStyleM26626b.m9485i();
        if (AbstractC0082o.m228c(iM9485i2)) {
            this.f12606e.setButtonDrawable(iM9485i2);
        }
        String strM9486j2 = bottomNavBarStyleM26626b.m9486j();
        if (AbstractC0082o.m231f(strM9486j2)) {
            this.f12606e.setText(strM9486j2);
        }
        int iM9488l2 = bottomNavBarStyleM26626b.m9488l();
        if (AbstractC0082o.m227b(iM9488l2)) {
            this.f12606e.setTextSize(iM9488l2);
        }
        int iM9487k2 = bottomNavBarStyleM26626b.m9487k();
        if (AbstractC0082o.m228c(iM9487k2)) {
            this.f12606e.setTextColor(iM9487k2);
        }
    }

    /* renamed from: g */
    public void m9609g() {
        this.f12606e.setChecked(this.f12607f.f12330T);
    }

    /* renamed from: h */
    public void m9610h() {
        m9604b();
        BottomNavBarStyle bottomNavBarStyleM26626b = PictureSelectionConfig.f12295P0.m26626b();
        if (AbstractC11370a.m25304l() <= 0) {
            this.f12604c.setEnabled(false);
            int iM9491o = bottomNavBarStyleM26626b.m9491o();
            if (AbstractC0082o.m228c(iM9491o)) {
                this.f12604c.setTextColor(iM9491o);
            } else {
                this.f12604c.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_9b));
            }
            String strM9490n = bottomNavBarStyleM26626b.m9490n();
            if (AbstractC0082o.m231f(strM9490n)) {
                this.f12604c.setText(strM9490n);
                return;
            } else {
                this.f12604c.setText(getContext().getString(R$string.ps_preview));
                return;
            }
        }
        this.f12604c.setEnabled(true);
        int iM9494r = bottomNavBarStyleM26626b.m9494r();
        if (AbstractC0082o.m228c(iM9494r)) {
            this.f12604c.setTextColor(iM9494r);
        } else {
            this.f12604c.setTextColor(ContextCompat.getColor(getContext(), R$color.ps_color_fa632d));
        }
        String strM9493q = bottomNavBarStyleM26626b.m9493q();
        if (!AbstractC0082o.m231f(strM9493q)) {
            this.f12604c.setText(getContext().getString(R$string.ps_preview_num, Integer.valueOf(AbstractC11370a.m25304l())));
        } else if (AbstractC0082o.m229d(strM9493q)) {
            this.f12604c.setText(String.format(strM9493q, Integer.valueOf(AbstractC11370a.m25304l())));
        } else {
            this.f12604c.setText(strM9493q);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f12608g != null && view.getId() == R$id.ps_tv_preview) {
            this.f12608g.mo9010d();
        }
    }

    public void setOnBottomNavBarListener(C7508b c7508b) {
        this.f12608g = c7508b;
    }

    public BottomNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9607e();
    }

    public BottomNavBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m9607e();
    }
}
