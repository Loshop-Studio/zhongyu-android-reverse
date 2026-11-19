package p000a.p005b.p012g.p013i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: a.b.g.i.r */
/* loaded from: classes.dex */
public class SubMenuC0065r extends C0054g implements SubMenu {

    /* renamed from: A */
    public C0056i f538A;

    /* renamed from: z */
    public C0054g f539z;

    public SubMenuC0065r(Context context, C0054g c0054g, C0056i c0056i) {
        super(context);
        this.f539z = c0054g;
        this.f538A = c0056i;
    }

    @Override // p000a.p005b.p012g.p013i.C0054g
    /* renamed from: d */
    public boolean mo199d(C0056i c0056i) {
        return this.f539z.mo199d(c0056i);
    }

    @Override // p000a.p005b.p012g.p013i.C0054g
    /* renamed from: e */
    public boolean mo200e(C0054g c0054g, MenuItem menuItem) {
        return super.mo200e(c0054g, menuItem) || this.f539z.mo200e(c0054g, menuItem);
    }

    @Override // p000a.p005b.p012g.p013i.C0054g
    /* renamed from: f */
    public boolean mo201f(C0056i c0056i) {
        return this.f539z.mo201f(c0056i);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f538A;
    }

    @Override // p000a.p005b.p012g.p013i.C0054g
    /* renamed from: j */
    public String mo205j() {
        C0056i c0056i = this.f538A;
        int i = c0056i != null ? c0056i.f464a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // p000a.p005b.p012g.p013i.C0054g
    /* renamed from: k */
    public C0054g mo206k() {
        return this.f539z.mo206k();
    }

    @Override // p000a.p005b.p012g.p013i.C0054g
    /* renamed from: m */
    public boolean mo208m() {
        return this.f539z.mo208m();
    }

    @Override // p000a.p005b.p012g.p013i.C0054g
    /* renamed from: n */
    public boolean mo209n() {
        return this.f539z.mo209n();
    }

    @Override // p000a.p005b.p012g.p013i.C0054g
    /* renamed from: o */
    public boolean mo210o() {
        return this.f539z.mo210o();
    }

    @Override // p000a.p005b.p012g.p013i.C0054g, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f539z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        m219x(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        m219x(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        m219x(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f538A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f538A.setIcon(drawable);
        return this;
    }

    @Override // p000a.p005b.p012g.p013i.C0054g, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f539z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        m219x(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m219x(0, charSequence, 0, null, null);
        return this;
    }
}
