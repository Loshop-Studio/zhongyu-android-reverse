package androidx.paging;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1", m26211f = "Separators.kt", m26212l = {616}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class SeparatorsKt$insertEventSeparators$separatorState$1 extends SuspendLambda implements InterfaceC9545q {
    final /* synthetic */ InterfaceC9545q $generator;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorsKt$insertEventSeparators$separatorState$1(InterfaceC9545q interfaceC9545q, InterfaceC11588c<? super SeparatorsKt$insertEventSeparators$separatorState$1> interfaceC11588c) {
        super(3, interfaceC11588c);
        this.$generator = interfaceC9545q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        Object obj2 = this.L$0;
        Object obj3 = this.L$1;
        InterfaceC9545q interfaceC9545q = this.$generator;
        this.L$0 = null;
        this.label = 1;
        Object objInvoke = interfaceC9545q.invoke(obj2, obj3, this);
        return objInvoke == objM25952f ? objM25952f : objInvoke;
    }

    @Override // p181hd.InterfaceC9545q
    public final Object invoke(T t10, T t11, InterfaceC11588c<? super R> interfaceC11588c) {
        SeparatorsKt$insertEventSeparators$separatorState$1 separatorsKt$insertEventSeparators$separatorState$1 = new SeparatorsKt$insertEventSeparators$separatorState$1(this.$generator, interfaceC11588c);
        separatorsKt$insertEventSeparators$separatorState$1.L$0 = t10;
        separatorsKt$insertEventSeparators$separatorState$1.L$1 = t11;
        return separatorsKt$insertEventSeparators$separatorState$1.invokeSuspend(C10786q.f26013a);
    }
}
