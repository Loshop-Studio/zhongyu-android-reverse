package p135i8;

import kotlin.Result;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* renamed from: i8.n1 */
/* loaded from: classes5.dex */
public final class C8859n1 extends AbstractC8829d1 {

    /* renamed from: e */
    public final InterfaceC9324c f16526e;

    public C8859n1(InterfaceC9324c interfaceC9324c) {
        this.f16526e = interfaceC9324c;
    }

    @Override // kotlinx.coroutines.InterfaceC9211m
    /* renamed from: a */
    public void mo14884a(Throwable th) {
        InterfaceC9324c interfaceC9324c = this.f16526e;
        Result.C9076a c9076a = Result.f17350b;
        interfaceC9324c.resumeWith(Result.m15909b(C8736p.f16368a));
    }
}
