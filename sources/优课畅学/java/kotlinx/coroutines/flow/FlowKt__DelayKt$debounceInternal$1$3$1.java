package kotlinx.coroutines.flow;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p180m8.AbstractC9339l;
import p190n7.AbstractC9434a;
import p191n8.C9442d0;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", m17801f = "Delay.kt", m17802l = {TbsListener.ErrorCode.DEXOAT_EXCEPTION}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements InterfaceC10570l {

    /* renamed from: a */
    public int f17726a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC9267d f17727b;

    /* renamed from: c */
    public final /* synthetic */ Ref$ObjectRef f17728c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(InterfaceC9267d interfaceC9267d, Ref$ObjectRef ref$ObjectRef, InterfaceC9324c interfaceC9324c) {
        super(1, interfaceC9324c);
        this.f17727b = interfaceC9267d;
        this.f17728c = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(InterfaceC9324c interfaceC9324c) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.f17727b, this.f17728c, interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f17726a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9267d interfaceC9267d = this.f17727b;
            C9442d0 c9442d0 = AbstractC9339l.f18395a;
            Object obj2 = this.f17728c.f17473a;
            if (obj2 == c9442d0) {
                obj2 = null;
            }
            this.f17726a = 1;
            if (interfaceC9267d.emit(obj2, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        this.f17728c.f17473a = null;
        return C8736p.f16368a;
    }

    @Override // p300x7.InterfaceC10570l
    public final Object invoke(InterfaceC9324c interfaceC9324c) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
