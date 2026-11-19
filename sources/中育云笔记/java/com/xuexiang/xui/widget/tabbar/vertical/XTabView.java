package com.xuexiang.xui.widget.tabbar.vertical;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.widget.tabbar.vertical.C8290a;
import com.xuexiang.xui.widget.tabbar.vertical.C8291b;
import com.xuexiang.xui.widget.tabbar.vertical.C8292c;
import com.xuexiang.xui.widget.textview.badge.InterfaceC8300a;
import p420y7.AbstractC11916b;

/* loaded from: classes5.dex */
public class XTabView extends TabView {

    /* renamed from: c */
    public Context f17206c;

    /* renamed from: d */
    public TextView f17207d;

    /* renamed from: e */
    public InterfaceC8300a f17208e;

    /* renamed from: f */
    public C8291b f17209f;

    /* renamed from: g */
    public C8292c f17210g;

    /* renamed from: h */
    public C8290a f17211h;

    /* renamed from: i */
    public boolean f17212i;

    /* renamed from: j */
    public Drawable f17213j;

    public XTabView(Context context) throws Resources.NotFoundException {
        super(context);
        this.f17206c = context;
        this.f17209f = new C8291b.a().m13476g();
        this.f17210g = new C8292c.a().m13485e();
        this.f17211h = new C8290a.a().m13463q();
        m13424d();
        TypedArray typedArrayObtainStyledAttributes = this.f17206c.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackgroundBorderless});
        this.f17213j = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        m13428h();
    }

    /* renamed from: a */
    public final void m13421a() {
        this.f17208e = TabBadgeView.m13419F(this);
        if (this.f17211h.m13431a() != -1552832) {
            this.f17208e.mo13555b(this.f17211h.m13431a());
        }
        if (this.f17211h.m13436f() != -1) {
            this.f17208e.mo13556c(this.f17211h.m13436f());
        }
        if (this.f17211h.m13442l() != 0 || this.f17211h.m13443m() != 0.0f) {
            this.f17208e.mo13557d(this.f17211h.m13442l(), this.f17211h.m13443m(), true);
        }
        if (this.f17211h.m13438h() != null || this.f17211h.m13444n()) {
            this.f17208e.mo13565l(this.f17211h.m13438h(), this.f17211h.m13444n());
        }
        if (this.f17211h.m13437g() != 11.0f) {
            this.f17208e.mo13564k(this.f17211h.m13437g(), true);
        }
        if (this.f17211h.m13434d() != 5.0f) {
            this.f17208e.mo13563j(this.f17211h.m13434d(), true);
        }
        if (this.f17211h.m13433c() != 0) {
            this.f17208e.mo13559f(this.f17211h.m13433c());
        }
        if (this.f17211h.m13435e() != null) {
            this.f17208e.mo13554a(this.f17211h.m13435e());
        }
        if (this.f17211h.m13432b() != 8388661) {
            this.f17208e.mo13558e(this.f17211h.m13432b());
        }
        if (this.f17211h.m13439i() != 1 || this.f17211h.m13440j() != 1) {
            this.f17208e.mo13560g(this.f17211h.m13439i(), this.f17211h.m13440j(), true);
        }
        if (this.f17211h.m13445o()) {
            this.f17208e.mo13562i(this.f17211h.m13445o());
        }
        if (!this.f17211h.m13446p()) {
            this.f17208e.mo13561h(this.f17211h.m13446p());
        }
        this.f17211h.m13441k();
    }

    /* renamed from: b */
    public final void m13422b() throws Resources.NotFoundException {
        Drawable drawable;
        int iM13469f = this.f17212i ? this.f17209f.m13469f() : this.f17209f.m13468e();
        if (iM13469f != 0) {
            drawable = this.f17206c.getResources().getDrawable(iM13469f);
            drawable.setBounds(0, 0, this.f17209f.m13466c() != -1 ? this.f17209f.m13466c() : drawable.getIntrinsicWidth(), this.f17209f.m13465b() != -1 ? this.f17209f.m13465b() : drawable.getIntrinsicHeight());
        } else {
            drawable = null;
        }
        int iM13464a = this.f17209f.m13464a();
        if (iM13464a == 48) {
            this.f17207d.setCompoundDrawables(null, drawable, null, null);
        } else if (iM13464a == 80) {
            this.f17207d.setCompoundDrawables(null, null, null, drawable);
        } else if (iM13464a == 8388611) {
            this.f17207d.setCompoundDrawables(drawable, null, null, null);
        } else if (iM13464a == 8388613) {
            this.f17207d.setCompoundDrawables(null, null, drawable, null);
        }
        m13425e();
    }

    /* renamed from: c */
    public final void m13423c() {
        this.f17207d.setTextColor(isChecked() ? this.f17210g.m13478b() : this.f17210g.m13477a());
        this.f17207d.setTextSize(this.f17210g.m13480d());
        this.f17207d.setText(this.f17210g.m13479c());
        this.f17207d.setGravity(17);
        this.f17207d.setEllipsize(TextUtils.TruncateAt.END);
        this.f17207d.setTypeface(AbstractC11916b.m26459c());
        m13425e();
    }

    /* renamed from: d */
    public final void m13424d() throws Resources.NotFoundException {
        setMinimumHeight(AbstractC8037c.m12188b(this.f17206c, 25.0f));
        if (this.f17207d == null) {
            this.f17207d = new TextView(this.f17206c);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.gravity = 17;
            this.f17207d.setLayoutParams(layoutParams);
            addView(this.f17207d);
        }
        m13423c();
        m13422b();
        m13421a();
    }

    /* renamed from: e */
    public final void m13425e() {
        if ((this.f17212i ? this.f17209f.m13469f() : this.f17209f.m13468e()) == 0) {
            this.f17207d.setCompoundDrawablePadding(0);
            return;
        }
        if (!TextUtils.isEmpty(this.f17210g.m13479c()) && this.f17207d.getCompoundDrawablePadding() != this.f17209f.m13467d()) {
            this.f17207d.setCompoundDrawablePadding(this.f17209f.m13467d());
        } else if (TextUtils.isEmpty(this.f17210g.m13479c())) {
            this.f17207d.setCompoundDrawablePadding(0);
        }
    }

    /* renamed from: f */
    public XTabView m13426f(int i10) {
        if (i10 == 0) {
            m13428h();
            return this;
        }
        if (i10 <= 0) {
            setBackground(null);
            return this;
        }
        super.setBackgroundResource(i10);
        return this;
    }

    /* renamed from: g */
    public XTabView m13427g(C8290a c8290a) {
        if (c8290a != null) {
            this.f17211h = c8290a;
        }
        m13421a();
        return this;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    public C8290a getBadge() {
        return this.f17211h;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    public InterfaceC8300a getBadgeView() {
        return this.f17208e;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    public C8291b getIcon() {
        return this.f17209f;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    @Deprecated
    public ImageView getIconView() {
        return null;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    public C8292c getTitle() {
        return this.f17210g;
    }

    @Override // com.xuexiang.xui.widget.tabbar.vertical.TabView
    public TextView getTitleView() {
        return this.f17207d;
    }

    /* renamed from: h */
    public final void m13428h() {
        Drawable background = getBackground();
        Drawable drawable = this.f17213j;
        if (background != drawable) {
            setBackground(drawable);
        }
    }

    /* renamed from: i */
    public XTabView m13429i(C8291b c8291b) throws Resources.NotFoundException {
        if (c8291b != null) {
            this.f17209f = c8291b;
        }
        m13422b();
        return this;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f17212i;
    }

    /* renamed from: j */
    public XTabView m13430j(C8292c c8292c) {
        if (c8292c != null) {
            this.f17210g = c8292c;
        }
        m13423c();
        return this;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        m13426f(i10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) throws Resources.NotFoundException {
        this.f17212i = z10;
        setSelected(z10);
        refreshDrawableState();
        this.f17207d.setTextColor(z10 ? this.f17210g.m13478b() : this.f17210g.m13477a());
        m13422b();
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f17207d.setPadding(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        this.f17207d.setPaddingRelative(i10, i11, i12, i13);
    }

    @Override // android.widget.Checkable
    public void toggle() throws Resources.NotFoundException {
        setChecked(!this.f17212i);
    }
}
