package p270v;

import com.bumptech.glide.load.data.InterfaceC5406e;
import java.nio.ByteBuffer;

/* renamed from: v.a */
/* loaded from: classes3.dex */
public class C10236a implements InterfaceC5406e {

    /* renamed from: a */
    public final ByteBuffer f20426a;

    /* renamed from: v.a$a */
    public static class a implements InterfaceC5406e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC5406e.a
        /* renamed from: a */
        public Class mo2843a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5406e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5406e mo2844b(ByteBuffer byteBuffer) {
            return new C10236a(byteBuffer);
        }
    }

    public C10236a(ByteBuffer byteBuffer) {
        this.f20426a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5406e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo2840a() {
        this.f20426a.position(0);
        return this.f20426a;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5406e
    /* renamed from: b */
    public void mo2841b() {
    }
}
