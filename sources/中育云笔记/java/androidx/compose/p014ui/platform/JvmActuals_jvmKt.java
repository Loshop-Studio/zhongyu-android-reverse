package androidx.compose.p014ui.platform;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9960c0;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10770a;

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
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        C9960c0 c9960c0 = C9960c0.f23411a;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        AbstractC9979u.m20293f(str2, "format(...)");
        sb2.append(str2);
        return sb2.toString();
    }

    @InterfaceC10770a
    /* renamed from: synchronized, reason: not valid java name */
    public static final /* synthetic */ <R> R m32668synchronized(Object obj, InterfaceC9529a interfaceC9529a) {
        R r10;
        synchronized (obj) {
            try {
                r10 = (R) interfaceC9529a.invoke();
                AbstractC9977s.m20286b(1);
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                AbstractC9977s.m20285a(1);
                throw th;
            }
        }
        AbstractC9977s.m20285a(1);
        return r10;
    }
}
