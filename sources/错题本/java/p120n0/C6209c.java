package p120n0;

import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.nio.ByteBuffer;
import p016b0.InterfaceC3072g0;
import p077i0.C5666v;
import p111m0.C6082e;
import p178u7.C6651y;
import p180v0.AbstractC6654a;
import p202y.C6763f;

/* renamed from: n0.c */
/* loaded from: classes2.dex */
public final class C6209c implements InterfaceC6207a {

    /* renamed from: b */
    public static final C6209c f9928b = new C6209c(0);

    /* renamed from: a */
    public final /* synthetic */ int f9929a;

    public /* synthetic */ C6209c(int i) {
        this.f9929a = i;
    }

    @Override // p120n0.InterfaceC6207a
    /* renamed from: a */
    public final InterfaceC3072g0 mo2017a(InterfaceC3072g0 interfaceC3072g0, C6763f c6763f) {
        byte[] bArrArray;
        switch (this.f9929a) {
            case 0:
                return interfaceC3072g0;
            default:
                ByteBuffer byteBufferAsReadOnlyBuffer = ((C6082e) ((GifDrawable) interfaceC3072g0.get()).f2309a.f4733b).f9692a.f11384d.asReadOnlyBuffer();
                int i = AbstractC6654a.f11225a;
                C6651y c6651y = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C6651y(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
                if (c6651y != null && c6651y.f11218a == 0 && c6651y.f11219b == ((byte[]) c6651y.f11220c).length) {
                    bArrArray = byteBufferAsReadOnlyBuffer.array();
                } else {
                    ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
                    byteBufferAsReadOnlyBuffer2.position(0);
                    byteBufferAsReadOnlyBuffer2.get(bArr);
                    bArrArray = bArr;
                }
                return new C5666v(bArrArray);
        }
    }
}
