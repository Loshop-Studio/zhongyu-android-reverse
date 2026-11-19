package p000a.p005b.p012g.p013i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Objects;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b;
import p000a.p031h.p043j.AbstractC0248b;

/* renamed from: a.b.g.i.i */
/* loaded from: classes.dex */
public final class C0056i implements InterfaceMenuItemC0215b {

    /* renamed from: A */
    public AbstractC0248b f460A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f461B;

    /* renamed from: D */
    public ContextMenu.ContextMenuInfo f463D;

    /* renamed from: a */
    public final int f464a;

    /* renamed from: b */
    public final int f465b;

    /* renamed from: c */
    public final int f466c;

    /* renamed from: d */
    public final int f467d;

    /* renamed from: e */
    public CharSequence f468e;

    /* renamed from: f */
    public CharSequence f469f;

    /* renamed from: g */
    public Intent f470g;

    /* renamed from: h */
    public char f471h;

    /* renamed from: j */
    public char f473j;

    /* renamed from: l */
    public Drawable f475l;

    /* renamed from: n */
    public C0054g f477n;

    /* renamed from: o */
    public SubMenuC0065r f478o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f479p;

    /* renamed from: q */
    public CharSequence f480q;

    /* renamed from: r */
    public CharSequence f481r;

    /* renamed from: y */
    public int f488y;

    /* renamed from: z */
    public View f489z;

    /* renamed from: i */
    public int f472i = 4096;

    /* renamed from: k */
    public int f474k = 4096;

    /* renamed from: m */
    public int f476m = 0;

    /* renamed from: s */
    public ColorStateList f482s = null;

    /* renamed from: t */
    public PorterDuff.Mode f483t = null;

    /* renamed from: u */
    public boolean f484u = false;

    /* renamed from: v */
    public boolean f485v = false;

    /* renamed from: w */
    public boolean f486w = false;

    /* renamed from: x */
    public int f487x = 16;

    /* renamed from: C */
    public boolean f462C = false;

    /* renamed from: a.b.g.i.i$a */
    public class a implements AbstractC0248b.a {
        public a() {
        }
    }

    public C0056i(C0054g c0054g, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f488y = 0;
        this.f477n = c0054g;
        this.f464a = i2;
        this.f465b = i;
        this.f466c = i3;
        this.f467d = i4;
        this.f468e = charSequence;
        this.f488y = i5;
    }

