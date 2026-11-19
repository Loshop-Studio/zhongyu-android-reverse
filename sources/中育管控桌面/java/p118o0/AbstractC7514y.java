package p118o0;

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
import p074i0.InterfaceC6499d;

/* renamed from: o0.y */
/* loaded from: classes3.dex */
public abstract class AbstractC7514y {

    /* renamed from: a */
    public static final Paint f9702a = new Paint(6);

    /* renamed from: b */
    public static final Paint f9703b = new Paint(7);

    /* renamed from: c */
    public static final Paint f9704c;

    /* renamed from: d */
    public static final Set f9705d;

    /* renamed from: e */
    public static final Lock f9706e;

    /* renamed from: o0.y$a */
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
        public boolean tryLock(long j6, TimeUnit timeUnit) {
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
        f9705d = hashSet;
        f9706e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f9704c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m8650a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f9706e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f9702a);
            m8654e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f9706e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m8651b(InterfaceC6499d interfaceC6499d, Bitmap bitmap, int i6, int i7) {
        float width;
        float height;
        if (bitmap.getWidth() == i6 && bitmap.getHeight() == i7) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i7 > bitmap.getHeight() * i6) {
            width = i7 / bitmap.getHeight();
            width2 = (i6 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i6 / bitmap.getWidth();
            height = (i7 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo7198d = interfaceC6499d.mo7198d(i6, i7, m8660k(bitmap));
        m8664o(bitmap, bitmapMo7198d);
        m8650a(bitmap, bitmapMo7198d, matrix);
        return bitmapMo7198d;
    }

    /* renamed from: c */
    public static Bitmap m8652c(InterfaceC6499d interfaceC6499d, Bitmap bitmap, int i6, int i7) {
        if (bitmap.getWidth() > i6 || bitmap.getHeight() > i7) {
            Log.isLoggable("TransformationUtils", 2);
            return m8655f(interfaceC6499d, bitmap, i6, i7);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    /* renamed from: d */
    public static Bitmap m8653d(InterfaceC6499d interfaceC6499d, Bitmap bitmap, int i6, int i7) {
        int iMin = Math.min(i6, i7);
        float f6 = iMin;
        float f7 = f6 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f6 / width, f6 / height);
        float f8 = width * fMax;
        float f9 = fMax * height;
        float f10 = (f6 - f8) / 2.0f;
        float f11 = (f6 - f9) / 2.0f;
        RectF rectF = new RectF(f10, f11, f8 + f10, f9 + f11);
        Bitmap bitmapM8656g = m8656g(interfaceC6499d, bitmap);
        Bitmap bitmapMo7198d = interfaceC6499d.mo7198d(iMin, iMin, m8657h(bitmap));
        bitmapMo7198d.setHasAlpha(true);
        Lock lock = f9706e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo7198d);
            canvas.drawCircle(f7, f7, f7, f9703b);
            canvas.drawBitmap(bitmapM8656g, (Rect) null, rectF, f9704c);
            m8654e(canvas);
            lock.unlock();
            if (!bitmapM8656g.equals(bitmap)) {
                interfaceC6499d.mo7197c(bitmapM8656g);
            }
            return bitmapMo7198d;
        } catch (Throwable th) {
            f9706e.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public static void m8654e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: f */
    public static Bitmap m8655f(InterfaceC6499d interfaceC6499d, Bitmap bitmap, int i6, int i7) {
        if (bitmap.getWidth() == i6 && bitmap.getHeight() == i7) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float fMin = Math.min(i6 / bitmap.getWidth(), i7 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Bitmap bitmapMo7198d = interfaceC6499d.mo7198d((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), m8660k(bitmap));
        m8664o(bitmap, bitmapMo7198d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            bitmapMo7198d.getWidth();
            bitmapMo7198d.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m8650a(bitmap, bitmapMo7198d, matrix);
        return bitmapMo7198d;
    }

    /* renamed from: g */
    public static Bitmap m8656g(InterfaceC6499d interfaceC6499d, Bitmap bitmap) {
        Bitmap.Config configM8657h = m8657h(bitmap);
        if (configM8657h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapMo7198d = interfaceC6499d.mo7198d(bitmap.getWidth(), bitmap.getHeight(), configM8657h);
        new Canvas(bitmapMo7198d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapMo7198d;
    }

    /* renamed from: h */
    public static Bitmap.Config m8657h(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    /* renamed from: i */
    public static Lock m8658i() {
        return f9706e;
    }

    /* renamed from: j */
    public static int m8659j(int i6) {
        switch (i6) {
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
    public static Bitmap.Config m8660k(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: l */
    public static void m8661l(int i6, Matrix matrix) {
        switch (i6) {
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
    public static boolean m8662m(int i6) {
        switch (i6) {
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
    public static Bitmap m8663n(InterfaceC6499d interfaceC6499d, Bitmap bitmap, int i6) {
        if (!m8662m(i6)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m8661l(i6, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapMo7198d = interfaceC6499d.mo7198d(Math.round(rectF.width()), Math.round(rectF.height()), m8660k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapMo7198d.setHasAlpha(bitmap.hasAlpha());
        m8650a(bitmap, bitmapMo7198d, matrix);
        return bitmapMo7198d;
    }

    /* renamed from: o */
    public static void m8664o(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
