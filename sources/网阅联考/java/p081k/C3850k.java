package p081k;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;
import p081k.InterfaceC3844e;
import p098n.InterfaceC4393b;

/* renamed from: k.k */
/* loaded from: classes2.dex */
public final class C3850k implements InterfaceC3844e {

    /* renamed from: a */
    public final RecyclableBufferedInputStream f4756a;

    /* renamed from: k.k$a */
    public static final class a implements InterfaceC3844e.a {

        /* renamed from: a */
        public final InterfaceC4393b f4757a;

        public a(InterfaceC4393b interfaceC4393b) {
            this.f4757a = interfaceC4393b;
        }

        @Override // p081k.InterfaceC3844e.a
        /* renamed from: a */
        public Class mo5129a() {
            return InputStream.class;
        }

        @Override // p081k.InterfaceC3844e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC3844e mo5130b(InputStream inputStream) {
            return new C3850k(inputStream, this.f4757a);
        }
    }

    public C3850k(InputStream inputStream, InterfaceC4393b interfaceC4393b) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, interfaceC4393b);
        this.f4756a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // p081k.InterfaceC3844e
    /* renamed from: b */
    public void mo5128b() {
        this.f4756a.m1932c();
    }

    /* renamed from: c */
    public void m5142c() {
        this.f4756a.m1931b();
    }

    @Override // p081k.InterfaceC3844e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream mo5127a() {
        this.f4756a.reset();
        return this.f4756a;
    }
}
