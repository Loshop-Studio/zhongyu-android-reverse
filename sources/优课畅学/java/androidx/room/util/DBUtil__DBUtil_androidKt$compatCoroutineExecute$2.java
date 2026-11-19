package androidx.room.util;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.room.util.DBUtil__DBUtil_androidKt$compatCoroutineExecute$2", m17801f = "DBUtil.android.kt", m17802l = {TbsListener.ErrorCode.NETWORK_NOT_WIFI_ERROR}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DBUtil__DBUtil_androidKt$compatCoroutineExecute$2 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10570l $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super DBUtil__DBUtil_androidKt$compatCoroutineExecute$2> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$block = interfaceC10570l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(this.$block, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super R> interfaceC9324c) {
        return ((DBUtil__DBUtil_androidKt$compatCoroutineExecute$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
        InterfaceC10570l interfaceC10570l = this.$block;
        this.label = 1;
        Object objInvoke = interfaceC10570l.invoke(this);
        return objInvoke == objM17291f ? objM17291f : objInvoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$block.invoke(this);
    }
}
