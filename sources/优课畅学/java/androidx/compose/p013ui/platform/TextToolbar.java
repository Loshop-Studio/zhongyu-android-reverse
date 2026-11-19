package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.geometry.Rect;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public interface TextToolbar {

    public static final class DefaultImpls {
        @Deprecated
        public static void showMenu(TextToolbar textToolbar, Rect rect, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, InterfaceC10559a interfaceC10559a4, InterfaceC10559a interfaceC10559a5) {
            TextToolbar.super.showMenu(rect, interfaceC10559a, interfaceC10559a2, interfaceC10559a3, interfaceC10559a4, interfaceC10559a5);
        }
    }

    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, InterfaceC10559a interfaceC10559a4, InterfaceC10559a interfaceC10559a5, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        if ((i10 & 2) != 0) {
            interfaceC10559a = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC10559a2 = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC10559a3 = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC10559a4 = null;
        }
        if ((i10 & 32) != 0) {
            interfaceC10559a5 = null;
        }
        textToolbar.showMenu(rect, interfaceC10559a, interfaceC10559a2, interfaceC10559a3, interfaceC10559a4, interfaceC10559a5);
    }

    TextToolbarStatus getStatus();

    void hide();

    void showMenu(Rect rect, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, InterfaceC10559a interfaceC10559a4);

    default void showMenu(Rect rect, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, InterfaceC10559a interfaceC10559a4, InterfaceC10559a interfaceC10559a5) {
        showMenu(rect, interfaceC10559a, interfaceC10559a2, interfaceC10559a3, interfaceC10559a4);
    }

    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, InterfaceC10559a interfaceC10559a4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        if ((i10 & 2) != 0) {
            interfaceC10559a = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC10559a2 = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC10559a3 = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC10559a4 = null;
        }
        textToolbar.showMenu(rect, interfaceC10559a, interfaceC10559a2, interfaceC10559a3, interfaceC10559a4);
    }
}
