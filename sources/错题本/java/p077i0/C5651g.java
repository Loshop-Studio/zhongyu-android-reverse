package p077i0;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import p024c0.InterfaceC3205b;
import p202y.InterfaceC6760c;

/* renamed from: i0.g */
/* loaded from: classes2.dex */
public final class C5651g extends AbstractC5648d {

    /* renamed from: b */
    public static final byte[] f8789b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC6760c.f11429a);

    @Override // p202y.InterfaceC6760c
    /* renamed from: b */
    public final void mo2013b(MessageDigest messageDigest) {
        messageDigest.update(f8789b);
    }

    @Override // p077i0.AbstractC5648d
    /* renamed from: c */
    public final Bitmap mo4973c(InterfaceC3205b interfaceC3205b, Bitmap bitmap, int i, int i8) {
        Paint paint = AbstractC5665u.f8826a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i8) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return AbstractC5665u.m4995b(interfaceC3205b, bitmap, i, i8);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // p202y.InterfaceC6760c
    public final boolean equals(Object obj) {
        return obj instanceof C5651g;
    }

    @Override // p202y.InterfaceC6760c
    public final int hashCode() {
        return -670243078;
    }
}
