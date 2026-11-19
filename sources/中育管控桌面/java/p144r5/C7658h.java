package p144r5;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r5.h */
/* loaded from: classes4.dex */
public final class C7658h extends Handler {

    /* renamed from: a */
    public static final C7658h f10099a = new C7658h();

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        C7657g c7657g = C7657g.f10096a;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "getLoggerName(...)");
        int iM9093b = AbstractC7659i.m9093b(record);
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
        c7657g.m9088a(loggerName, iM9093b, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
