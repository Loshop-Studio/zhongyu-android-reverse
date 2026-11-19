package p126u;

import java.nio.ByteBuffer;
import p081k.InterfaceC3844e;

/* renamed from: u.a */
/* loaded from: classes2.dex */
public class C4600a implements InterfaceC3844e {

    /* renamed from: a */
    public final ByteBuffer f5803a;

    /* renamed from: u.a$a */
    public static class a implements InterfaceC3844e.a {
        @Override // p081k.InterfaceC3844e.a
        /* renamed from: a */
        public Class mo5129a() {
            return ByteBuffer.class;
        }

        @Override // p081k.InterfaceC3844e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC3844e mo5130b(ByteBuffer byteBuffer) {
            return new C4600a(byteBuffer);
        }
    }

    public C4600a(ByteBuffer byteBuffer) {
        this.f5803a = byteBuffer;
    }

    @Override // p081k.InterfaceC3844e
    /* renamed from: b */
    public void mo5128b() {
    }

    @Override // p081k.InterfaceC3844e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo5127a() {
        this.f5803a.position(0);
        return this.f5803a;
    }
}
