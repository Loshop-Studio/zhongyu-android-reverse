package androidx.compose.runtime.internal;

import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class TraceKt {
    public static final <T> T trace(String str, InterfaceC9529a interfaceC9529a) {
        Trace trace = Trace.INSTANCE;
        Object objBeginSection = trace.beginSection(str);
        try {
            T t10 = (T) interfaceC9529a.invoke();
            AbstractC9977s.m20286b(1);
            trace.endSection(objBeginSection);
            AbstractC9977s.m20285a(1);
            return t10;
        } catch (Throwable th) {
            AbstractC9977s.m20286b(1);
            Trace.INSTANCE.endSection(objBeginSection);
            AbstractC9977s.m20285a(1);
            throw th;
        }
    }
}
