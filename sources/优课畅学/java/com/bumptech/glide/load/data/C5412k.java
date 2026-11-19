package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC5406e;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;
import p193o.InterfaceC9498b;

/* renamed from: com.bumptech.glide.load.data.k */
/* loaded from: classes3.dex */
public final class C5412k implements InterfaceC5406e {

    /* renamed from: a */
    public final RecyclableBufferedInputStream f2950a;

    /* renamed from: com.bumptech.glide.load.data.k$a */
    public static final class a implements InterfaceC5406e.a {

        /* renamed from: a */
        public final InterfaceC9498b f2951a;

        public a(InterfaceC9498b interfaceC9498b) {
            this.f2951a = interfaceC9498b;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5406e.a
        /* renamed from: a */
        public Class mo2843a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5406e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5406e mo2844b(InputStream inputStream) {
            return new C5412k(inputStream, this.f2951a);
        }
    }

    public C5412k(InputStream inputStream, InterfaceC9498b interfaceC9498b) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, interfaceC9498b);
        this.f2950a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5406e
    /* renamed from: b */
    public void mo2841b() {
        this.f2950a.m3051c();
    }

    /* renamed from: c */
    public void m2873c() {
        this.f2950a.m3050b();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5406e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream mo2840a() {
        this.f2950a.reset();
        return this.f2950a;
    }
}
