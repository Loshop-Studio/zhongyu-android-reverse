package p298q0;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import com.alibaba.fastjson.asm.Opcodes;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p109d1.AbstractC8909j;
import p213k0.InterfaceC9772d;

/* renamed from: q0.y */
/* loaded from: classes3.dex */
public abstract class AbstractC10716y {

    /* renamed from: a */
    public static final Paint f25787a = new Paint(6);

    /* renamed from: b */
    public static final Paint f25788b = new Paint(7);

    /* renamed from: c */
    public static final Paint f25789c;

    /* renamed from: d */
    public static final Set f25790d;

    /* renamed from: e */
    public static final Lock f25791e;

    /* renamed from: q0.y$a */
    public class a implements b {

        /* renamed from: a */
        public final /* synthetic */ int f25792a;

        public a(int i10) {
            this.f25792a = i10;
        }

        @Override // p298q0.AbstractC10716y.b
        /* renamed from: a */
        public void mo22706a(Canvas canvas, Paint paint, RectF rectF) {
            int i10 = this.f25792a;
            canvas.drawRoundRect(rectF, i10, i10, paint);
        }
    }

    /* renamed from: q0.y$b */
    public interface b {
        /* renamed from: a */
        void mo22706a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* renamed from: q0.y$c */
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
        f25790d = hashSet;
        f25791e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new c();
        Paint paint = new Paint(7);
        f25789c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m22690a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f25791e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f25787a);
            m22693d(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f25791e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m22691b(InterfaceC9772d interfaceC9772d, Bitmap bitmap, int i10, int i11) {
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
        Bitmap bitmapMo19711d = interfaceC9772d.mo19711d(i10, i11, m22699j(bitmap));
        m22705p(bitmap, bitmapMo19711d);
        m22690a(bitmap, bitmapMo19711d, matrix);
        return bitmapMo19711d;
    }

    /* renamed from: c */
    public static Bitmap m22692c(InterfaceC9772d interfaceC9772d, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            Log.isLoggable("TransformationUtils", 2);
            return m22694e(interfaceC9772d, bitmap, i10, i11);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    /* renamed from: d */
    public static void m22693d(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: e */
    public static Bitmap m22694e(InterfaceC9772d interfaceC9772d, Bitmap bitmap, int i10, int i11) {
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
        Bitmap bitmapMo19711d = interfaceC9772d.mo19711d((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), m22699j(bitmap));
        m22705p(bitmap, bitmapMo19711d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            bitmapMo19711d.getWidth();
            bitmapMo19711d.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m22690a(bitmap, bitmapMo19711d, matrix);
        return bitmapMo19711d;
    }

    /* renamed from: f */
    public static Bitmap m22695f(InterfaceC9772d interfaceC9772d, Bitmap bitmap) {
        Bitmap.Config configM22696g = m22696g(bitmap);
        if (configM22696g.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapMo19711d = interfaceC9772d.mo19711d(bitmap.getWidth(), bitmap.getHeight(), configM22696g);
        new Canvas(bitmapMo19711d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapMo19711d;
    }

    /* renamed from: g */
    public static Bitmap.Config m22696g(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    /* renamed from: h */
    public static Lock m22697h() {
        return f25791e;
    }

    /* renamed from: i */
    public static int m22698i(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return Opcodes.GETFIELD;
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

    /* renamed from: j */
    public static Bitmap.Config m22699j(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: k */
    public static void m22700k(int i10, Matrix matrix) {
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

    /* renamed from: l */
    public static boolean m22701l(int i10) {
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

    /* renamed from: m */
    public static Bitmap m22702m(InterfaceC9772d interfaceC9772d, Bitmap bitmap, int i10) {
        if (!m22701l(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m22700k(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapMo19711d = interfaceC9772d.mo19711d(Math.round(rectF.width()), Math.round(rectF.height()), m22699j(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapMo19711d.setHasAlpha(bitmap.hasAlpha());
        m22690a(bitmap, bitmapMo19711d, matrix);
        return bitmapMo19711d;
    }

    /* renamed from: n */
    public static Bitmap m22703n(InterfaceC9772d interfaceC9772d, Bitmap bitmap, int i10) {
        AbstractC8909j.m17465a(i10 > 0, "roundingRadius must be greater than 0.");
        return m22704o(interfaceC9772d, bitmap, new a(i10));
    }

    /* renamed from: o */
    public static Bitmap m22704o(InterfaceC9772d interfaceC9772d, Bitmap bitmap, b bVar) {
        Bitmap.Config configM22696g = m22696g(bitmap);
        Bitmap bitmapM22695f = m22695f(interfaceC9772d, bitmap);
        Bitmap bitmapMo19711d = interfaceC9772d.mo19711d(bitmapM22695f.getWidth(), bitmapM22695f.getHeight(), configM22696g);
        bitmapMo19711d.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapM22695f, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapMo19711d.getWidth(), bitmapMo19711d.getHeight());
        Lock lock = f25791e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo19711d);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            bVar.mo22706a(canvas, paint, rectF);
            m22693d(canvas);
            lock.unlock();
            if (!bitmapM22695f.equals(bitmap)) {
                interfaceC9772d.mo19710c(bitmapM22695f);
            }
            return bitmapMo19711d;
        } catch (Throwable th) {
            f25791e.unlock();
            throw th;
        }
    }

    /* renamed from: p */
    public static void m22705p(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
