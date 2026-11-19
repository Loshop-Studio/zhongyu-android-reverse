package p198j0;

import java.io.File;
import p168h0.C9438e;
import p168h0.InterfaceC9434a;
import p229l0.InterfaceC10094a;

/* renamed from: j0.b */
/* loaded from: classes3.dex */
public class C9649b implements InterfaceC10094a.b {

    /* renamed from: a */
    public final InterfaceC9434a f22352a;

    /* renamed from: b */
    public final Object f22353b;

    /* renamed from: c */
    public final C9438e f22354c;

    public C9649b(InterfaceC9434a interfaceC9434a, Object obj, C9438e c9438e) {
        this.f22352a = interfaceC9434a;
        this.f22353b = obj;
        this.f22354c = c9438e;
    }

    @Override // p229l0.InterfaceC10094a.b
    /* renamed from: a */
    public boolean mo19044a(File file) {
        return this.f22352a.mo18616a(this.f22353b, file, this.f22354c);
    }
}
