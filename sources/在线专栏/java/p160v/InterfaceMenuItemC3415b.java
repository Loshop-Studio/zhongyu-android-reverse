package p160v;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.AbstractC0337b;

/* renamed from: v.b */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC3415b extends MenuItem {
    /* renamed from: a */
    InterfaceMenuItemC3415b mo424a(AbstractC0337b abstractC0337b);

    /* renamed from: b */
    AbstractC0337b mo425b();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i4);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c4, int i4);

    @Override // android.view.MenuItem
    InterfaceMenuItemC3415b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c4, int i4);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c4, char c5, int i4, int i5);

    @Override // android.view.MenuItem
    void setShowAsAction(int i4);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i4);

    @Override // android.view.MenuItem
    InterfaceMenuItemC3415b setTooltipText(CharSequence charSequence);
}
