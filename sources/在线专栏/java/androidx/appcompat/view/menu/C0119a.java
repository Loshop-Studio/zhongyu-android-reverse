package androidx.appcompat.view.menu;

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
import androidx.core.content.C0332a;
import androidx.core.view.AbstractC0337b;
import p156u.C3403a;
import p160v.InterfaceMenuItemC3415b;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public class C0119a implements InterfaceMenuItemC3415b {

    /* renamed from: a */
    private final int f523a;

    /* renamed from: b */
    private final int f524b;

    /* renamed from: c */
    private final int f525c;

    /* renamed from: d */
    private CharSequence f526d;

    /* renamed from: e */
    private CharSequence f527e;

    /* renamed from: f */
    private Intent f528f;

    /* renamed from: g */
    private char f529g;

    /* renamed from: i */
    private char f531i;

    /* renamed from: k */
    private Drawable f533k;

    /* renamed from: l */
    private Context f534l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f535m;

    /* renamed from: n */
    private CharSequence f536n;

    /* renamed from: o */
    private CharSequence f537o;

    /* renamed from: h */
    private int f530h = 4096;

    /* renamed from: j */
    private int f532j = 4096;

    /* renamed from: p */
    private ColorStateList f538p = null;

    /* renamed from: q */
    private PorterDuff.Mode f539q = null;

    /* renamed from: r */
    private boolean f540r = false;

    /* renamed from: s */
    private boolean f541s = false;

    /* renamed from: t */
    private int f542t = 16;

    public C0119a(Context context, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        this.f534l = context;
        this.f523a = i5;
        this.f524b = i4;
        this.f525c = i7;
        this.f526d = charSequence;
    }

    /* renamed from: c */
    private void m423c() {
        Drawable drawable = this.f533k;
        if (drawable != null) {
            if (this.f540r || this.f541s) {
                Drawable drawableM10401r = C3403a.m10401r(drawable);
                this.f533k = drawableM10401r;
                Drawable drawableMutate = drawableM10401r.mutate();
                this.f533k = drawableMutate;
                if (this.f540r) {
                    C3403a.m10398o(drawableMutate, this.f538p);
                }
                if (this.f541s) {
                    C3403a.m10399p(this.f533k, this.f539q);
                }
            }
        }
    }

    @Override // p160v.InterfaceMenuItemC3415b
    /* renamed from: a */
    public InterfaceMenuItemC3415b mo424a(AbstractC0337b abstractC0337b) {
        throw new UnsupportedOperationException();
    }

    @Override // p160v.InterfaceMenuItemC3415b
    /* renamed from: b */
    public AbstractC0337b mo425b() {
        return null;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC3415b setActionView(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC3415b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC3415b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f532j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f531i;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f536n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f524b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f533k;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f538p;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f539q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f528f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f523a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f530h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f529g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f525c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f526d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f527e;
        return charSequence != null ? charSequence : this.f526d;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f537o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f542t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f542t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f542t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f542t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        this.f531i = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        this.f542t = (z3 ? 1 : 0) | (this.f542t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        this.f542t = (z3 ? 2 : 0) | (this.f542t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        this.f542t = (z3 ? 16 : 0) | (this.f542t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f533k = drawable;
        m423c();
        return this;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f538p = colorStateList;
        this.f540r = true;
        m423c();
        return this;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f539q = mode;
        this.f541s = true;
        m423c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f528f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        this.f529g = c4;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f535m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f529g = c4;
        this.f531i = Character.toLowerCase(c5);
        return this;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public void setShowAsAction(int i4) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f526d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f527e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        this.f542t = (this.f542t & 8) | (z3 ? 0 : 8);
        return this;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        this.f531i = Character.toLowerCase(c4);
        this.f532j = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC3415b setContentDescription(CharSequence charSequence) {
        this.f536n = charSequence;
        return this;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c4, int i4) {
        this.f529g = c4;
        this.f530h = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        this.f526d = this.f534l.getResources().getString(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC3415b setTooltipText(CharSequence charSequence) {
        this.f537o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f533k = C0332a.m1806d(this.f534l, i4);
        m423c();
        return this;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f529g = c4;
        this.f530h = KeyEvent.normalizeMetaState(i4);
        this.f531i = Character.toLowerCase(c5);
        this.f532j = KeyEvent.normalizeMetaState(i5);
        return this;
    }
}
