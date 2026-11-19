package coil3.util;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.os.Looper;
import android.widget.ImageView;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil3.size.Scale;
import coil3.util.Logger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p087k.AbstractC6622u;
import p087k.C6602a;
import p087k.C6621t;
import p087k.InterfaceC6611j;

/* renamed from: coil3.util.d */
/* loaded from: classes3.dex */
public abstract class AbstractC4595d {

    /* renamed from: a */
    public static final ColorSpace f1966a = null;

    /* renamed from: b */
    public static final Bitmap.Config[] f1967b;

    /* renamed from: c */
    public static final Bitmap.Config f1968c;

    /* renamed from: coil3.util.d$a */
    public static final /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1969a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f1970b;

        static {
            int[] iArr = new int[Logger.Level.values().length];
            try {
                iArr[Logger.Level.f1943a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Logger.Level.f1944b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Logger.Level.f1945c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Logger.Level.f1946d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Logger.Level.f1947e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f1969a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            f1970b = iArr2;
        }
    }

    static {
        int i6 = Build.VERSION.SDK_INT;
        f1967b = i6 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f1968c = i6 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: a */
    public static final Bitmap.Config m2050a() {
        return f1968c;
    }

    /* renamed from: b */
    public static final int m2051b(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    /* renamed from: c */
    public static final ColorSpace m2052c() {
        return f1966a;
    }

    /* renamed from: d */
    public static final int m2053d(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    /* renamed from: e */
    public static final Scale m2054e(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i6 = scaleType == null ? -1 : a.f1970b[scaleType.ordinal()];
        return (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) ? Scale.f1920b : Scale.f1919a;
    }

    /* renamed from: f */
    public static final Bitmap.Config[] m2055f() {
        return f1967b;
    }

    /* renamed from: g */
    public static final int m2056g(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    /* renamed from: h */
    public static final boolean m2057h(C6621t c6621t) {
        return Intrinsics.areEqual(c6621t.m7575c(), "file") && Intrinsics.areEqual(CollectionsKt.firstOrNull(AbstractC6622u.m7582f(c6621t)), "android_asset");
    }

    /* renamed from: i */
    public static final boolean m2058i() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    /* renamed from: j */
    public static final boolean m2059j(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
    }

    /* renamed from: k */
    public static final void m2060k(InterfaceC6611j interfaceC6611j) {
        if (interfaceC6611j instanceof C6602a) {
            ((C6602a) interfaceC6611j).m7566b().prepareToDraw();
        }
    }
}
