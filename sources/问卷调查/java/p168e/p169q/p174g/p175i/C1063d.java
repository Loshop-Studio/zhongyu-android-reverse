package p168e.p169q.p174g.p175i;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import p160d.p162f.p164b.C1011d;
import p160d.p167i.C1026g;

/* renamed from: e.q.g.i.d */
/* loaded from: classes.dex */
public final class C1063d extends Handler {

    /* renamed from: a */
    public static final C1063d f5633a = new C1063d();

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        int iMin;
        C1011d.m2809e(logRecord, "record");
        C1062c c1062c = C1062c.f5632c;
        String loggerName = logRecord.getLoggerName();
        C1011d.m2808d(loggerName, "record.loggerName");
        int i = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        C1011d.m2808d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        C1011d.m2809e(loggerName, "loggerName");
        C1011d.m2809e(message, "message");
        String strSubstring = C1062c.f5631b.get(loggerName);
        if (strSubstring == null) {
            C1011d.m2809e(loggerName, "$this$take");
            int length = loggerName.length();
            strSubstring = loggerName.substring(0, 23 > length ? length : 23);
            C1011d.m2808d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        if (Log.isLoggable(strSubstring, i)) {
            if (thrown != null) {
                message = message + "\n" + Log.getStackTraceString(thrown);
            }
            int length2 = message.length();
            int i2 = 0;
            while (i2 < length2) {
                int iM2825h = C1026g.m2825h(message, '\n', i2, false, 4);
                if (iM2825h == -1) {
                    iM2825h = length2;
                }
                while (true) {
                    iMin = Math.min(iM2825h, i2 + 4000);
                    String strSubstring2 = message.substring(i2, iMin);
                    C1011d.m2808d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, strSubstring, strSubstring2);
                    if (iMin >= iM2825h) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
