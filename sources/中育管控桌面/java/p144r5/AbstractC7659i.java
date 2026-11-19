package p144r5;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: r5.i */
/* loaded from: classes4.dex */
public abstract class AbstractC7659i {
    /* renamed from: b */
    public static final int m9093b(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }
}
