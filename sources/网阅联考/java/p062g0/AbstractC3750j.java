package p062g0;

import android.graphics.Bitmap;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import kotlin.UByte;

/* renamed from: g0.j */
/* loaded from: classes2.dex */
public abstract class AbstractC3750j {

    /* renamed from: a */
    public static final char[] f4396a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f4397b = new char[64];

    /* renamed from: g0.j$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4398a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f4398a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4398a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4398a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4398a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4398a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static void m4770a() {
        if (!m4785p()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m4771b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static boolean m4772c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: d */
    public static String m4773d(byte[] bArr, char[] cArr) {
        for (int i4 = 0; i4 < bArr.length; i4++) {
            int i5 = bArr[i4] & UByte.MAX_VALUE;
            int i6 = i4 * 2;
            char[] cArr2 = f4396a;
            cArr[i6] = cArr2[i5 >>> 4];
            cArr[i6 + 1] = cArr2[i5 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public static Queue m4774e(int i4) {
        return new ArrayDeque(i4);
    }

    /* renamed from: f */
    public static int m4775f(int i4, int i5, Bitmap.Config config) {
        return i4 * i5 * m4777h(config);
    }

    /* renamed from: g */
    public static int m4776g(Bitmap bitmap) {
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
    public static int m4777h(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i4 = a.f4398a[config.ordinal()];
        if (i4 == 1) {
            return 1;
        }
        if (i4 == 2 || i4 == 3) {
            return 2;
        }
        return i4 != 4 ? 4 : 8;
    }

    /* renamed from: i */
    public static List m4778i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static int m4779j(float f4) {
        return m4780k(f4, 17);
    }

    /* renamed from: k */
    public static int m4780k(float f4, int i4) {
        return m4781l(Float.floatToIntBits(f4), i4);
    }

    /* renamed from: l */
    public static int m4781l(int i4, int i5) {
        return (i5 * 31) + i4;
    }

    /* renamed from: m */
    public static int m4782m(Object obj, int i4) {
        return m4781l(obj == null ? 0 : obj.hashCode(), i4);
    }

    /* renamed from: n */
    public static int m4783n(boolean z3, int i4) {
        return m4781l(z3 ? 1 : 0, i4);
    }

    /* renamed from: o */
    public static boolean m4784o() {
        return !m4785p();
    }

    /* renamed from: p */
    public static boolean m4785p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: q */
    public static boolean m4786q(int i4) {
        return i4 > 0 || i4 == Integer.MIN_VALUE;
    }

    /* renamed from: r */
    public static boolean m4787r(int i4, int i5) {
        return m4786q(i4) && m4786q(i5);
    }

    /* renamed from: s */
    public static String m4788s(byte[] bArr) {
        String strM4773d;
        char[] cArr = f4397b;
        synchronized (cArr) {
            strM4773d = m4773d(bArr, cArr);
        }
        return strM4773d;
    }
}
