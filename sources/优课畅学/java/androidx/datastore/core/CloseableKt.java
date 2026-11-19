package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8722b;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class CloseableKt {
    public static final <T extends Closeable, R> R use(T t10, InterfaceC10570l block) throws Throwable {
        AbstractC9133u.m16133g(t10, "<this>");
        AbstractC9133u.m16133g(block, "block");
        try {
            R r10 = (R) block.invoke(t10);
            AbstractC9131s.m16125b(1);
            try {
                t10.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            if (th != null) {
                throw th;
            }
            AbstractC9131s.m16124a(1);
            return r10;
        } catch (Throwable th2) {
            AbstractC9131s.m16125b(1);
            try {
                t10.close();
            } catch (Throwable th3) {
                AbstractC8722b.m14228a(th2, th3);
            }
            throw th2;
        }
    }
}
