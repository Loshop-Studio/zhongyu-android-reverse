package p000a.p005b.p012g.p013i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p000a.p021e.C0136h;
import p000a.p031h.p037e.p038a.InterfaceMenuC0214a;
import p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b;
import p000a.p031h.p037e.p038a.InterfaceSubMenuC0216c;

/* renamed from: a.b.g.i.o */
/* loaded from: classes.dex */
public class MenuC0062o extends AbstractC0050c implements Menu {

    /* renamed from: d */
    public final InterfaceMenuC0214a f515d;

    public MenuC0062o(Context context, InterfaceMenuC0214a interfaceMenuC0214a) {
        super(context);
        if (interfaceMenuC0214a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f515d = interfaceMenuC0214a;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m169c(this.f515d.add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m169c(this.f515d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m169c(this.f515d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m169c(this.f515d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f515d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m169c(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m170d(this.f515d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m170d(this.f515d.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m170d(this.f515d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m170d(this.f515d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        C0136h<InterfaceMenuItemC0215b, MenuItem> c0136h = this.f380b;
        if (c0136h != null) {
            c0136h.clear();
        }
        C0136h<InterfaceSubMenuC0216c, SubMenu> c0136h2 = this.f381c;
        if (c0136h2 != null) {
            c0136h2.clear();
        }
        this.f515d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f515d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m169c(this.f515d.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m169c(this.f515d.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f515d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f515d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f515d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f515d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        if (this.f380b != null) {
            int i2 = 0;
            while (true) {
                C0136h<InterfaceMenuItemC0215b, MenuItem> c0136h = this.f380b;
                if (i2 >= c0136h.f950d) {
                    break;
                }
                if (c0136h.m514h(i2).getGroupId() == i) {
                    this.f380b.m515i(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f515d.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        if (this.f380b != null) {
            int i2 = 0;
            while (true) {
                C0136h<InterfaceMenuItemC0215b, MenuItem> c0136h = this.f380b;
                if (i2 >= c0136h.f950d) {
                    break;
                }
                if (c0136h.m514h(i2).getItemId() == i) {
                    this.f380b.m515i(i2);
                    break;
                }
                i2++;
            }
        }
        this.f515d.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f515d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f515d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f515d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f515d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f515d.size();
    }
}
