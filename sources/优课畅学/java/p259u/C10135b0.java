package p259u;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p116h0.AbstractC8706j;
import p116h0.AbstractC8707k;
import p160l.InterfaceC9228b;
import p193o.InterfaceC9500d;

/* renamed from: u.b0 */
/* loaded from: classes3.dex */
public final class C10135b0 extends AbstractC10143g {

    /* renamed from: c */
    public static final byte[] f20252c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC9228b.f18210a);

    /* renamed from: b */
    public final int f20253b;

    public C10135b0(int i10) {
        AbstractC8706j.m14178a(i10 > 0, "roundingRadius must be greater than 0.");
        this.f20253b = i10;
    }

    @Override // p160l.InterfaceC9228b
    /* renamed from: b */
    public void mo13883b(MessageDigest messageDigest) {
        messageDigest.update(f20252c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f20253b).array());
    }

    @Override // p259u.AbstractC10143g
    /* renamed from: c */
    public Bitmap mo18969c(InterfaceC9500d interfaceC9500d, Bitmap bitmap, int i10, int i11) {
        return AbstractC10137c0.m18986o(interfaceC9500d, bitmap, this.f20253b);
    }

    @Override // p160l.InterfaceC9228b
    public boolean equals(Object obj) {
        return (obj instanceof C10135b0) && this.f20253b == ((C10135b0) obj).f20253b;
    }

    @Override // p160l.InterfaceC9228b
    public int hashCode() {
        return AbstractC8707k.m14197o(-569625254, AbstractC8707k.m14196n(this.f20253b));
    }
}
