package p208z;

import java.io.InputStream;
import p024c0.C3210g;

/* renamed from: z.l */
/* loaded from: classes2.dex */
public final class C6807l implements InterfaceC6801f {

    /* renamed from: a */
    public final C3210g f11486a;

    public C6807l(C3210g c3210g) {
        this.f11486a = c3210g;
    }

    @Override // p208z.InterfaceC6801f
    /* renamed from: a */
    public final InterfaceC6802g mo5090a(Object obj) {
        return new C6803h((InputStream) obj, this.f11486a);
    }

    @Override // p208z.InterfaceC6801f
    /* renamed from: b */
    public final Class mo5091b() {
        return InputStream.class;
    }
}
