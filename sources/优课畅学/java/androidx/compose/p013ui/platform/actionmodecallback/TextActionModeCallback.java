package androidx.compose.p013ui.platform.actionmodecallback;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TextActionModeCallback {
    public static final int $stable = 8;
    private final InterfaceC10559a onActionModeDestroy;
    private InterfaceC10559a onAutofillRequested;
    private InterfaceC10559a onCopyRequested;
    private InterfaceC10559a onCutRequested;
    private InterfaceC10559a onPasteRequested;
    private InterfaceC10559a onSelectAllRequested;
    private Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption menuItemOption, InterfaceC10559a interfaceC10559a) {
        if (interfaceC10559a != null && menu.findItem(menuItemOption.getId()) == null) {
            addMenuItem$ui_release(menu, menuItemOption);
        } else {
            if (interfaceC10559a != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void addMenuItem$ui_release(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    public final InterfaceC10559a getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    public final InterfaceC10559a getOnAutofillRequested() {
        return this.onAutofillRequested;
    }

    public final InterfaceC10559a getOnCopyRequested() {
        return this.onCopyRequested;
    }

    public final InterfaceC10559a getOnCutRequested() {
        return this.onCutRequested;
    }

    public final InterfaceC10559a getOnPasteRequested() {
        return this.onPasteRequested;
    }

    public final InterfaceC10559a getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        AbstractC9133u.m16130d(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            InterfaceC10559a interfaceC10559a = this.onCopyRequested;
            if (interfaceC10559a != null) {
                interfaceC10559a.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            InterfaceC10559a interfaceC10559a2 = this.onPasteRequested;
            if (interfaceC10559a2 != null) {
                interfaceC10559a2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            InterfaceC10559a interfaceC10559a3 = this.onCutRequested;
            if (interfaceC10559a3 != null) {
                interfaceC10559a3.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            InterfaceC10559a interfaceC10559a4 = this.onSelectAllRequested;
            if (interfaceC10559a4 != null) {
                interfaceC10559a4.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            InterfaceC10559a interfaceC10559a5 = this.onAutofillRequested;
            if (interfaceC10559a5 != null) {
                interfaceC10559a5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.onCopyRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Copy);
        }
        if (this.onPasteRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Paste);
        }
        if (this.onCutRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Cut);
        }
        if (this.onSelectAllRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.SelectAll);
        }
        if (this.onAutofillRequested == null || Build.VERSION.SDK_INT < 26) {
            return true;
        }
        addMenuItem$ui_release(menu, MenuItemOption.Autofill);
        return true;
    }

    public final void onDestroyActionMode() {
        InterfaceC10559a interfaceC10559a = this.onActionModeDestroy;
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui_release(menu);
        return true;
    }

    public final void setOnAutofillRequested(InterfaceC10559a interfaceC10559a) {
        this.onAutofillRequested = interfaceC10559a;
    }

    public final void setOnCopyRequested(InterfaceC10559a interfaceC10559a) {
        this.onCopyRequested = interfaceC10559a;
    }

    public final void setOnCutRequested(InterfaceC10559a interfaceC10559a) {
        this.onCutRequested = interfaceC10559a;
    }

    public final void setOnPasteRequested(InterfaceC10559a interfaceC10559a) {
        this.onPasteRequested = interfaceC10559a;
    }

    public final void setOnSelectAllRequested(InterfaceC10559a interfaceC10559a) {
        this.onSelectAllRequested = interfaceC10559a;
    }

    public final void setRect(Rect rect) {
        this.rect = rect;
    }

    @VisibleForTesting
    public final void updateMenuItems$ui_release(Menu menu) {
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Autofill, this.onAutofillRequested);
    }

    public TextActionModeCallback(InterfaceC10559a interfaceC10559a, Rect rect, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, InterfaceC10559a interfaceC10559a4, InterfaceC10559a interfaceC10559a5, InterfaceC10559a interfaceC10559a6) {
        this.onActionModeDestroy = interfaceC10559a;
        this.rect = rect;
        this.onCopyRequested = interfaceC10559a2;
        this.onPasteRequested = interfaceC10559a3;
        this.onCutRequested = interfaceC10559a4;
        this.onSelectAllRequested = interfaceC10559a5;
        this.onAutofillRequested = interfaceC10559a6;
    }

    public /* synthetic */ TextActionModeCallback(InterfaceC10559a interfaceC10559a, Rect rect, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, InterfaceC10559a interfaceC10559a4, InterfaceC10559a interfaceC10559a5, InterfaceC10559a interfaceC10559a6, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : interfaceC10559a, (i10 & 2) != 0 ? Rect.Companion.getZero() : rect, (i10 & 4) != 0 ? null : interfaceC10559a2, (i10 & 8) != 0 ? null : interfaceC10559a3, (i10 & 16) != 0 ? null : interfaceC10559a4, (i10 & 32) != 0 ? null : interfaceC10559a5, (i10 & 64) != 0 ? null : interfaceC10559a6);
    }
}
