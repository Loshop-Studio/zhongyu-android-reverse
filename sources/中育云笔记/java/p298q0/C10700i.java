package p298q0;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import p168h0.C9438e;
import p168h0.InterfaceC9439f;
import p198j0.InterfaceC9657j;

/* renamed from: q0.i */
/* loaded from: classes3.dex */
public final class C10700i implements InterfaceC9439f {

    /* renamed from: a */
    public final C10696e f25764a = new C10696e();

    @Override // p168h0.InterfaceC9439f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9657j mo4266b(ByteBuffer byteBuffer, int i10, int i11, C9438e c9438e) {
        return this.f25764a.m22657c(ImageDecoder.createSource(byteBuffer), i10, i11, c9438e);
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4265a(ByteBuffer byteBuffer, C9438e c9438e) {
        return true;
    }
}
