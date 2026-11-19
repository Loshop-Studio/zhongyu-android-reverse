package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.C0253g;
import p160v.InterfaceMenuItemC3415b;
import p160v.InterfaceSubMenuC3416c;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
abstract class AbstractC0121c {

    /* renamed from: a */
    final Context f553a;

    /* renamed from: b */
    private C0253g<InterfaceMenuItemC3415b, MenuItem> f554b;

    /* renamed from: c */
    private C0253g<InterfaceSubMenuC3416c, SubMenu> f555c;

    AbstractC0121c(Context context) {
        this.f553a = context;
    }

    /* renamed from: c */
    final MenuItem m438c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC3415b)) {
            return menuItem;
        }
        InterfaceMenuItemC3415b interfaceMenuItemC3415b = (InterfaceMenuItemC3415b) menuItem;
        if (this.f554b == null) {
            this.f554b = new C0253g<>();
        }
        MenuItem menuItem2 = this.f554b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0128j menuItemC0128j = new MenuItemC0128j(this.f553a, interfaceMenuItemC3415b);
        this.f554b.put(interfaceMenuItemC3415b, menuItemC0128j);
        return menuItemC0128j;
    }

    /* renamed from: d */
    final SubMenu m439d(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC3416c)) {
            return subMenu;
        }
        InterfaceSubMenuC3416c interfaceSubMenuC3416c = (InterfaceSubMenuC3416c) subMenu;
        if (this.f555c == null) {
            this.f555c = new C0253g<>();
        }
        SubMenu subMenu2 = this.f555c.get(interfaceSubMenuC3416c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC0137s subMenuC0137s = new SubMenuC0137s(this.f553a, interfaceSubMenuC3416c);
        this.f555c.put(interfaceSubMenuC3416c, subMenuC0137s);
        return subMenuC0137s;
    }

    /* renamed from: e */
    final void m440e() {
        C0253g<InterfaceMenuItemC3415b, MenuItem> c0253g = this.f554b;
        if (c0253g != null) {
            c0253g.clear();
        }
        C0253g<InterfaceSubMenuC3416c, SubMenu> c0253g2 = this.f555c;
        if (c0253g2 != null) {
            c0253g2.clear();
        }
    }

    /* renamed from: f */
    final void m441f(int i4) {
        if (this.f554b == null) {
            return;
        }
        int i5 = 0;
        while (i5 < this.f554b.size()) {
            if (this.f554b.keyAt(i5).getGroupId() == i4) {
                this.f554b.removeAt(i5);
                i5--;
            }
            i5++;
        }
    }

    /* renamed from: g */
    final void m442g(int i4) {
        if (this.f554b == null) {
            return;
        }
        for (int i5 = 0; i5 < this.f554b.size(); i5++) {
            if (this.f554b.keyAt(i5).getItemId() == i4) {
                this.f554b.removeAt(i5);
                return;
            }
        }
    }
}
