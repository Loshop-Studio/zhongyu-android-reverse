package kotlin.system;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¨\u0006\u0004"}, m7880d2 = {"exitProcess", "", NotificationCompat.CATEGORY_STATUS, "", "kotlin-stdlib"}, m7881k = 2, m7882mv = {2, 2, 0}, m7884xi = 48)
@JvmName(name = "ProcessKt")
/* loaded from: classes4.dex */
public final class ProcessKt {
    @InlineOnly
    private static final Void exitProcess(int i6) {
        System.exit(i6);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
