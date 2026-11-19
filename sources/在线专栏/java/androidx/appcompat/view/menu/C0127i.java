package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC0132n;
import androidx.core.view.AbstractC0337b;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import p015c.C1045h;
import p073d.C2443a;
import p156u.C3403a;
import p160v.InterfaceMenuItemC3415b;

/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
public final class C0127i implements InterfaceMenuItemC3415b {

    /* renamed from: A */
    private View f615A;

    /* renamed from: B */
    private AbstractC0337b f616B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f617C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f619E;

    /* renamed from: a */
    private final int f620a;

    /* renamed from: b */
    private final int f621b;

    /* renamed from: c */
    private final int f622c;

    /* renamed from: d */
    private final int f623d;

    /* renamed from: e */
    private CharSequence f624e;

    /* renamed from: f */
    private CharSequence f625f;

    /* renamed from: g */
    private Intent f626g;

    /* renamed from: h */
    private char f627h;

    /* renamed from: j */
    private char f629j;

    /* renamed from: l */
    private Drawable f631l;

    /* renamed from: n */
    C0125g f633n;

    /* renamed from: o */
    private SubMenuC0136r f634o;

    /* renamed from: p */
    private Runnable f635p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f636q;

    /* renamed from: r */
    private CharSequence f637r;

    /* renamed from: s */
    private CharSequence f638s;

    /* renamed from: z */
    private int f645z;

    /* renamed from: i */
    private int f628i = 4096;

    /* renamed from: k */
    private int f630k = 4096;

    /* renamed from: m */
    private int f632m = 0;

    /* renamed from: t */
    private ColorStateList f639t = null;

    /* renamed from: u */
    private PorterDuff.Mode f640u = null;

    /* renamed from: v */
    private boolean f641v = false;

    /* renamed from: w */
    private boolean f642w = false;

    /* renamed from: x */
    private boolean f643x = false;

    /* renamed from: y */
    private int f644y = 16;

    /* renamed from: D */
    private boolean f618D = false;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    class a implements AbstractC0337b.b {
        a() {
        }

        @Override // androidx.core.view.AbstractC0337b.b
        public void onActionProviderVisibilityChanged(boolean z3) {
            C0127i c0127i = C0127i.this;
            c0127i.f633n.onItemVisibleChanged(c0127i);
        }
    }

    C0127i(C0125g c0125g, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        this.f633n = c0125g;
        this.f620a = i5;
        this.f621b = i4;
        this.f622c = i6;
        this.f623d = i7;
        this.f624e = charSequence;
        this.f645z = i8;
    }

    /* renamed from: d */
    private static void m476d(StringBuilder sb, int i4, int i5, String str) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m477e(Drawable drawable) {
        if (drawable != null && this.f643x && (this.f641v || this.f642w)) {
            drawable = C3403a.m10401r(drawable).mutate();
            if (this.f641v) {
                C3403a.m10398o(drawable, this.f639t);
            }
            if (this.f642w) {
                C3403a.m10399p(drawable, this.f640u);
            }
            this.f643x = false;
        }
        return drawable;
    }

    /* renamed from: A */
    boolean m478A() {
        return this.f633n.isShortcutsVisible() && m482g() != 0;
    }

    /* renamed from: B */
    public boolean m479B() {
        return (this.f645z & 4) == 4;
    }

    @Override // p160v.InterfaceMenuItemC3415b
    /* renamed from: a */
    public InterfaceMenuItemC3415b mo424a(AbstractC0337b abstractC0337b) {
        AbstractC0337b abstractC0337b2 = this.f616B;
        if (abstractC0337b2 != null) {
            abstractC0337b2.m1848h();
        }
        this.f615A = null;
        this.f616B = abstractC0337b;
        this.f633n.onItemsChanged(true);
        AbstractC0337b abstractC0337b3 = this.f616B;
        if (abstractC0337b3 != null) {
            abstractC0337b3.mo510j(new a());
        }
        return this;
    }

    @Override // p160v.InterfaceMenuItemC3415b
    /* renamed from: b */
    public AbstractC0337b mo425b() {
        return this.f616B;
    }

