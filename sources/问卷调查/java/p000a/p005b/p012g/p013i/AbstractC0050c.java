package p000a.p005b.p012g.p013i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p000a.p021e.C0136h;
import p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b;
import p000a.p031h.p037e.p038a.InterfaceSubMenuC0216c;

/* renamed from: a.b.g.i.c */
/* loaded from: classes.dex */
public abstract class AbstractC0050c {

    /* renamed from: a */
    public final Context f379a;

    /* renamed from: b */
    public C0136h<InterfaceMenuItemC0215b, MenuItem> f380b;

    /* renamed from: c */
    public C0136h<InterfaceSubMenuC0216c, SubMenu> f381c;

    public AbstractC0050c(Context context) {
        this.f379a = context;
    }

    /* renamed from: c */
    public final MenuItem m169c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0215b)) {
            return menuItem;
        }
        InterfaceMenuItemC0215b interfaceMenuItemC0215b = (InterfaceMenuItemC0215b) menuItem;
        if (this.f380b == null) {
            this.f380b = new C0136h<>();
        }
        MenuItem orDefault = this.f380b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        MenuItemC0057j menuItemC0057j = new MenuItemC0057j(this.f379a, interfaceMenuItemC0215b);
        this.f380b.put(interfaceMenuItemC0215b, menuItemC0057j);
        return menuItemC0057j;
    }

    /* renamed from: d */
    public final SubMenu m170d(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC0216c)) {
            return subMenu;
        }
        InterfaceSubMenuC0216c interfaceSubMenuC0216c = (InterfaceSubMenuC0216c) subMenu;
        if (this.f381c == null) {
            this.f381c = new C0136h<>();
        }
        SubMenu subMenu2 = this.f381c.get(interfaceSubMenuC0216c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC0066s subMenuC0066s = new SubMenuC0066s(this.f379a, interfaceSubMenuC0216c);
        this.f381c.put(interfaceSubMenuC0216c, subMenuC0066s);
        return subMenuC0066s;
    }
}
