package androidx.room;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import p149s0.InterfaceC3372c;

/* renamed from: androidx.room.l0 */
/* loaded from: classes.dex */
class C0629l0 implements InterfaceC3372c.c {

    /* renamed from: a */
    private final String f4046a;

    /* renamed from: b */
    private final File f4047b;

    /* renamed from: c */
    private final Callable<InputStream> f4048c;

    /* renamed from: d */
    private final InterfaceC3372c.c f4049d;

    C0629l0(String str, File file, Callable<InputStream> callable, InterfaceC3372c.c cVar) {
        this.f4046a = str;
        this.f4047b = file;
        this.f4048c = callable;
        this.f4049d = cVar;
    }

    @Override // p149s0.InterfaceC3372c.c
    /* renamed from: a */
    public InterfaceC3372c mo3484a(InterfaceC3372c.b bVar) {
        return new C0627k0(bVar.f11844a, this.f4046a, this.f4047b, this.f4048c, bVar.f11846c.f11843a, this.f4049d.mo3484a(bVar));
    }
}
