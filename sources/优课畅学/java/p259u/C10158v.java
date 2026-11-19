package p259u;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p160l.InterfaceC9228b;
import p193o.InterfaceC9500d;

/* renamed from: u.v */
/* loaded from: classes3.dex */
public class C10158v extends AbstractC10143g {

    /* renamed from: b */
    public static final byte[] f20275b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC9228b.f18210a);

    @Override // p160l.InterfaceC9228b
    /* renamed from: b */
    public void mo13883b(MessageDigest messageDigest) {
        messageDigest.update(f20275b);
    }

    @Override // p259u.AbstractC10143g
    /* renamed from: c */
    public Bitmap mo18969c(InterfaceC9500d interfaceC9500d, Bitmap bitmap, int i10, int i11) {
        return AbstractC10137c0.m18977f(interfaceC9500d, bitmap, i10, i11);
    }

    @Override // p160l.InterfaceC9228b
    public boolean equals(Object obj) {
        return obj instanceof C10158v;
    }

    @Override // p160l.InterfaceC9228b
    public int hashCode() {
        return 1572326941;
    }
}