    /* renamed from: c */
    public void m480c() {
        this.f633n.onItemActionRequestChanged(this);
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f645z & 8) == 0) {
            return false;
        }
        if (this.f615A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f617C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f633n.collapseItemActionView(this);
        }
        return false;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m485j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f617C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f633n.expandItemActionView(this);
        }
        return false;
    }

    /* renamed from: f */
    public int m481f() {
        return this.f623d;
    }

    /* renamed from: g */
    char m482g() {
        return this.f633n.isQwertyMode() ? this.f629j : this.f627h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public View getActionView() {
        View view = this.f615A;
        if (view != null) {
            return view;
        }
        AbstractC0337b abstractC0337b = this.f616B;
        if (abstractC0337b == null) {
            return null;
        }
        View viewMo508d = abstractC0337b.mo508d(this);
        this.f615A = viewMo508d;
        return viewMo508d;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f630k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f629j;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f637r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f621b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f631l;
        if (drawable != null) {
            return m477e(drawable);
        }
        if (this.f632m == 0) {
            return null;
        }
        Drawable drawableM8169d = C2443a.m8169d(this.f633n.getContext(), this.f632m);
        this.f632m = 0;
        this.f631l = drawableM8169d;
        return m477e(drawableM8169d);
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f639t;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f640u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f626g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f620a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f619E;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f628i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f627h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f622c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f634o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f624e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f625f;
        return charSequence != null ? charSequence : this.f624e;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f638s;
    }

    /* renamed from: h */
    String m483h() {
        char cM482g = m482g();
        if (cM482g == 0) {
            return "";
        }
        Resources resources = this.f633n.getContext().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f633n.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C1045h.f5915n));
        }
        int i4 = this.f633n.isQwertyMode() ? this.f630k : this.f628i;
        m476d(sb, i4, ArrayPool.STANDARD_BUFFER_SIZE_BYTES, resources.getString(C1045h.f5911j));
        m476d(sb, i4, 4096, resources.getString(C1045h.f5907f));
        m476d(sb, i4, 2, resources.getString(C1045h.f5906e));
        m476d(sb, i4, 1, resources.getString(C1045h.f5912k));
        m476d(sb, i4, 4, resources.getString(C1045h.f5914m));
        m476d(sb, i4, 8, resources.getString(C1045h.f5910i));
        if (cM482g == '\b') {
            sb.append(resources.getString(C1045h.f5908g));
        } else if (cM482g == '\n') {
            sb.append(resources.getString(C1045h.f5909h));
        } else if (cM482g != ' ') {
            sb.append(cM482g);
        } else {
            sb.append(resources.getString(C1045h.f5913l));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f634o != null;
    }

    /* renamed from: i */
    CharSequence m484i(InterfaceC0132n.a aVar) {
        return (aVar == null || !aVar.prefersCondensedTitle()) ? getTitle() : getTitleCondensed();
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f618D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f644y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f644y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f644y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0337b abstractC0337b = this.f616B;
        return (abstractC0337b == null || !abstractC0337b.mo509g()) ? (this.f644y & 8) == 0 : (this.f644y & 8) == 0 && this.f616B.mo507b();
    }

    /* renamed from: j */
    public boolean m485j() {
        AbstractC0337b abstractC0337b;
        if ((this.f645z & 8) == 0) {
            return false;
        }
        if (this.f615A == null && (abstractC0337b = this.f616B) != null) {
            this.f615A = abstractC0337b.mo508d(this);
        }
        return this.f615A != null;
    }

    /* renamed from: k */
    public boolean m486k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f636q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0125g c0125g = this.f633n;
        if (c0125g.dispatchMenuItemSelected(c0125g, this)) {
            return true;
        }
        Runnable runnable = this.f635p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f626g != null) {
            try {
                this.f633n.getContext().startActivity(this.f626g);
                return true;
            } catch (ActivityNotFoundException e4) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e4);
            }
        }
        AbstractC0337b abstractC0337b = this.f616B;
        return abstractC0337b != null && abstractC0337b.mo505e();
    }

    /* renamed from: l */
    public boolean m487l() {
        return (this.f644y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m488m() {
        return (this.f644y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m489n() {
        return (this.f645z & 1) == 1;
    }

    /* renamed from: o */
    public boolean m490o() {
        return (this.f645z & 2) == 2;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC3415b setActionView(int i4) {
        Context context = this.f633n.getContext();
        setActionView(LayoutInflater.from(context).inflate(i4, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC3415b setActionView(View view) {
        int i4;
        this.f615A = view;
        this.f616B = null;
        if (view != null && view.getId() == -1 && (i4 = this.f620a) > 0) {
            view.setId(i4);
        }
        this.f633n.onItemActionRequestChanged(this);
        return this;
    }

    /* renamed from: r */
    public void m493r(boolean z3) {
        this.f618D = z3;
        this.f633n.onItemsChanged(false);
    }

    /* renamed from: s */
    void m494s(boolean z3) {
        int i4 = this.f644y;
        int i5 = (z3 ? 2 : 0) | (i4 & (-3));
        this.f644y = i5;
        if (i4 != i5) {
            this.f633n.onItemsChanged(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        if (this.f629j == c4) {
            return this;
        }
        this.f629j = Character.toLowerCase(c4);
        this.f633n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        int i4 = this.f644y;
        int i5 = (z3 ? 1 : 0) | (i4 & (-2));
        this.f644y = i5;
        if (i4 != i5) {
            this.f633n.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        if ((this.f644y & 4) != 0) {
            this.f633n.setExclusiveItemChecked(this);
        } else {
            m494s(z3);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f644y |= 16;
        } else {
            this.f644y &= -17;
        }
        this.f633n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f632m = 0;
        this.f631l = drawable;
        this.f643x = true;
        this.f633n.onItemsChanged(false);
        return this;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f639t = colorStateList;
        this.f641v = true;
        this.f643x = true;
        this.f633n.onItemsChanged(false);
        return this;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f640u = mode;
        this.f642w = true;
        this.f643x = true;
        this.f633n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f626g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        if (this.f627h == c4) {
            return this;
        }
        this.f627h = c4;
        this.f633n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f617C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f636q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f627h = c4;
        this.f629j = Character.toLowerCase(c5);
        this.f633n.onItemsChanged(false);
        return this;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f645z = i4;
        this.f633n.onItemActionRequestChanged(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f624e = charSequence;
        this.f633n.onItemsChanged(false);
        SubMenuC0136r subMenuC0136r = this.f634o;
        if (subMenuC0136r != null) {
            subMenuC0136r.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f625f = charSequence;
        this.f633n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        if (m500y(z3)) {
            this.f633n.onItemVisibleChanged(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m495t(boolean z3) {
        this.f644y = (z3 ? 4 : 0) | (this.f644y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f624e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m496u(boolean z3) {
        if (z3) {
            this.f644y |= 32;
        } else {
            this.f644y &= -33;
        }
    }

    /* renamed from: v */
    void m497v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f619E = contextMenuInfo;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC3415b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    /* renamed from: x */
    public void m499x(SubMenuC0136r subMenuC0136r) {
        this.f634o = subMenuC0136r;
        subMenuC0136r.setHeaderTitle(getTitle());
    }

    /* renamed from: y */
    boolean m500y(boolean z3) {
        int i4 = this.f644y;
        int i5 = (z3 ? 0 : 8) | (i4 & (-9));
        this.f644y = i5;
        return i4 != i5;
    }

    /* renamed from: z */
    public boolean m501z() {
        return this.f633n.getOptionalIconsVisible();
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC3415b setContentDescription(CharSequence charSequence) {
        this.f637r = charSequence;
        this.f633n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC3415b setTooltipText(CharSequence charSequence) {
        this.f638s = charSequence;
        this.f633n.onItemsChanged(false);
        return this;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        if (this.f629j == c4 && this.f630k == i4) {
            return this;
        }
        this.f629j = Character.toLowerCase(c4);
        this.f630k = KeyEvent.normalizeMetaState(i4);
        this.f633n.onItemsChanged(false);
        return this;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c4, int i4) {
        if (this.f627h == c4 && this.f628i == i4) {
            return this;
        }
        this.f627h = c4;
        this.f628i = KeyEvent.normalizeMetaState(i4);
        this.f633n.onItemsChanged(false);
        return this;
    }

    @Override // p160v.InterfaceMenuItemC3415b, android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f627h = c4;
        this.f628i = KeyEvent.normalizeMetaState(i4);
        this.f629j = Character.toLowerCase(c5);
        this.f630k = KeyEvent.normalizeMetaState(i5);
        this.f633n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f631l = null;
        this.f632m = i4;
        this.f643x = true;
        this.f633n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        return setTitle(this.f633n.getContext().getString(i4));
    }
}
