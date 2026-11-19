package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirk;
import com.tendcloud.tenddata.C7863av;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements Quirk {
    private static final Set<String> SAMSUNG_DEVICES = new HashSet(Arrays.asList("A24"));

    private boolean canParseSosMarker(@NonNull byte[] bArr) {
        byte b10;
        int i10 = 2;
        while (i10 + 4 <= bArr.length && (b10 = bArr[i10]) == -1) {
            if (b10 == -1 && bArr[i10 + 1] == -38) {
                return true;
            }
            i10 += (((bArr[i10 + 2] & C7863av.f14384i) << 8) | (bArr[i10 + 3] & C7863av.f14384i)) + 2;
        }
        return false;
    }

    private int findSecondFfd8Position(@NonNull byte[] bArr) {
        int i10 = 2;
        while (true) {
            int i11 = i10 + 1;
            if (i11 > bArr.length) {
                return -1;
            }
            if (bArr[i10] == -1 && bArr[i11] == -40) {
                return i10;
            }
            i10 = i11;
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
