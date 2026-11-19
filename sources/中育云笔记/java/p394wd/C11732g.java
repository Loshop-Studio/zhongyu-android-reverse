package p394wd;

import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import p410xd.C11874y;
import vc.InterfaceC11588c;

/* renamed from: wd.g */
/* loaded from: classes6.dex */
public final class C11732g extends C11874y {
    public C11732g(InterfaceC9945d interfaceC9945d, InterfaceC11588c interfaceC11588c) {
        super(interfaceC9945d, interfaceC11588c);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: K */
    public boolean mo20417K(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return m20412F(th);
    }
}
