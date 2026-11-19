package androidx.camera.core.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

/* loaded from: classes.dex */
public class InvalidJpegDataParser {
    private final LargeJpegImageQuirk mQuirk = (LargeJpegImageQuirk) DeviceQuirks.get(LargeJpegImageQuirk.class);

    @VisibleForTesting
    public static int getJfifEoiMarkEndPosition(@NonNull byte[] bArr) {
        byte b6;
        int i = 2;
        while (i + 4 <= bArr.length && (b6 = bArr[i]) == -1) {
            int i8 = i + 2;
            int i9 = ((bArr[i8] & 255) << 8) | (bArr[i + 3] & 255);
            if (b6 == -1 && bArr[i + 1] == -38) {
                while (true) {
                    int i10 = i8 + 2;
                    if (i10 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i8] == -1 && bArr[i8 + 1] == -39) {
                        return i10;
                    }
                    i8++;
                }
            } else {
                i += i9 + 2;
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
