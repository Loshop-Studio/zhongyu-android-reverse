package androidx.room.util;

import androidx.databinding.library.baseAdapters.C3721BR;
import androidx.room.TransactionScope;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1", m17801f = "DBUtil.kt", m17802l = {C3721BR.viewModel}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DBUtil__DBUtilKt$internalPerform$2$result$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10574p $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtilKt$internalPerform$2$result$1(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super DBUtil__DBUtilKt$internalPerform$2$result$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$block = interfaceC10574p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$1 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.$block, interfaceC9324c);
        dBUtil__DBUtilKt$internalPerform$2$result$1.L$0 = obj;
        return dBUtil__DBUtilKt$internalPerform$2$result$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(TransactionScope<R> transactionScope, InterfaceC9324c<? super R> interfaceC9324c) {
        return ((DBUtil__DBUtilKt$internalPerform$2$result$1) create(transactionScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
        TransactionScope transactionScope = (TransactionScope) this.L$0;
        InterfaceC10574p interfaceC10574p = this.$block;
        this.label = 1;
        Object objInvoke = interfaceC10574p.invoke(transactionScope, this);
        return objInvoke == objM17291f ? objM17291f : objInvoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$block.invoke((TransactionScope) this.L$0, this);
    }
}
