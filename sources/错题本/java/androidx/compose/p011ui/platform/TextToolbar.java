package androidx.compose.p011ui.platform;

import androidx.compose.p011ui.geometry.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001Jq\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ_\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¢\u0006\u0004\b\u000b\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/platform/TextToolbar;", "", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lkotlin/Function0;", "Ld6/s;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "showMenu", "(Landroidx/compose/ui/geometry/Rect;Lr6/a;Lr6/a;Lr6/a;Lr6/a;Lr6/a;)V", "(Landroidx/compose/ui/geometry/Rect;Lr6/a;Lr6/a;Lr6/a;Lr6/a;)V", "hide", "()V", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", NotificationCompat.CATEGORY_STATUS, "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface TextToolbar {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        public static void showMenu(@NotNull TextToolbar textToolbar, @NotNull Rect rect, @Nullable InterfaceC6469a interfaceC6469a, @Nullable InterfaceC6469a interfaceC6469a2, @Nullable InterfaceC6469a interfaceC6469a3, @Nullable InterfaceC6469a interfaceC6469a4, @Nullable InterfaceC6469a interfaceC6469a5) {
            TextToolbar.super.showMenu(rect, interfaceC6469a, interfaceC6469a2, interfaceC6469a3, interfaceC6469a4, interfaceC6469a5);
        }
    }

    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6469a interfaceC6469a3, InterfaceC6469a interfaceC6469a4, InterfaceC6469a interfaceC6469a5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        if ((i & 2) != 0) {
            interfaceC6469a = null;
        }
        if ((i & 4) != 0) {
            interfaceC6469a2 = null;
        }
        if ((i & 8) != 0) {
            interfaceC6469a3 = null;
        }
        if ((i & 16) != 0) {
            interfaceC6469a4 = null;
        }
        if ((i & 32) != 0) {
            interfaceC6469a5 = null;
        }
        textToolbar.showMenu(rect, interfaceC6469a, interfaceC6469a2, interfaceC6469a3, interfaceC6469a4, interfaceC6469a5);
    }

    @NotNull
    TextToolbarStatus getStatus();

    void hide();

    void showMenu(@NotNull Rect rect, @Nullable InterfaceC6469a onCopyRequested, @Nullable InterfaceC6469a onPasteRequested, @Nullable InterfaceC6469a onCutRequested, @Nullable InterfaceC6469a onSelectAllRequested);

    default void showMenu(@NotNull Rect rect, @Nullable InterfaceC6469a onCopyRequested, @Nullable InterfaceC6469a onPasteRequested, @Nullable InterfaceC6469a onCutRequested, @Nullable InterfaceC6469a onSelectAllRequested, @Nullable InterfaceC6469a onAutofillRequested) {
        showMenu(rect, onCopyRequested, onPasteRequested, onCutRequested, onSelectAllRequested);
    }

    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, InterfaceC6469a interfaceC6469a3, InterfaceC6469a interfaceC6469a4, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        if ((i & 2) != 0) {
            interfaceC6469a = null;
        }
        if ((i & 4) != 0) {
            interfaceC6469a2 = null;
        }
        if ((i & 8) != 0) {
            interfaceC6469a3 = null;
        }
        if ((i & 16) != 0) {
            interfaceC6469a4 = null;
        }
        textToolbar.showMenu(rect, interfaceC6469a, interfaceC6469a2, interfaceC6469a3, interfaceC6469a4);
    }
}
