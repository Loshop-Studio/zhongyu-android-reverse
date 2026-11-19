package androidx.room.concurrent;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class AtomicsKt {
    public static final Void loop(AtomicInteger atomicInteger, InterfaceC9540l action) {
        AbstractC9979u.m20294g(atomicInteger, "<this>");
        AbstractC9979u.m20294g(action, "action");
        while (true) {
            action.invoke(Integer.valueOf(atomicInteger.get()));
        }
    }
}
