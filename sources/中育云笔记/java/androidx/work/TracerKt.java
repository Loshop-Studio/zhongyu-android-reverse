package androidx.work;

import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes3.dex */
public final class TracerKt {
    public static final <T> T traced(Tracer tracer, String label, InterfaceC9529a block) {
        AbstractC9979u.m20294g(tracer, "<this>");
        AbstractC9979u.m20294g(label, "label");
        AbstractC9979u.m20294g(block, "block");
        boolean zIsEnabled = tracer.isEnabled();
        if (zIsEnabled) {
            try {
                tracer.beginSection(label);
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                if (zIsEnabled) {
                    tracer.endSection();
                }
                AbstractC9977s.m20285a(1);
                throw th;
            }
        }
        T t10 = (T) block.invoke();
        AbstractC9977s.m20286b(1);
        if (zIsEnabled) {
            tracer.endSection();
        }
        AbstractC9977s.m20285a(1);
        return t10;
    }
}
