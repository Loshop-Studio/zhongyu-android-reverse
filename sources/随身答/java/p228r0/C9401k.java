package p228r0;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p122h0.InterfaceC8082b;
import p164l0.InterfaceC8867d;

/* renamed from: r0.k */
/* loaded from: classes3.dex */
public class C9401k extends AbstractC9396f {

    /* renamed from: b */
    public static final byte[] f16393b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(InterfaceC8082b.f13784a);

    @Override // p122h0.InterfaceC8082b
    /* renamed from: a */
    public void mo12082a(MessageDigest messageDigest) {
        messageDigest.update(f16393b);
    }

    @Override // p228r0.AbstractC9396f
    /* renamed from: c */
    public Bitmap mo15466c(InterfaceC8867d interfaceC8867d, Bitmap bitmap, int i9, int i10) {
        return AbstractC9414x.m15494d(interfaceC8867d, bitmap, i9, i10);
    }

    @Override // p122h0.InterfaceC8082b
    public boolean equals(Object obj) {
        return obj instanceof C9401k;
    }

    @Override // p122h0.InterfaceC8082b
    public int hashCode() {
        return 1101716364;
    }
}
