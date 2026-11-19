package retrofit2;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "retrofit2.KotlinExtensions", m26211f = "KotlinExtensions.kt", m26212l = {119}, m26213m = "suspendAndThrow")
/* loaded from: classes6.dex */
public final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f26577c;

    /* renamed from: d */
    public /* synthetic */ Object f26578d;

    /* renamed from: e */
    public int f26579e;

    public KotlinExtensions$suspendAndThrow$1(InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26578d = obj;
        this.f26579e |= Integer.MIN_VALUE;
        return KotlinExtensions.m24321e(null, this);
    }
}
