package androidx.room.concurrent;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class AtomicsKt {
    public static final Void loop(AtomicInteger atomicInteger, InterfaceC10570l action) {
        AbstractC9133u.m16133g(atomicInteger, "<this>");
        AbstractC9133u.m16133g(action, "action");
        while (true) {
            action.invoke(Integer.valueOf(atomicInteger.get()));
        }
    }
}
