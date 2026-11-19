package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p160v.InterfaceSubMenuC3416c;

/* renamed from: androidx.appcompat.view.menu.s */
/* loaded from: classes.dex */
class SubMenuC0137s extends MenuC0133o implements SubMenu {

    /* renamed from: e */
    private final InterfaceSubMenuC3416c f696e;

    SubMenuC0137s(Context context, InterfaceSubMenuC3416c interfaceSubMenuC3416c) {
        super(context, interfaceSubMenuC3416c);
        this.f696e = interfaceSubMenuC3416c;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f696e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m438c(this.f696e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i4) {
        this.f696e.setHeaderIcon(i4);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i4) {
        this.f696e.setHeaderTitle(i4);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f696e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i4) {
        this.f696e.setIcon(i4);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f696e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f696e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f696e.setIcon(drawable);
        return this;
    }
}
