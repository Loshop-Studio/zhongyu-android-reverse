package p125p0;

import com.bumptech.glide.load.data.InterfaceC4693e;
import java.nio.ByteBuffer;

/* renamed from: p0.a */
/* loaded from: classes3.dex */
public class C7588a implements InterfaceC4693e {

    /* renamed from: a */
    public final ByteBuffer f10046a;

    /* renamed from: p0.a$a */
    public static class a implements InterfaceC4693e.a {
        @Override // com.bumptech.glide.load.data.InterfaceC4693e.a
        /* renamed from: a */
        public Class mo2577a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4693e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4693e mo2578b(ByteBuffer byteBuffer) {
            return new C7588a(byteBuffer);
        }
    }

    public C7588a(ByteBuffer byteBuffer) {
        this.f10046a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4693e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer mo2574a() {
        this.f10046a.position(0);
        return this.f10046a;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4693e
    /* renamed from: b */
    public void mo2575b() {
    }
}
