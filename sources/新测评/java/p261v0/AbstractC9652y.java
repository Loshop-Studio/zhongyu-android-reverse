package p261v0;

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
import p195p0.InterfaceC8804d;

/* renamed from: v0.y */
/* loaded from: classes3.dex */
public abstract class AbstractC9652y {

    /* renamed from: a */
    public static final Paint f16845a = new Paint(6);

    /* renamed from: b */
    public static final Paint f16846b = new Paint(7);

    /* renamed from: c */
    public static final Paint f16847c;

    /* renamed from: d */
    public static final Set f16848d;

    /* renamed from: e */
    public static final Lock f16849e;

    /* renamed from: v0.y$a */
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
        public boolean tryLock(long j10, TimeUnit timeUnit) {
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
        f16848d = hashSet;
        f16849e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f16847c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m16033a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f16849e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f16845a);
            m16037e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f16849e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m16034b(InterfaceC8804d interfaceC8804d, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            width2 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo14713d = interfaceC8804d.mo14713d(i10, i11, m16043k(bitmap));
        m16047o(bitmap, bitmapMo14713d);
        m16033a(bitmap, bitmapMo14713d, matrix);
        return bitmapMo14713d;
    }

    /* renamed from: c */
    public static Bitmap m16035c(InterfaceC8804d interfaceC8804d, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            Log.isLoggable("TransformationUtils", 2);
            return m16038f(interfaceC8804d, bitmap, i10, i11);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    /* renamed from: d */
    public static Bitmap m16036d(InterfaceC8804d interfaceC8804d, Bitmap bitmap, int i10, int i11) {
        int iMin = Math.min(i10, i11);
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
        Bitmap bitmapM16039g = m16039g(interfaceC8804d, bitmap);
        Bitmap bitmapMo14713d = interfaceC8804d.mo14713d(iMin, iMin, m16040h(bitmap));
        bitmapMo14713d.setHasAlpha(true);
        Lock lock = f16849e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo14713d);
            canvas.drawCircle(f11, f11, f11, f16846b);
            canvas.drawBitmap(bitmapM16039g, (Rect) null, rectF, f16847c);
            m16037e(canvas);
            lock.unlock();
            if (!bitmapM16039g.equals(bitmap)) {
                interfaceC8804d.mo14712c(bitmapM16039g);
            }
            return bitmapMo14713d;
        } catch (Throwable th) {
            f16849e.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public static void m16037e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: f */
    public static Bitmap m16038f(InterfaceC8804d interfaceC8804d, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float fMin = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Bitmap bitmapMo14713d = interfaceC8804d.mo14713d((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), m16043k(bitmap));
        m16047o(bitmap, bitmapMo14713d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            bitmapMo14713d.getWidth();
            bitmapMo14713d.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m16033a(bitmap, bitmapMo14713d, matrix);
        return bitmapMo14713d;
    }

    /* renamed from: g */
    public static Bitmap m16039g(InterfaceC8804d interfaceC8804d, Bitmap bitmap) {
        Bitmap.Config configM16040h = m16040h(bitmap);
        if (configM16040h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapMo14713d = interfaceC8804d.mo14713d(bitmap.getWidth(), bitmap.getHeight(), configM16040h);
        new Canvas(bitmapMo14713d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapMo14713d;
    }

    /* renamed from: h */
    public static Bitmap.Config m16040h(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    /* renamed from: i */
    public static Lock m16041i() {
        return f16849e;
    }

    /* renamed from: j */
    public static int m16042j(int i10) {
        switch (i10) {
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
    public static Bitmap.Config m16043k(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: l */
    public static void m16044l(int i10, Matrix matrix) {
        switch (i10) {
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
    public static boolean m16045m(int i10) {
        switch (i10) {
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
    public static Bitmap m16046n(InterfaceC8804d interfaceC8804d, Bitmap bitmap, int i10) {
        if (!m16045m(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m16044l(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapMo14713d = interfaceC8804d.mo14713d(Math.round(rectF.width()), Math.round(rectF.height()), m16043k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapMo14713d.setHasAlpha(bitmap.hasAlpha());
        m16033a(bitmap, bitmapMo14713d, matrix);
        return bitmapMo14713d;
    }

    /* renamed from: o */
    public static void m16047o(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
