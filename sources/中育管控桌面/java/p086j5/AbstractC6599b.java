package p086j5;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.DurationKt;
import kotlin.time.InstantKt;

/* renamed from: j5.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6599b {
    /* renamed from: b */
    public static final String m7529b(long j6) {
        String str;
        if (j6 <= -999500000) {
            str = ((j6 - 500000000) / InstantKt.NANOS_PER_SECOND) + " s ";
        } else if (j6 <= -999500) {
            str = ((j6 - 500000) / DurationKt.NANOS_IN_MILLIS) + " ms";
        } else if (j6 <= 0) {
            str = ((j6 - 500) / 1000) + " µs";
        } else if (j6 < 999500) {
            str = ((j6 + 500) / 1000) + " µs";
        } else if (j6 < 999500000) {
            str = ((j6 + 500000) / DurationKt.NANOS_IN_MILLIS) + " ms";
        } else {
            str = ((j6 + 500000000) / InstantKt.NANOS_PER_SECOND) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    /* renamed from: c */
    public static final void m7530c(Logger logger, AbstractC6598a abstractC6598a, C6600c c6600c, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(c6600c.m7539h());
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        sb.append(str2);
        sb.append(": ");
        sb.append(abstractC6598a.m7522b());
        logger.fine(sb.toString());
    }
}
