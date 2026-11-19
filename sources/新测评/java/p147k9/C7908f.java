package p147k9;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k9.f */
/* loaded from: classes5.dex */
public final class C7908f extends Handler {

    /* renamed from: a */
    public static final C7908f f13784a = new C7908f();

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        C7907e c7907e = C7907e.f13781a;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int iM13538b = AbstractC7909g.m13538b(record);
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        c7907e.m13533a(loggerName, iM13538b, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
