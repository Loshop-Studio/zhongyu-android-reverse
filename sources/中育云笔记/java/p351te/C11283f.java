package p351te;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: te.f */
/* loaded from: classes6.dex */
public final class C11283f extends Handler {

    /* renamed from: a */
    public static final C11283f f27095a = new C11283f();

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        AbstractC9979u.m20294g(record, "record");
        C11282e c11282e = C11282e.f27092a;
        String loggerName = record.getLoggerName();
        AbstractC9979u.m20293f(loggerName, "record.loggerName");
        int iM25228b = AbstractC11284g.m25228b(record);
        String message = record.getMessage();
        AbstractC9979u.m20293f(message, "record.message");
        c11282e.m25223a(loggerName, iM25228b, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
