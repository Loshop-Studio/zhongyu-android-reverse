package p298q0;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p168h0.InterfaceC9435b;
import p213k0.InterfaceC9772d;

/* renamed from: q0.j */
/* loaded from: classes3.dex */
public class C10701j extends AbstractC10698g {

    /* renamed from: b */
    public static final byte[] f25765b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC9435b.f21837a);

    @Override // p168h0.InterfaceC9435b
    /* renamed from: b */
    public void mo2797b(MessageDigest messageDigest) {
        messageDigest.update(f25765b);
    }

    @Override // p298q0.AbstractC10698g
    /* renamed from: c */
    public Bitmap mo22661c(InterfaceC9772d interfaceC9772d, Bitmap bitmap, int i10, int i11) {
        return AbstractC10716y.m22691b(interfaceC9772d, bitmap, i10, i11);
    }

    @Override // p168h0.InterfaceC9435b
    public boolean equals(Object obj) {
        return obj instanceof C10701j;
    }

    @Override // p168h0.InterfaceC9435b
    public int hashCode() {
        return -599754482;
    }
}
