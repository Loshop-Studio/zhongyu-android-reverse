package androidx.compose.p013ui.platform;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9114c0;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class JvmActuals_jvmKt {
    public static /* synthetic */ void AtomicInt$annotations() {
    }

    public static final Object nativeClass(Object obj) {
        return obj.getClass();
    }

    public static final String simpleIdentityToString(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        C9114c0 c9114c0 = C9114c0.f17482a;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        AbstractC9133u.m16132f(str2, "format(...)");
        sb.append(str2);
        return sb.toString();
    }

    @InterfaceC8721a
    /* renamed from: synchronized, reason: not valid java name */
    public static final /* synthetic */ <R> R m26066synchronized(Object obj, InterfaceC10559a interfaceC10559a) {
        R r10;
        synchronized (obj) {
            try {
                r10 = (R) interfaceC10559a.invoke();
                AbstractC9131s.m16125b(1);
            } catch (Throwable th) {
                AbstractC9131s.m16125b(1);
                AbstractC9131s.m16124a(1);
                throw th;
            }
        }
        AbstractC9131s.m16124a(1);
        return r10;
    }
}
