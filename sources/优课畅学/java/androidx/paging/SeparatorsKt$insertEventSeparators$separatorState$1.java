package androidx.paging;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1", m17801f = "Separators.kt", m17802l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SeparatorsKt$insertEventSeparators$separatorState$1 extends SuspendLambda implements InterfaceC10575q {
    final /* synthetic */ InterfaceC10575q $generator;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorsKt$insertEventSeparators$separatorState$1(InterfaceC10575q interfaceC10575q, InterfaceC9324c<? super SeparatorsKt$insertEventSeparators$separatorState$1> interfaceC9324c) {
        super(3, interfaceC9324c);
        this.$generator = interfaceC10575q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        Object obj2 = this.L$0;
        Object obj3 = this.L$1;
        InterfaceC10575q interfaceC10575q = this.$generator;
        this.L$0 = null;
        this.label = 1;
        Object objInvoke = interfaceC10575q.invoke(obj2, obj3, this);
        return objInvoke == objM17291f ? objM17291f : objInvoke;
    }

    @Override // p300x7.InterfaceC10575q
    public final Object invoke(T t10, T t11, InterfaceC9324c<? super R> interfaceC9324c) {
        SeparatorsKt$insertEventSeparators$separatorState$1 separatorsKt$insertEventSeparators$separatorState$1 = new SeparatorsKt$insertEventSeparators$separatorState$1(this.$generator, interfaceC9324c);
        separatorsKt$insertEventSeparators$separatorState$1.L$0 = t10;
        separatorsKt$insertEventSeparators$separatorState$1.L$1 = t11;
        return separatorsKt$insertEventSeparators$separatorState$1.invokeSuspend(C8736p.f16368a);
    }
}
