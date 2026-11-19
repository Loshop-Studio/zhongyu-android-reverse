package p228r0;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p122h0.InterfaceC8082b;
import p164l0.InterfaceC8867d;

/* renamed from: r0.j */
/* loaded from: classes3.dex */
public class C9400j extends AbstractC9396f {

    /* renamed from: b */
    public static final byte[] f16392b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC8082b.f13784a);

    @Override // p122h0.InterfaceC8082b
    /* renamed from: a */
    public void mo12082a(MessageDigest messageDigest) {
        messageDigest.update(f16392b);
    }

    @Override // p228r0.AbstractC9396f
    /* renamed from: c */
    public Bitmap mo15466c(InterfaceC8867d interfaceC8867d, Bitmap bitmap, int i9, int i10) {
        return AbstractC9414x.m15493c(interfaceC8867d, bitmap, i9, i10);
    }

    @Override // p122h0.InterfaceC8082b
    public boolean equals(Object obj) {
        return obj instanceof C9400j;
    }

    @Override // p122h0.InterfaceC8082b
    public int hashCode() {
        return -670243078;
    }
}
