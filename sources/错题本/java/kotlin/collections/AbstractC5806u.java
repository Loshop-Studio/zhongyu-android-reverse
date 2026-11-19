package kotlin.collections;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.v4.media.AbstractC0037f;
import android.util.DisplayMetrics;
import androidx.compose.material3.AbstractC1923c;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import kotlinx.serialization.json.internal.C6041v;
import okio.Buffer;
import p008a7.C0019a;
import p084i7.InterfaceC5686b;
import p100k6.AbstractC5758a;
import p108l6.AbstractC6066a;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;
import p118m7.C6127d;
import p118m7.C6138g1;
import p118m7.C6185w0;
import p125n7.InterfaceC6233h;
import p139p7.AbstractC6396c;
import p152r6.InterfaceC6471c;
import p164t1.AbstractC6582a;
import p169t6.AbstractC6600a;
import p200x6.C6751a;
import p200x6.C6754d;
import p200x6.C6756f;
import p200x6.InterfaceC6752b;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6779c;

/* renamed from: kotlin.collections.u */
/* loaded from: classes2.dex */
public abstract class AbstractC5806u {
    /* renamed from: A */
    public static ArrayList m5247A(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C5800o(objArr, true));
    }

    /* renamed from: B */
    public static final List m5248B(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : m5286y(list.get(0)) : EmptyList.INSTANCE;
    }

    /* renamed from: C */
    public static PorterDuff.Mode m5249C(int i) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return null;
        }
    }

    /* renamed from: D */
    public static final void m5250D(int i, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m82g(i8, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i8 <= i) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i8 + ") is greater than size (" + i + ").");
    }

    /* renamed from: E */
    public static boolean m5251E(Context context, int i, boolean z8) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, z8);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: F */
    public static int m5252F(Context context, int i, int i8) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i8);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: G */
    public static int m5253G(Context context, int i, int i8) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i8);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: H */
    public static float m5254H(Context context, int i, float f) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getFloat(0, f);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: I */
    public static C6754d m5255I(C6756f c6756f) {
        return new C6754d(c6756f.f11421b, c6756f.f11420a, -c6756f.f11422c);
    }

    /* renamed from: J */
    public static C6754d m5256J(C6756f c6756f, int i) {
        AbstractC5830k.m5330g(c6756f, "<this>");
        boolean z8 = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z8) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i8 = c6756f.f11420a;
        int i9 = c6756f.f11421b;
        if (c6756f.f11422c <= 0) {
            i = -i;
        }
        return new C6754d(i8, i9, i);
    }

    /* renamed from: K */
    public static void m5257K() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: L */
    public static void m5258L() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: M */
    public static final String m5259M(String str) {
        AbstractC5830k.m5330g(str, "<this>");
        int i = 0;
        int i8 = -1;
        if (!AbstractC5855p.m5372F(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                AbstractC5830k.m5329f(ascii, "toASCII(host)");
                Locale US = Locale.US;
                AbstractC5830k.m5329f(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                AbstractC5830k.m5329f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i9 = 0; i9 < length; i9++) {
                    char cCharAt = lowerCase.charAt(i9);
                    if (AbstractC5830k.m5332i(cCharAt, 31) <= 0 || AbstractC5830k.m5332i(cCharAt, 127) >= 0 || AbstractC5855p.m5379M(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM5279r = (AbstractC5862w.m5409C(str, "[", false) && AbstractC5862w.m5414u(str, "]", false)) ? m5279r(1, str.length() - 1, str) : m5279r(0, str.length(), str);
        if (inetAddressM5279r == null) {
            return null;
        }
        byte[] address = inetAddressM5279r.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressM5279r.getHostAddress();
            }
            throw new AssertionError(AbstractC1923c.m1047k('\'', "Invalid IPv6 address: '", str));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < address.length) {
            int i12 = i10;
            while (i12 < 16 && address[i12] == 0 && address[i12 + 1] == 0) {
                i12 += 2;
            }
            int i13 = i12 - i10;
            if (i13 > i11 && i13 >= 4) {
                i8 = i10;
                i11 = i13;
            }
            i10 = i12 + 2;
        }
        Buffer buffer = new Buffer();
        while (i < address.length) {
            if (i == i8) {
                buffer.writeByte(58);
                i += i11;
                if (i == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i > 0) {
                    buffer.writeByte(58);
                }
                byte b6 = address[i];
                byte[] bArr = AbstractC6396c.f10486a;
                buffer.writeHexadecimalUnsignedLong(((b6 & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return buffer.readUtf8();
    }

    /* renamed from: N */
    public static C6756f m5260N(int i, int i8) {
        if (i8 > Integer.MIN_VALUE) {
            return new C6756f(i, i8 - 1, 1);
        }
        C6756f c6756f = C6756f.f11427d;
        return C6756f.f11427d;
    }

    /* renamed from: O */
    public static Context m5261O(Context context) {
        int iM6241q;
        int iM6241q2;
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        int i = configuration.densityDpi;
        Integer numValueOf = Integer.valueOf(i);
        if (i <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : resources.getDisplayMetrics().densityDpi;
        int i8 = DisplayMetrics.DENSITY_DEVICE_STABLE;
        Integer numValueOf2 = i8 > 0 ? Integer.valueOf(i8) : null;
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : iIntValue;
        float f = iIntValue / iIntValue2;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 1.0f;
        configuration2.densityDpi = iIntValue2;
        int i9 = configuration.screenWidthDp;
        int i10 = 1;
        if (i9 == 0) {
            iM6241q = 0;
        } else {
            iM6241q = AbstractC6600a.m6241q(i9 * f);
            if (iM6241q < 1) {
                iM6241q = 1;
            }
        }
        configuration2.screenWidthDp = iM6241q;
        int i11 = configuration.screenHeightDp;
        if (i11 == 0) {
            iM6241q2 = 0;
        } else {
            iM6241q2 = AbstractC6600a.m6241q(i11 * f);
            if (iM6241q2 < 1) {
                iM6241q2 = 1;
            }
        }
        configuration2.screenHeightDp = iM6241q2;
        int i12 = configuration.smallestScreenWidthDp;
        if (i12 == 0) {
            i10 = 0;
        } else {
            int iM6241q3 = AbstractC6600a.m6241q(i12 * f);
            if (iM6241q3 >= 1) {
                i10 = iM6241q3;
            }
        }
        configuration2.smallestScreenWidthDp = i10;
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration2);
        AbstractC5830k.m5329f(contextCreateConfigurationContext, "createConfigurationContext(...)");
        return contextCreateConfigurationContext;
    }

    /* renamed from: a */
    public static final C6138g1 m5262a(InterfaceC6779c interfaceC6779c, InterfaceC5686b elementSerializer) {
        AbstractC5830k.m5330g(elementSerializer, "elementSerializer");
        return new C6138g1(interfaceC6779c, elementSerializer);
    }

    /* renamed from: b */
    public static final void m5263b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    /* renamed from: c */
    public static final C6127d m5264c(InterfaceC5686b elementSerializer) {
        AbstractC5830k.m5330g(elementSerializer, "elementSerializer");
        return new C6127d(elementSerializer, 0);
    }

    /* renamed from: d */
    public static final void m5265d(InterfaceC6072f interfaceC6072f) {
        AbstractC5830k.m5330g(interfaceC6072f, "<this>");
        if ((interfaceC6072f instanceof C6041v ? (C6041v) interfaceC6072f : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + AbstractC5832m.m5340a(interfaceC6072f.getClass()));
    }

    /* renamed from: e */
    public static void m5266e(Throwable th, Throwable exception) {
        AbstractC5830k.m5330g(th, "<this>");
        AbstractC5830k.m5330g(exception, "exception");
        if (th != exception) {
            Integer num = AbstractC6066a.f9669a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = AbstractC5758a.f9108a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    /* renamed from: f */
    public static ArrayList m5267f(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C5800o(objArr, true));
    }

    /* renamed from: g */
    public static final InterfaceC6233h m5268g(InterfaceC6071e interfaceC6071e) {
        AbstractC5830k.m5330g(interfaceC6071e, "<this>");
        InterfaceC6233h interfaceC6233h = interfaceC6071e instanceof InterfaceC6233h ? (InterfaceC6233h) interfaceC6071e : null;
        if (interfaceC6233h != null) {
            return interfaceC6233h;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + AbstractC5832m.m5340a(interfaceC6071e.getClass()));
    }

    /* renamed from: h */
    public static int m5269h(int i, List list, InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5330g(list, "<this>");
        m5250D(list.size(), i);
        int i8 = i - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            int iIntValue = ((Number) interfaceC6471c.invoke(list.get(i10))).intValue();
            if (iIntValue < 0) {
                i9 = i10 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    /* renamed from: i */
    public static int m5270i(List list, Comparable comparable) {
        int size = list.size();
        AbstractC5830k.m5330g(list, "<this>");
        m5250D(list.size(), size);
        int i = size - 1;
        int i8 = 0;
        while (i8 <= i) {
            int i9 = (i8 + i) >>> 1;
            int iM6441f = AbstractC6768a.m6441f((Comparable) list.get(i9), comparable);
            if (iM6441f < 0) {
                i8 = i9 + 1;
            } else {
                if (iM6441f <= 0) {
                    return i9;
                }
                i = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    /* renamed from: j */
    public static int m5271j(int i, int i8) {
        return i > i8 ? i8 : i;
    }

    /* renamed from: k */
    public static double m5272k(double d9, double d10, double d11) {
        if (d10 <= d11) {
            return d9 < d10 ? d10 : d9 > d11 ? d11 : d9;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d11 + " is less than minimum " + d10 + '.');
    }

    /* renamed from: l */
    public static float m5273l(float f, float f7, float f8) {
        if (f7 <= f8) {
            return f < f7 ? f7 : f > f8 ? f8 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f8 + " is less than minimum " + f7 + '.');
    }

    /* renamed from: m */
    public static int m5274m(int i, int i8, int i9) {
        if (i8 <= i9) {
            return i < i8 ? i8 : i > i9 ? i9 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i8 + '.');
    }

    /* renamed from: n */
    public static long m5275n(long j7, long j8, long j9) {
        if (j8 <= j9) {
            return j7 < j8 ? j8 : j7 > j9 ? j9 : j7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j9 + " is less than minimum " + j8 + '.');
    }

    /* renamed from: o */
    public static Comparable m5276o(Comparable comparable, InterfaceC6752b range) {
        AbstractC5830k.m5330g(range, "range");
        C6751a c6751a = (C6751a) range;
        float f = c6751a.f11419b;
        float f7 = c6751a.f11418a;
        if (!c6751a.m6431a()) {
            return (!c6751a.m6432b(comparable, Float.valueOf(f7)) || c6751a.m6432b(Float.valueOf(f7), comparable)) ? (!c6751a.m6432b(Float.valueOf(f), comparable) || c6751a.m6432b(comparable, Float.valueOf(f))) ? comparable : Float.valueOf(f) : Float.valueOf(f7);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    /* renamed from: p */
    public static int m5277p(Iterable iterable, int i) {
        AbstractC5830k.m5330g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* renamed from: q */
    public static ListBuilder m5278q() {
        return new ListBuilder(0, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        if (r7 == 16) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
    
        if (r8 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress m5279r(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.AbstractC5806u.m5279r(int, int, java.lang.String):java.net.InetAddress");
    }

    /* renamed from: s */
    public static EmptyList m5280s() {
        return EmptyList.INSTANCE;
    }

    /* renamed from: t */
    public static void m5281t() {
        synchronized (AbstractC5806u.class) {
            AbstractC6582a.m6217a();
            throw null;
        }
    }

    /* renamed from: u */
    public static int m5282u(List list) {
        AbstractC5830k.m5330g(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: v */
    public static final InterfaceC5686b m5283v(InterfaceC5686b interfaceC5686b) {
        AbstractC5830k.m5330g(interfaceC5686b, "<this>");
        return interfaceC5686b.getDescriptor().mo5099b() ? interfaceC5686b : new C6185w0(interfaceC5686b);
    }

    /* renamed from: w */
    public static final long m5284w(long j7) {
        if (j7 < 0) {
            int i = C0019a.f57d;
            return C0019a.f56c;
        }
        int i8 = C0019a.f57d;
        return C0019a.f55b;
    }

    /* renamed from: x */
    public static final boolean m5285x(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    /* renamed from: y */
    public static List m5286y(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC5830k.m5329f(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* renamed from: z */
    public static List m5287z(Object... elements) {
        AbstractC5830k.m5330g(elements, "elements");
        return elements.length > 0 ? AbstractC5802q.m5208u(elements) : EmptyList.INSTANCE;
    }
}
