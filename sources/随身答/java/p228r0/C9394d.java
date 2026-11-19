package p228r0;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Log;
import java.io.IOException;
import p152k0.InterfaceC8259j;
import p164l0.C8868e;
import p164l0.InterfaceC8867d;
import p218q0.AbstractC9348d;

/* renamed from: r0.d */
/* loaded from: classes3.dex */
public final class C9394d extends AbstractC9348d {

    /* renamed from: b */
    public final InterfaceC8867d f16386b = new C8868e();

    @Override // p218q0.AbstractC9348d
    /* renamed from: c */
    public InterfaceC8259j mo15290c(ImageDecoder.Source source, int i9, int i10, ImageDecoder$OnHeaderDecodedListener imageDecoder$OnHeaderDecodedListener) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, imageDecoder$OnHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new C9395e(bitmapDecodeBitmap, this.f16386b);
    }
}
