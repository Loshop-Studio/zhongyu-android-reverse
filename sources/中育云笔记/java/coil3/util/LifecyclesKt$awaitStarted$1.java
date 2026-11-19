package coil3.util;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.util.LifecyclesKt", m26211f = "lifecycles.kt", m26212l = {42}, m26213m = "awaitStarted")
/* loaded from: classes3.dex */
public final class LifecyclesKt$awaitStarted$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f3928c;

    /* renamed from: d */
    public Object f3929d;

    /* renamed from: e */
    public int f3930e;

    /* renamed from: f */
    public /* synthetic */ Object f3931f;

    /* renamed from: g */
    public int f3932g;

    public LifecyclesKt$awaitStarted$1(InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3931f = obj;
        this.f3932g |= Integer.MIN_VALUE;
        return LifecyclesKt.m3289a(null, this);
    }
}
