package androidx.room;

import kotlin.AbstractC9079b;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", m17801f = "RoomDatabase.android.kt", m17802l = {2015}, m17803m = "invokeSuspend")
/* renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 */
/* loaded from: classes3.dex */
public final class C4530x2e53b6b3 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10570l $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4530x2e53b6b3(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super C4530x2e53b6b3> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$block = interfaceC10570l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        C4530x2e53b6b3 c4530x2e53b6b3 = new C4530x2e53b6b3(this.$block, interfaceC9324c);
        c4530x2e53b6b3.L$0 = obj;
        return c4530x2e53b6b3;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super R> interfaceC9324c) {
        return ((C4530x2e53b6b3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TransactionElement transactionElement;
        Throwable th;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transactionElement = (TransactionElement) this.L$0;
            try {
                AbstractC9079b.m15926b(obj);
                transactionElement.release();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                transactionElement.release();
                throw th;
            }
        }
        AbstractC9079b.m15926b(obj);
        InterfaceC9100d.b bVar = ((InterfaceC8822b0) this.L$0).getCoroutineContext().get(TransactionElement.Key);
        AbstractC9133u.m16130d(bVar);
        TransactionElement transactionElement2 = (TransactionElement) bVar;
        transactionElement2.acquire();
        try {
            InterfaceC10570l interfaceC10570l = this.$block;
            this.L$0 = transactionElement2;
            this.label = 1;
            Object objInvoke = interfaceC10570l.invoke(this);
            if (objInvoke == objM17291f) {
                return objM17291f;
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
}
