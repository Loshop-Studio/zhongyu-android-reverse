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
import kotlin.jvm.internal.AbstractC9979u;
import p212k.AbstractC9767u;
import p212k.C9747a;
import p212k.C9766t;
import p212k.InterfaceC9756j;
import p325rc.AbstractC10947g0;

/* renamed from: coil3.util.d */
/* loaded from: classes3.dex */
public abstract class AbstractC5491d {

    /* renamed from: a */
    public static final ColorSpace f3957a = null;

    /* renamed from: b */
    public static final Bitmap.Config[] f3958b;

    /* renamed from: c */
    public static final Bitmap.Config f3959c;

    /* renamed from: coil3.util.d$a */
    public static final /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3960a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3961b;

        static {
            int[] iArr = new int[Logger.Level.values().length];
            try {
                iArr[Logger.Level.f3934c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Logger.Level.f3935d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Logger.Level.f3936e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Logger.Level.f3937f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Logger.Level.f3938g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3960a = iArr;
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
            f3961b = iArr2;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f3958b = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f3959c = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: a */
    public static final Bitmap.Config m3318a() {
        return f3959c;
    }

    /* renamed from: b */
    public static final int m3319b(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    /* renamed from: c */
    public static final ColorSpace m3320c() {
        return f3957a;
    }

    /* renamed from: d */
    public static final int m3321d(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    /* renamed from: e */
    public static final Scale m3322e(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i10 = scaleType == null ? -1 : a.f3961b[scaleType.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? Scale.f3911d : Scale.f3910c;
    }

    /* renamed from: f */
    public static final Bitmap.Config[] m3323f() {
        return f3958b;
    }

    /* renamed from: g */
    public static final int m3324g(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    /* renamed from: h */
    public static final boolean m3325h(C9766t c9766t) {
        return AbstractC9979u.m20289b(c9766t.m19685c(), "file") && AbstractC9979u.m20289b(AbstractC10947g0.m23946o0(AbstractC9767u.m19692f(c9766t)), "android_asset");
    }

    /* renamed from: i */
    public static final boolean m3326i() {
        return AbstractC9979u.m20289b(Looper.myLooper(), Looper.getMainLooper());
    }

    /* renamed from: j */
    public static final boolean m3327j(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
    }

    /* renamed from: k */
    public static final void m3328k(InterfaceC9756j interfaceC9756j) {
        if (interfaceC9756j instanceof C9747a) {
            ((C9747a) interfaceC9756j).m19676b().prepareToDraw();
        }
    }
}
