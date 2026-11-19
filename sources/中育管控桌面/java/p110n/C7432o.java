package p110n;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import okio.BufferedSource;
import p023c0.AbstractC4455a;

/* renamed from: n.o */
/* loaded from: classes3.dex */
public final class C7432o {

    /* renamed from: a */
    public static final C7432o f9491a = new C7432o();

    /* renamed from: b */
    public static final Paint f9492b = new Paint(3);

    /* renamed from: a */
    public final C7424i m8474a(String str, BufferedSource bufferedSource, InterfaceC7431n interfaceC7431n) {
        if (!interfaceC7431n.mo8467c(str, bufferedSource)) {
            return C7424i.f9480d;
        }
        ExifInterface exifInterface = new ExifInterface(new C7426j(bufferedSource.peek().inputStream()));
        return new C7424i(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
    }

    /* renamed from: b */
    public final Bitmap m8475b(Bitmap bitmap, C7424i c7424i) {
        if (!c7424i.m8462b() && !AbstractC7433p.m8476a(c7424i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (c7424i.m8462b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (AbstractC7433p.m8476a(c7424i)) {
            matrix.postRotate(c7424i.m8461a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f6 = rectF.left;
        if (f6 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f6, -rectF.top);
        }
        Bitmap bitmapCreateBitmap = AbstractC7433p.m8477b(c7424i) ? Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), AbstractC4455a.m1521c(bitmap)) : Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), AbstractC4455a.m1521c(bitmap));
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, f9492b);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }
}
