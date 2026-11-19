package p133v2;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.DurationKt;

/* renamed from: v2.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4632b {
    /* renamed from: b */
    public static final String m6427b(long j4) {
        String str;
        if (j4 <= -999500000) {
            str = ((j4 - 500000000) / 1000000000) + " s ";
        } else if (j4 <= -999500) {
            str = ((j4 - 500000) / DurationKt.NANOS_IN_MILLIS) + " ms";
        } else if (j4 <= 0) {
            str = ((j4 - 500) / 1000) + " µs";
        } else if (j4 < 999500) {
            str = ((j4 + 500) / 1000) + " µs";
        } else if (j4 < 999500000) {
            str = ((j4 + 500000) / DurationKt.NANOS_IN_MILLIS) + " ms";
        } else {
            str = ((j4 + 500000000) / 1000000000) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        return str2;
    }

    /* renamed from: c */
    public static final void m6428c(AbstractC4631a abstractC4631a, C4634d c4634d, String str) {
        Logger loggerM6456a = C4635e.f5851j.m6456a();
        StringBuilder sb = new StringBuilder();
        sb.append(c4634d.m6435f());
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(abstractC4631a.m6420b());
        loggerM6456a.fine(sb.toString());
    }
}
