package p228r0;

import com.bumptech.glide.load.resource.bitmap.C5505a;
import java.nio.ByteBuffer;
import p091e1.AbstractC7829a;
import p122h0.C8084d;
import p122h0.InterfaceC8085e;
import p152k0.InterfaceC8259j;

/* renamed from: r0.g */
/* loaded from: classes3.dex */
public class C9397g implements InterfaceC8085e {

    /* renamed from: a */
    public final C5505a f16389a;

    public C9397g(C5505a c5505a) {
        this.f16389a = c5505a;
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8259j mo3290b(ByteBuffer byteBuffer, int i9, int i10, C8084d c8084d) {
        return this.f16389a.m3276f(AbstractC7829a.m12230f(byteBuffer), i9, i10, c8084d);
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3289a(ByteBuffer byteBuffer, C8084d c8084d) {
        return this.f16389a.m3281q(byteBuffer);
    }
}
