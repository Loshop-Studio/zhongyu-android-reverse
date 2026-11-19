package kotlinx.coroutines;

import kotlin.AbstractC5774b;
import kotlin.Result;
import p045d6.C5443s;
import p054e7.AbstractC5469a;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;
import p185v7.AbstractC6683l;

/* renamed from: kotlinx.coroutines.d1 */
/* loaded from: classes4.dex */
public final class C5891d1 extends C5867b0 {

    /* renamed from: d */
    public final InterfaceC5631c f9338d;

    public C5891d1(InterfaceC5636h interfaceC5636h, InterfaceC6473e interfaceC6473e) {
        super(interfaceC5636h, false);
        this.f9338d = AbstractC6683l.m6365e(interfaceC6473e, this, this);
    }

    @Override // kotlinx.coroutines.C5871c1
    /* renamed from: T */
    public final void mo5450T() throws Throwable {
        try {
            AbstractC5469a.m4832h(AbstractC6683l.m6374n(this.f9338d), Result.m13956constructorimpl(C5443s.f8405a));
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(th)));
            throw th;
        }
    }
}
