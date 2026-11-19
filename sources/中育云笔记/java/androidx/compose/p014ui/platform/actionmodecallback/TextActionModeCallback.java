package androidx.compose.p014ui.platform.actionmodecallback;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TextActionModeCallback {
    public static final int $stable = 8;
    private final InterfaceC9529a onActionModeDestroy;
    private InterfaceC9529a onAutofillRequested;
    private InterfaceC9529a onCopyRequested;
    private InterfaceC9529a onCutRequested;
    private InterfaceC9529a onPasteRequested;
    private InterfaceC9529a onSelectAllRequested;
    private Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption menuItemOption, InterfaceC9529a interfaceC9529a) {
        if (interfaceC9529a != null && menu.findItem(menuItemOption.getId()) == null) {
            addMenuItem$ui_release(menu, menuItemOption);
        } else {
            if (interfaceC9529a != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void addMenuItem$ui_release(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    public final InterfaceC9529a getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    public final InterfaceC9529a getOnAutofillRequested() {
        return this.onAutofillRequested;
    }

    public final InterfaceC9529a getOnCopyRequested() {
        return this.onCopyRequested;
    }

    public final InterfaceC9529a getOnCutRequested() {
        return this.onCutRequested;
    }

    public final InterfaceC9529a getOnPasteRequested() {
        return this.onPasteRequested;
    }

    public final InterfaceC9529a getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        AbstractC9979u.m20291d(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            InterfaceC9529a interfaceC9529a = this.onCopyRequested;
            if (interfaceC9529a != null) {
                interfaceC9529a.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            InterfaceC9529a interfaceC9529a2 = this.onPasteRequested;
            if (interfaceC9529a2 != null) {
                interfaceC9529a2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            InterfaceC9529a interfaceC9529a3 = this.onCutRequested;
            if (interfaceC9529a3 != null) {
                interfaceC9529a3.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            InterfaceC9529a interfaceC9529a4 = this.onSelectAllRequested;
            if (interfaceC9529a4 != null) {
                interfaceC9529a4.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            InterfaceC9529a interfaceC9529a5 = this.onAutofillRequested;
            if (interfaceC9529a5 != null) {
                interfaceC9529a5.invoke();
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
        InterfaceC9529a interfaceC9529a = this.onActionModeDestroy;
        if (interfaceC9529a != null) {
            interfaceC9529a.invoke();
        }
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui_release(menu);
        return true;
    }

    public final void setOnAutofillRequested(InterfaceC9529a interfaceC9529a) {
        this.onAutofillRequested = interfaceC9529a;
    }

    public final void setOnCopyRequested(InterfaceC9529a interfaceC9529a) {
        this.onCopyRequested = interfaceC9529a;
    }

    public final void setOnCutRequested(InterfaceC9529a interfaceC9529a) {
        this.onCutRequested = interfaceC9529a;
    }

    public final void setOnPasteRequested(InterfaceC9529a interfaceC9529a) {
        this.onPasteRequested = interfaceC9529a;
    }

    public final void setOnSelectAllRequested(InterfaceC9529a interfaceC9529a) {
        this.onSelectAllRequested = interfaceC9529a;
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

    public TextActionModeCallback(InterfaceC9529a interfaceC9529a, Rect rect, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, InterfaceC9529a interfaceC9529a4, InterfaceC9529a interfaceC9529a5, InterfaceC9529a interfaceC9529a6) {
        this.onActionModeDestroy = interfaceC9529a;
        this.rect = rect;
        this.onCopyRequested = interfaceC9529a2;
        this.onPasteRequested = interfaceC9529a3;
        this.onCutRequested = interfaceC9529a4;
        this.onSelectAllRequested = interfaceC9529a5;
        this.onAutofillRequested = interfaceC9529a6;
    }

    public /* synthetic */ TextActionModeCallback(InterfaceC9529a interfaceC9529a, Rect rect, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, InterfaceC9529a interfaceC9529a4, InterfaceC9529a interfaceC9529a5, InterfaceC9529a interfaceC9529a6, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : interfaceC9529a, (i10 & 2) != 0 ? Rect.Companion.getZero() : rect, (i10 & 4) != 0 ? null : interfaceC9529a2, (i10 & 8) != 0 ? null : interfaceC9529a3, (i10 & 16) != 0 ? null : interfaceC9529a4, (i10 & 32) != 0 ? null : interfaceC9529a5, (i10 & 64) != 0 ? null : interfaceC9529a6);
    }
}
