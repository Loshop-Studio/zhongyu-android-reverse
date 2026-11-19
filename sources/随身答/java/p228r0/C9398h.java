package p228r0;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import p122h0.C8084d;
import p122h0.InterfaceC8085e;
import p152k0.InterfaceC8259j;

/* renamed from: r0.h */
/* loaded from: classes3.dex */
public final class C9398h implements InterfaceC8085e {

    /* renamed from: a */
    public final C9394d f16390a = new C9394d();

    @Override // p122h0.InterfaceC8085e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8259j mo3290b(ByteBuffer byteBuffer, int i9, int i10, C8084d c8084d) {
        return this.f16390a.m15291d(ImageDecoder.createSource(byteBuffer), i9, i10, c8084d);
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3289a(ByteBuffer byteBuffer, C8084d c8084d) {
        return true;
    }
}
