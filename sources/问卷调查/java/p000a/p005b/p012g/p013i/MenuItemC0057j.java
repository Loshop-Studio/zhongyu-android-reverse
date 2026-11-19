package p000a.p005b.p012g.p013i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p000a.p005b.p012g.InterfaceC0041b;
import p000a.p031h.p037e.p038a.InterfaceMenuItemC0215b;
import p000a.p031h.p043j.AbstractC0248b;

/* renamed from: a.b.g.i.j */
/* loaded from: classes.dex */
public class MenuItemC0057j extends AbstractC0050c implements MenuItem {

    /* renamed from: d */
    public final InterfaceMenuItemC0215b f491d;

    /* renamed from: e */
    public Method f492e;

    /* renamed from: a.b.g.i.j$a */
    public class a extends AbstractC0248b {

        /* renamed from: b */
        public final ActionProvider f493b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f493b = actionProvider;
        }

        @Override // p000a.p031h.p043j.AbstractC0248b
        /* renamed from: a */
        public boolean mo234a() {
            return this.f493b.hasSubMenu();
        }

        @Override // p000a.p031h.p043j.AbstractC0248b
        /* renamed from: c */
        public View mo235c() {
            return this.f493b.onCreateActionView();
        }

        @Override // p000a.p031h.p043j.AbstractC0248b
        /* renamed from: e */
        public boolean mo236e() {
            return this.f493b.onPerformDefaultAction();
        }

        @Override // p000a.p031h.p043j.AbstractC0248b
        /* renamed from: f */
        public void mo237f(SubMenu subMenu) {
            this.f493b.onPrepareSubMenu(MenuItemC0057j.this.m170d(subMenu));
        }
    }

    /* renamed from: a.b.g.i.j$b */
    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        public AbstractC0248b.a f495d;

        public b(MenuItemC0057j menuItemC0057j, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p000a.p031h.p043j.AbstractC0248b
        /* renamed from: b */
        public boolean mo238b() {
            return this.f493b.isVisible();
        }

        @Override // p000a.p031h.p043j.AbstractC0248b
        /* renamed from: d */
        public View mo239d(MenuItem menuItem) {
            return this.f493b.onCreateActionView(menuItem);
        }

        @Override // p000a.p031h.p043j.AbstractC0248b
        /* renamed from: g */
        public boolean mo240g() {
            return this.f493b.overridesItemVisibility();
        }

        @Override // p000a.p031h.p043j.AbstractC0248b
        /* renamed from: h */
        public void mo241h(AbstractC0248b.a aVar) {
            this.f495d = aVar;
            this.f493b.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC0248b.a aVar = this.f495d;
            if (aVar != null) {
                C0054g c0054g = C0056i.this.f477n;
                c0054g.f440h = true;
                c0054g.m212q(true);
            }
        }
    }

    /* renamed from: a.b.g.i.j$c */
    public static class c extends FrameLayout implements InterfaceC0041b {

        /* renamed from: b */
        public final CollapsibleActionView f496b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view) {
            super(view.getContext());
            this.f496b = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // p000a.p005b.p012g.InterfaceC0041b
        /* renamed from: a */
        public void mo150a() {
            this.f496b.onActionViewExpanded();
        }

        @Override // p000a.p005b.p012g.InterfaceC0041b
        /* renamed from: e */
        public void mo151e() {
            this.f496b.onActionViewCollapsed();
        }
    }

    /* renamed from: a.b.g.i.j$d */
    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f497a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f497a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f497a.onMenuItemActionCollapse(MenuItemC0057j.this.m169c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f497a.onMenuItemActionExpand(MenuItemC0057j.this.m169c(menuItem));
        }
    }

    /* renamed from: a.b.g.i.j$e */
    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f499a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f499a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f499a.onMenuItemClick(MenuItemC0057j.this.m169c(menuItem));
        }
    }

    public MenuItemC0057j(Context context, InterfaceMenuItemC0215b interfaceMenuItemC0215b) {
        super(context);
        if (interfaceMenuItemC0215b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f491d = interfaceMenuItemC0215b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f491d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f491d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0248b abstractC0248bMo163a = this.f491d.mo163a();
        if (abstractC0248bMo163a instanceof a) {
            return ((a) abstractC0248bMo163a).f493b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f491d.getActionView();
        return actionView instanceof c ? (View) ((c) actionView).f496b : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f491d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f491d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f491d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f491d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f491d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f491d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f491d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f491d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f491d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f491d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f491d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f491d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f491d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m170d(this.f491d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f491d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f491d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f491d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f491d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f491d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f491d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f491d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f491d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f491d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, this.f379a, actionProvider);
        InterfaceMenuItemC0215b interfaceMenuItemC0215b = this.f491d;
        if (actionProvider == null) {
            bVar = null;
        }
        interfaceMenuItemC0215b.mo164b(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f491d.setActionView(i);
        View actionView = this.f491d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f491d.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f491d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f491d.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f491d.setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f491d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f491d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f491d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f491d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f491d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f491d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f491d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f491d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f491d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f491d.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        this.f491d.setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f491d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f491d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f491d.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f491d.setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f491d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f491d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f491d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f491d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f491d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f491d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f491d.setVisible(z);
    }
}
