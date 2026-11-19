package p191n8;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.AbstractC9152a;
import p135i8.AbstractC8890y;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9538c;

/* renamed from: n8.z */
/* loaded from: classes5.dex */
public class C9473z extends AbstractC9152a implements InterfaceC9538c {

    /* renamed from: d */
    public final InterfaceC9324c f18693d;

    public C9473z(InterfaceC9100d interfaceC9100d, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9100d, true, true);
        this.f18693d = interfaceC9324c;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: B */
    public void mo14824B(Object obj) {
        AbstractC9455k.m17354c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(this.f18693d), AbstractC8890y.m14934a(obj, this.f18693d), null, 2, null);
    }

    @Override // kotlinx.coroutines.AbstractC9152a
    /* renamed from: G0 */
    public void mo14931G0(Object obj) {
        InterfaceC9324c interfaceC9324c = this.f18693d;
        interfaceC9324c.resumeWith(AbstractC8890y.m14934a(obj, interfaceC9324c));
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: e0 */
    public final boolean mo14826e0() {
        return true;
    }

    @Override // p201o7.InterfaceC9538c
    public final InterfaceC9538c getCallerFrame() {
        InterfaceC9324c interfaceC9324c = this.f18693d;
        if (interfaceC9324c instanceof InterfaceC9538c) {
            return (InterfaceC9538c) interfaceC9324c;
        }
        return null;
    }
}
