package p172n;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import okio.BufferedSource;
import p030c0.AbstractC5075a;

/* renamed from: n.o */
/* loaded from: classes3.dex */
public final class C8600o {

    /* renamed from: a */
    public static final C8600o f14238a = new C8600o();

    /* renamed from: b */
    public static final Paint f14239b = new Paint(3);

    /* renamed from: a */
    public final C8592i m14153a(String str, BufferedSource bufferedSource, InterfaceC8599n interfaceC8599n) {
        if (!interfaceC8599n.mo14146c(str, bufferedSource)) {
            return C8592i.f14227d;
        }
        ExifInterface exifInterface = new ExifInterface(new C8594j(bufferedSource.peek().inputStream()));
        return new C8592i(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
    }

    /* renamed from: b */
    public final Bitmap m14154b(Bitmap bitmap, C8592i c8592i) {
        if (!c8592i.m14141b() && !AbstractC8601p.m14155a(c8592i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (c8592i.m14141b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (AbstractC8601p.m14155a(c8592i)) {
            matrix.postRotate(c8592i.m14140a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (f10 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        Bitmap bitmapCreateBitmap = AbstractC8601p.m14156b(c8592i) ? Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), AbstractC5075a.m2664c(bitmap)) : Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), AbstractC5075a.m2664c(bitmap));
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, f14239b);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }
}
