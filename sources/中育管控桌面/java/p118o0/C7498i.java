package p118o0;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p067h0.InterfaceC6440j;

/* renamed from: o0.i */
/* loaded from: classes3.dex */
public final class C7498i implements InterfaceC6286e {

    /* renamed from: a */
    public final C7494e f9680a = new C7494e();

    @Override // p053f0.InterfaceC6286e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6440j mo2796a(ByteBuffer byteBuffer, int i6, int i7, C6285d c6285d) {
        return this.f9680a.m8617c(ImageDecoder.createSource(byteBuffer), i6, i7, c6285d);
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2797b(ByteBuffer byteBuffer, C6285d c6285d) {
        return true;
    }
}
