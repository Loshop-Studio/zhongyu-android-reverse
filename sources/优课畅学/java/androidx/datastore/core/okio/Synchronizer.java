package androidx.datastore.core.okio;

import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class Synchronizer {
    public final <T> T withLock(InterfaceC10559a block) {
        T t10;
        AbstractC9133u.m16133g(block, "block");
        synchronized (this) {
            try {
                t10 = (T) block.invoke();
                AbstractC9131s.m16125b(1);
            } catch (Throwable th) {
                AbstractC9131s.m16125b(1);
                AbstractC9131s.m16124a(1);
                throw th;
            }
        }
        AbstractC9131s.m16124a(1);
        return t10;
    }
}
