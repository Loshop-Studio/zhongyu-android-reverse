package kotlin.system;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¨\u0006\u0004"}, m13558d2 = {"exitProcess", "", NotificationCompat.CATEGORY_STATUS, "", "kotlin-stdlib"}, m13559k = 2, m13560mv = {2, 2, 0}, m13562xi = 48)
@JvmName(name = "ProcessKt")
/* loaded from: classes5.dex */
public final class ProcessKt {
    @InlineOnly
    private static final Void exitProcess(int i10) {
        System.exit(i10);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
