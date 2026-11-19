package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirk;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements Quirk {
    private static final Set<String> SAMSUNG_DEVICES = new HashSet(Arrays.asList("A24"));

    private boolean canParseSosMarker(@NonNull byte[] bArr) {
        byte b10;
        int i9 = 2;
        while (i9 + 4 <= bArr.length && (b10 = bArr[i9]) == -1) {
            if (b10 == -1 && bArr[i9 + 1] == -38) {
                return true;
            }
            i9 += (((bArr[i9 + 2] & UByte.MAX_VALUE) << 8) | (bArr[i9 + 3] & UByte.MAX_VALUE)) + 2;
        }
        return false;
    }

    private int findSecondFfd8Position(@NonNull byte[] bArr) {
        int i9 = 2;
        while (true) {
            int i10 = i9 + 1;
            if (i10 > bArr.length) {
                return -1;
            }
            if (bArr[i9] == -1 && bArr[i10] == -40) {
                return i9;
            }
            i9 = i10;
        }
    }

    private static boolean isSamsungProblematicDevice() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && SAMSUNG_DEVICES.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    public static boolean load() {
        return isSamsungProblematicDevice();
    }

    @NonNull
    public byte[] jpegImageToJpegByteArray(@NonNull ImageProxy imageProxy) {
        int iFindSecondFfd8Position = 0;
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return (canParseSosMarker(bArr) || (iFindSecondFfd8Position = findSecondFfd8Position(bArr)) != -1) ? Arrays.copyOfRange(bArr, iFindSecondFfd8Position, buffer.limit()) : bArr;
    }
}
