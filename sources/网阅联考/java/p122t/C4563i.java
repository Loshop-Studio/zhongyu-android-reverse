package p122t;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import p076j.C3794d;
import p076j.InterfaceC3795e;
import p093m.InterfaceC4361j;

/* renamed from: t.i */
/* loaded from: classes2.dex */
public final class C4563i implements InterfaceC3795e {

    /* renamed from: a */
    public final C4557d f5740a = new C4557d();

    @Override // p076j.InterfaceC3795e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4361j mo1966b(ByteBuffer byteBuffer, int i4, int i5, C3794d c3794d) {
        return this.f5740a.m6177d(ImageDecoder.createSource(byteBuffer), i4, i5, c3794d);
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1965a(ByteBuffer byteBuffer, C3794d c3794d) {
        return true;
    }
}
