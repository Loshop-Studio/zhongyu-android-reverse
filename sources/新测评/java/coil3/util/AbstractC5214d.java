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
import p137k.AbstractC7849u;
import p137k.C7829a;
import p137k.C7848t;
import p137k.InterfaceC7838j;

/* renamed from: coil3.util.d */
/* loaded from: classes3.dex */
public abstract class AbstractC5214d {

    /* renamed from: a */
    public static final ColorSpace f3282a = null;

    /* renamed from: b */
    public static final Bitmap.Config[] f3283b;

    /* renamed from: c */
    public static final Bitmap.Config f3284c;

    /* renamed from: coil3.util.d$a */
    public static final /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3285a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3286b;

        static {
            int[] iArr = new int[Logger.Level.values().length];
            try {
                iArr[Logger.Level.f3259a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Logger.Level.f3260b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Logger.Level.f3261c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Logger.Level.f3262d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Logger.Level.f3263e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3285a = iArr;
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
            f3286b = iArr2;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f3283b = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f3284c = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: a */
    public static final Bitmap.Config m3224a() {
        return f3284c;
    }

    /* renamed from: b */
    public static final int m3225b(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    /* renamed from: c */
    public static final ColorSpace m3226c() {
        return f3282a;
    }

    /* renamed from: d */
    public static final int m3227d(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    /* renamed from: e */
    public static final Scale m3228e(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i10 = scaleType == null ? -1 : a.f3286b[scaleType.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? Scale.f3236b : Scale.f3235a;
    }

    /* renamed from: f */
    public static final Bitmap.Config[] m3229f() {
        return f3283b;
    }

    /* renamed from: g */
    public static final int m3230g(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    /* renamed from: h */
    public static final boolean m3231h(C7848t c7848t) {
        return Intrinsics.areEqual(c7848t.m13309c(), "file") && Intrinsics.areEqual(CollectionsKt.firstOrNull(AbstractC7849u.m13316f(c7848t)), "android_asset");
    }

    /* renamed from: i */
    public static final boolean m3232i() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    /* renamed from: j */
    public static final boolean m3233j(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
    }

    /* renamed from: k */
    public static final void m3234k(InterfaceC7838j interfaceC7838j) {
        if (interfaceC7838j instanceof C7829a) {
            ((C7829a) interfaceC7838j).m13297b().prepareToDraw();
        }
    }
}
