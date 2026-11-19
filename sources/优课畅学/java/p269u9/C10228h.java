package p269u9;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: u9.h */
/* loaded from: classes5.dex */
public final class C10228h extends Handler {

    /* renamed from: a */
    public static final C10228h f20406a = new C10228h();

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        AbstractC9133u.m16133g(record, "record");
        C10227g c10227g = C10227g.f20403a;
        String loggerName = record.getLoggerName();
        AbstractC9133u.m16132f(loggerName, "getLoggerName(...)");
        int iM19129b = AbstractC10229i.m19129b(record);
        String message = record.getMessage();
        AbstractC9133u.m16132f(message, "getMessage(...)");
        c10227g.m19124a(loggerName, iM19129b, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
