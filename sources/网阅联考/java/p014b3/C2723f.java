package p014b3;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b3.f */
/* loaded from: classes2.dex */
public final class C2723f extends Handler {

    /* renamed from: a */
    public static final C2723f f473a = new C2723f();

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        C2722e c2722e = C2722e.f472c;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int iM1520b = AbstractC2724g.m1520b(record);
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        c2722e.m1515a(loggerName, iM1520b, message, record.getThrown());
    }
}
