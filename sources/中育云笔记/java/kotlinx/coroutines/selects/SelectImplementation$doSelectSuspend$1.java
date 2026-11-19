package kotlinx.coroutines.selects;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.selects.SelectImplementation", m26211f = "Select.kt", m26212l = {453, 456}, m26213m = "doSelectSuspend")
/* loaded from: classes6.dex */
public final class SelectImplementation$doSelectSuspend$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f24029c;

    /* renamed from: d */
    public /* synthetic */ Object f24030d;

    /* renamed from: e */
    public final /* synthetic */ SelectImplementation f24031e;

    /* renamed from: f */
    public int f24032f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$doSelectSuspend$1(SelectImplementation selectImplementation, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f24031e = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24030d = obj;
        this.f24032f |= Integer.MIN_VALUE;
        return this.f24031e.m20984q(this);
    }
}
