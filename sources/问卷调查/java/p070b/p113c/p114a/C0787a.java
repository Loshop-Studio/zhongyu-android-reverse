package p070b.p113c.p114a;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import io.github.inflationx.calligraphy3.TypefaceUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;
import p070b.p071a.p072a.p073a.C0561a;
import p160d.p162f.p164b.C1011d;
import p168e.p169q.p171d.AbstractC1047a;
import p168e.p169q.p171d.C1048b;
import p168e.p169q.p171d.C1049c;
import p178f.C1082f;

/* renamed from: b.c.a.a */
/* loaded from: classes.dex */
public final class C0787a {

    /* renamed from: a */
    public static Application f4446a;

    /* renamed from: A */
    public static int m2461A(Context context, int i) {
        return m2462B(context, i, 0);
    }

    /* renamed from: B */
    public static int m2462B(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: C */
    public static int m2463C(Context context, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: D */
    public static float m2464D(Context context, int i, float f2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getFloat(0, f2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: E */
    public static final int m2465E(C1082f c1082f, int i) {
        int i2;
        C1011d.m2809e(c1082f, "$this$segment");
        int[] iArr = c1082f.f5665h;
        int i3 = i + 1;
        int length = c1082f.f5664g.length;
        C1011d.m2809e(iArr, "$this$binarySearch");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    /* renamed from: F */
    public static final char m2466F(char[] cArr) {
        C1011d.m2809e(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* renamed from: a */
    public static final void m2467a(AbstractC1047a abstractC1047a, C1048b c1048b, String str) {
        C1049c c1049c = C1049c.f5591j;
        Logger logger = C1049c.f5590i;
        StringBuilder sb = new StringBuilder();
        sb.append(c1048b.f5588e);
        sb.append(' ');
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C1011d.m2808d(str2, "java.lang.String.format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(abstractC1047a.f5582c);
        logger.fine(sb.toString());
    }

    /* renamed from: b */
    public static final boolean m2468b(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C1011d.m2809e(bArr, "a");
        C1011d.m2809e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static float m2469c(float f2, float f3, float f4, float f5) {
        return ((f4 - f2) / f5) + f3;
    }

    /* renamed from: d */
    public static float m2470d(float f2, float f3, float f4, float f5) {
        return f3 - ((f4 - f2) * f5);
    }

    /* renamed from: e */
    public static float m2471e(float f2, float f3, float f4, float f5) {
        return C0561a.m2073a(f4, f3, f5, f2);
    }

    /* renamed from: f */
    public static float m2472f(float f2, float f3, float f4, float f5) {
        return f4 - ((f3 - f2) / f5);
    }

    /* renamed from: g */
    public static final void m2473g(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: h */
    public static int m2474h(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: i */
    public static final boolean m2475i(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* renamed from: j */
    public static final String m2476j(long j) {
        StringBuilder sb;
        long j2;
        long j3;
        long j4;
        if (j > -999500000) {
            if (j > -999500) {
                if (j <= 0) {
                    sb = new StringBuilder();
                    j4 = j - 500;
                } else if (j < 999500) {
                    sb = new StringBuilder();
                    j4 = j + 500;
                } else if (j < 999500000) {
                    sb = new StringBuilder();
                    j3 = j + 500000;
                } else {
                    sb = new StringBuilder();
                    j2 = j + 500000000;
                }
                sb.append(j4 / 1000);
                sb.append(" µs");
                String str = String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
                C1011d.m2808d(str, "java.lang.String.format(format, *args)");
                return str;
            }
            sb = new StringBuilder();
            j3 = j - 500000;
            sb.append(j3 / 1000000);
            sb.append(" ms");
            String str2 = String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
            C1011d.m2808d(str2, "java.lang.String.format(format, *args)");
            return str2;
        }
        sb = new StringBuilder();
        j2 = j - 500000000;
        sb.append(j2 / 1000000000);
        sb.append(" s ");
        String str22 = String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
        C1011d.m2808d(str22, "java.lang.String.format(format, *args)");
        return str22;
    }

    /* renamed from: k */
    public static Bitmap m2477k(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* renamed from: l */
    public static int m2478l(int i, int i2, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: m */
    public static Context m2479m() {
        Application application = f4446a;
        if (application != null) {
            return application;
        }
        throw new ExceptionInInitializerError("请先在全局Application中调用 XUI.init() 初始化！");
    }

    /* renamed from: n */
    public static Typeface m2480n() {
        if (TextUtils.isEmpty(null)) {
            return null;
        }
        return TypefaceUtils.load(m2479m().getAssets(), null);
    }

    /* renamed from: o */
    public static Typeface m2481o(String str) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return TypefaceUtils.load(m2479m().getAssets(), str);
    }

    /* renamed from: p */
    public static Resources m2482p() {
        return m2479m().getResources();
    }

    /* renamed from: q */
    public static String m2483q(int i) {
        return m2482p().getString(i);
    }

    /* renamed from: r */
    public static boolean m2484r(float f2, float f3, float f4, float f5, float f6, float f7) {
        return f2 > f4 && f2 < f6 && f3 > f5 && f3 < f7;
    }

    /* renamed from: s */
    public static boolean m2485s(float f2, float f3, float f4, float f5, float f6) {
        return Math.abs(f2 - f4) <= f6 && Math.abs(f3 - f5) <= f6;
    }

    /* renamed from: t */
    public static boolean m2486t(float f2, float f3, float f4, float f5, float f6, float f7) {
        return f2 > f4 && f2 < f5 && Math.abs(f3 - f6) <= f7;
    }

    /* renamed from: u */
    public static boolean m2487u(float f2, float f3, float f4, float f5, float f6, float f7) {
        return Math.abs(f2 - f4) <= f7 && f3 > f5 && f3 < f6;
    }

    /* renamed from: v */
    public static boolean m2488v(int i) {
        return Math.sqrt((((double) (Color.blue(i) * Color.blue(i))) * 0.068d) + ((((double) (Color.green(i) * Color.green(i))) * 0.691d) + (((double) (Color.red(i) * Color.red(i))) * 0.241d))) > 130.0d;
    }

    /* renamed from: w */
    public static final <T> List<T> m2489w(T t) {
        List<T> listSingletonList = Collections.singletonList(t);
        C1011d.m2808d(listSingletonList, "java.util.Collections.singletonList(element)");
        return listSingletonList;
    }

    /* renamed from: x */
    public static final int m2490x(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: y */
    public static PorterDuff.Mode m2491y(int i, PorterDuff.Mode mode) {
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

    /* renamed from: z */
    public static boolean m2492z(Context context, int i, boolean z) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getBoolean(0, z);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
