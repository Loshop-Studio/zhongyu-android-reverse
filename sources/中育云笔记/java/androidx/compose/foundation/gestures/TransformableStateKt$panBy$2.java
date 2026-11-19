package androidx.compose.foundation.gestures;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableStateKt$panBy$2", m26211f = "TransformableState.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransformableStateKt$panBy$2 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ long $offset;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$panBy$2(long j10, InterfaceC11588c<? super TransformableStateKt$panBy$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$offset = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        TransformableStateKt$panBy$2 transformableStateKt$panBy$2 = new TransformableStateKt$panBy$2(this.$offset, interfaceC11588c);
        transformableStateKt$panBy$2.L$0 = obj;
        return transformableStateKt$panBy$2;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(TransformScope transformScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((TransformableStateKt$panBy$2) create(transformScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        ((TransformScope) this.L$0).mo27136transformByd4ec7I(1.0f, this.$offset, 0.0f);
        return C10786q.f26013a;
    }
}
