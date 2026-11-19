package p091e1;

import android.graphics.Bitmap;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import kotlin.UByte;

/* renamed from: e1.j */
/* loaded from: classes3.dex */
public abstract class AbstractC7838j {

    /* renamed from: a */
    public static final char[] f13161a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f13162b = new char[64];

    /* renamed from: e1.j$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13163a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f13163a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13163a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13163a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13163a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13163a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static void m12258a() {
        if (!m12273p()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m12259b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static boolean m12260c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: d */
    public static String m12261d(byte[] bArr, char[] cArr) {
        for (int i9 = 0; i9 < bArr.length; i9++) {
            byte b10 = bArr[i9];
            int i10 = b10 & UByte.MAX_VALUE;
            int i11 = i9 * 2;
            char[] cArr2 = f13161a;
            cArr[i11] = cArr2[i10 >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public static Queue m12262e(int i9) {
        return new ArrayDeque(i9);
    }

    /* renamed from: f */
    public static int m12263f(int i9, int i10, Bitmap.Config config) {
        return i9 * i10 * m12265h(config);
    }

    /* renamed from: g */
    public static int m12264g(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: h */
    public static int m12265h(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i9 = a.f13163a[config.ordinal()];
        int i10 = 1;
        if (i9 != 1) {
            i10 = 2;
            if (i9 != 2 && i9 != 3) {
                return i9 != 4 ? 4 : 8;
            }
        }
        return i10;
    }

    /* renamed from: i */
    public static List m12266i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static int m12267j(float f10) {
        return m12268k(f10, 17);
    }

    /* renamed from: k */
    public static int m12268k(float f10, int i9) {
        return m12269l(Float.floatToIntBits(f10), i9);
    }

    /* renamed from: l */
    public static int m12269l(int i9, int i10) {
        return (i10 * 31) + i9;
    }

    /* renamed from: m */
    public static int m12270m(Object obj, int i9) {
        return m12269l(obj == null ? 0 : obj.hashCode(), i9);
    }

    /* renamed from: n */
    public static int m12271n(boolean z9, int i9) {
        return m12269l(z9 ? 1 : 0, i9);
    }

    /* renamed from: o */
    public static boolean m12272o() {
        return !m12273p();
    }

    /* renamed from: p */
    public static boolean m12273p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: q */
    public static boolean m12274q(int i9) {
        return i9 > 0 || i9 == Integer.MIN_VALUE;
    }

    /* renamed from: r */
    public static boolean m12275r(int i9, int i10) {
        return m12274q(i9) && m12274q(i10);
    }

    /* renamed from: s */
    public static String m12276s(byte[] bArr) {
        String strM12261d;
        char[] cArr = f13162b;
        synchronized (cArr) {
            strM12261d = m12261d(bArr, cArr);
        }
        return strM12261d;
    }
}
