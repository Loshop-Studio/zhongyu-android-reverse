package p067h0;

import java.io.File;
import p053f0.C6285d;
import p053f0.InterfaceC6282a;
import p081j0.InterfaceC6573a;

/* renamed from: h0.b */
/* loaded from: classes3.dex */
public class C6432b implements InterfaceC6573a.b {

    /* renamed from: a */
    public final InterfaceC6282a f8109a;

    /* renamed from: b */
    public final Object f8110b;

    /* renamed from: c */
    public final C6285d f8111c;

    public C6432b(InterfaceC6282a interfaceC6282a, Object obj, C6285d c6285d) {
        this.f8109a = interfaceC6282a;
        this.f8110b = obj;
        this.f8111c = c6285d;
    }

    @Override // p081j0.InterfaceC6573a.b
    /* renamed from: a */
    public boolean mo7039a(File file) {
        return this.f8109a.mo6411a(this.f8110b, file, this.f8111c);
    }
}
