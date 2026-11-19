package androidx.room.concurrent;

import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class CloseBarrierKt {
    public static final void ifNotClosed(CloseBarrier closeBarrier, InterfaceC10559a action) {
        AbstractC9133u.m16133g(closeBarrier, "<this>");
        AbstractC9133u.m16133g(action, "action");
        if (closeBarrier.block$room_runtime_release()) {
            try {
                action.invoke();
            } finally {
                AbstractC9131s.m16125b(1);
                closeBarrier.unblock$room_runtime_release();
                AbstractC9131s.m16124a(1);
            }
        }
    }
}
