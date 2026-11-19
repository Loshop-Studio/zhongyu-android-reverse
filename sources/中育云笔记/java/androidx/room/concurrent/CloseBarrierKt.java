package androidx.room.concurrent;

import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes3.dex */
public final class CloseBarrierKt {
    public static final void ifNotClosed(CloseBarrier closeBarrier, InterfaceC9529a action) {
        AbstractC9979u.m20294g(closeBarrier, "<this>");
        AbstractC9979u.m20294g(action, "action");
        if (closeBarrier.block$room_runtime_release()) {
            try {
                action.invoke();
            } finally {
                AbstractC9977s.m20286b(1);
                closeBarrier.unblock$room_runtime_release();
                AbstractC9977s.m20285a(1);
            }
        }
    }
}
