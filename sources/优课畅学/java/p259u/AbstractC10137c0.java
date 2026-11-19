package p259u;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import com.tencent.rtmp.TXLiveConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p116h0.AbstractC8706j;
import p193o.InterfaceC9500d;

/* renamed from: u.c0 */
/* loaded from: classes3.dex */
public abstract class AbstractC10137c0 {

    /* renamed from: a */
    public static final Paint f20257a = new Paint(6);

    /* renamed from: b */
    public static final Paint f20258b = new Paint(7);

    /* renamed from: c */
    public static final Paint f20259c;

    /* renamed from: d */
    public static final Set f20260d;

    /* renamed from: e */
    public static final Lock f20261e;

    /* renamed from: u.c0$a */
    public class a implements b {

        /* renamed from: a */
        public final /* synthetic */ int f20262a;

        public a(int i10) {
            this.f20262a = i10;
        }

        @Override // p259u.AbstractC10137c0.b
        /* renamed from: a */
        public void mo18989a(Canvas canvas, Paint paint, RectF rectF) {
            int i10 = this.f20262a;
            canvas.drawRoundRect(rectF, i10, i10, paint);
        }
    }

    /* renamed from: u.c0$b */
    public interface b {
        /* renamed from: a */
        void mo18989a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* renamed from: u.c0$c */
    public static final class c implements Lock {
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
        f20260d = hashSet;
        f20261e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new c();
        Paint paint = new Paint(7);
        f20259c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m18972a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f20261e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f20257a);
            m18976e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f20261e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m18973b(InterfaceC9500d interfaceC9500d, Bitmap bitmap, int i10, int i11) {
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
        Bitmap bitmapMo17621c = interfaceC9500d.mo17621c(i10, i11, m18982k(bitmap));
        m18988q(bitmap, bitmapMo17621c);
        m18972a(bitmap, bitmapMo17621c, matrix);
        return bitmapMo17621c;
    }

    /* renamed from: c */
    public static Bitmap m18974c(InterfaceC9500d interfaceC9500d, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            Log.isLoggable("TransformationUtils", 2);
            return m18977f(interfaceC9500d, bitmap, i10, i11);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    /* renamed from: d */
    public static Bitmap m18975d(InterfaceC9500d interfaceC9500d, Bitmap bitmap, int i10, int i11) {
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
        Bitmap bitmapM18978g = m18978g(interfaceC9500d, bitmap);
        Bitmap bitmapMo17621c = interfaceC9500d.mo17621c(iMin, iMin, m18979h(bitmap));
        bitmapMo17621c.setHasAlpha(true);
        Lock lock = f20261e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo17621c);
            canvas.drawCircle(f11, f11, f11, f20258b);
            canvas.drawBitmap(bitmapM18978g, (Rect) null, rectF, f20259c);
            m18976e(canvas);
            lock.unlock();
            if (!bitmapM18978g.equals(bitmap)) {
                interfaceC9500d.mo17620b(bitmapM18978g);
            }
            return bitmapMo17621c;
        } catch (Throwable th) {
            f20261e.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public static void m18976e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: f */
    public static Bitmap m18977f(InterfaceC9500d interfaceC9500d, Bitmap bitmap, int i10, int i11) {
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
        Bitmap bitmapMo17621c = interfaceC9500d.mo17621c((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), m18982k(bitmap));
        m18988q(bitmap, bitmapMo17621c);
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            bitmapMo17621c.getWidth();
            bitmapMo17621c.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m18972a(bitmap, bitmapMo17621c, matrix);
        return bitmapMo17621c;
    }

    /* renamed from: g */
    public static Bitmap m18978g(InterfaceC9500d interfaceC9500d, Bitmap bitmap) {
        Bitmap.Config configM18979h = m18979h(bitmap);
        if (configM18979h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapMo17621c = interfaceC9500d.mo17621c(bitmap.getWidth(), bitmap.getHeight(), configM18979h);
        new Canvas(bitmapMo17621c).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapMo17621c;
    }

    /* renamed from: h */
    public static Bitmap.Config m18979h(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    /* renamed from: i */
    public static Lock m18980i() {
        return f20261e;
    }

    /* renamed from: j */
    public static int m18981j(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return TXLiveConstants.RENDER_ROTATION_180;
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
    public static Bitmap.Config m18982k(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: l */
    public static void m18983l(int i10, Matrix matrix) {
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
    public static boolean m18984m(int i10) {
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
    public static Bitmap m18985n(InterfaceC9500d interfaceC9500d, Bitmap bitmap, int i10) {
        if (!m18984m(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m18983l(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapMo17621c = interfaceC9500d.mo17621c(Math.round(rectF.width()), Math.round(rectF.height()), m18982k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapMo17621c.setHasAlpha(bitmap.hasAlpha());
        m18972a(bitmap, bitmapMo17621c, matrix);
        return bitmapMo17621c;
    }

    /* renamed from: o */
    public static Bitmap m18986o(InterfaceC9500d interfaceC9500d, Bitmap bitmap, int i10) {
        AbstractC8706j.m14178a(i10 > 0, "roundingRadius must be greater than 0.");
        return m18987p(interfaceC9500d, bitmap, new a(i10));
    }

    /* renamed from: p */
    public static Bitmap m18987p(InterfaceC9500d interfaceC9500d, Bitmap bitmap, b bVar) {
        Bitmap.Config configM18979h = m18979h(bitmap);
        Bitmap bitmapM18978g = m18978g(interfaceC9500d, bitmap);
        Bitmap bitmapMo17621c = interfaceC9500d.mo17621c(bitmapM18978g.getWidth(), bitmapM18978g.getHeight(), configM18979h);
        bitmapMo17621c.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapM18978g, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapMo17621c.getWidth(), bitmapMo17621c.getHeight());
        Lock lock = f20261e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo17621c);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            bVar.mo18989a(canvas, paint, rectF);
            m18976e(canvas);
            lock.unlock();
            if (!bitmapM18978g.equals(bitmap)) {
                interfaceC9500d.mo17620b(bitmapM18978g);
            }
            return bitmapMo17621c;
        } catch (Throwable th) {
            f20261e.unlock();
            throw th;
        }
    }

    /* renamed from: q */
    public static void m18988q(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
