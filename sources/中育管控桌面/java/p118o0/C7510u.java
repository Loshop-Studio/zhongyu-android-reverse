package p118o0;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import p016b1.AbstractC4399a;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p067h0.InterfaceC6440j;

/* renamed from: o0.u */
/* loaded from: classes3.dex */
public final class C7510u implements InterfaceC6286e {

    /* renamed from: a */
    public final C7494e f9696a = new C7494e();

    @Override // p053f0.InterfaceC6286e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6440j mo2796a(InputStream inputStream, int i6, int i7, C6285d c6285d) {
        return this.f9696a.m8617c(ImageDecoder.createSource(AbstractC4399a.m1406b(inputStream)), i6, i7, c6285d);
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2797b(InputStream inputStream, C6285d c6285d) {
        return true;
    }
}
