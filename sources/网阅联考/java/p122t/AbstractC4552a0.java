package p122t;

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
import p098n.InterfaceC4395d;

/* renamed from: t.a0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4552a0 {

    /* renamed from: a */
    public static final Paint f5715a = new Paint(6);

    /* renamed from: b */
    public static final Paint f5716b = new Paint(7);

    /* renamed from: c */
    public static final Paint f5717c;

    /* renamed from: d */
    public static final Set f5718d;

    /* renamed from: e */
    public static final Lock f5719e;

    /* renamed from: t.a0$a */
    public static final class a implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j4, TimeUnit timeUnit) {
            return true;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f5718d = hashSet;
        f5719e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f5717c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m6245a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f5719e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f5715a);
            m6249e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f5719e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m6246b(InterfaceC4395d interfaceC4395d, Bitmap bitmap, int i4, int i5) {
        float width;
        float height;
        if (bitmap.getWidth() == i4 && bitmap.getHeight() == i5) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i5 > bitmap.getHeight() * i4) {
            width = i5 / bitmap.getHeight();
            width2 = (i4 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i4 / bitmap.getWidth();
            height = (i5 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo5393d = interfaceC4395d.mo5393d(i4, i5, m6255k(bitmap));
        m6259o(bitmap, bitmapMo5393d);
        m6245a(bitmap, bitmapMo5393d, matrix);
        return bitmapMo5393d;
    }

    /* renamed from: c */
    public static Bitmap m6247c(InterfaceC4395d interfaceC4395d, Bitmap bitmap, int i4, int i5) {
        if (bitmap.getWidth() > i4 || bitmap.getHeight() > i5) {
            Log.isLoggable("TransformationUtils", 2);
            return m6250f(interfaceC4395d, bitmap, i4, i5);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    /* renamed from: d */
    public static Bitmap m6248d(InterfaceC4395d interfaceC4395d, Bitmap bitmap, int i4, int i5) {
        int iMin = Math.min(i4, i5);
        float f4 = iMin;
        float f5 = f4 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f4 / width, f4 / height);
        float f6 = width * fMax;
        float f7 = fMax * height;
        float f8 = (f4 - f6) / 2.0f;
        float f9 = (f4 - f7) / 2.0f;
        RectF rectF = new RectF(f8, f9, f6 + f8, f7 + f9);
        Bitmap bitmapM6251g = m6251g(interfaceC4395d, bitmap);
        Bitmap bitmapMo5393d = interfaceC4395d.mo5393d(iMin, iMin, m6252h(bitmap));
        bitmapMo5393d.setHasAlpha(true);
        Lock lock = f5719e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo5393d);
            canvas.drawCircle(f5, f5, f5, f5716b);
            canvas.drawBitmap(bitmapM6251g, (Rect) null, rectF, f5717c);
            m6249e(canvas);
            lock.unlock();
            if (!bitmapM6251g.equals(bitmap)) {
                interfaceC4395d.mo5392c(bitmapM6251g);
            }
            return bitmapMo5393d;
        } catch (Throwable th) {
            f5719e.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public static void m6249e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: f */
    public static Bitmap m6250f(InterfaceC4395d interfaceC4395d, Bitmap bitmap, int i4, int i5) {
        if (bitmap.getWidth() == i4 && bitmap.getHeight() == i5) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float fMin = Math.min(i4 / bitmap.getWidth(), i5 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Bitmap bitmapMo5393d = interfaceC4395d.mo5393d((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), m6255k(bitmap));
        m6259o(bitmap, bitmapMo5393d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i4);
            sb.append("x");
            sb.append(i5);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append("x");
            sb2.append(bitmap.getHeight());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(bitmapMo5393d.getWidth());
            sb3.append("x");
            sb3.append(bitmapMo5393d.getHeight());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(fMin);
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m6245a(bitmap, bitmapMo5393d, matrix);
        return bitmapMo5393d;
    }

    /* renamed from: g */
    public static Bitmap m6251g(InterfaceC4395d interfaceC4395d, Bitmap bitmap) {
        Bitmap.Config configM6252h = m6252h(bitmap);
        if (configM6252h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapMo5393d = interfaceC4395d.mo5393d(bitmap.getWidth(), bitmap.getHeight(), configM6252h);
        new Canvas(bitmapMo5393d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapMo5393d;
    }

    /* renamed from: h */
    public static Bitmap.Config m6252h(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    /* renamed from: i */
    public static Lock m6253i() {
        return f5719e;
    }

    /* renamed from: j */
    public static int m6254j(int i4) {
        switch (i4) {
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
    public static Bitmap.Config m6255k(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: l */
    public static void m6256l(int i4, Matrix matrix) {
        switch (i4) {
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
    public static boolean m6257m(int i4) {
        switch (i4) {
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
    public static Bitmap m6258n(InterfaceC4395d interfaceC4395d, Bitmap bitmap, int i4) {
        if (!m6257m(i4)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m6256l(i4, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapMo5393d = interfaceC4395d.mo5393d(Math.round(rectF.width()), Math.round(rectF.height()), m6255k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapMo5393d.setHasAlpha(bitmap.hasAlpha());
        m6245a(bitmap, bitmapMo5393d, matrix);
        return bitmapMo5393d;
    }

    /* renamed from: o */
    public static void m6259o(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
