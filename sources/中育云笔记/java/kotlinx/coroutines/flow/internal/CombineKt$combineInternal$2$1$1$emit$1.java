package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", m26211f = "Combine.kt", m26212l = {29, 30}, m26213m = "emit")
/* loaded from: classes6.dex */
public final class CombineKt$combineInternal$2$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: c */
    public /* synthetic */ Object f23955c;

    /* renamed from: d */
    public final /* synthetic */ CombineKt$combineInternal$2.C100431.AnonymousClass1 f23956d;

    /* renamed from: e */
    public int f23957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2$1$1$emit$1(CombineKt$combineInternal$2.C100431.AnonymousClass1 anonymousClass1, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f23956d = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23955c = obj;
        this.f23957e |= Integer.MIN_VALUE;
        return this.f23956d.emit(null, this);
    }
}
