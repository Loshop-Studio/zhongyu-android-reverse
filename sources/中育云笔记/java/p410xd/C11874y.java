package p410xd;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.AbstractC9995a;
import p409xc.InterfaceC11828c;
import sd.AbstractC11177y;
import vc.InterfaceC11588c;

/* renamed from: xd.y */
/* loaded from: classes6.dex */
public class C11874y extends AbstractC9995a implements InterfaceC11828c {

    /* renamed from: f */
    public final InterfaceC11588c f28133f;

    public C11874y(InterfaceC9945d interfaceC9945d, InterfaceC11588c interfaceC11588c) {
        super(interfaceC9945d, true, true);
        this.f28133f = interfaceC11588c;
    }

    @Override // kotlinx.coroutines.AbstractC9995a
    /* renamed from: F0 */
    public void mo20490F0(Object obj) {
        InterfaceC11588c interfaceC11588c = this.f28133f;
        interfaceC11588c.resumeWith(AbstractC11177y.m24828a(obj, interfaceC11588c));
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: e0 */
    public final boolean mo20435e0() {
        return true;
    }

    @Override // p409xc.InterfaceC11828c
    public final InterfaceC11828c getCallerFrame() {
        InterfaceC11588c interfaceC11588c = this.f28133f;
        if (interfaceC11588c instanceof InterfaceC11828c) {
            return (InterfaceC11828c) interfaceC11588c;
        }
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: w */
    public void mo20460w(Object obj) {
        AbstractC11850i.m26278b(IntrinsicsKt__IntrinsicsJvmKt.m20224d(this.f28133f), AbstractC11177y.m24828a(obj, this.f28133f));
    }

    /* renamed from: J0 */
    public void mo24752J0() {
    }
}
