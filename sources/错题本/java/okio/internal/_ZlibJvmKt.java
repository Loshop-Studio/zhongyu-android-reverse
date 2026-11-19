package okio.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.GregorianCalendar;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a8\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011*\f\b\u0000\u0010\u0004\"\u00020\u00052\u00020\u0005¨\u0006\u0012"}, m5110d2 = {"DEFAULT_COMPRESSION", "", "getDEFAULT_COMPRESSION", "()I", "CRC32", "Ljava/util/zip/CRC32;", "datePartsToEpochMillis", "", "year", "month", "day", "hour", "minute", "second", "EMPTY_BYTE_ARRAY", "", "getEMPTY_BYTE_ARRAY", "()[B", "okio"}, m5111k = 2, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class _ZlibJvmKt {
    private static final int DEFAULT_COMPRESSION = -1;

    @NotNull
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    public static final long datePartsToEpochMillis(int i, int i8, int i9, int i10, int i11, int i12) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i, i8 - 1, i9, i10, i11, i12);
        return gregorianCalendar.getTime().getTime();
    }

    public static final int getDEFAULT_COMPRESSION() {
        return DEFAULT_COMPRESSION;
    }

    @NotNull
    public static final byte[] getEMPTY_BYTE_ARRAY() {
        return EMPTY_BYTE_ARRAY;
    }
}
