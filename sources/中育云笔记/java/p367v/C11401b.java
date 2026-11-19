package p367v;

import java.io.IOException;
import je.C9745y;
import je.InterfaceC9725e;
import je.InterfaceC9726f;
import kotlin.AbstractC9924b;
import kotlin.Result;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import sd.InterfaceC11125j;

/* renamed from: v.b */
/* loaded from: classes3.dex */
public final class C11401b implements InterfaceC9726f, InterfaceC9540l {

    /* renamed from: c */
    public final InterfaceC9725e f27221c;

    /* renamed from: d */
    public final InterfaceC11125j f27222d;

    public C11401b(InterfaceC9725e interfaceC9725e, InterfaceC11125j interfaceC11125j) {
        this.f27221c = interfaceC9725e;
        this.f27222d = interfaceC11125j;
    }

    @Override // je.InterfaceC9726f
    /* renamed from: a */
    public void mo7268a(InterfaceC9725e interfaceC9725e, IOException iOException) {
        if (interfaceC9725e.isCanceled()) {
            return;
        }
        InterfaceC11125j interfaceC11125j = this.f27222d;
        Result.C9921a c9921a = Result.f23263d;
        interfaceC11125j.resumeWith(Result.m20054c(AbstractC9924b.m20070a(iOException)));
    }

    @Override // je.InterfaceC9726f
    /* renamed from: b */
    public void mo7269b(InterfaceC9725e interfaceC9725e, C9745y c9745y) {
        this.f27222d.resumeWith(Result.m20054c(c9745y));
    }

    /* renamed from: c */
    public void m25358c(Throwable th) {
        try {
            this.f27221c.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m25358c((Throwable) obj);
        return C10786q.f26013a;
    }
}
