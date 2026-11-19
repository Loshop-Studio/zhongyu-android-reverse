package p077i0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.compose.material3.AbstractC1923c;
import java.security.MessageDigest;
import p024c0.InterfaceC3205b;
import p202y.InterfaceC6760c;

/* renamed from: i0.f */
/* loaded from: classes2.dex */
public final class C5650f extends AbstractC5648d {

    /* renamed from: b */
    public static final byte[] f8788b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC6760c.f11429a);

    @Override // p202y.InterfaceC6760c
    /* renamed from: b */
    public final void mo2013b(MessageDigest messageDigest) {
        messageDigest.update(f8788b);
    }

    @Override // p077i0.AbstractC5648d
    /* renamed from: c */
    public final Bitmap mo4973c(InterfaceC3205b interfaceC3205b, Bitmap bitmap, int i, int i8) {
        float width;
        float fM1061y;
        Paint paint = AbstractC5665u.f8826a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i8) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float fM1061y2 = 0.0f;
        if (bitmap.getWidth() * i8 > bitmap.getHeight() * i) {
            width = i8 / bitmap.getHeight();
            fM1061y2 = AbstractC1923c.m1061y(bitmap.getWidth(), width, i, 0.5f);
            fM1061y = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            fM1061y = AbstractC1923c.m1061y(bitmap.getHeight(), width, i8, 0.5f);
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (fM1061y2 + 0.5f), (int) (fM1061y + 0.5f));
        Bitmap bitmapMo2145i = interfaceC3205b.mo2145i(i, i8, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo2145i.setHasAlpha(bitmap.hasAlpha());
        AbstractC5665u.m4994a(bitmap, bitmapMo2145i, matrix);
        return bitmapMo2145i;
    }

    @Override // p202y.InterfaceC6760c
    public final boolean equals(Object obj) {
        return obj instanceof C5650f;
    }

    @Override // p202y.InterfaceC6760c
    public final int hashCode() {
        return -599754482;
    }
}
