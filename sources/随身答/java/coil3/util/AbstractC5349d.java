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
import p151k.AbstractC8248s;
import p151k.C8230a;
import p151k.C8247r;
import p151k.InterfaceC8239j;

/* renamed from: coil3.util.d */
/* loaded from: classes3.dex */
public abstract class AbstractC5349d {

    /* renamed from: a */
    public static final ColorSpace f3164a = null;

    /* renamed from: b */
    public static final Bitmap.Config[] f3165b;

    /* renamed from: c */
    public static final Bitmap.Config f3166c;

    /* renamed from: coil3.util.d$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3167a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3168b;

        static {
            int[] iArr = new int[Logger.Level.values().length];
            try {
                iArr[Logger.Level.f3146a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Logger.Level.f3147b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Logger.Level.f3148c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Logger.Level.f3149d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Logger.Level.f3150e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3167a = iArr;
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
            f3168b = iArr2;
        }
    }

    static {
        int i9 = Build.VERSION.SDK_INT;
        f3165b = i9 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f3166c = i9 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: a */
    public static final Bitmap.Config m2941a() {
        return f3166c;
    }

    /* renamed from: b */
    public static final int m2942b(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    /* renamed from: c */
    public static final ColorSpace m2943c() {
        return f3164a;
    }

    /* renamed from: d */
    public static final int m2944d(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    /* renamed from: e */
    public static final Scale m2945e(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i9 = scaleType == null ? -1 : a.f3168b[scaleType.ordinal()];
        return (i9 == 1 || i9 == 2 || i9 == 3 || i9 == 4) ? Scale.f3124b : Scale.f3123a;
    }

    /* renamed from: f */
    public static final Bitmap.Config[] m2946f() {
        return f3165b;
    }

    /* renamed from: g */
    public static final int m2947g(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    /* renamed from: h */
    public static final boolean m2948h(C8247r c8247r) {
        return Intrinsics.areEqual(c8247r.m13277c(), "file") && Intrinsics.areEqual(CollectionsKt.firstOrNull(AbstractC8248s.m13284f(c8247r)), "android_asset");
    }

    /* renamed from: i */
    public static final boolean m2949i() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    /* renamed from: j */
    public static final boolean m2950j(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
    }

    /* renamed from: k */
    public static final void m2951k(InterfaceC8239j interfaceC8239j) {
        if (interfaceC8239j instanceof C8230a) {
            ((C8230a) interfaceC8239j).m13266b().prepareToDraw();
        }
    }
}
