package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Looper;
import com.bumptech.glide.load.model.Model;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public final class Util {
    private static final int HASH_ACCUMULATOR = 17;
    private static final int HASH_MULTIPLIER = 31;
    private static final char[] HEX_CHAR_ARRAY = "0123456789abcdef".toCharArray();
    private static final char[] SHA_256_CHARS = new char[64];

    /* renamed from: com.bumptech.glide.util.Util$1 */
    static /* synthetic */ class C12671 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private Util() {
    }

    public static void assertBackgroundThread() {
        if (!isOnBackgroundThread()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void assertMainThread() {
        if (!isOnMainThread()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean bothModelsNullEquivalentOrEquals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj instanceof Model ? ((Model) obj).isEquivalentTo(obj2) : obj.equals(obj2);
    }

    public static boolean bothNullOrEqual(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static String bytesToHex(byte[] bArr, char[] cArr) {
        for (int i4 = 0; i4 < bArr.length; i4++) {
            int i5 = bArr[i4] & 255;
            int i6 = i4 * 2;
            char[] cArr2 = HEX_CHAR_ARRAY;
            cArr[i6] = cArr2[i5 >>> 4];
            cArr[i6 + 1] = cArr2[i5 & 15];
        }
        return new String(cArr);
    }

    public static <T> Queue<T> createQueue(int i4) {
        return new ArrayDeque(i4);
    }

    @TargetApi(19)
    public static int getBitmapByteSize(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    private static int getBytesPerPixel(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i4 = C12671.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()];
        if (i4 == 1) {
            return 1;
        }
        if (i4 == 2 || i4 == 3) {
            return 2;
        }
        return i4 != 4 ? 4 : 8;
    }

    @Deprecated
    public static int getSize(Bitmap bitmap) {
        return getBitmapByteSize(bitmap);
    }

    public static <T> List<T> getSnapshot(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t3 : collection) {
            if (t3 != null) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    public static int hashCode(int i4) {
        return hashCode(i4, 17);
    }

    public static int hashCode(int i4, int i5) {
        return (i5 * 31) + i4;
    }

    public static boolean isOnBackgroundThread() {
        return !isOnMainThread();
    }

    public static boolean isOnMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static boolean isValidDimension(int i4) {
        return i4 > 0 || i4 == Integer.MIN_VALUE;
    }

    public static boolean isValidDimensions(int i4, int i5) {
        return isValidDimension(i4) && isValidDimension(i5);
    }

    public static String sha256BytesToHex(byte[] bArr) {
        String strBytesToHex;
        char[] cArr = SHA_256_CHARS;
        synchronized (cArr) {
            strBytesToHex = bytesToHex(bArr, cArr);
        }
        return strBytesToHex;
    }

    public static int hashCode(float f4) {
        return hashCode(f4, 17);
    }

    public static int hashCode(float f4, int i4) {
        return hashCode(Float.floatToIntBits(f4), i4);
    }

    public static int hashCode(Object obj, int i4) {
        return hashCode(obj == null ? 0 : obj.hashCode(), i4);
    }

    public static int hashCode(boolean z3, int i4) {
        return hashCode(z3 ? 1 : 0, i4);
    }

    public static int hashCode(boolean z3) {
        return hashCode(z3, 17);
    }

    public static int getBitmapByteSize(int i4, int i5, Bitmap.Config config) {
        return i4 * i5 * getBytesPerPixel(config);
    }
}
