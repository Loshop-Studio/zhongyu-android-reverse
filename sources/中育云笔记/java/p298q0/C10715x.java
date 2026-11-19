package p298q0;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p109d1.AbstractC8909j;
import p109d1.AbstractC8910k;
import p168h0.InterfaceC9435b;
import p213k0.InterfaceC9772d;

/* renamed from: q0.x */
/* loaded from: classes3.dex */
public final class C10715x extends AbstractC10698g {

    /* renamed from: c */
    public static final byte[] f25785c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC9435b.f21837a);

    /* renamed from: b */
    public final int f25786b;

    public C10715x(int i10) {
        AbstractC8909j.m17465a(i10 > 0, "roundingRadius must be greater than 0.");
        this.f25786b = i10;
    }

    @Override // p168h0.InterfaceC9435b
    /* renamed from: b */
    public void mo2797b(MessageDigest messageDigest) {
        messageDigest.update(f25785c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f25786b).array());
    }

    @Override // p298q0.AbstractC10698g
    /* renamed from: c */
    public Bitmap mo22661c(InterfaceC9772d interfaceC9772d, Bitmap bitmap, int i10, int i11) {
        return AbstractC10716y.m22703n(interfaceC9772d, bitmap, this.f25786b);
    }

    @Override // p168h0.InterfaceC9435b
    public boolean equals(Object obj) {
        return (obj instanceof C10715x) && this.f25786b == ((C10715x) obj).f25786b;
    }

    @Override // p168h0.InterfaceC9435b
    public int hashCode() {
        return AbstractC8910k.m17484o(-569625254, AbstractC8910k.m17483n(this.f25786b));
    }
}
