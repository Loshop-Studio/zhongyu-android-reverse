package androidx.core.os;

import android.os.Trace;
import kotlin.jvm.internal.AbstractC9131s;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class TraceKt {
    @InterfaceC8721a
    public static final <T> T trace(String str, InterfaceC10559a interfaceC10559a) {
        Trace.beginSection(str);
        try {
            return (T) interfaceC10559a.invoke();
        } finally {
            AbstractC9131s.m16125b(1);
            Trace.endSection();
            AbstractC9131s.m16124a(1);
        }
    }
}
