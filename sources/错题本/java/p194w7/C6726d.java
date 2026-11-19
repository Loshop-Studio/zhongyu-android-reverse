package p194w7;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;

/* renamed from: w7.d */
/* loaded from: classes4.dex */
public final class C6726d extends Handler {

    /* renamed from: a */
    public static final C6726d f11344a = new C6726d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int iMin;
        AbstractC5830k.m5330g(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC6725c.f11342a;
        String loggerName = record.getLoggerName();
        AbstractC5830k.m5329f(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i = iIntValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        AbstractC5830k.m5329f(message, "record.message");
        Throwable thrown = record.getThrown();
        String strM5401i0 = (String) AbstractC6725c.f11343b.get(loggerName);
        if (strM5401i0 == null) {
            strM5401i0 = AbstractC5855p.m5401i0(23, loggerName);
        }
        if (Log.isLoggable(strM5401i0, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i8 = 0;
            while (i8 < length) {
                int iM5379M = AbstractC5855p.m5379M(message, '\n', i8, 4);
                if (iM5379M == -1) {
                    iM5379M = length;
                }
                while (true) {
                    iMin = Math.min(iM5379M, i8 + 4000);
                    String strSubstring = message.substring(i8, iMin);
                    AbstractC5830k.m5329f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, strM5401i0, strSubstring);
                    if (iMin >= iM5379M) {
                        break;
                    } else {
                        i8 = iMin;
                    }
                }
                i8 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
