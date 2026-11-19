package androidx.compose.p014ui.input.pointer;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
public final class SuspendingPointerInputFilterKt {
    private static final PointerEvent EmptyPointerEvent = new PointerEvent(AbstractC10978w.m24136n());
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";
    public static final long WITH_TIMEOUT_MICRO_DELAY_MILLIS = 8;

    @InterfaceC10770a
    public static final /* synthetic */ SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(InterfaceC9544p interfaceC9544p) {
        return new SuspendingPointerInputModifierNodeImpl((Object) null, (Object) null, (Object[]) null, interfaceC9544p);
    }

    private static /* synthetic */ void getPointerInputModifierNoParamError$annotations() {
    }

    @InterfaceC10770a
    public static final Modifier pointerInput(Modifier modifier, InterfaceC9544p interfaceC9544p) {
        throw new IllegalStateException(PointerInputModifierNoParamError);
    }

    public static final SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(PointerInputEventHandler pointerInputEventHandler) {
        return new SuspendingPointerInputModifierNodeImpl((Object) null, (Object) null, (Object[]) null, pointerInputEventHandler);
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(obj, obj2, null, pointerInputEventHandler, 4, null));
    }

    public static final Modifier pointerInput(Modifier modifier, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(null, null, objArr, pointerInputEventHandler, 3, null));
    }
}
