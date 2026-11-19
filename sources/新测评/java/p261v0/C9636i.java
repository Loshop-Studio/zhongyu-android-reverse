package p261v0;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import p162m0.C8539d;
import p162m0.InterfaceC8540e;
import p184o0.InterfaceC8690j;

/* renamed from: v0.i */
/* loaded from: classes3.dex */
public final class C9636i implements InterfaceC8540e {

    /* renamed from: a */
    public final C9632e f16823a = new C9632e();

    @Override // p162m0.InterfaceC8540e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8690j mo3617b(ByteBuffer byteBuffer, int i10, int i11, C8539d c8539d) {
        return this.f16823a.m16000c(ImageDecoder.createSource(byteBuffer), i10, i11, c8539d);
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3616a(ByteBuffer byteBuffer, C8539d c8539d) {
        return true;
    }
}
