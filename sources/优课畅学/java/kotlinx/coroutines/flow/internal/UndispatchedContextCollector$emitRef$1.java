package kotlinx.coroutines.flow.internal;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m17801f = "ChannelFlow.kt", m17802l = {TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f18063a;

    /* renamed from: b */
    public /* synthetic */ Object f18064b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC9267d f18065c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndispatchedContextCollector$emitRef$1(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f18065c = interfaceC9267d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.f18065c, interfaceC9324c);
        undispatchedContextCollector$emitRef$1.f18064b = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f18063a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            Object obj2 = this.f18064b;
            InterfaceC9267d interfaceC9267d = this.f18065c;
            this.f18063a = 1;
            if (interfaceC9267d.emit(obj2, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(Object obj, InterfaceC9324c interfaceC9324c) {
        return ((UndispatchedContextCollector$emitRef$1) create(obj, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
