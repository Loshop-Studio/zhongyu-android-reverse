package p259u;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p160l.InterfaceC9228b;
import p193o.InterfaceC9500d;

/* renamed from: u.l */
/* loaded from: classes3.dex */
public class C10148l extends AbstractC10143g {

    /* renamed from: b */
    public static final byte[] f20270b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC9228b.f18210a);

    @Override // p160l.InterfaceC9228b
    /* renamed from: b */
    public void mo13883b(MessageDigest messageDigest) {
        messageDigest.update(f20270b);
    }

    @Override // p259u.AbstractC10143g
    /* renamed from: c */
    public Bitmap mo18969c(InterfaceC9500d interfaceC9500d, Bitmap bitmap, int i10, int i11) {
        return AbstractC10137c0.m18974c(interfaceC9500d, bitmap, i10, i11);
    }

    @Override // p160l.InterfaceC9228b
    public boolean equals(Object obj) {
        return obj instanceof C10148l;
    }

    @Override // p160l.InterfaceC9228b
    public int hashCode() {
        return -670243078;
    }
}
