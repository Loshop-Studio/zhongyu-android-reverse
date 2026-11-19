package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p235r8.InterfaceC9942a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class MutexUtilsKt {
    public static final <R> R withTryLock(InterfaceC9942a interfaceC9942a, Object obj, InterfaceC10570l block) {
        AbstractC9133u.m16133g(interfaceC9942a, "<this>");
        AbstractC9133u.m16133g(block, "block");
        boolean zTryLock = interfaceC9942a.tryLock(obj);
        try {
            return (R) block.invoke(Boolean.valueOf(zTryLock));
        } finally {
            AbstractC9131s.m16125b(1);
            if (zTryLock) {
                interfaceC9942a.unlock(obj);
            }
            AbstractC9131s.m16124a(1);
        }
    }

    public static /* synthetic */ Object withTryLock$default(InterfaceC9942a interfaceC9942a, Object obj, InterfaceC10570l block, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        AbstractC9133u.m16133g(interfaceC9942a, "<this>");
        AbstractC9133u.m16133g(block, "block");
        boolean zTryLock = interfaceC9942a.tryLock(obj);
        try {
            return block.invoke(Boolean.valueOf(zTryLock));
        } finally {
            AbstractC9131s.m16125b(1);
            if (zTryLock) {
                interfaceC9942a.unlock(obj);
            }
            AbstractC9131s.m16124a(1);
        }
    }
}
