package kotlinx.coroutines.flow;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m17801f = "Builders.kt", m17802l = {TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_RET_TYPE_NOT_BUNDLE}, m17803m = "collectTo")
/* loaded from: classes5.dex */
public final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f17688a;

    /* renamed from: b */
    public /* synthetic */ Object f17689b;

    /* renamed from: c */
    public final /* synthetic */ CallbackFlowBuilder f17690c;

    /* renamed from: d */
    public int f17691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder$collectTo$1(CallbackFlowBuilder callbackFlowBuilder, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f17690c = callbackFlowBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17689b = obj;
        this.f17691d |= Integer.MIN_VALUE;
        return this.f17690c.mo16569i(null, this);
    }
}
