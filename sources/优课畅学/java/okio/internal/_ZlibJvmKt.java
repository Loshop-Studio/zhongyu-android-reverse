package okio.internal;

import java.util.GregorianCalendar;

/* loaded from: classes5.dex */
public final class _ZlibJvmKt {
    private static final int DEFAULT_COMPRESSION = -1;
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    public static final long datePartsToEpochMillis(int i10, int i11, int i12, int i13, int i14, int i15) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i10, i11 - 1, i12, i13, i14, i15);
        return gregorianCalendar.getTime().getTime();
    }

    public static final int getDEFAULT_COMPRESSION() {
        return DEFAULT_COMPRESSION;
    }

    public static final byte[] getEMPTY_BYTE_ARRAY() {
        return EMPTY_BYTE_ARRAY;
    }
}
