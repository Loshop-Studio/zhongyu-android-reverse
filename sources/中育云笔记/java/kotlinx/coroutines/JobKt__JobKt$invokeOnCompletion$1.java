package kotlinx.coroutines;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import sd.AbstractC11151p1;

/* loaded from: classes6.dex */
public /* synthetic */ class JobKt__JobKt$invokeOnCompletion$1 extends FunctionReferenceImpl implements InterfaceC9540l {
    public JobKt__JobKt$invokeOnCompletion$1(Object obj) {
        super(1, obj, AbstractC11151p1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
    }

    /* renamed from: g */
    public final void m20398g(Throwable th) {
        ((AbstractC11151p1) this.receiver).mo20469v(th);
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m20398g((Throwable) obj);
        return C10786q.f26013a;
    }
}
