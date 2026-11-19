package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0337b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p088g.InterfaceC2621c;
import p160v.InterfaceMenuItemC3415b;

/* renamed from: androidx.appcompat.view.menu.j */
/* loaded from: classes.dex */
public class MenuItemC0128j extends AbstractC0121c implements MenuItem {

    /* renamed from: d */
    private final InterfaceMenuItemC3415b f647d;

    /* renamed from: e */
    private Method f648e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    private class a extends AbstractC0337b {

        /* renamed from: d */
        final ActionProvider f649d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f649d = actionProvider;
        }

        @Override // androidx.core.view.AbstractC0337b
        /* renamed from: a */
        public boolean mo503a() {
            return this.f649d.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC0337b
        /* renamed from: c */
        public View mo504c() {
            return this.f649d.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC0337b
        /* renamed from: e */
        public boolean mo505e() {
            return this.f649d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC0337b
        /* renamed from: f */
        public void mo506f(SubMenu subMenu) {
            this.f649d.onPrepareSubMenu(MenuItemC0128j.this.m439d(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        private AbstractC0337b.b f651f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.AbstractC0337b
        /* renamed from: b */
        public boolean mo507b() {
            return this.f649d.isVisible();
        }

        @Override // androidx.core.view.AbstractC0337b
        /* renamed from: d */
        public View mo508d(MenuItem menuItem) {
            return this.f649d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC0337b
        /* renamed from: g */
        public boolean mo509g() {
            return this.f649d.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC0337b
        /* renamed from: j */
        public void mo510j(AbstractC0337b.b bVar) {
            this.f651f = bVar;
            this.f649d.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z3) {
            AbstractC0337b.b bVar = this.f651f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z3);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    static class c extends FrameLayout implements InterfaceC2621c {

        /* renamed from: a */
        final CollapsibleActionView f653a;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.f653a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        View m511a() {
            return (View) this.f653a;
        }

        @Override // p088g.InterfaceC2621c
        /* renamed from: b */
        public void mo512b() {
            this.f653a.onActionViewExpanded();
        }

        @Override // p088g.InterfaceC2621c
        /* renamed from: c */
        public void mo513c() {
            this.f653a.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f654a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f654a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f654a.onMenuItemActionCollapse(MenuItemC0128j.this.m438c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f654a.onMenuItemActionExpand(MenuItemC0128j.this.m438c(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f656a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f656a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f656a.onMenuItemClick(MenuItemC0128j.this.m438c(menuItem));
        }
    }

    public MenuItemC0128j(Context context, InterfaceMenuItemC3415b interfaceMenuItemC3415b) {
        super(context);
        if (interfaceMenuItemC3415b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f647d = interfaceMenuItemC3415b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f647d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f647d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0337b abstractC0337bMo425b = this.f647d.mo425b();
        if (abstractC0337bMo425b instanceof a) {
            return ((a) abstractC0337bMo425b).f649d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f647d.getActionView();
        return actionView instanceof c ? ((c) actionView).m511a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f647d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f647d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f647d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f647d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f647d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f647d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f647d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f647d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f647d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f647d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f647d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f647d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f647d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m439d(this.f647d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f647d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f647d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f647d.getTooltipText();
    }

    /* renamed from: h */
    public void m502h(boolean z3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.f648e == null) {
                this.f648e = this.f647d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f648e.invoke(this.f647d, Boolean.valueOf(z3));
        } catch (Exception e4) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e4);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f647d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f647d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f647d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f647d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f647d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f647d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f553a, actionProvider);
        InterfaceMenuItemC3415b interfaceMenuItemC3415b = this.f647d;
        if (actionProvider == null) {
            bVar = null;
        }
        interfaceMenuItemC3415b.mo424a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f647d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        this.f647d.setAlphabeticShortcut(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        this.f647d.setCheckable(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        this.f647d.setChecked(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f647d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        this.f647d.setEnabled(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f647d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f647d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f647d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f647d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        this.f647d.setNumericShortcut(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f647d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f647d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f647d.setShortcut(c4, c5);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i4) {
        this.f647d.setShowAsAction(i4);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i4) {
        this.f647d.setShowAsActionFlags(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f647d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f647d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f647d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        return this.f647d.setVisible(z3);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        this.f647d.setAlphabeticShortcut(c4, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f647d.setIcon(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4, int i4) {
        this.f647d.setNumericShortcut(c4, i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f647d.setShortcut(c4, c5, i4, i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        this.f647d.setTitle(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i4) {
        this.f647d.setActionView(i4);
        View actionView = this.f647d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f647d.setActionView(new c(actionView));
        }
        return this;
    }
}
