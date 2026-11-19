package p122t;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Log;
import java.io.IOException;
import p093m.InterfaceC4361j;
import p098n.C4396e;
import p098n.InterfaceC4395d;
import p118s.AbstractC4540j;

/* renamed from: t.d */
/* loaded from: classes2.dex */
public final class C4557d extends AbstractC4540j {

    /* renamed from: b */
    public final InterfaceC4395d f5726b = new C4396e();

    @Override // p118s.AbstractC4540j
    /* renamed from: c */
    public InterfaceC4361j mo6176c(ImageDecoder.Source source, int i4, int i5, ImageDecoder$OnHeaderDecodedListener imageDecoder$OnHeaderDecodedListener) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, imageDecoder$OnHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoded [");
            sb.append(bitmapDecodeBitmap.getWidth());
            sb.append("x");
            sb.append(bitmapDecodeBitmap.getHeight());
            sb.append("] for [");
            sb.append(i4);
            sb.append("x");
            sb.append(i5);
            sb.append("]");
        }
        return new C4559e(bitmapDecodeBitmap, this.f5726b);
    }
}
