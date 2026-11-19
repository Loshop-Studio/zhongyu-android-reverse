package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC4693e;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;
import p074i0.InterfaceC6497b;

/* renamed from: com.bumptech.glide.load.data.k */
/* loaded from: classes3.dex */
public final class C4699k implements InterfaceC4693e {

    /* renamed from: a */
    public final RecyclableBufferedInputStream f2308a;

    /* renamed from: com.bumptech.glide.load.data.k$a */
    public static final class a implements InterfaceC4693e.a {

        /* renamed from: a */
        public final InterfaceC6497b f2309a;

        public a(InterfaceC6497b interfaceC6497b) {
            this.f2309a = interfaceC6497b;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4693e.a
        /* renamed from: a */
        public Class mo2577a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC4693e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4693e mo2578b(InputStream inputStream) {
            return new C4699k(inputStream, this.f2309a);
        }
    }

    public C4699k(InputStream inputStream, InterfaceC6497b interfaceC6497b) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, interfaceC6497b);
        this.f2308a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4693e
    /* renamed from: b */
    public void mo2575b() {
        this.f2308a.m2786g();
    }

    /* renamed from: c */
    public void m2608c() {
        this.f2308a.m2785c();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4693e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream mo2574a() {
        this.f2308a.reset();
        return this.f2308a;
    }
}
