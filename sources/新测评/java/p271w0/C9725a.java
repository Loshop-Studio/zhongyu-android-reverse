package p271w0;

import com.bumptech.glide.load.data.InterfaceC5357e;
import java.nio.ByteBuffer;

/* renamed from: w0.a */
/* loaded from: classes3.dex */
public class C9725a implements InterfaceC5357e {

    /* renamed from: a */
    public final ByteBuffer f17060a;

    /* renamed from: w0.a$a */
    public static class a implements InterfaceC5357e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC5357e.a
        /* renamed from: a */
        public Class mo3396a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5357e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5357e mo3397b(ByteBuffer byteBuffer) {
            return new C9725a(byteBuffer);
        }
    }

    public C9725a(ByteBuffer byteBuffer) {
        this.f17060a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5357e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo3393a() {
        this.f17060a.position(0);
        return this.f17060a;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5357e
    /* renamed from: b */
    public void mo3394b() {
    }
}
