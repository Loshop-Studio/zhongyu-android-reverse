package p259u;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import p160l.C9230d;
import p160l.InterfaceC9231e;
import p182n.InterfaceC9357j;
import p193o.C9501e;
import p193o.InterfaceC9500d;
import p248t.C10082i;

/* renamed from: u.e */
/* loaded from: classes3.dex */
public final class C10140e implements InterfaceC9231e {

    /* renamed from: a */
    public final InterfaceC9500d f20264a = new C9501e();

    @Override // p160l.InterfaceC9231e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC9357j mo3061a(Object obj, int i10, int i11, C9230d c9230d) {
        return m18994c(AbstractC10138d.m18990a(obj), i10, i11, c9230d);
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo3062b(Object obj, C9230d c9230d) {
        return m18995d(AbstractC10138d.m18990a(obj), c9230d);
    }

    /* renamed from: c */
    public InterfaceC9357j m18994c(ImageDecoder.Source source, int i10, int i11, C9230d c9230d) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C10082i(i10, i11, c9230d));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new C10142f(bitmapDecodeBitmap, this.f20264a);
    }

    /* renamed from: d */
    public boolean m18995d(ImageDecoder.Source source, C9230d c9230d) {
        return true;
    }
}
