package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.Modifier;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class SuspendingPointerInputFilterKt {
    private static final PointerEvent EmptyPointerEvent = new PointerEvent(AbstractC8809v.m14771n());
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";
    public static final long WITH_TIMEOUT_MICRO_DELAY_MILLIS = 8;

    @InterfaceC8721a
    public static final /* synthetic */ SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(InterfaceC10574p interfaceC10574p) {
        return new SuspendingPointerInputModifierNodeImpl((Object) null, (Object) null, (Object[]) null, interfaceC10574p);
    }

    private static /* synthetic */ void getPointerInputModifierNoParamError$annotations() {
    }

    @InterfaceC8721a
    public static final Modifier pointerInput(Modifier modifier, InterfaceC10574p interfaceC10574p) {
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
