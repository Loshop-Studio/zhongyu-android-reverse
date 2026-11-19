package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0332a;
import androidx.core.view.AbstractC0337b;
import androidx.core.view.C0359v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.http2.Settings;
import p160v.InterfaceMenuC3414a;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public class C0125g implements InterfaceMenuC3414a {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private a mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private C0127i mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<C0127i> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<InterfaceC0131m>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<C0127i> mItems = new ArrayList<>();
    private ArrayList<C0127i> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<C0127i> mActionItems = new ArrayList<>();
    private ArrayList<C0127i> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    public interface a {
        boolean onMenuItemSelected(C0125g c0125g, MenuItem menuItem);

        void onMenuModeChange(C0125g c0125g);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    public interface b {
        /* renamed from: a */
        boolean mo416a(C0127i c0127i);
    }

    public C0125g(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        setShortcutsVisibleInner(true);
    }

    private C0127i createNewMenuItem(int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        return new C0127i(this, i4, i5, i6, i7, charSequence, i8);
    }

    private void dispatchPresenterUpdate(boolean z3) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<InterfaceC0131m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0131m> next = it.next();
            InterfaceC0131m interfaceC0131m = next.get();
            if (interfaceC0131m == null) {
                this.mPresenters.remove(next);
            } else {
                interfaceC0131m.updateMenuView(z3);
            }
        }
        startDispatchingItemsChanged();
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        Iterator<WeakReference<InterfaceC0131m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0131m> next = it.next();
            InterfaceC0131m interfaceC0131m = next.get();
            if (interfaceC0131m == null) {
                this.mPresenters.remove(next);
            } else {
                int id = interfaceC0131m.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    interfaceC0131m.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<InterfaceC0131m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0131m> next = it.next();
            InterfaceC0131m interfaceC0131m = next.get();
            if (interfaceC0131m == null) {
                this.mPresenters.remove(next);
            } else {
                int id = interfaceC0131m.getId();
                if (id > 0 && (parcelableOnSaveInstanceState = interfaceC0131m.onSaveInstanceState()) != null) {
                    sparseArray.put(id, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    private boolean dispatchSubMenuSelected(SubMenuC0136r subMenuC0136r, InterfaceC0131m interfaceC0131m) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean zOnSubMenuSelected = interfaceC0131m != null ? interfaceC0131m.onSubMenuSelected(subMenuC0136r) : false;
        Iterator<WeakReference<InterfaceC0131m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0131m> next = it.next();
            InterfaceC0131m interfaceC0131m2 = next.get();
            if (interfaceC0131m2 == null) {
                this.mPresenters.remove(next);
            } else if (!zOnSubMenuSelected) {
                zOnSubMenuSelected = interfaceC0131m2.onSubMenuSelected(subMenuC0136r);
            }
        }
        return zOnSubMenuSelected;
    }

    private static int findInsertIndex(ArrayList<C0127i> arrayList, int i4) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m481f() <= i4) {
                return size + 1;
            }
        }
        return 0;
    }

    private static int getOrdering(int i4) {
        int i5 = ((-65536) & i4) >> 16;
        if (i5 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i5 < iArr.length) {
                return (i4 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i5] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void removeItemAtInt(int i4, boolean z3) {
        if (i4 < 0 || i4 >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i4);
        if (z3) {
            onItemsChanged(true);
        }
    }

    private void setHeaderInternal(int i4, CharSequence charSequence, int i5, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i4 > 0) {
                this.mHeaderTitle = resources.getText(i4);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i5 > 0) {
                this.mHeaderIcon = C0332a.m1806d(getContext(), i5);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    private void setShortcutsVisibleInner(boolean z3) {
        this.mShortcutsVisible = z3 && this.mResources.getConfiguration().keyboard != 1 && C0359v.m2110e(ViewConfiguration.get(this.mContext), this.mContext);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i4, i5, i6, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = intent3;
            }
        }
        return size;
    }

    protected MenuItem addInternal(int i4, int i5, int i6, CharSequence charSequence) {
        int ordering = getOrdering(i6);
        C0127i c0127iCreateNewMenuItem = createNewMenuItem(i4, i5, i6, ordering, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            c0127iCreateNewMenuItem.m497v(contextMenuInfo);
        }
        ArrayList<C0127i> arrayList = this.mItems;
        arrayList.add(findInsertIndex(arrayList, ordering), c0127iCreateNewMenuItem);
        onItemsChanged(true);
        return c0127iCreateNewMenuItem;
    }

    public void addMenuPresenter(InterfaceC0131m interfaceC0131m) {
        addMenuPresenter(interfaceC0131m, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void changeMenuMode() {
        a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        C0127i c0127i = this.mExpandedItem;
        if (c0127i != null) {
            collapseItemActionView(c0127i);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public final void close(boolean z3) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        Iterator<WeakReference<InterfaceC0131m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0131m> next = it.next();
            InterfaceC0131m interfaceC0131m = next.get();
            if (interfaceC0131m == null) {
                this.mPresenters.remove(next);
            } else {
                interfaceC0131m.onCloseMenu(this, z3);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(C0127i c0127i) {
        boolean zCollapseItemActionView = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == c0127i) {
            stopDispatchingItemsChanged();
            Iterator<WeakReference<InterfaceC0131m>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0131m> next = it.next();
                InterfaceC0131m interfaceC0131m = next.get();
                if (interfaceC0131m == null) {
                    this.mPresenters.remove(next);
                } else {
                    zCollapseItemActionView = interfaceC0131m.collapseItemActionView(this, c0127i);
                    if (zCollapseItemActionView) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.mExpandedItem = null;
            }
        }
        return zCollapseItemActionView;
    }

    boolean dispatchMenuItemSelected(C0125g c0125g, MenuItem menuItem) {
        a aVar = this.mCallback;
        return aVar != null && aVar.onMenuItemSelected(c0125g, menuItem);
    }

    public boolean expandItemActionView(C0127i c0127i) {
        boolean zExpandItemActionView = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<InterfaceC0131m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0131m> next = it.next();
            InterfaceC0131m interfaceC0131m = next.get();
            if (interfaceC0131m == null) {
                this.mPresenters.remove(next);
            } else {
                zExpandItemActionView = interfaceC0131m.expandItemActionView(this, c0127i);
                if (zExpandItemActionView) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.mExpandedItem = c0127i;
        }
        return zExpandItemActionView;
    }

    public int findGroupIndex(int i4) {
        return findGroupIndex(i4, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i4) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            C0127i c0127i = this.mItems.get(i5);
            if (c0127i.getItemId() == i4) {
                return c0127i;
            }
            if (c0127i.hasSubMenu() && (menuItemFindItem = c0127i.getSubMenu().findItem(i4)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i4) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (this.mItems.get(i5).getItemId() == i4) {
                return i5;
            }
        }
        return -1;
    }

    C0127i findItemWithShortcutForKey(int i4, KeyEvent keyEvent) {
        ArrayList<C0127i> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zIsQwertyMode = isQwertyMode();
        for (int i5 = 0; i5 < size; i5++) {
            C0127i c0127i = arrayList.get(i5);
            char alphabeticShortcut = zIsQwertyMode ? c0127i.getAlphabeticShortcut() : c0127i.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zIsQwertyMode && alphabeticShortcut == '\b' && i4 == 67))) {
                return c0127i;
            }
        }
        return null;
    }

    void findItemsWithShortcutForKey(List<C0127i> list, int i4, KeyEvent keyEvent) {
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            int size = this.mItems.size();
            for (int i5 = 0; i5 < size; i5++) {
                C0127i c0127i = this.mItems.get(i5);
                if (c0127i.hasSubMenu()) {
                    ((C0125g) c0127i.getSubMenu()).findItemsWithShortcutForKey(list, i4, keyEvent);
                }
                char alphabeticShortcut = zIsQwertyMode ? c0127i.getAlphabeticShortcut() : c0127i.getNumericShortcut();
                if (((modifiers & 69647) == ((zIsQwertyMode ? c0127i.getAlphabeticModifiers() : c0127i.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zIsQwertyMode && alphabeticShortcut == '\b' && i4 == 67)) && c0127i.isEnabled()) {
                        list.add(c0127i);
                    }
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<C0127i> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            Iterator<WeakReference<InterfaceC0131m>> it = this.mPresenters.iterator();
            boolean zFlagActionItems = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0131m> next = it.next();
                InterfaceC0131m interfaceC0131m = next.get();
                if (interfaceC0131m == null) {
                    this.mPresenters.remove(next);
                } else {
                    zFlagActionItems |= interfaceC0131m.flagActionItems();
                }
            }
            if (zFlagActionItems) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C0127i c0127i = visibleItems.get(i4);
                    if (c0127i.m487l()) {
                        this.mActionItems.add(c0127i);
                    } else {
                        this.mNonActionItems.add(c0127i);
                    }
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<C0127i> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    protected String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public C0127i getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i4) {
        return this.mItems.get(i4);
    }

    public ArrayList<C0127i> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    Resources getResources() {
        return this.mResources;
    }

    public C0125g getRootMenu() {
        return this;
    }

    public ArrayList<C0127i> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0127i c0127i = this.mItems.get(i4);
            if (c0127i.isVisible()) {
                this.mVisibleItems.add(c0127i);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.mItems.get(i4).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i4, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    void onItemActionRequestChanged(C0127i c0127i) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    void onItemVisibleChanged(C0127i c0127i) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z3) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z3) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z3) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        dispatchPresenterUpdate(z3);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i4, int i5) {
        return performItemAction(findItem(i4), i5);
    }

    public boolean performItemAction(MenuItem menuItem, int i4) {
        return performItemAction(menuItem, null, i4);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        C0127i c0127iFindItemWithShortcutForKey = findItemWithShortcutForKey(i4, keyEvent);
        boolean zPerformItemAction = c0127iFindItemWithShortcutForKey != null ? performItemAction(c0127iFindItemWithShortcutForKey, i5) : false;
        if ((i5 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i4) {
        int iFindGroupIndex = findGroupIndex(i4);
        if (iFindGroupIndex >= 0) {
            int size = this.mItems.size() - iFindGroupIndex;
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= size || this.mItems.get(iFindGroupIndex).getGroupId() != i4) {
                    break;
                }
                removeItemAtInt(iFindGroupIndex, false);
                i5 = i6;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i4) {
        removeItemAtInt(findItemIndex(i4), true);
    }

    public void removeItemAt(int i4) {
        removeItemAtInt(i4, true);
    }

    public void removeMenuPresenter(InterfaceC0131m interfaceC0131m) {
        Iterator<WeakReference<InterfaceC0131m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0131m> next = it.next();
            InterfaceC0131m interfaceC0131m2 = next.get();
            if (interfaceC0131m2 == null || interfaceC0131m2 == interfaceC0131m) {
                this.mPresenters.remove(next);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0136r) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i5 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i5 <= 0 || (menuItemFindItem = findItem(i5)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0136r) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCallback(a aVar) {
        this.mCallback = aVar;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public C0125g setDefaultShowAsAction(int i4) {
        this.mDefaultShowAsAction = i4;
        return this;
    }

    void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i4 = 0; i4 < size; i4++) {
            C0127i c0127i = this.mItems.get(i4);
            if (c0127i.getGroupId() == groupId && c0127i.m488m() && c0127i.isCheckable()) {
                c0127i.m494s(c0127i == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i4, boolean z3, boolean z4) {
        int size = this.mItems.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0127i c0127i = this.mItems.get(i5);
            if (c0127i.getGroupId() == i4) {
                c0127i.m495t(z4);
                c0127i.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.mGroupDividerEnabled = z3;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i4, boolean z3) {
        int size = this.mItems.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0127i c0127i = this.mItems.get(i5);
            if (c0127i.getGroupId() == i4) {
                c0127i.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i4, boolean z3) {
        int size = this.mItems.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C0127i c0127i = this.mItems.get(i5);
            if (c0127i.getGroupId() == i4 && c0127i.m500y(z3)) {
                z4 = true;
            }
        }
        if (z4) {
            onItemsChanged(true);
        }
    }

    protected C0125g setHeaderIconInt(Drawable drawable) {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    protected C0125g setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    protected C0125g setHeaderViewInt(View view) {
        setHeaderInternal(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean z3) {
        this.mOptionalIconsVisible = z3;
    }

    public void setOverrideVisibleItems(boolean z3) {
        this.mOverrideVisibleItems = z3;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.mQwertyMode = z3;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z3) {
        if (this.mShortcutsVisible == z3) {
            return;
        }
        setShortcutsVisibleInner(z3);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    @Override // android.view.Menu
    public MenuItem add(int i4) {
        return addInternal(0, 0, 0, this.mResources.getString(i4));
    }

    public void addMenuPresenter(InterfaceC0131m interfaceC0131m, Context context) {
        this.mPresenters.add(new WeakReference<>(interfaceC0131m));
        interfaceC0131m.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i4));
    }

    public int findGroupIndex(int i4, int i5) {
        int size = size();
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < size) {
            if (this.mItems.get(i5).getGroupId() == i4) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public boolean performItemAction(MenuItem menuItem, InterfaceC0131m interfaceC0131m, int i4) {
        C0127i c0127i = (C0127i) menuItem;
        if (c0127i == null || !c0127i.isEnabled()) {
            return false;
        }
        boolean zM486k = c0127i.m486k();
        AbstractC0337b abstractC0337bMo425b = c0127i.mo425b();
        boolean z3 = abstractC0337bMo425b != null && abstractC0337bMo425b.mo503a();
        if (c0127i.m485j()) {
            zM486k |= c0127i.expandActionView();
            if (zM486k) {
                close(true);
            }
        } else if (c0127i.hasSubMenu() || z3) {
            if ((i4 & 4) == 0) {
                close(false);
            }
            if (!c0127i.hasSubMenu()) {
                c0127i.m499x(new SubMenuC0136r(getContext(), this, c0127i));
            }
            SubMenuC0136r subMenuC0136r = (SubMenuC0136r) c0127i.getSubMenu();
            if (z3) {
                abstractC0337bMo425b.mo506f(subMenuC0136r);
            }
            zM486k |= dispatchSubMenuSelected(subMenuC0136r, interfaceC0131m);
            if (!zM486k) {
                close(true);
            }
        } else if ((i4 & 1) == 0) {
            close(true);
        }
        return zM486k;
    }

    protected C0125g setHeaderIconInt(int i4) {
        setHeaderInternal(0, null, i4, null, null);
        return this;
    }

    protected C0125g setHeaderTitleInt(int i4) {
        setHeaderInternal(i4, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return addInternal(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        C0127i c0127i = (C0127i) addInternal(i4, i5, i6, charSequence);
        SubMenuC0136r subMenuC0136r = new SubMenuC0136r(this.mContext, this, c0127i);
        c0127i.m499x(subMenuC0136r);
        return subMenuC0136r;
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, int i7) {
        return addInternal(i4, i5, i6, this.mResources.getString(i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, this.mResources.getString(i7));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }
}
