package androidx.compose.p006ui.input.pointer;

import androidx.compose.p006ui.geometry.Size;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.ui.input.pointer.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1394b {
    /* renamed from: a */
    public static long m571a(AwaitPointerEventScope awaitPointerEventScope) {
        return Size.INSTANCE.m9023getZeroNHjbRc();
    }

    /* renamed from: b */
    public static Object m572b(AwaitPointerEventScope awaitPointerEventScope, long j4, Function2 function2, Continuation continuation) {
        return m591u(awaitPointerEventScope, j4, function2, continuation);
    }

    /* renamed from: c */
    public static Object m573c(AwaitPointerEventScope awaitPointerEventScope, long j4, Function2 function2, Continuation continuation) {
        return m592v(awaitPointerEventScope, j4, function2, continuation);
    }

    /* renamed from: t */
    public static /* synthetic */ Object m590t(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i4 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
    }

    /* renamed from: u */
    public static /* synthetic */ Object m591u(AwaitPointerEventScope awaitPointerEventScope, long j4, Function2 function2, Continuation continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }

    /* renamed from: v */
    public static /* synthetic */ Object m592v(AwaitPointerEventScope awaitPointerEventScope, long j4, Function2 function2, Continuation continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }
}
