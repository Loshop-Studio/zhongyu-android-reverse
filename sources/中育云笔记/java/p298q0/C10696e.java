package p298q0;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import p168h0.C9438e;
import p168h0.InterfaceC9439f;
import p198j0.InterfaceC9657j;
import p213k0.C9773e;
import p213k0.InterfaceC9772d;
import p284p0.C10596c;

/* renamed from: q0.e */
/* loaded from: classes3.dex */
public final class C10696e implements InterfaceC9439f {

    /* renamed from: a */
    public final InterfaceC9772d f25760a = new C9773e();

    @Override // p168h0.InterfaceC9439f
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo4265a(Object obj, C9438e c9438e) {
        return m22658d(AbstractC10695d.m22656a(obj), c9438e);
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC9657j mo4266b(Object obj, int i10, int i11, C9438e c9438e) {
        return m22657c(AbstractC10695d.m22656a(obj), i10, i11, c9438e);
    }

    /* renamed from: c */
    public InterfaceC9657j m22657c(ImageDecoder.Source source, int i10, int i11, C9438e c9438e) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C10596c(i10, i11, c9438e));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new C10697f(bitmapDecodeBitmap, this.f25760a);
    }

    /* renamed from: d */
    public boolean m22658d(ImageDecoder.Source source, C9438e c9438e) {
        return true;
    }
}
