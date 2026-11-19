package p109d1;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.tendcloud.tenddata.C7863av;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import p428z0.AbstractC11952a;

/* renamed from: d1.k */
/* loaded from: classes3.dex */
public abstract class AbstractC8910k {

    /* renamed from: a */
    public static final char[] f20883a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f20884b = new char[64];

    /* renamed from: c */
    public static volatile Handler f20885c;

    /* renamed from: d1.k$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20886a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f20886a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20886a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20886a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20886a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20886a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static void m17470a() {
        if (!m17488s()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m17471b(AbstractC11952a abstractC11952a, AbstractC11952a abstractC11952a2) {
        return abstractC11952a == null ? abstractC11952a2 == null : abstractC11952a.m26519F(abstractC11952a2);
    }

    /* renamed from: c */
    public static boolean m17472c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: d */
    public static boolean m17473d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    public static String m17474e(byte[] bArr, char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = b10 & C7863av.f14384i;
            int i12 = i10 * 2;
            char[] cArr2 = f20883a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static Queue m17475f(int i10) {
        return new ArrayDeque(i10);
    }

    /* renamed from: g */
    public static int m17476g(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * m17478i(config);
    }

    /* renamed from: h */
    public static int m17477h(Bitmap bitmap) {
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
    public static int m17478i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f20886a[config.ordinal()];
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
    public static List m17479j(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static Handler m17480k() {
        if (f20885c == null) {
            synchronized (AbstractC8910k.class) {
                try {
                    if (f20885c == null) {
                        f20885c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f20885c;
    }

    /* renamed from: l */
    public static int m17481l(float f10) {
        return m17482m(f10, 17);
    }

    /* renamed from: m */
    public static int m17482m(float f10, int i10) {
        return m17484o(Float.floatToIntBits(f10), i10);
    }

    /* renamed from: n */
    public static int m17483n(int i10) {
        return m17484o(i10, 17);
    }

    /* renamed from: o */
    public static int m17484o(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    /* renamed from: p */
    public static int m17485p(Object obj, int i10) {
        return m17484o(obj == null ? 0 : obj.hashCode(), i10);
    }

    /* renamed from: q */
    public static int m17486q(boolean z10, int i10) {
        return m17484o(z10 ? 1 : 0, i10);
    }

    /* renamed from: r */
    public static boolean m17487r() {
        return !m17488s();
    }

    /* renamed from: s */
    public static boolean m17488s() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: t */
    public static boolean m17489t(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    /* renamed from: u */
    public static boolean m17490u(int i10, int i11) {
        return m17489t(i10) && m17489t(i11);
    }

    /* renamed from: v */
    public static void m17491v(Runnable runnable) {
        m17480k().post(runnable);
    }

    /* renamed from: w */
    public static void m17492w(Runnable runnable) {
        m17480k().removeCallbacks(runnable);
    }

    /* renamed from: x */
    public static String m17493x(byte[] bArr) {
        String strM17474e;
        char[] cArr = f20884b;
        synchronized (cArr) {
            strM17474e = m17474e(bArr, cArr);
        }
        return strM17474e;
    }
}
