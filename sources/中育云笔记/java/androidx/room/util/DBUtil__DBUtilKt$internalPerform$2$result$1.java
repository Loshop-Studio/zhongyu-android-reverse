package androidx.room.util;

import androidx.room.TransactionScope;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1", m26211f = "DBUtil.kt", m26212l = {59}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DBUtil__DBUtilKt$internalPerform$2$result$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9544p $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtilKt$internalPerform$2$result$1(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super DBUtil__DBUtilKt$internalPerform$2$result$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$block = interfaceC9544p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$1 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.$block, interfaceC11588c);
        dBUtil__DBUtilKt$internalPerform$2$result$1.L$0 = obj;
        return dBUtil__DBUtilKt$internalPerform$2$result$1;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(TransactionScope<R> transactionScope, InterfaceC11588c<? super R> interfaceC11588c) {
        return ((DBUtil__DBUtilKt$internalPerform$2$result$1) create(transactionScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
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
        TransactionScope transactionScope = (TransactionScope) this.L$0;
        InterfaceC9544p interfaceC9544p = this.$block;
        this.label = 1;
        Object objInvoke = interfaceC9544p.invoke(transactionScope, this);
        return objInvoke == objM25952f ? objM25952f : objInvoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$block.invoke((TransactionScope) this.L$0, this);
    }
}
