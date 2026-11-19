package androidx.compose.p013ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableObjectList;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.input.rotary.RotaryScrollEvent;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public interface FocusOwner extends FocusManager {
    /* renamed from: dispatchKeyEvent-YhN2O0w$default, reason: not valid java name */
    static /* synthetic */ boolean m23928dispatchKeyEventYhN2O0w$default(FocusOwner focusOwner, KeyEvent keyEvent, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i10 & 2) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
                @Override // p300x7.InterfaceC10559a
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        return focusOwner.mo23931dispatchKeyEventYhN2O0w(keyEvent, interfaceC10559a);
    }

    static /* synthetic */ boolean dispatchRotaryEvent$default(FocusOwner focusOwner, RotaryScrollEvent rotaryScrollEvent, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchRotaryEvent");
        }
        if ((i10 & 2) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: androidx.compose.ui.focus.FocusOwner.dispatchRotaryEvent.1
                @Override // p300x7.InterfaceC10559a
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        return focusOwner.dispatchRotaryEvent(rotaryScrollEvent, interfaceC10559a);
    }

    /* renamed from: clearFocus-I7lrPNg, reason: not valid java name */
    boolean mo23929clearFocusI7lrPNg(boolean z10, boolean z11, boolean z12, int i10);

    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo, reason: not valid java name */
    boolean mo23930dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent);

    /* renamed from: dispatchKeyEvent-YhN2O0w, reason: not valid java name */
    boolean mo23931dispatchKeyEventYhN2O0w(KeyEvent keyEvent, InterfaceC10559a interfaceC10559a);

    boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent, InterfaceC10559a interfaceC10559a);

    /* renamed from: focusSearch-ULY8qGw, reason: not valid java name */
    Boolean mo23932focusSearchULY8qGw(int i10, Rect rect, InterfaceC10570l interfaceC10570l);

    FocusTargetNode getActiveFocusTargetNode();

    Rect getFocusRect();

    FocusTransactionManager getFocusTransactionManager();

    MutableObjectList<FocusListener> getListeners();

    Modifier getModifier();

    FocusState getRootState();

    boolean isFocusCaptured();

    void releaseFocus();

    /* renamed from: requestFocusForOwner-7o62pno, reason: not valid java name */
    boolean mo23933requestFocusForOwner7o62pno(FocusDirection focusDirection, Rect rect);

    void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode);

    void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode);

    void scheduleInvalidation(FocusTargetNode focusTargetNode);

    void scheduleInvalidationForOwner();

    void setActiveFocusTargetNode(FocusTargetNode focusTargetNode);

    void setFocusCaptured(boolean z10);

    /* renamed from: takeFocus-aToIllA, reason: not valid java name */
    boolean mo23934takeFocusaToIllA(int i10, Rect rect);
}
