package p117i1;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import kotlin.UByte;
import p073e1.AbstractC7324a;

/* renamed from: i1.k */
/* loaded from: classes3.dex */
public abstract class AbstractC7652k {

    /* renamed from: a */
    public static final char[] f12901a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f12902b = new char[64];

    /* renamed from: c */
    public static volatile Handler f12903c;

    /* renamed from: i1.k$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12904a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f12904a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12904a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12904a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12904a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12904a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static void m12685a() {
        if (!m12702r()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m12686b(AbstractC7324a abstractC7324a, AbstractC7324a abstractC7324a2) {
        return abstractC7324a == null ? abstractC7324a2 == null : abstractC7324a.m11652G(abstractC7324a2);
    }

    /* renamed from: c */
    public static boolean m12687c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: d */
    public static boolean m12688d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    public static String m12689e(byte[] bArr, char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = b10 & UByte.MAX_VALUE;
            int i12 = i10 * 2;
            char[] cArr2 = f12901a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static Queue m12690f(int i10) {
        return new ArrayDeque(i10);
    }

    /* renamed from: g */
    public static int m12691g(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * m12693i(config);
    }

    /* renamed from: h */
    public static int m12692h(Bitmap bitmap) {
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
    public static int m12693i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f12904a[config.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 3) {
                return i10 != 4 ? 4 : 8;
            }
        }
        return i11;
    }

    /* renamed from: j */
    public static List m12694j(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static Handler m12695k() {
        if (f12903c == null) {
            synchronized (AbstractC7652k.class) {
                try {
                    if (f12903c == null) {
                        f12903c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f12903c;
    }

    /* renamed from: l */
    public static int m12696l(float f10) {
        return m12697m(f10, 17);
    }

    /* renamed from: m */
    public static int m12697m(float f10, int i10) {
        return m12698n(Float.floatToIntBits(f10), i10);
    }

    /* renamed from: n */
    public static int m12698n(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    /* renamed from: o */
    public static int m12699o(Object obj, int i10) {
        return m12698n(obj == null ? 0 : obj.hashCode(), i10);
    }

    /* renamed from: p */
    public static int m12700p(boolean z9, int i10) {
        return m12698n(z9 ? 1 : 0, i10);
    }

    /* renamed from: q */
    public static boolean m12701q() {
        return !m12702r();
    }

    /* renamed from: r */
    public static boolean m12702r() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: s */
    public static boolean m12703s(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    /* renamed from: t */
    public static boolean m12704t(int i10, int i11) {
        return m12703s(i10) && m12703s(i11);
    }

    /* renamed from: u */
    public static void m12705u(Runnable runnable) {
        m12695k().post(runnable);
    }

    /* renamed from: v */
    public static void m12706v(Runnable runnable) {
        m12695k().removeCallbacks(runnable);
    }

    /* renamed from: w */
    public static String m12707w(byte[] bArr) {
        String strM12689e;
        char[] cArr = f12902b;
        synchronized (cArr) {
            strM12689e = m12689e(bArr, cArr);
        }
        return strM12689e;
    }
}
