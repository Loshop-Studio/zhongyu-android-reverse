package p081e9;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.DurationKt;
import kotlin.time.InstantKt;

/* renamed from: e9.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7417b {
    /* renamed from: b */
    public static final String m11919b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - 500000000) / InstantKt.NANOS_PER_SECOND) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - 500000) / DurationKt.NANOS_IN_MILLIS) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - 500) / 1000) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + 500) / 1000) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + 500000) / DurationKt.NANOS_IN_MILLIS) + " ms";
        } else {
            str = ((j10 + 500000000) / InstantKt.NANOS_PER_SECOND) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        return str2;
    }

    /* renamed from: c */
    public static final void m11920c(AbstractC7416a abstractC7416a, C7419d c7419d, String str) {
        Logger loggerM11948a = C7420e.f12104h.m11948a();
        StringBuilder sb = new StringBuilder();
        sb.append(c7419d.m11927f());
        sb.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(abstractC7416a.m11912b());
        loggerM11948a.fine(sb.toString());
    }
}
