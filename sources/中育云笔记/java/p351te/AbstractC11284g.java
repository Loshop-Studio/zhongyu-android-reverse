package p351te;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: te.g */
/* loaded from: classes6.dex */
public abstract class AbstractC11284g {
    /* renamed from: b */
    public static final int m25228b(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }
}
