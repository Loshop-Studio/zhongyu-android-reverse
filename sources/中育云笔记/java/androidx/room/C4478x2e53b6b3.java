package androidx.room;

import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", m26211f = "RoomDatabase.android.kt", m26212l = {2015}, m26213m = "invokeSuspend")
/* renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 */
/* loaded from: classes3.dex */
public final class C4478x2e53b6b3 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9540l $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4478x2e53b6b3(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super C4478x2e53b6b3> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$block = interfaceC9540l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        C4478x2e53b6b3 c4478x2e53b6b3 = new C4478x2e53b6b3(this.$block, interfaceC11588c);
        c4478x2e53b6b3.L$0 = obj;
        return c4478x2e53b6b3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TransactionElement transactionElement;
        Throwable th;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transactionElement = (TransactionElement) this.L$0;
            try {
                AbstractC9924b.m20071b(obj);
                transactionElement.release();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                transactionElement.release();
                throw th;
            }
        }
        AbstractC9924b.m20071b(obj);
        InterfaceC9945d.b bVar = ((InterfaceC11122i0) this.L$0).getCoroutineContext().get(TransactionElement.Key);
        AbstractC9979u.m20291d(bVar);
        TransactionElement transactionElement2 = (TransactionElement) bVar;
        transactionElement2.acquire();
        try {
            InterfaceC9540l interfaceC9540l = this.$block;
            this.L$0 = transactionElement2;
            this.label = 1;
            Object objInvoke = interfaceC9540l.invoke(this);
            if (objInvoke == objM25952f) {
                return objM25952f;
            }
            transactionElement = transactionElement2;
            obj = objInvoke;
            transactionElement.release();
            return obj;
        } catch (Throwable th3) {
            transactionElement = transactionElement2;
            th = th3;
            transactionElement.release();
            throw th;
        }
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
        return ((C4478x2e53b6b3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
