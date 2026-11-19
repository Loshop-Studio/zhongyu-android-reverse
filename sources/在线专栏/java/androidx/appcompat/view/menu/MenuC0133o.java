package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p160v.InterfaceMenuC3414a;

/* renamed from: androidx.appcompat.view.menu.o */
/* loaded from: classes.dex */
public class MenuC0133o extends AbstractC0121c implements Menu {

    /* renamed from: d */
    private final InterfaceMenuC3414a f672d;

    public MenuC0133o(Context context, InterfaceMenuC3414a interfaceMenuC3414a) {
        super(context);
        if (interfaceMenuC3414a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f672d = interfaceMenuC3414a;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m438c(this.f672d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f672d.addIntentOptions(i4, i5, i6, componentName, intentArr, intent, i7, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                menuItemArr[i8] = m438c(menuItemArr2[i8]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m439d(this.f672d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m440e();
        this.f672d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f672d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i4) {
        return m438c(this.f672d.findItem(i4));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i4) {
        return m438c(this.f672d.getItem(i4));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f672d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return this.f672d.isShortcutKey(i4, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i4, int i5) {
        return this.f672d.performIdentifierAction(i4, i5);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        return this.f672d.performShortcut(i4, keyEvent, i5);
    }

    @Override // android.view.Menu
    public void removeGroup(int i4) {
        m441f(i4);
        this.f672d.removeGroup(i4);
    }

    @Override // android.view.Menu
    public void removeItem(int i4) {
        m442g(i4);
        this.f672d.removeItem(i4);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i4, boolean z3, boolean z4) {
        this.f672d.setGroupCheckable(i4, z3, z4);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i4, boolean z3) {
        this.f672d.setGroupEnabled(i4, z3);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i4, boolean z3) {
        this.f672d.setGroupVisible(i4, z3);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f672d.setQwertyMode(z3);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f672d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i4) {
        return m438c(this.f672d.add(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4) {
        return m439d(this.f672d.addSubMenu(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return m438c(this.f672d.add(i4, i5, i6, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        return m439d(this.f672d.addSubMenu(i4, i5, i6, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, int i7) {
        return m438c(this.f672d.add(i4, i5, i6, i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return m439d(this.f672d.addSubMenu(i4, i5, i6, i7));
    }
}
