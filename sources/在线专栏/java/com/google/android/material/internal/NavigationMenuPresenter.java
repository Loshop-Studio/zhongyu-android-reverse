package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.view.menu.C0127i;
import androidx.appcompat.view.menu.InterfaceC0131m;
import androidx.appcompat.view.menu.InterfaceC0132n;
import androidx.appcompat.view.menu.SubMenuC0136r;
import androidx.core.view.C0340c0;
import androidx.core.view.C0358u;
import androidx.recyclerview.widget.C0598l;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C1371R;
import java.util.ArrayList;
import p016c0.C1050c;

/* loaded from: classes.dex */
public class NavigationMenuPresenter implements InterfaceC0131m {
    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    NavigationMenuAdapter adapter;
    private InterfaceC0131m.a callback;
    boolean hasCustomItemIconSize;
    LinearLayout headerLayout;
    ColorStateList iconTintList;

    /* renamed from: id */
    private int f7397id;
    Drawable itemBackground;
    int itemHorizontalPadding;
    int itemIconPadding;
    int itemIconSize;
    private int itemMaxLines;
    LayoutInflater layoutInflater;
    C0125g menu;
    private NavigationMenuView menuView;
    int paddingSeparator;
    private int paddingTopDefault;
    int textAppearance;
    boolean textAppearanceSet;
    ColorStateList textColor;
    boolean isBehindStatusBar = true;
    private int overScrollMode = -1;
    final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.internal.NavigationMenuPresenter.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z3 = true;
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            C0127i itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean zPerformItemAction = navigationMenuPresenter.menu.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && zPerformItemAction) {
                NavigationMenuPresenter.this.adapter.setCheckedItem(itemData);
            } else {
                z3 = false;
            }
            NavigationMenuPresenter.this.setUpdateSuspended(false);
            if (z3) {
                NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    };

    private static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    private class NavigationMenuAdapter extends RecyclerView.AbstractC0562g<ViewHolder> {
        private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private C0127i checkedItem;
        private final ArrayList<NavigationMenuItem> items = new ArrayList<>();
        private boolean updateSuspended;

        NavigationMenuAdapter() {
            prepareMenuItems();
        }

        private void appendTransparentIconIfMissing(int i4, int i5) {
            while (i4 < i5) {
                ((NavigationMenuTextItem) this.items.get(i4)).needsEmptyIcon = true;
                i4++;
            }
        }

        private void prepareMenuItems() {
            if (this.updateSuspended) {
                return;
            }
            this.updateSuspended = true;
            this.items.clear();
            this.items.add(new NavigationMenuHeaderItem());
            int i4 = -1;
            int size = NavigationMenuPresenter.this.menu.getVisibleItems().size();
            boolean z3 = false;
            int size2 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C0127i c0127i = NavigationMenuPresenter.this.menu.getVisibleItems().get(i5);
                if (c0127i.isChecked()) {
                    setCheckedItem(c0127i);
                }
                if (c0127i.isCheckable()) {
                    c0127i.m495t(false);
                }
                if (c0127i.hasSubMenu()) {
                    SubMenu subMenu = c0127i.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i5 != 0) {
                            this.items.add(new NavigationMenuSeparatorItem(NavigationMenuPresenter.this.paddingSeparator, 0));
                        }
                        this.items.add(new NavigationMenuTextItem(c0127i));
                        int size3 = this.items.size();
                        int size4 = subMenu.size();
                        boolean z4 = false;
                        for (int i6 = 0; i6 < size4; i6++) {
                            C0127i c0127i2 = (C0127i) subMenu.getItem(i6);
                            if (c0127i2.isVisible()) {
                                if (!z4 && c0127i2.getIcon() != null) {
                                    z4 = true;
                                }
                                if (c0127i2.isCheckable()) {
                                    c0127i2.m495t(false);
                                }
                                if (c0127i.isChecked()) {
                                    setCheckedItem(c0127i);
                                }
                                this.items.add(new NavigationMenuTextItem(c0127i2));
                            }
                        }
                        if (z4) {
                            appendTransparentIconIfMissing(size3, this.items.size());
                        }
                    }
                } else {
                    int groupId = c0127i.getGroupId();
                    if (groupId != i4) {
                        size2 = this.items.size();
                        z3 = c0127i.getIcon() != null;
                        if (i5 != 0) {
                            size2++;
                            ArrayList<NavigationMenuItem> arrayList = this.items;
                            int i7 = NavigationMenuPresenter.this.paddingSeparator;
                            arrayList.add(new NavigationMenuSeparatorItem(i7, i7));
                        }
                    } else if (!z3 && c0127i.getIcon() != null) {
                        appendTransparentIconIfMissing(size2, this.items.size());
                        z3 = true;
                    }
                    NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(c0127i);
                    navigationMenuTextItem.needsEmptyIcon = z3;
                    this.items.add(navigationMenuTextItem);
                    i4 = groupId;
                }
            }
            this.updateSuspended = false;
        }

        public Bundle createInstanceState() {
            Bundle bundle = new Bundle();
            C0127i c0127i = this.checkedItem;
            if (c0127i != null) {
                bundle.putInt(STATE_CHECKED_ITEM, c0127i.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.items.size();
            for (int i4 = 0; i4 < size; i4++) {
                NavigationMenuItem navigationMenuItem = this.items.get(i4);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    C0127i menuItem = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                    View actionView = menuItem != null ? menuItem.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItem.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(STATE_ACTION_VIEWS, sparseArray);
            return bundle;
        }

        public C0127i getCheckedItem() {
            return this.checkedItem;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
        public int getItemCount() {
            return this.items.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
        public long getItemId(int i4) {
            return i4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
        public int getItemViewType(int i4) {
            NavigationMenuItem navigationMenuItem = this.items.get(i4);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                return ((NavigationMenuTextItem) navigationMenuItem).getMenuItem().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        int getRowCount() {
            int i4 = NavigationMenuPresenter.this.headerLayout.getChildCount() == 0 ? 0 : 1;
            for (int i5 = 0; i5 < NavigationMenuPresenter.this.adapter.getItemCount(); i5++) {
                if (NavigationMenuPresenter.this.adapter.getItemViewType(i5) == 0) {
                    i4++;
                }
            }
            return i4;
        }

        public void restoreInstanceState(Bundle bundle) {
            C0127i menuItem;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C0127i menuItem2;
            int i4 = bundle.getInt(STATE_CHECKED_ITEM, 0);
            if (i4 != 0) {
                this.updateSuspended = true;
                int size = this.items.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    NavigationMenuItem navigationMenuItem = this.items.get(i5);
                    if ((navigationMenuItem instanceof NavigationMenuTextItem) && (menuItem2 = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem()) != null && menuItem2.getItemId() == i4) {
                        setCheckedItem(menuItem2);
                        break;
                    }
                    i5++;
                }
                this.updateSuspended = false;
                prepareMenuItems();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(STATE_ACTION_VIEWS);
            if (sparseParcelableArray != null) {
                int size2 = this.items.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    NavigationMenuItem navigationMenuItem2 = this.items.get(i6);
                    if ((navigationMenuItem2 instanceof NavigationMenuTextItem) && (menuItem = ((NavigationMenuTextItem) navigationMenuItem2).getMenuItem()) != null && (actionView = menuItem.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItem.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void setCheckedItem(C0127i c0127i) {
            if (this.checkedItem == c0127i || !c0127i.isCheckable()) {
                return;
            }
            C0127i c0127i2 = this.checkedItem;
            if (c0127i2 != null) {
                c0127i2.setChecked(false);
            }
            this.checkedItem = c0127i;
            c0127i.setChecked(true);
        }

        public void setUpdateSuspended(boolean z3) {
            this.updateSuspended = z3;
        }

        public void update() {
            prepareMenuItems();
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
        public void onBindViewHolder(ViewHolder viewHolder, int i4) throws Resources.NotFoundException {
            int itemViewType = getItemViewType(i4);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ((TextView) viewHolder.itemView).setText(((NavigationMenuTextItem) this.items.get(i4)).getMenuItem().getTitle());
                    return;
                } else {
                    if (itemViewType != 2) {
                        return;
                    }
                    NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) this.items.get(i4);
                    viewHolder.itemView.setPadding(0, navigationMenuSeparatorItem.getPaddingTop(), 0, navigationMenuSeparatorItem.getPaddingBottom());
                    return;
                }
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.iconTintList);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (navigationMenuPresenter.textAppearanceSet) {
                navigationMenuItemView.setTextAppearance(navigationMenuPresenter.textAppearance);
            }
            ColorStateList colorStateList = NavigationMenuPresenter.this.textColor;
            if (colorStateList != null) {
                navigationMenuItemView.setTextColor(colorStateList);
            }
            Drawable drawable = NavigationMenuPresenter.this.itemBackground;
            C0358u.m2057t0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) this.items.get(i4);
            navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.needsEmptyIcon);
            navigationMenuItemView.setHorizontalPadding(NavigationMenuPresenter.this.itemHorizontalPadding);
            navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.itemIconPadding);
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            if (navigationMenuPresenter2.hasCustomItemIconSize) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter2.itemIconSize);
            }
            navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.itemMaxLines);
            navigationMenuItemView.initialize(navigationMenuTextItem.getMenuItem(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
            if (i4 == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new NormalViewHolder(navigationMenuPresenter.layoutInflater, viewGroup, navigationMenuPresenter.onClickListener);
            }
            if (i4 == 1) {
                return new SubheaderViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i4 == 2) {
                return new SeparatorViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i4 != 3) {
                return null;
            }
            return new HeaderViewHolder(NavigationMenuPresenter.this.headerLayout);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
        public void onViewRecycled(ViewHolder viewHolder) {
            if (viewHolder instanceof NormalViewHolder) {
                ((NavigationMenuItemView) viewHolder.itemView).recycle();
            }
        }
    }

    private static class NavigationMenuHeaderItem implements NavigationMenuItem {
        NavigationMenuHeaderItem() {
        }
    }

    private interface NavigationMenuItem {
    }

    private static class NavigationMenuSeparatorItem implements NavigationMenuItem {
        private final int paddingBottom;
        private final int paddingTop;

        public NavigationMenuSeparatorItem(int i4, int i5) {
            this.paddingTop = i4;
            this.paddingBottom = i5;
        }

        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        public int getPaddingTop() {
            return this.paddingTop;
        }
    }

    private static class NavigationMenuTextItem implements NavigationMenuItem {
        private final C0127i menuItem;
        boolean needsEmptyIcon;

        NavigationMenuTextItem(C0127i c0127i) {
            this.menuItem = c0127i;
        }

        public C0127i getMenuItem() {
            return this.menuItem;
        }
    }

    private class NavigationMenuViewAccessibilityDelegate extends C0598l {
        NavigationMenuViewAccessibilityDelegate(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.C0598l, androidx.core.view.C0335a
        public void onInitializeAccessibilityNodeInfo(View view, C1050c c1050c) {
            super.onInitializeAccessibilityNodeInfo(view, c1050c);
            c1050c.m4882e0(C1050c.b.m4921a(NavigationMenuPresenter.this.adapter.getRowCount(), 0, false));
        }
    }

    private static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C1371R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    private static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C1371R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    private static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C1371R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    private static abstract class ViewHolder extends RecyclerView.AbstractC0557b0 {
        public ViewHolder(View view) {
            super(view);
        }
    }

    private void updateTopPadding() {
        int i4 = (this.headerLayout.getChildCount() == 0 && this.isBehindStatusBar) ? this.paddingTopDefault : 0;
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, i4, 0, navigationMenuView.getPaddingBottom());
    }

    public void addHeaderView(View view) {
        this.headerLayout.addView(view);
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean collapseItemActionView(C0125g c0125g, C0127i c0127i) {
        return false;
    }

    public void dispatchApplyWindowInsets(C0340c0 c0340c0) {
        int iM1874l = c0340c0.m1874l();
        if (this.paddingTopDefault != iM1874l) {
            this.paddingTopDefault = iM1874l;
            updateTopPadding();
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c0340c0.m1871i());
        C0358u.m2030g(this.headerLayout, c0340c0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean expandItemActionView(C0125g c0125g, C0127i c0127i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean flagActionItems() {
        return false;
    }

    public C0127i getCheckedItem() {
        return this.adapter.getCheckedItem();
    }

    public int getHeaderCount() {
        return this.headerLayout.getChildCount();
    }

    public View getHeaderView(int i4) {
        return this.headerLayout.getChildAt(i4);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public int getId() {
        return this.f7397id;
    }

    public Drawable getItemBackground() {
        return this.itemBackground;
    }

    public int getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    public int getItemIconPadding() {
        return this.itemIconPadding;
    }

    public int getItemMaxLines() {
        return this.itemMaxLines;
    }

    public ColorStateList getItemTextColor() {
        return this.textColor;
    }

    public ColorStateList getItemTintList() {
        return this.iconTintList;
    }

    public InterfaceC0132n getMenuView(ViewGroup viewGroup) {
        if (this.menuView == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.layoutInflater.inflate(C1371R.layout.design_navigation_menu, viewGroup, false);
            this.menuView = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new NavigationMenuViewAccessibilityDelegate(this.menuView));
            if (this.adapter == null) {
                this.adapter = new NavigationMenuAdapter();
            }
            int i4 = this.overScrollMode;
            if (i4 != -1) {
                this.menuView.setOverScrollMode(i4);
            }
            this.headerLayout = (LinearLayout) this.layoutInflater.inflate(C1371R.layout.design_navigation_item_header, (ViewGroup) this.menuView, false);
            this.menuView.setAdapter(this.adapter);
        }
        return this.menuView;
    }

    public View inflateHeaderView(int i4) {
        View viewInflate = this.layoutInflater.inflate(i4, (ViewGroup) this.headerLayout, false);
        addHeaderView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void initForMenu(Context context, C0125g c0125g) {
        this.layoutInflater = LayoutInflater.from(context);
        this.menu = c0125g;
        this.paddingSeparator = context.getResources().getDimensionPixelOffset(C1371R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.isBehindStatusBar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void onCloseMenu(C0125g c0125g, boolean z3) {
        InterfaceC0131m.a aVar = this.callback;
        if (aVar != null) {
            aVar.onCloseMenu(c0125g, z3);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(STATE_HIERARCHY);
            if (sparseParcelableArray != null) {
                this.menuView.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(STATE_ADAPTER);
            if (bundle2 != null) {
                this.adapter.restoreInstanceState(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray(STATE_HEADER);
            if (sparseParcelableArray2 != null) {
                this.headerLayout.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.menuView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.menuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(STATE_HIERARCHY, sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            bundle.putBundle(STATE_ADAPTER, navigationMenuAdapter.createInstanceState());
        }
        if (this.headerLayout != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.headerLayout.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(STATE_HEADER, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean onSubMenuSelected(SubMenuC0136r subMenuC0136r) {
        return false;
    }

    public void removeHeaderView(View view) {
        this.headerLayout.removeView(view);
        if (this.headerLayout.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.menuView;
            navigationMenuView.setPadding(0, this.paddingTopDefault, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void setBehindStatusBar(boolean z3) {
        if (this.isBehindStatusBar != z3) {
            this.isBehindStatusBar = z3;
            updateTopPadding();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void setCallback(InterfaceC0131m.a aVar) {
        this.callback = aVar;
    }

    public void setCheckedItem(C0127i c0127i) {
        this.adapter.setCheckedItem(c0127i);
    }

    public void setId(int i4) {
        this.f7397id = i4;
    }

    public void setItemBackground(Drawable drawable) {
        this.itemBackground = drawable;
        updateMenuView(false);
    }

    public void setItemHorizontalPadding(int i4) {
        this.itemHorizontalPadding = i4;
        updateMenuView(false);
    }

    public void setItemIconPadding(int i4) {
        this.itemIconPadding = i4;
        updateMenuView(false);
    }

    public void setItemIconSize(int i4) {
        if (this.itemIconSize != i4) {
            this.itemIconSize = i4;
            this.hasCustomItemIconSize = true;
            updateMenuView(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        updateMenuView(false);
    }

    public void setItemMaxLines(int i4) {
        this.itemMaxLines = i4;
        updateMenuView(false);
    }

    public void setItemTextAppearance(int i4) {
        this.textAppearance = i4;
        this.textAppearanceSet = true;
        updateMenuView(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.textColor = colorStateList;
        updateMenuView(false);
    }

    public void setOverScrollMode(int i4) {
        this.overScrollMode = i4;
        NavigationMenuView navigationMenuView = this.menuView;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i4);
        }
    }

    public void setUpdateSuspended(boolean z3) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.setUpdateSuspended(z3);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void updateMenuView(boolean z3) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.update();
        }
    }
}
