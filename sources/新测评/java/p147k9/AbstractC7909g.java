package p147k9;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: k9.g */
/* loaded from: classes5.dex */
public abstract class AbstractC7909g {
    /* renamed from: b */
    public static final int m13538b(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }
}
