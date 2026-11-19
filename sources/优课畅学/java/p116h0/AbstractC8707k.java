package p116h0;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import p069d0.AbstractC8269a;

/* renamed from: h0.k */
/* loaded from: classes3.dex */
public abstract class AbstractC8707k {

    /* renamed from: a */
    public static final char[] f16325a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f16326b = new char[64];

    /* renamed from: c */
    public static volatile Handler f16327c;

    /* renamed from: h0.k$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16328a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f16328a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16328a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16328a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16328a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16328a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static void m14183a() {
        if (!m14201s()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m14184b(AbstractC8269a abstractC8269a, AbstractC8269a abstractC8269a2) {
        return abstractC8269a == null ? abstractC8269a2 == null : abstractC8269a.m13361G(abstractC8269a2);
    }

    /* renamed from: c */
    public static boolean m14185c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: d */
    public static boolean m14186d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    public static String m14187e(byte[] bArr, char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f16325a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static Queue m14188f(int i10) {
        return new ArrayDeque(i10);
    }

    /* renamed from: g */
    public static int m14189g(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * m14191i(config);
    }

    /* renamed from: h */
    public static int m14190h(Bitmap bitmap) {
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
    public static int m14191i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f16328a[config.ordinal()];
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
    public static List m14192j(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static Handler m14193k() {
        if (f16327c == null) {
            synchronized (AbstractC8707k.class) {
                try {
                    if (f16327c == null) {
                        f16327c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f16327c;
    }

    /* renamed from: l */
    public static int m14194l(float f10) {
        return m14195m(f10, 17);
    }

    /* renamed from: m */
    public static int m14195m(float f10, int i10) {
        return m14197o(Float.floatToIntBits(f10), i10);
    }

    /* renamed from: n */
    public static int m14196n(int i10) {
        return m14197o(i10, 17);
    }

    /* renamed from: o */
    public static int m14197o(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    /* renamed from: p */
    public static int m14198p(Object obj, int i10) {
        return m14197o(obj == null ? 0 : obj.hashCode(), i10);
    }

    /* renamed from: q */
    public static int m14199q(boolean z10, int i10) {
        return m14197o(z10 ? 1 : 0, i10);
    }

    /* renamed from: r */
    public static boolean m14200r() {
        return !m14201s();
    }

    /* renamed from: s */
    public static boolean m14201s() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: t */
    public static boolean m14202t(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    /* renamed from: u */
    public static boolean m14203u(int i10, int i11) {
        return m14202t(i10) && m14202t(i11);
    }

    /* renamed from: v */
    public static void m14204v(Runnable runnable) {
        m14193k().post(runnable);
    }

    /* renamed from: w */
    public static void m14205w(Runnable runnable) {
        m14193k().removeCallbacks(runnable);
    }

    /* renamed from: x */
    public static String m14206x(byte[] bArr) {
        String strM14187e;
        char[] cArr = f16326b;
        synchronized (cArr) {
            strM14187e = m14187e(bArr, cArr);
        }
        return strM14187e;
    }
}
