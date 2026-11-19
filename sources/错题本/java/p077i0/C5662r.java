package p077i0;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p024c0.InterfaceC3205b;
import p202y.InterfaceC6760c;

/* renamed from: i0.r */
/* loaded from: classes2.dex */
public final class C5662r extends AbstractC5648d {

    /* renamed from: b */
    public static final byte[] f8818b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC6760c.f11429a);

    @Override // p202y.InterfaceC6760c
    /* renamed from: b */
    public final void mo2013b(MessageDigest messageDigest) {
        messageDigest.update(f8818b);
    }

    @Override // p077i0.AbstractC5648d
    /* renamed from: c */
    public final Bitmap mo4973c(InterfaceC3205b interfaceC3205b, Bitmap bitmap, int i, int i8) {
        return AbstractC5665u.m4995b(interfaceC3205b, bitmap, i, i8);
    }

    @Override // p202y.InterfaceC6760c
    public final boolean equals(Object obj) {
        return obj instanceof C5662r;
    }

    @Override // p202y.InterfaceC6760c
    public final int hashCode() {
        return 1572326941;
    }
}
