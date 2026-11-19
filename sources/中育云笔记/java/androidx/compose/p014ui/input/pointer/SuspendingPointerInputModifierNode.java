package androidx.compose.p014ui.input.pointer;

import androidx.compose.p014ui.node.PointerInputModifierNode;
import kotlin.NotImplementedError;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public interface SuspendingPointerInputModifierNode extends PointerInputModifierNode {
    @InterfaceC10770a
    static /* synthetic */ void getPointerInputHandler$annotations() {
    }

    default PointerInputEventHandler getPointerInputEventHandler() {
        throw new NotImplementedError("An operation is not implemented: pointerInputEventHandler must be implemented (get()).");
    }

    InterfaceC9544p getPointerInputHandler();

    void resetPointerInputHandler();

    default void setPointerInputEventHandler(PointerInputEventHandler pointerInputEventHandler) {
        throw new NotImplementedError("An operation is not implemented: " + ("pointerInputEventHandler must be implemented (set(" + pointerInputEventHandler + "))."));
    }

    void setPointerInputHandler(InterfaceC9544p interfaceC9544p);
}
