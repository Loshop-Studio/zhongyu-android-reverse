package p228r0;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import p091e1.AbstractC7829a;
import p122h0.C8084d;
import p122h0.InterfaceC8085e;
import p152k0.InterfaceC8259j;

/* renamed from: r0.t */
/* loaded from: classes3.dex */
public final class C9410t implements InterfaceC8085e {

    /* renamed from: a */
    public final C9394d f16405a = new C9394d();

    @Override // p122h0.InterfaceC8085e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8259j mo3290b(InputStream inputStream, int i9, int i10, C8084d c8084d) {
        return this.f16405a.m15291d(ImageDecoder.createSource(AbstractC7829a.m12226b(inputStream)), i9, i10, c8084d);
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3289a(InputStream inputStream, C8084d c8084d) {
        return true;
    }
}
