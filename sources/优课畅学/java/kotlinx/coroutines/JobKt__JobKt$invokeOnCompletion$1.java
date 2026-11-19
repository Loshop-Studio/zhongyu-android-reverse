package kotlinx.coroutines;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public /* synthetic */ class JobKt__JobKt$invokeOnCompletion$1 extends FunctionReferenceImpl implements InterfaceC10570l {
    public JobKt__JobKt$invokeOnCompletion$1(Object obj) {
        super(1, obj, InterfaceC9211m.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
    }

    /* renamed from: d */
    public final void m16246d(Throwable th) {
        ((InterfaceC9211m) this.receiver).mo14884a(th);
    }

    @Override // p300x7.InterfaceC10570l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m16246d((Throwable) obj);
        return C8736p.f16368a;
    }
}