    /* renamed from: c */
    public static void m223c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b
    /* renamed from: a */
    public AbstractC0248b mo163a() {
        return this.f460A;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b
    /* renamed from: b */
    public InterfaceMenuItemC0215b mo164b(AbstractC0248b abstractC0248b) {
        AbstractC0248b abstractC0248b2 = this.f460A;
        if (abstractC0248b2 != null) {
            abstractC0248b2.f1582a = null;
        }
        this.f489z = null;
        this.f460A = abstractC0248b;
        this.f477n.m212q(true);
        AbstractC0248b abstractC0248b3 = this.f460A;
        if (abstractC0248b3 != null) {
            abstractC0248b3.mo241h(new a());
        }
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f488y & 8) == 0) {
            return false;
        }
        if (this.f489z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f461B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f477n.mo199d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m224d(Drawable drawable) {
        if (drawable != null && this.f486w && (this.f484u || this.f485v)) {
            drawable = drawable.mutate();
            if (this.f484u) {
                drawable.setTintList(this.f482s);
            }
            if (this.f485v) {
                drawable.setTintMode(this.f483t);
            }
            this.f486w = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public char m225e() {
        return this.f477n.mo209n() ? this.f473j : this.f471h;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m226f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f461B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f477n.mo201f(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m226f() {
        AbstractC0248b abstractC0248b;
        if ((this.f488y & 8) == 0) {
            return false;
        }
        if (this.f489z == null && (abstractC0248b = this.f460A) != null) {
            this.f489z = abstractC0248b.mo239d(this);
        }
        return this.f489z != null;
    }

    /* renamed from: g */
    public boolean m227g() {
        return (this.f487x & 32) == 32;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public View getActionView() {
        View view = this.f489z;
        if (view != null) {
            return view;
        }
        AbstractC0248b abstractC0248b = this.f460A;
        if (abstractC0248b == null) {
            return null;
        }
        View viewMo239d = abstractC0248b.mo239d(this);
        this.f489z = viewMo239d;
        return viewMo239d;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f474k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f473j;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f480q;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f465b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f475l;
        if (drawable != null) {
            return m224d(drawable);
        }
        int i = this.f476m;
        if (i == 0) {
            return null;
        }
        Drawable drawableM129a = C0034a.m129a(this.f477n.f433a, i);
        this.f476m = 0;
        this.f475l = drawableM129a;
        return m224d(drawableM129a);
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f482s;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f483t;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f470g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f464a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f463D;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f472i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f471h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f466c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f478o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f468e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f469f;
        return charSequence != null ? charSequence : this.f468e;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f481r;
    }

    /* renamed from: h */
    public boolean m228h() {
        return (this.f487x & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f478o != null;
    }

    /* renamed from: i */
    public InterfaceMenuItemC0215b m229i(View view) {
        int i;
        this.f489z = view;
        this.f460A = null;
        if (view != null && view.getId() == -1 && (i = this.f464a) > 0) {
            view.setId(i);
        }
        this.f477n.m211p();
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f462C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f487x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f487x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f487x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0248b abstractC0248b = this.f460A;
        return (abstractC0248b == null || !abstractC0248b.mo240g()) ? (this.f487x & 8) == 0 : (this.f487x & 8) == 0 && this.f460A.mo238b();
    }

    /* renamed from: j */
    public void m230j(boolean z) {
        int i = this.f487x;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f487x = i2;
        if (i != i2) {
            this.f477n.m212q(false);
        }
    }

    /* renamed from: k */
    public void m231k(boolean z) {
        this.f487x = z ? this.f487x | 32 : this.f487x & (-33);
    }

    /* renamed from: l */
    public boolean m232l(boolean z) {
        int i = this.f487x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f487x = i2;
        return i != i2;
    }

    /* renamed from: m */
    public boolean m233m() {
        return this.f477n.mo210o() && m225e() != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setActionView(int i) {
        Context context = this.f477n.f433a;
        m229i(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        m229i(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f473j == c2) {
            return this;
        }
        this.f473j = Character.toLowerCase(c2);
        this.f477n.m212q(false);
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f473j == c2 && this.f474k == i) {
            return this;
        }
        this.f473j = Character.toLowerCase(c2);
        this.f474k = KeyEvent.normalizeMetaState(i);
        this.f477n.m212q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f487x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f487x = i2;
        if (i != i2) {
            this.f477n.m212q(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f487x & 4) != 0) {
            C0054g c0054g = this.f477n;
            Objects.requireNonNull(c0054g);
            int groupId = getGroupId();
            int size = c0054g.f438f.size();
            c0054g.m221z();
            for (int i = 0; i < size; i++) {
                C0056i c0056i = c0054g.f438f.get(i);
                if (c0056i.f465b == groupId && c0056i.m228h() && c0056i.isCheckable()) {
                    c0056i.m230j(c0056i == this);
                }
            }
            c0054g.m220y();
        } else {
            m230j(z);
        }
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public InterfaceMenuItemC0215b setContentDescription(CharSequence charSequence) {
        this.f480q = charSequence;
        this.f477n.m212q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f480q = charSequence;
        this.f477n.m212q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f487x = z ? this.f487x | 16 : this.f487x & (-17);
        this.f477n.m212q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f475l = null;
        this.f476m = i;
        this.f486w = true;
        this.f477n.m212q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f476m = 0;
        this.f475l = drawable;
        this.f486w = true;
        this.f477n.m212q(false);
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f482s = colorStateList;
        this.f484u = true;
        this.f486w = true;
        this.f477n.m212q(false);
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f483t = mode;
        this.f485v = true;
        this.f486w = true;
        this.f477n.m212q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f470g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f471h == c2) {
            return this;
        }
        this.f471h = c2;
        this.f477n.m212q(false);
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        if (this.f471h == c2 && this.f472i == i) {
            return this;
        }
        this.f471h = c2;
        this.f472i = KeyEvent.normalizeMetaState(i);
        this.f477n.m212q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f461B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f479p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f471h = c2;
        this.f473j = Character.toLowerCase(c3);
        this.f477n.m212q(false);
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f471h = c2;
        this.f472i = KeyEvent.normalizeMetaState(i);
        this.f473j = Character.toLowerCase(c3);
        this.f474k = KeyEvent.normalizeMetaState(i2);
        this.f477n.m212q(false);
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f488y = i;
        this.f477n.m211p();
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.f477n.f433a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f468e = charSequence;
        this.f477n.m212q(false);
        SubMenuC0065r subMenuC0065r = this.f478o;
        if (subMenuC0065r != null) {
            subMenuC0065r.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f469f = charSequence;
        this.f477n.m212q(false);
        return this;
    }

    @Override // p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b, android.view.MenuItem
    public InterfaceMenuItemC0215b setTooltipText(CharSequence charSequence) {
        this.f481r = charSequence;
        this.f477n.m212q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f481r = charSequence;
        this.f477n.m212q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m232l(z)) {
            C0054g c0054g = this.f477n;
            c0054g.f440h = true;
            c0054g.m212q(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f468e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
