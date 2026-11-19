package p276v8;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v8.f */
/* loaded from: classes5.dex */
public final class C9778f extends Handler {

    /* renamed from: a */
    public static final C9778f f17391a = new C9778f();

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        C9777e c9777e = C9777e.f17388a;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int iM16571b = AbstractC9779g.m16571b(record);
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        c9777e.m16566a(loggerName, iM16571b, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
