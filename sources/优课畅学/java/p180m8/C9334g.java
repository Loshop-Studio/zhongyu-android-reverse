package p180m8;

import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import p179m7.InterfaceC9324c;
import p191n8.C9473z;

/* renamed from: m8.g */
/* loaded from: classes5.dex */
public final class C9334g extends C9473z {
    public C9334g(InterfaceC9100d interfaceC9100d, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9100d, interfaceC9324c);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: K */
    public boolean mo14903K(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return m16261F(th);
    }
}
