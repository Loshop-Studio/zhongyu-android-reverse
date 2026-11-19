package p118o0;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p067h0.InterfaceC6440j;
import p074i0.C6500e;
import p074i0.InterfaceC6499d;
import p111n0.C7446c;

/* renamed from: o0.e */
/* loaded from: classes3.dex */
public final class C7494e implements InterfaceC6286e {

    /* renamed from: a */
    public final InterfaceC6499d f9676a = new C6500e();

    @Override // p053f0.InterfaceC6286e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC6440j mo2796a(Object obj, int i6, int i7, C6285d c6285d) {
        return m8617c(AbstractC7493d.m8616a(obj), i6, i7, c6285d);
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo2797b(Object obj, C6285d c6285d) {
        return m8618d(AbstractC7493d.m8616a(obj), c6285d);
    }

    /* renamed from: c */
    public InterfaceC6440j m8617c(ImageDecoder.Source source, int i6, int i7, C6285d c6285d) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C7446c(i6, i7, c6285d));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new C7495f(bitmapDecodeBitmap, this.f9676a);
    }

    /* renamed from: d */
    public boolean m8618d(ImageDecoder.Source source, C6285d c6285d) {
        return true;
    }
}
