package p313r0;

import com.bumptech.glide.load.data.InterfaceC5825e;
import java.nio.ByteBuffer;

/* renamed from: r0.a */
/* loaded from: classes3.dex */
public class C10832a implements InterfaceC5825e {

    /* renamed from: a */
    public final ByteBuffer f26143a;

    /* renamed from: r0.a$a */
    public static class a implements InterfaceC5825e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC5825e.a
        /* renamed from: a */
        public Class mo4048a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5825e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5825e mo4049b(ByteBuffer byteBuffer) {
            return new C10832a(byteBuffer);
        }
    }

    public C10832a(ByteBuffer byteBuffer) {
        this.f26143a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5825e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo4046a() {
        this.f26143a.position(0);
        return this.f26143a;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5825e
    public void cleanup() {
    }
}
