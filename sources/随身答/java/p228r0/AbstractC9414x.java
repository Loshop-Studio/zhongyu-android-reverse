package p228r0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p164l0.InterfaceC8867d;

/* renamed from: r0.x */
/* loaded from: classes3.dex */
public abstract class AbstractC9414x {

    /* renamed from: a */
    public static final Paint f16411a = new Paint(6);

    /* renamed from: b */
    public static final Paint f16412b = new Paint(7);

    /* renamed from: c */
    public static final Paint f16413c;

    /* renamed from: d */
    public static final Set f16414d;

    /* renamed from: e */
    public static final Lock f16415e;

    /* renamed from: r0.x$a */
    public static final class a implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j9, TimeUnit timeUnit) {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f16414d = hashSet;
        f16415e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f16413c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m15491a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f16415e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f16411a);
            m15495e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f16415e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m15492b(InterfaceC8867d interfaceC8867d, Bitmap bitmap, int i9, int i10) {
        float width;
        float height;
        if (bitmap.getWidth() == i9 && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i10 > bitmap.getHeight() * i9) {
            width = i10 / bitmap.getHeight();
            width2 = (i9 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i9 / bitmap.getWidth();
            height = (i10 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo13733d = interfaceC8867d.mo13733d(i9, i10, m15501k(bitmap));
        m15505o(bitmap, bitmapMo13733d);
        m15491a(bitmap, bitmapMo13733d, matrix);
        return bitmapMo13733d;
    }

    /* renamed from: c */
    public static Bitmap m15493c(InterfaceC8867d interfaceC8867d, Bitmap bitmap, int i9, int i10) {
        if (bitmap.getWidth() > i9 || bitmap.getHeight() > i10) {
            Log.isLoggable("TransformationUtils", 2);
            return m15496f(interfaceC8867d, bitmap, i9, i10);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    /* renamed from: d */
    public static Bitmap m15494d(InterfaceC8867d interfaceC8867d, Bitmap bitmap, int i9, int i10) {
        int iMin = Math.min(i9, i10);
        float f10 = iMin;
        float f11 = f10 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f10 / width, f10 / height);
        float f12 = width * fMax;
        float f13 = fMax * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap bitmapM15497g = m15497g(interfaceC8867d, bitmap);
        Bitmap bitmapMo13733d = interfaceC8867d.mo13733d(iMin, iMin, m15498h(bitmap));
        bitmapMo13733d.setHasAlpha(true);
        Lock lock = f16415e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo13733d);
            canvas.drawCircle(f11, f11, f11, f16412b);
            canvas.drawBitmap(bitmapM15497g, (Rect) null, rectF, f16413c);
            m15495e(canvas);
            lock.unlock();
            if (!bitmapM15497g.equals(bitmap)) {
                interfaceC8867d.mo13732c(bitmapM15497g);
            }
            return bitmapMo13733d;
        } catch (Throwable th) {
            f16415e.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public static void m15495e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: f */
    public static Bitmap m15496f(InterfaceC8867d interfaceC8867d, Bitmap bitmap, int i9, int i10) {
        if (bitmap.getWidth() == i9 && bitmap.getHeight() == i10) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float fMin = Math.min(i9 / bitmap.getWidth(), i10 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Bitmap bitmapMo13733d = interfaceC8867d.mo13733d((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), m15501k(bitmap));
        m15505o(bitmap, bitmapMo13733d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            bitmapMo13733d.getWidth();
            bitmapMo13733d.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m15491a(bitmap, bitmapMo13733d, matrix);
        return bitmapMo13733d;
    }

    /* renamed from: g */
    public static Bitmap m15497g(InterfaceC8867d interfaceC8867d, Bitmap bitmap) {
        Bitmap.Config configM15498h = m15498h(bitmap);
        if (configM15498h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapMo13733d = interfaceC8867d.mo13733d(bitmap.getWidth(), bitmap.getHeight(), configM15498h);
        new Canvas(bitmapMo13733d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapMo13733d;
    }

    /* renamed from: h */
    public static Bitmap.Config m15498h(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    /* renamed from: i */
    public static Lock m15499i() {
        return f16415e;
    }

    /* renamed from: j */
    public static int m15500j(int i9) {
        switch (i9) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: k */
    public static Bitmap.Config m15501k(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: l */
    public static void m15502l(int i9, Matrix matrix) {
        switch (i9) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    /* renamed from: m */
    public static boolean m15503m(int i9) {
        switch (i9) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: n */
    public static Bitmap m15504n(InterfaceC8867d interfaceC8867d, Bitmap bitmap, int i9) {
        if (!m15503m(i9)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m15502l(i9, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapMo13733d = interfaceC8867d.mo13733d(Math.round(rectF.width()), Math.round(rectF.height()), m15501k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapMo13733d.setHasAlpha(bitmap.hasAlpha());
        m15491a(bitmap, bitmapMo13733d, matrix);
        return bitmapMo13733d;
    }

    /* renamed from: o */
    public static void m15505o(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
