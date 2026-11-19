package androidx.room.util;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.room.util.DBUtil__DBUtil_androidKt$compatCoroutineExecute$2", m26211f = "DBUtil.android.kt", m26212l = {111}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DBUtil__DBUtil_androidKt$compatCoroutineExecute$2 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9540l $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super DBUtil__DBUtil_androidKt$compatCoroutineExecute$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$block = interfaceC9540l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(this.$block, interfaceC11588c);
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
        InterfaceC9540l interfaceC9540l = this.$block;
        this.label = 1;
        Object objInvoke = interfaceC9540l.invoke(this);
        return objInvoke == objM25952f ? objM25952f : objInvoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$block.invoke(this);
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
        return ((DBUtil__DBUtil_androidKt$compatCoroutineExecute$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
