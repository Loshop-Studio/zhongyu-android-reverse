package p261v0;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import p162m0.C8539d;
import p162m0.InterfaceC8540e;
import p184o0.InterfaceC8690j;
import p195p0.C8805e;
import p195p0.InterfaceC8804d;
import p250u0.C9531c;

/* renamed from: v0.e */
/* loaded from: classes3.dex */
public final class C9632e implements InterfaceC8540e {

    /* renamed from: a */
    public final InterfaceC8804d f16819a = new C8805e();

    @Override // p162m0.InterfaceC8540e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo3616a(Object obj, C8539d c8539d) {
        return m16001d(AbstractC9631d.m15999a(obj), c8539d);
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC8690j mo3617b(Object obj, int i10, int i11, C8539d c8539d) {
        return m16000c(AbstractC9631d.m15999a(obj), i10, i11, c8539d);
    }

    /* renamed from: c */
    public InterfaceC8690j m16000c(ImageDecoder.Source source, int i10, int i11, C8539d c8539d) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C9531c(i10, i11, c8539d));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new C9633f(bitmapDecodeBitmap, this.f16819a);
    }

    /* renamed from: d */
    public boolean m16001d(ImageDecoder.Source source, C8539d c8539d) {
        return true;
    }
}
