package p183n;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import okio.BufferedSource;
import p090e0.AbstractC7803a;

/* renamed from: n.o */
/* loaded from: classes3.dex */
public final class C9070o {

    /* renamed from: a */
    public static final C9070o f15254a = new C9070o();

    /* renamed from: b */
    public static final Paint f15255b = new Paint(3);

    /* renamed from: a */
    public final C9062i m14544a(String str, BufferedSource bufferedSource, InterfaceC9069n interfaceC9069n) {
        if (!interfaceC9069n.mo14537c(str, bufferedSource)) {
            return C9062i.f15243d;
        }
        ExifInterface exifInterface = new ExifInterface(new C9064j(bufferedSource.peek().inputStream()));
        return new C9062i(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
    }

    /* renamed from: b */
    public final Bitmap m14545b(Bitmap bitmap, C9062i c9062i) {
        if (!c9062i.m14532b() && !AbstractC9071p.m14546a(c9062i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (c9062i.m14532b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (AbstractC9071p.m14546a(c9062i)) {
            matrix.postRotate(c9062i.m14531a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (f10 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        Bitmap bitmapCreateBitmap = AbstractC9071p.m14547b(c9062i) ? Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), AbstractC7803a.m12172c(bitmap)) : Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), AbstractC7803a.m12172c(bitmap));
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, f15255b);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }
}
