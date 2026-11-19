package androidx.camera.core.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import kotlin.UByte;

/* loaded from: classes.dex */
public class InvalidJpegDataParser {
    private final LargeJpegImageQuirk mQuirk = (LargeJpegImageQuirk) DeviceQuirks.get(LargeJpegImageQuirk.class);

    @VisibleForTesting
    public static int getJfifEoiMarkEndPosition(@NonNull byte[] bArr) {
        byte b10;
        int i9 = 2;
        while (i9 + 4 <= bArr.length && (b10 = bArr[i9]) == -1) {
            int i10 = i9 + 2;
            int i11 = ((bArr[i10] & UByte.MAX_VALUE) << 8) | (bArr[i9 + 3] & UByte.MAX_VALUE);
            if (b10 == -1 && bArr[i9 + 1] == -38) {
                while (true) {
                    int i12 = i10 + 2;
                    if (i12 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i10] == -1 && bArr[i10 + 1] == -39) {
                        return i12;
                    }
                    i10++;
                }
            } else {
                i9 += i11 + 2;
            }
        }
        return -1;
    }

    public int getValidDataLength(@NonNull byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.mQuirk;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.shouldCheckInvalidJpegData(bArr)) {
            return bArr.length;
        }
        int jfifEoiMarkEndPosition = getJfifEoiMarkEndPosition(bArr);
        return jfifEoiMarkEndPosition != -1 ? jfifEoiMarkEndPosition : bArr.length;
    }
}
