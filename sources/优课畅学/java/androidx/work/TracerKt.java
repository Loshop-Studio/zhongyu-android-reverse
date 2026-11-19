package androidx.work;

import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class TracerKt {
    public static final <T> T traced(Tracer tracer, String label, InterfaceC10559a block) {
        AbstractC9133u.m16133g(tracer, "<this>");
        AbstractC9133u.m16133g(label, "label");
        AbstractC9133u.m16133g(block, "block");
        boolean zIsEnabled = tracer.isEnabled();
        if (zIsEnabled) {
            try {
                tracer.beginSection(label);
            } catch (Throwable th) {
                AbstractC9131s.m16125b(1);
                if (zIsEnabled) {
                    tracer.endSection();
                }
                AbstractC9131s.m16124a(1);
                throw th;
            }
        }
        T t10 = (T) block.invoke();
        AbstractC9131s.m16125b(1);
        if (zIsEnabled) {
            tracer.endSection();
        }
        AbstractC9131s.m16124a(1);
        return t10;
    }
}
