package kotlinx.coroutines.flow;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.C9160c;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p180m8.AbstractC9339l;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m17801f = "Delay.kt", m17802l = {236}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f17729a;

    /* renamed from: b */
    public int f17730b;

    /* renamed from: c */
    public /* synthetic */ Object f17731c;

    /* renamed from: d */
    public final /* synthetic */ Ref$ObjectRef f17732d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC9267d f17733e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref$ObjectRef ref$ObjectRef, InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f17732d = ref$ObjectRef;
        this.f17733e = interfaceC9267d;
    }

    /* renamed from: c */
    public final Object m16588c(Object obj, InterfaceC9324c interfaceC9324c) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(C9160c.m16531b(obj), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.f17732d, this.f17733e, interfaceC9324c);
        flowKt__DelayKt$debounceInternal$1$3$2.f17731c = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // p300x7.InterfaceC10574p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m16588c(((C9160c) obj).m16541l(), (InterfaceC9324c) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f17730b;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            Object objM16541l = ((C9160c) this.f17731c).m16541l();
            ref$ObjectRef = this.f17732d;
            boolean z10 = objM16541l instanceof C9160c.c;
            if (!z10) {
                ref$ObjectRef.f17473a = objM16541l;
            }
            InterfaceC9267d interfaceC9267d = this.f17733e;
            if (z10) {
                Throwable thM16534e = C9160c.m16534e(objM16541l);
                if (thM16534e != null) {
                    throw thM16534e;
                }
                Object obj2 = ref$ObjectRef.f17473a;
                if (obj2 != null) {
                    if (obj2 == AbstractC9339l.f18395a) {
                        obj2 = null;
                    }
                    this.f17731c = objM16541l;
                    this.f17729a = ref$ObjectRef;
                    this.f17730b = 1;
                    if (interfaceC9267d.emit(obj2, this) == objM17291f) {
                        return objM17291f;
                    }
                    ref$ObjectRef2 = ref$ObjectRef;
                }
                ref$ObjectRef.f17473a = AbstractC9339l.f18397c;
            }
            return C8736p.f16368a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$ObjectRef2 = (Ref$ObjectRef) this.f17729a;
        AbstractC9079b.m15926b(obj);
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.f17473a = AbstractC9339l.f18397c;
        return C8736p.f16368a;
    }
}
