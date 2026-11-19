package p122t;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p076j.InterfaceC3792b;
import p098n.InterfaceC4395d;

/* renamed from: t.l */
/* loaded from: classes2.dex */
public class C4566l extends AbstractC4560f {

    /* renamed from: b */
    public static final byte[] f5743b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(InterfaceC3792b.f4537a);

    @Override // p076j.InterfaceC3792b
    /* renamed from: b */
    public void mo4729b(MessageDigest messageDigest) {
        messageDigest.update(f5743b);
    }

    @Override // p122t.AbstractC4560f
    /* renamed from: c */
    public Bitmap mo6282c(InterfaceC4395d interfaceC4395d, Bitmap bitmap, int i4, int i5) {
        return AbstractC4552a0.m6248d(interfaceC4395d, bitmap, i4, i5);
    }

    @Override // p076j.InterfaceC3792b
    public boolean equals(Object obj) {
        return obj instanceof C4566l;
    }

    @Override // p076j.InterfaceC3792b
    public int hashCode() {
        return 1101716364;
    }
}
