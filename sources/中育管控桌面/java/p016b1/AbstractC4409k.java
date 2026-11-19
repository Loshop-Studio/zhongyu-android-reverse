package p016b1;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import kotlin.UByte;
import p181x0.AbstractC7823a;

/* renamed from: b1.k */
/* loaded from: classes3.dex */
public abstract class AbstractC4409k {

    /* renamed from: a */
    public static final char[] f1268a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f1269b = new char[64];

    /* renamed from: c */
    public static volatile Handler f1270c;

    /* renamed from: b1.k$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1271a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f1271a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1271a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1271a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1271a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1271a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static void m1440a() {
        if (!m1457r()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m1441b(AbstractC7823a abstractC7823a, AbstractC7823a abstractC7823a2) {
        return abstractC7823a == null ? abstractC7823a2 == null : abstractC7823a.m9419G(abstractC7823a2);
    }

    /* renamed from: c */
    public static boolean m1442c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: d */
    public static boolean m1443d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    public static String m1444e(byte[] bArr, char[] cArr) {
        for (int i6 = 0; i6 < bArr.length; i6++) {
            byte b7 = bArr[i6];
            int i7 = b7 & UByte.MAX_VALUE;
            int i8 = i6 * 2;
            char[] cArr2 = f1268a;
            cArr[i8] = cArr2[i7 >>> 4];
            cArr[i8 + 1] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static Queue m1445f(int i6) {
        return new ArrayDeque(i6);
    }

    /* renamed from: g */
    public static int m1446g(int i6, int i7, Bitmap.Config config) {
        return i6 * i7 * m1448i(config);
    }

    /* renamed from: h */
    public static int m1447h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: i */
    public static int m1448i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i6 = a.f1271a[config.ordinal()];
        int i7 = 1;
        if (i6 != 1) {
            i7 = 2;
            if (i6 != 2 && i6 != 3) {
                return i6 != 4 ? 4 : 8;
            }
        }
        return i7;
    }

    /* renamed from: j */
    public static List m1449j(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static Handler m1450k() {
        if (f1270c == null) {
            synchronized (AbstractC4409k.class) {
                try {
                    if (f1270c == null) {
                        f1270c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f1270c;
    }

    /* renamed from: l */
    public static int m1451l(float f6) {
        return m1452m(f6, 17);
    }

    /* renamed from: m */
    public static int m1452m(float f6, int i6) {
        return m1453n(Float.floatToIntBits(f6), i6);
    }

    /* renamed from: n */
    public static int m1453n(int i6, int i7) {
        return (i7 * 31) + i6;
    }

    /* renamed from: o */
    public static int m1454o(Object obj, int i6) {
        return m1453n(obj == null ? 0 : obj.hashCode(), i6);
    }

    /* renamed from: p */
    public static int m1455p(boolean z6, int i6) {
        return m1453n(z6 ? 1 : 0, i6);
    }

    /* renamed from: q */
    public static boolean m1456q() {
        return !m1457r();
    }

    /* renamed from: r */
    public static boolean m1457r() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: s */
    public static boolean m1458s(int i6) {
        return i6 > 0 || i6 == Integer.MIN_VALUE;
    }

    /* renamed from: t */
    public static boolean m1459t(int i6, int i7) {
        return m1458s(i6) && m1458s(i7);
    }

    /* renamed from: u */
    public static void m1460u(Runnable runnable) {
        m1450k().post(runnable);
    }

    /* renamed from: v */
    public static void m1461v(Runnable runnable) {
        m1450k().removeCallbacks(runnable);
    }

    /* renamed from: w */
    public static String m1462w(byte[] bArr) {
        String strM1444e;
        char[] cArr = f1269b;
        synchronized (cArr) {
            strM1444e = m1444e(bArr, cArr);
        }
        return strM1444e;
    }
}
