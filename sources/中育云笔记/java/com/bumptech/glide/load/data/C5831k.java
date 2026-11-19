package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC5825e;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.taobao.accs.utl.UtilityImpl;
import java.io.InputStream;
import p213k0.InterfaceC9770b;

/* renamed from: com.bumptech.glide.load.data.k */
/* loaded from: classes3.dex */
public final class C5831k implements InterfaceC5825e {

    /* renamed from: a */
    public final RecyclableBufferedInputStream f4720a;

    /* renamed from: com.bumptech.glide.load.data.k$a */
    public static final class a implements InterfaceC5825e.a {

        /* renamed from: a */
        public final InterfaceC9770b f4721a;

        public a(InterfaceC9770b interfaceC9770b) {
            this.f4721a = interfaceC9770b;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5825e.a
        /* renamed from: a */
        public Class mo4048a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5825e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5825e mo4049b(InputStream inputStream) {
            return new C5831k(inputStream, this.f4721a);
        }
    }

    public C5831k(InputStream inputStream, InterfaceC9770b interfaceC9770b) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, interfaceC9770b);
        this.f4720a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(UtilityImpl.TNET_FILE_SIZE);
    }

    /* renamed from: b */
    public void m4077b() {
        this.f4720a.m4254e();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5825e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream mo4046a() {
        this.f4720a.reset();
        return this.f4720a;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5825e
    public void cleanup() {
        this.f4720a.m4255f();
    }
}
