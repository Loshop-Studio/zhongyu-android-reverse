package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC5357e;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;
import p195p0.InterfaceC8802b;

/* renamed from: com.bumptech.glide.load.data.k */
/* loaded from: classes3.dex */
public final class C5363k implements InterfaceC5357e {

    /* renamed from: a */
    public final RecyclableBufferedInputStream f3517a;

    /* renamed from: com.bumptech.glide.load.data.k$a */
    public static final class a implements InterfaceC5357e.a {

        /* renamed from: a */
        public final InterfaceC8802b f3518a;

        public a(InterfaceC8802b interfaceC8802b) {
            this.f3518a = interfaceC8802b;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5357e.a
        /* renamed from: a */
        public Class mo3396a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5357e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5357e mo3397b(InputStream inputStream) {
            return new C5363k(inputStream, this.f3518a);
        }
    }

    public C5363k(InputStream inputStream, InterfaceC8802b interfaceC8802b) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, interfaceC8802b);
        this.f3517a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5357e
    /* renamed from: b */
    public void mo3394b() {
        this.f3517a.m3606g();
    }

    /* renamed from: c */
    public void m3427c() {
        this.f3517a.m3605f();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5357e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream mo3393a() {
        this.f3517a.reset();
        return this.f3517a;
    }
}
