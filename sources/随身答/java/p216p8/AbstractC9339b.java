package p216p8;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.DurationKt;
import kotlin.time.InstantKt;

/* renamed from: p8.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9339b {
    /* renamed from: b */
    public static final String m15255b(long j9) {
        String str;
        if (j9 <= -999500000) {
            str = ((j9 - 500000000) / InstantKt.NANOS_PER_SECOND) + " s ";
        } else if (j9 <= -999500) {
            str = ((j9 - 500000) / DurationKt.NANOS_IN_MILLIS) + " ms";
        } else if (j9 <= 0) {
            str = ((j9 - 500) / 1000) + " µs";
        } else if (j9 < 999500) {
            str = ((j9 + 500) / 1000) + " µs";
        } else if (j9 < 999500000) {
            str = ((j9 + 500000) / DurationKt.NANOS_IN_MILLIS) + " ms";
        } else {
            str = ((j9 + 500000000) / InstantKt.NANOS_PER_SECOND) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        return str2;
    }

    /* renamed from: c */
    public static final void m15256c(AbstractC9338a abstractC9338a, C9341d c9341d, String str) {
        Logger loggerM15284a = C9342e.f16226h.m15284a();
        StringBuilder sb = new StringBuilder();
        sb.append(c9341d.m15263f());
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(abstractC9338a.m15249b());
        loggerM15284a.fine(sb.toString());
    }
}
