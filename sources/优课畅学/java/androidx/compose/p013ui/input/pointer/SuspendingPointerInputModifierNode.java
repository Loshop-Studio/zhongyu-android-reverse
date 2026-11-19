package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.node.PointerInputModifierNode;
import kotlin.NotImplementedError;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface SuspendingPointerInputModifierNode extends PointerInputModifierNode {
    @InterfaceC8721a
    static /* synthetic */ void getPointerInputHandler$annotations() {
    }

    default PointerInputEventHandler getPointerInputEventHandler() {
        throw new NotImplementedError("An operation is not implemented: pointerInputEventHandler must be implemented (get()).");
    }

    InterfaceC10574p getPointerInputHandler();

    void resetPointerInputHandler();

    default void setPointerInputEventHandler(PointerInputEventHandler pointerInputEventHandler) {
        throw new NotImplementedError("An operation is not implemented: " + ("pointerInputEventHandler must be implemented (set(" + pointerInputEventHandler + "))."));
    }

    void setPointerInputHandler(InterfaceC10574p interfaceC10574p);
}
