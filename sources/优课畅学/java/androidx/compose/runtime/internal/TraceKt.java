package androidx.compose.runtime.internal;

import kotlin.jvm.internal.AbstractC9131s;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class TraceKt {
    public static final <T> T trace(String str, InterfaceC10559a interfaceC10559a) {
        Trace trace = Trace.INSTANCE;
        Object objBeginSection = trace.beginSection(str);
        try {
            T t10 = (T) interfaceC10559a.invoke();
            AbstractC9131s.m16125b(1);
            trace.endSection(objBeginSection);
            AbstractC9131s.m16124a(1);
            return t10;
        } catch (Throwable th) {
            AbstractC9131s.m16125b(1);
            Trace.INSTANCE.endSection(objBeginSection);
            AbstractC9131s.m16124a(1);
            throw th;
        }
    }
}
