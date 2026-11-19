package p000a.p005b.p012g.p013i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p031h.p037e.p038a.InterfaceSubMenuC0216c;

/* renamed from: a.b.g.i.s */
/* loaded from: classes.dex */
public class SubMenuC0066s extends MenuC0062o implements SubMenu {

    /* renamed from: e */
    public final InterfaceSubMenuC0216c f540e;

    public SubMenuC0066s(Context context, InterfaceSubMenuC0216c interfaceSubMenuC0216c) {
        super(context, interfaceSubMenuC0216c);
        this.f540e = interfaceSubMenuC0216c;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f540e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m169c(this.f540e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f540e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f540e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f540e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f540e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f540e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f540e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f540e.setIcon(drawable);
        return this;
    }
}
