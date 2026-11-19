package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0125g;

/* renamed from: androidx.appcompat.view.menu.r */
/* loaded from: classes.dex */
public class SubMenuC0136r extends C0125g implements SubMenu {
    private C0127i mItem;
    private C0125g mParentMenu;

    public SubMenuC0136r(Context context, C0125g c0125g, C0127i c0127i) {
        super(context);
        this.mParentMenu = c0125g;
        this.mItem = c0127i;
    }

    @Override // androidx.appcompat.view.menu.C0125g
    public boolean collapseItemActionView(C0127i c0127i) {
        return this.mParentMenu.collapseItemActionView(c0127i);
    }

    @Override // androidx.appcompat.view.menu.C0125g
    boolean dispatchMenuItemSelected(C0125g c0125g, MenuItem menuItem) {
        return super.dispatchMenuItemSelected(c0125g, menuItem) || this.mParentMenu.dispatchMenuItemSelected(c0125g, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0125g
    public boolean expandItemActionView(C0127i c0127i) {
        return this.mParentMenu.expandItemActionView(c0127i);
    }

    @Override // androidx.appcompat.view.menu.C0125g
    public String getActionViewStatesKey() {
        C0127i c0127i = this.mItem;
        int itemId = c0127i != null ? c0127i.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.mItem;
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    @Override // androidx.appcompat.view.menu.C0125g
    public C0125g getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.C0125g
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }

    @Override // androidx.appcompat.view.menu.C0125g
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.C0125g
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    @Override // androidx.appcompat.view.menu.C0125g
    public void setCallback(C0125g.a aVar) {
        this.mParentMenu.setCallback(aVar);
    }

    @Override // androidx.appcompat.view.menu.C0125g, android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.mParentMenu.setGroupDividerEnabled(z3);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.setHeaderViewInt(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0125g, android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.mParentMenu.setQwertyMode(z3);
    }

    @Override // androidx.appcompat.view.menu.C0125g
    public void setShortcutsVisible(boolean z3) {
        this.mParentMenu.setShortcutsVisible(z3);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i4) {
        return (SubMenu) super.setHeaderIconInt(i4);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i4) {
        return (SubMenu) super.setHeaderTitleInt(i4);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i4) {
        this.mItem.setIcon(i4);
        return this;
    }
}
