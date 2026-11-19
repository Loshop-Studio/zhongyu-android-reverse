package p298q0;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p168h0.InterfaceC9435b;
import p213k0.InterfaceC9772d;

/* renamed from: q0.r */
/* loaded from: classes3.dex */
public class C10709r extends AbstractC10698g {

    /* renamed from: b */
    public static final byte[] f25770b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC9435b.f21837a);

    @Override // p168h0.InterfaceC9435b
    /* renamed from: b */
    public void mo2797b(MessageDigest messageDigest) {
        messageDigest.update(f25770b);
    }

    @Override // p298q0.AbstractC10698g
    /* renamed from: c */
    public Bitmap mo22661c(InterfaceC9772d interfaceC9772d, Bitmap bitmap, int i10, int i11) {
        return AbstractC10716y.m22694e(interfaceC9772d, bitmap, i10, i11);
    }

    @Override // p168h0.InterfaceC9435b
    public boolean equals(Object obj) {
        return obj instanceof C10709r;
    }

    @Override // p168h0.InterfaceC9435b
    public int hashCode() {
        return 1572326941;
    }
}
