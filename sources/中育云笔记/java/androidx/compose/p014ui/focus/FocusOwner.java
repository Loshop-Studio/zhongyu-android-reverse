package androidx.compose.p014ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableObjectList;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.input.rotary.RotaryScrollEvent;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public interface FocusOwner extends FocusManager {
    /* renamed from: dispatchKeyEvent-YhN2O0w$default, reason: not valid java name */
    static /* synthetic */ boolean m30530dispatchKeyEventYhN2O0w$default(FocusOwner focusOwner, KeyEvent keyEvent, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
                @Override // p181hd.InterfaceC9529a
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        return focusOwner.mo30533dispatchKeyEventYhN2O0w(keyEvent, interfaceC9529a);
    }

    static /* synthetic */ boolean dispatchRotaryEvent$default(FocusOwner focusOwner, RotaryScrollEvent rotaryScrollEvent, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchRotaryEvent");
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.ui.focus.FocusOwner.dispatchRotaryEvent.1
                @Override // p181hd.InterfaceC9529a
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        return focusOwner.dispatchRotaryEvent(rotaryScrollEvent, interfaceC9529a);
    }

    /* renamed from: clearFocus-I7lrPNg, reason: not valid java name */
    boolean mo30531clearFocusI7lrPNg(boolean z10, boolean z11, boolean z12, int i10);

    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo, reason: not valid java name */
    boolean mo30532dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent);

    /* renamed from: dispatchKeyEvent-YhN2O0w, reason: not valid java name */
    boolean mo30533dispatchKeyEventYhN2O0w(KeyEvent keyEvent, InterfaceC9529a interfaceC9529a);

    boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent, InterfaceC9529a interfaceC9529a);

    /* renamed from: focusSearch-ULY8qGw, reason: not valid java name */
    Boolean mo30534focusSearchULY8qGw(int i10, Rect rect, InterfaceC9540l interfaceC9540l);

    FocusTargetNode getActiveFocusTargetNode();

    Rect getFocusRect();

    FocusTransactionManager getFocusTransactionManager();

    MutableObjectList<FocusListener> getListeners();

    Modifier getModifier();

    FocusState getRootState();

    boolean isFocusCaptured();

    void releaseFocus();

    /* renamed from: requestFocusForOwner-7o62pno, reason: not valid java name */
    boolean mo30535requestFocusForOwner7o62pno(FocusDirection focusDirection, Rect rect);

    void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode);

    void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode);

    void scheduleInvalidation(FocusTargetNode focusTargetNode);

    void scheduleInvalidationForOwner();

    void setActiveFocusTargetNode(FocusTargetNode focusTargetNode);

    void setFocusCaptured(boolean z10);

    /* renamed from: takeFocus-aToIllA, reason: not valid java name */
    boolean mo30536takeFocusaToIllA(int i10, Rect rect);
}
