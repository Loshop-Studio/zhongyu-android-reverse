package androidx.compose.foundation.gestures;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableStateKt$panBy$2", m17801f = "TransformableState.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransformableStateKt$panBy$2 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ long $offset;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$panBy$2(long j10, InterfaceC9324c<? super TransformableStateKt$panBy$2> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$offset = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        TransformableStateKt$panBy$2 transformableStateKt$panBy$2 = new TransformableStateKt$panBy$2(this.$offset, interfaceC9324c);
        transformableStateKt$panBy$2.L$0 = obj;
        return transformableStateKt$panBy$2;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(TransformScope transformScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((TransformableStateKt$panBy$2) create(transformScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        ((TransformScope) this.L$0).mo20534transformByd4ec7I(1.0f, this.$offset, 0.0f);
        return C8736p.f16368a;
    }
}
