package p261v0;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p162m0.InterfaceC8537b;
import p195p0.InterfaceC8804d;

/* renamed from: v0.j */
/* loaded from: classes3.dex */
public class C9637j extends AbstractC9634g {

    /* renamed from: b */
    public static final byte[] f16824b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC8537b.f14173a);

    @Override // p162m0.InterfaceC8537b
    /* renamed from: a */
    public void mo12541a(MessageDigest messageDigest) {
        messageDigest.update(f16824b);
    }

    @Override // p261v0.AbstractC9634g
    /* renamed from: c */
    public Bitmap mo16004c(InterfaceC8804d interfaceC8804d, Bitmap bitmap, int i10, int i11) {
        return AbstractC9652y.m16034b(interfaceC8804d, bitmap, i10, i11);
    }

    @Override // p162m0.InterfaceC8537b
    public boolean equals(Object obj) {
        return obj instanceof C9637j;
    }

    @Override // p162m0.InterfaceC8537b
    public int hashCode() {
        return -599754482;
    }
}
