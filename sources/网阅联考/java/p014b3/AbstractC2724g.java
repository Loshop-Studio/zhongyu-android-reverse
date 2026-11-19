package p014b3;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: b3.g */
/* loaded from: classes2.dex */
public abstract class AbstractC2724g {
    /* renamed from: b */
    public static final int m1520b(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}
