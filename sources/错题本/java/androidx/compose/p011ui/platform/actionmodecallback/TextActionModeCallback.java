package androidx.compose.p011ui.platform.actionmodecallback;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u00002\u00020\u0001B}\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001a\u0010\u0019J!\u0010\u001c\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b#\u0010$R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010&\u001a\u0004\b.\u0010(\"\u0004\b/\u00100R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u00100R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010&\u001a\u0004\b3\u0010(\"\u0004\b4\u00100R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010&\u001a\u0004\b5\u0010(\"\u0004\b6\u00100R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010&\u001a\u0004\b7\u0010(\"\u0004\b8\u00100¨\u00069"}, m5110d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "Lkotlin/Function0;", "Ld6/s;", "onActionModeDestroy", "Landroidx/compose/ui/geometry/Rect;", "rect", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "<init>", "(Lr6/a;Landroidx/compose/ui/geometry/Rect;Lr6/a;Lr6/a;Lr6/a;Lr6/a;Lr6/a;)V", "Landroid/view/Menu;", "menu", "Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "item", "callback", "addOrRemoveMenuItem", "(Landroid/view/Menu;Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;Lr6/a;)V", "Landroid/view/ActionMode;", "mode", "", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "Landroid/view/MenuItem;", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "onDestroyActionMode", "()V", "updateMenuItems$ui_release", "(Landroid/view/Menu;)V", "updateMenuItems", "addMenuItem$ui_release", "(Landroid/view/Menu;Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;)V", "addMenuItem", "Lr6/a;", "getOnActionModeDestroy", "()Lr6/a;", "Landroidx/compose/ui/geometry/Rect;", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "setRect", "(Landroidx/compose/ui/geometry/Rect;)V", "getOnCopyRequested", "setOnCopyRequested", "(Lr6/a;)V", "getOnPasteRequested", "setOnPasteRequested", "getOnCutRequested", "setOnCutRequested", "getOnSelectAllRequested", "setOnSelectAllRequested", "getOnAutofillRequested", "setOnAutofillRequested", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextActionModeCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextActionModeCallback.android.kt\nandroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
/* loaded from: classes2.dex */
public final class TextActionModeCallback {
    public static final int $stable = 8;

    @Nullable
    private final InterfaceC6469a onActionModeDestroy;

    @Nullable
    private InterfaceC6469a onAutofillRequested;

    @Nullable
    private InterfaceC6469a onCopyRequested;

    @Nullable
    private InterfaceC6469a onCutRequested;

    @Nullable
    private InterfaceC6469a onPasteRequested;

    @Nullable
    private InterfaceC6469a onSelectAllRequested;

