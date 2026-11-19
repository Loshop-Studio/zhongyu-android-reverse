package p259u;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
import p160l.C9230d;
import p160l.InterfaceC9231e;
import p182n.InterfaceC9357j;

/* renamed from: u.j */
/* loaded from: classes3.dex */
public final class C10146j implements InterfaceC9231e {

    /* renamed from: a */
    public final C10140e f20268a = new C10140e();

    @Override // p160l.InterfaceC9231e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9357j mo3061a(ByteBuffer byteBuffer, int i10, int i11, C9230d c9230d) {
        return this.f20268a.m18994c(ImageDecoder.createSource(byteBuffer), i10, i11, c9230d);
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3062b(ByteBuffer byteBuffer, C9230d c9230d) {
        return true;
    }
}
