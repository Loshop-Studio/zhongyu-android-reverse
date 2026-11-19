package p118o0;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p053f0.InterfaceC6283b;
import p074i0.InterfaceC6499d;

/* renamed from: o0.k */
/* loaded from: classes3.dex */
public class C7500k extends AbstractC7496g {

    /* renamed from: b */
    public static final byte[] f9682b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC6283b.f7649a);

    @Override // p053f0.InterfaceC6283b
    /* renamed from: b */
    public void mo9b(MessageDigest messageDigest) {
        messageDigest.update(f9682b);
    }

    @Override // p118o0.AbstractC7496g
    /* renamed from: c */
    public Bitmap mo8621c(InterfaceC6499d interfaceC6499d, Bitmap bitmap, int i6, int i7) {
        return AbstractC7514y.m8652c(interfaceC6499d, bitmap, i6, i7);
    }

    @Override // p053f0.InterfaceC6283b
    public boolean equals(Object obj) {
        return obj instanceof C7500k;
    }

    @Override // p053f0.InterfaceC6283b
    public int hashCode() {
        return -670243078;
    }
}
