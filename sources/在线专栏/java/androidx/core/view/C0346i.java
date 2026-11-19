package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p160v.InterfaceMenuItemC3415b;

/* renamed from: androidx.core.view.i */
/* loaded from: classes.dex */
public final class C0346i {
    /* renamed from: a */
    public static MenuItem m1940a(MenuItem menuItem, AbstractC0337b abstractC0337b) {
        if (menuItem instanceof InterfaceMenuItemC3415b) {
            return ((InterfaceMenuItemC3415b) menuItem).mo424a(abstractC0337b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m1941b(MenuItem menuItem, char c4, int i4) {
        if (menuItem instanceof InterfaceMenuItemC3415b) {
            ((InterfaceMenuItemC3415b) menuItem).setAlphabeticShortcut(c4, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c4, i4);
        }
    }

    /* renamed from: c */
    public static void m1942c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC3415b) {
            ((InterfaceMenuItemC3415b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: d */
    public static void m1943d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC3415b) {
            ((InterfaceMenuItemC3415b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: e */
    public static void m1944e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC3415b) {
            ((InterfaceMenuItemC3415b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: f */
    public static void m1945f(MenuItem menuItem, char c4, int i4) {
        if (menuItem instanceof InterfaceMenuItemC3415b) {
            ((InterfaceMenuItemC3415b) menuItem).setNumericShortcut(c4, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c4, i4);
        }
    }

    /* renamed from: g */
    public static void m1946g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC3415b) {
            ((InterfaceMenuItemC3415b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
