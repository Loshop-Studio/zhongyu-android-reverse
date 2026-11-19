package p238s0;

import java.nio.ByteBuffer;
import p132i0.InterfaceC8116e;

/* renamed from: s0.a */
/* loaded from: classes3.dex */
public class C9463a implements InterfaceC8116e {

    /* renamed from: a */
    public final ByteBuffer f16494a;

    /* renamed from: s0.a$a */
    public static class a implements InterfaceC8116e.a {
        @Override // p132i0.InterfaceC8116e.a
        /* renamed from: a */
        public Class mo12993a() {
            return ByteBuffer.class;
        }

        @Override // p132i0.InterfaceC8116e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC8116e mo12994b(ByteBuffer byteBuffer) {
            return new C9463a(byteBuffer);
        }
    }

    public C9463a(ByteBuffer byteBuffer) {
        this.f16494a = byteBuffer;
    }

    @Override // p132i0.InterfaceC8116e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo12991a() {
        this.f16494a.position(0);
        return this.f16494a;
    }

    @Override // p132i0.InterfaceC8116e
    /* renamed from: b */
    public void mo12992b() {
    }
}
