package p000a.p005b.p012g.p013i;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p031h.p033c.C0192a;
import p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b;
import p000a.p031h.p043j.AbstractC0248b;

/* renamed from: a.b.g.i.a */
/* loaded from: classes.dex */
public class C0048a implements InterfaceMenuItemC0215b {

    /* renamed from: a */
    public CharSequence f355a;

    /* renamed from: b */
    public CharSequence f356b;

    /* renamed from: c */
    public Intent f357c;

    /* renamed from: d */
    public char f358d;

    /* renamed from: f */
    public char f360f;

    /* renamed from: h */
    public Drawable f362h;

    /* renamed from: i */
    public Context f363i;

    /* renamed from: j */
    public CharSequence f364j;

    /* renamed from: k */
    public CharSequence f365k;

    /* renamed from: e */
    public int f359e = 4096;

    /* renamed from: g */
    public int f361g = 4096;

    /* renamed from: l */
    public ColorStateList f366l = null;

    /* renamed from: m */
    public PorterDuff.Mode f367m = null;

    /* renamed from: n */
    public boolean f368n = false;

    /* renamed from: o */
    public boolean f369o = false;

    /* renamed from: p */
    public int f370p = 16;

    public C0048a(Context context, int i, int i2, int i3, CharSequence charSequence) {
        this.f363i = context;
        this.f355a = charSequence;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b
    /* renamed from: a */
    public AbstractC0248b mo163a() {
        return null;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b
    /* renamed from: b */
    public InterfaceMenuItemC0215b mo164b(AbstractC0248b abstractC0248b) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void m165c() {
        Drawable drawable = this.f362h;
        if (drawable != null) {
            if (this.f368n || this.f369o) {
                this.f362h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f362h = drawableMutate;
                if (this.f368n) {
                    drawableMutate.setTintList(this.f366l);
                }
                if (this.f369o) {
                    this.f362h.setTintMode(this.f367m);
                }
            }
        }
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f361g;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f360f;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f364j;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f362h;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f366l;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f367m;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f357c;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f359e;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f358d;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f355a;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f356b;
        return charSequence != null ? charSequence : this.f355a;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f365k;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f370p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f370p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f370p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f370p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f360f = Character.toLowerCase(c2);
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f360f = Character.toLowerCase(c2);
        this.f361g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f370p = (z ? 1 : 0) | (this.f370p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f370p = (z ? 2 : 0) | (this.f370p & (-3));
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public InterfaceMenuItemC0215b setContentDescription(CharSequence charSequence) {
        this.f364j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f364j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f370p = (z ? 16 : 0) | (this.f370p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        Context context = this.f363i;
        Object obj = C0192a.f1425a;
        this.f362h = C0192a.c.m739b(context, i);
        m165c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f362h = drawable;
        m165c();
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f366l = colorStateList;
        this.f368n = true;
        m165c();
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f367m = mode;
        this.f369o = true;
        m165c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f357c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f358d = c2;
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        this.f358d = c2;
        this.f359e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f358d = c2;
        this.f360f = Character.toLowerCase(c3);
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f358d = c2;
        this.f359e = KeyEvent.normalizeMetaState(i);
        this.f360f = Character.toLowerCase(c3);
        this.f361g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f355a = this.f363i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f355a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f356b = charSequence;
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public InterfaceMenuItemC0215b setTooltipText(CharSequence charSequence) {
        this.f365k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f365k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f370p = (this.f370p & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
