package kotlinx.coroutines;

import kotlinx.coroutines.flow.internal.ChildCancelledException;
import p054e7.C5483o;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.l1 */
/* loaded from: classes4.dex */
public final class C5979l1 extends C5483o {

    /* renamed from: e */
    public final /* synthetic */ int f9470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5979l1(InterfaceC5636h interfaceC5636h, InterfaceC5631c interfaceC5631c, int i) {
        super(interfaceC5631c, interfaceC5636h);
        this.f9470e = i;
    }

    @Override // kotlinx.coroutines.C5871c1
    /* renamed from: z */
    public final boolean mo5465z(Throwable th) {
        switch (this.f9470e) {
            case 0:
                return false;
            default:
                if (th instanceof ChildCancelledException) {
                    return true;
                }
                return m5462v(th);
        }
    }
}