    @NotNull
    private Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption item, InterfaceC6469a callback) {
        if (callback != null && menu.findItem(item.getId()) == null) {
            addMenuItem$ui_release(menu, item);
        } else {
            if (callback != null || menu.findItem(item.getId()) == null) {
                return;
            }
            menu.removeItem(item.getId());
        }
    }

    public final void addMenuItem$ui_release(@NotNull Menu menu, @NotNull MenuItemOption item) {
        menu.add(0, item.getId(), item.getOrder(), item.getTitleResource()).setShowAsAction(1);
    }

    @Nullable
    public final InterfaceC6469a getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    @Nullable
    public final InterfaceC6469a getOnAutofillRequested() {
        return this.onAutofillRequested;
    }

    @Nullable
    public final InterfaceC6469a getOnCopyRequested() {
        return this.onCopyRequested;
    }

    @Nullable
    public final InterfaceC6469a getOnCutRequested() {
        return this.onCutRequested;
    }

    @Nullable
    public final InterfaceC6469a getOnPasteRequested() {
        return this.onPasteRequested;
    }

    @Nullable
    public final InterfaceC6469a getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    @NotNull
    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(@Nullable ActionMode mode, @Nullable MenuItem item) {
        AbstractC5830k.m5327d(item);
        int itemId = item.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            InterfaceC6469a interfaceC6469a = this.onCopyRequested;
            if (interfaceC6469a != null) {
                interfaceC6469a.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            InterfaceC6469a interfaceC6469a2 = this.onPasteRequested;
            if (interfaceC6469a2 != null) {
                interfaceC6469a2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            InterfaceC6469a interfaceC6469a3 = this.onCutRequested;
            if (interfaceC6469a3 != null) {
                interfaceC6469a3.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            InterfaceC6469a interfaceC6469a4 = this.onSelectAllRequested;
            if (interfaceC6469a4 != null) {
                interfaceC6469a4.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            InterfaceC6469a interfaceC6469a5 = this.onAutofillRequested;
            if (interfaceC6469a5 != null) {
                interfaceC6469a5.invoke();
            }
        }
        if (mode == null) {
            return true;
        }
        mode.finish();
        return true;
    }

    public final boolean onCreateActionMode(@Nullable ActionMode mode, @Nullable Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (mode == null) {
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
        InterfaceC6469a interfaceC6469a = this.onActionModeDestroy;
        if (interfaceC6469a != null) {
            interfaceC6469a.invoke();
        }
    }

    public final boolean onPrepareActionMode(@Nullable ActionMode mode, @Nullable Menu menu) {
        if (mode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui_release(menu);
        return true;
    }

    public final void setOnAutofillRequested(@Nullable InterfaceC6469a interfaceC6469a) {
        this.onAutofillRequested = interfaceC6469a;
    }

    public final void setOnCopyRequested(@Nullable InterfaceC6469a interfaceC6469a) {
        this.onCopyRequested = interfaceC6469a;
    }

    public final void setOnCutRequested(@Nullable InterfaceC6469a interfaceC6469a) {
        this.onCutRequested = interfaceC6469a;
    }

    public final void setOnPasteRequested(@Nullable InterfaceC6469a interfaceC6469a) {
        this.onPasteRequested = interfaceC6469a;
    }

    public final void setOnSelectAllRequested(@Nullable InterfaceC6469a interfaceC6469a) {
        this.onSelectAllRequested = interfaceC6469a;
    }

    public final void setRect(@NotNull Rect rect) {
        this.rect = rect;
    }

    @VisibleForTesting
    public final void updateMenuItems$ui_release(@NotNull Menu menu) {
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Autofill, this.onAutofillRequested);
    }

    public TextActionModeCallback(@Nullable InterfaceC6469a interfaceC6469a, @NotNull Rect rect, @Nullable InterfaceC6469a interfaceC6469a2, @Nullable InterfaceC6469a interfaceC6469a3, @Nullable InterfaceC6469a interfaceC6469a4, @Nullable InterfaceC6469a interfaceC6469a5, @Nullable InterfaceC6469a interfaceC6469a6) {
        this.onActionModeDestroy = interfaceC6469a;
        this.rect = rect;
        this.onCopyRequested = interfaceC6469a2;
        this.onPasteRequested = interfaceC6469a3;
        this.onCutRequested = interfaceC6469a4;
        this.onSelectAllRequested = interfaceC6469a5;
        this.onAutofillRequested = interfaceC6469a6;
    }

    public /* synthetic */ TextActionModeCallback(InterfaceC6469a interfaceC6469a, Rect rect, InterfaceC6469a interfaceC6469a2, InterfaceC6469a interfaceC6469a3, InterfaceC6469a interfaceC6469a4, InterfaceC6469a interfaceC6469a5, InterfaceC6469a interfaceC6469a6, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? null : interfaceC6469a, (i & 2) != 0 ? Rect.INSTANCE.getZero() : rect, (i & 4) != 0 ? null : interfaceC6469a2, (i & 8) != 0 ? null : interfaceC6469a3, (i & 16) != 0 ? null : interfaceC6469a4, (i & 32) != 0 ? null : interfaceC6469a5, (i & 64) != 0 ? null : interfaceC6469a6);
    }
}
