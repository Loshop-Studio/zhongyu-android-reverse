package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.geometry.Rect;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public interface TextToolbar {

    public static final class DefaultImpls {
        @Deprecated
        public static void showMenu(TextToolbar textToolbar, Rect rect, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, InterfaceC9529a interfaceC9529a4, InterfaceC9529a interfaceC9529a5) {
            TextToolbar.super.showMenu(rect, interfaceC9529a, interfaceC9529a2, interfaceC9529a3, interfaceC9529a4, interfaceC9529a5);
        }
    }

    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, InterfaceC9529a interfaceC9529a4, InterfaceC9529a interfaceC9529a5, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9529a2 = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC9529a3 = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC9529a4 = null;
        }
        if ((i10 & 32) != 0) {
            interfaceC9529a5 = null;
        }
        textToolbar.showMenu(rect, interfaceC9529a, interfaceC9529a2, interfaceC9529a3, interfaceC9529a4, interfaceC9529a5);
    }

    TextToolbarStatus getStatus();

    void hide();

    void showMenu(Rect rect, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, InterfaceC9529a interfaceC9529a4);

    default void showMenu(Rect rect, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, InterfaceC9529a interfaceC9529a4, InterfaceC9529a interfaceC9529a5) {
        showMenu(rect, interfaceC9529a, interfaceC9529a2, interfaceC9529a3, interfaceC9529a4);
    }

    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, InterfaceC9529a interfaceC9529a4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9529a2 = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC9529a3 = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC9529a4 = null;
        }
        textToolbar.showMenu(rect, interfaceC9529a, interfaceC9529a2, interfaceC9529a3, interfaceC9529a4);
    }
}
