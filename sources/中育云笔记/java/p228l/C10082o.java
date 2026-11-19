package p228l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import okio.BufferedSource;
import p001a0.AbstractC0003a;

/* renamed from: l.o */
/* loaded from: classes3.dex */
public final class C10082o {

    /* renamed from: a */
    public static final C10082o f24096a = new C10082o();

    /* renamed from: b */
    public static final Paint f24097b = new Paint(3);

    /* renamed from: a */
    public final C10074i m21086a(String str, BufferedSource bufferedSource, InterfaceC10081n interfaceC10081n) {
        if (!interfaceC10081n.mo21079c(str, bufferedSource)) {
            return C10074i.f24085d;
        }
        ExifInterface exifInterface = new ExifInterface(new C10076j(bufferedSource.peek().inputStream()));
        return new C10074i(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
    }

    /* renamed from: b */
    public final Bitmap m21087b(Bitmap bitmap, C10074i c10074i) {
        if (!c10074i.m21074b() && !AbstractC10083p.m21088a(c10074i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (c10074i.m21074b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (AbstractC10083p.m21088a(c10074i)) {
            matrix.postRotate(c10074i.m21073a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (f10 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        Bitmap bitmapCreateBitmap = AbstractC10083p.m21089b(c10074i) ? Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), AbstractC0003a.m5c(bitmap)) : Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), AbstractC0003a.m5c(bitmap));
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, f24097b);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }
}
