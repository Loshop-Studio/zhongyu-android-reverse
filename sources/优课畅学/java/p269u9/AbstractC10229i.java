package p269u9;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: u9.i */
/* loaded from: classes5.dex */
public abstract class AbstractC10229i {
    /* renamed from: b */
    public static final int m19129b(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }
}
