package p132i0;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;
import p132i0.InterfaceC8116e;
import p164l0.InterfaceC8865b;

/* renamed from: i0.k */
/* loaded from: classes3.dex */
public final class C8122k implements InterfaceC8116e {

    /* renamed from: a */
    public final RecyclableBufferedInputStream f13888a;

    /* renamed from: i0.k$a */
    public static final class a implements InterfaceC8116e.a {

        /* renamed from: a */
        public final InterfaceC8865b f13889a;

        public a(InterfaceC8865b interfaceC8865b) {
            this.f13889a = interfaceC8865b;
        }

        @Override // p132i0.InterfaceC8116e.a
        /* renamed from: a */
        public Class mo12993a() {
            return InputStream.class;
        }

        @Override // p132i0.InterfaceC8116e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC8116e mo12994b(InputStream inputStream) {
            return new C8122k(inputStream, this.f13889a);
        }
    }

    public C8122k(InputStream inputStream, InterfaceC8865b interfaceC8865b) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, interfaceC8865b);
        this.f13888a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // p132i0.InterfaceC8116e
    /* renamed from: b */
    public void mo12992b() {
        this.f13888a.m3256g();
    }

    /* renamed from: c */
    public void m13006c() {
        this.f13888a.m3255c();
    }

    @Override // p132i0.InterfaceC8116e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream mo12991a() {
        this.f13888a.reset();
        return this.f13888a;
    }
}
