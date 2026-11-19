package com.xuexiang.xui.widget.tabbar.vertical;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import io.reactivex.internal.operators.observable.C5711g;
import p054e7.C5486r;
import p073h4.AbstractC5625a;
import p143q3.C6413a;
import p143q3.C6414b;
import p143q3.C6415c;
import p164t1.AbstractC6582a;
import p166t3.InterfaceC6584a;

/* loaded from: classes3.dex */
public class XTabView extends TabView {

    /* renamed from: a */
    public final TextView f4990a;

    /* renamed from: b */
    public TabBadgeView f4991b;

    /* renamed from: c */
    public C6414b f4992c;

    /* renamed from: d */
    public C6415c f4993d;

    /* renamed from: e */
    public C6413a f4994e;

    /* renamed from: f */
    public boolean f4995f;

    /* renamed from: g */
    public final Drawable f4996g;

    public XTabView(Context context) {
        super(context);
        C5711g c5711g = new C5711g(8);
        C6414b c6414b = new C6414b();
        c6414b.f10524a = c5711g;
        this.f4992c = c6414b;
        C5486r c5486r = new C5486r(2);
        C6415c c6415c = new C6415c();
        c6415c.f10525a = c5486r;
        this.f4993d = c6415c;
        this.f4994e = new C6413a();
        setMinimumHeight(AbstractC5625a.m4948h(context, 25.0f));
        if (this.f4990a == null) {
            this.f4990a = new TextView(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.gravity = 17;
            this.f4990a.setLayoutParams(layoutParams);
            addView(this.f4990a);
        }
        m3608c();
        m3607b();
        m3606a();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackgroundBorderless});
        this.f4996g = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        Drawable background = getBackground();
        Drawable drawable = this.f4996g;
        if (background != drawable) {
            setBackground(drawable);
        }
    }

    /* renamed from: a */
    public final void m3606a() {
        TabBadgeView tabBadgeView;
        int i = 0;
        while (true) {
            if (i >= getChildCount()) {
                tabBadgeView = null;
                break;
            }
            View childAt = getChildAt(i);
            if (childAt instanceof TabBadgeView) {
                tabBadgeView = (TabBadgeView) childAt;
                break;
            }
            i++;
        }
        if (tabBadgeView == null) {
            tabBadgeView = new TabBadgeView(getContext());
            addView(tabBadgeView, new FrameLayout.LayoutParams(-1, -1));
        }
        tabBadgeView.f5043s = this;
        this.f4991b = tabBadgeView;
        this.f4994e.getClass();
        this.f4994e.getClass();
        this.f4994e.getClass();
        this.f4994e.getClass();
        this.f4994e.getClass();
        this.f4994e.getClass();
        this.f4994e.getClass();
        this.f4994e.getClass();
        this.f4994e.getClass();
        this.f4994e.getClass();
        this.f4994e.getClass();
        this.f4994e.getClass();
        this.f4994e.getClass();
        this.f4994e.getClass();
        this.f4994e.getClass();
        this.f4994e.getClass();
    }

    /* renamed from: b */
    public final void m3607b() {
        boolean z8 = this.f4995f;
        this.f4992c.getClass();
        C5711g c5711g = this.f4992c.f10524a;
        this.f4990a.setCompoundDrawables(null, null, null, null);
        boolean z9 = this.f4995f;
        this.f4992c.getClass();
        this.f4990a.setCompoundDrawablePadding(0);
    }

    /* renamed from: c */
    public final void m3608c() {
        int i;
        if (this.f4995f) {
            this.f4993d.getClass();
            i = -49023;
        } else {
            this.f4993d.getClass();
            i = -9079435;
        }
        this.f4990a.setTextColor(i);
        C5486r c5486r = this.f4993d.f10525a;
        this.f4990a.setTextSize(16);
        this.f4990a.setText(this.f4993d.f10525a.f8481b);
        this.f4990a.setGravity(17);
        this.f4990a.setEllipsize(TextUtils.TruncateAt.END);
        AbstractC6582a.m6218b();
        this.f4990a.setTypeface(null);
        boolean z8 = this.f4995f;
        this.f4992c.getClass();
        this.f4990a.setCompoundDrawablePadding(0);
    }

    /* renamed from: d */
    public final void m3609d(int i) {
        if (i != 0) {
            if (i <= 0) {
                setBackground(null);
                return;
            } else {
                super.setBackgroundResource(i);
                return;
            }
        }
        Drawable background = getBackground();
        Drawable drawable = this.f4996g;
        if (background != drawable) {
            setBackground(drawable);
        }
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    public C6413a getBadge() {
        return this.f4994e;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    public InterfaceC6584a getBadgeView() {
        return this.f4991b;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    public C6414b getIcon() {
        return this.f4992c;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    @Deprecated
    public ImageView getIconView() {
        return null;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    public C6415c getTitle() {
        return this.f4993d;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    public TextView getTitleView() {
        return this.f4990a;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f4995f;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        m3609d(i);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        int i;
        this.f4995f = z8;
        setSelected(z8);
        refreshDrawableState();
        if (z8) {
            this.f4993d.getClass();
            i = -49023;
        } else {
            this.f4993d.getClass();
            i = -9079435;
        }
        this.f4990a.setTextColor(i);
        m3607b();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i8, int i9, int i10) {
        this.f4990a.setPadding(i, i8, i9, i10);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i8, int i9, int i10) {
        this.f4990a.setPaddingRelative(i, i8, i9, i10);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f4995f);
    }
}
