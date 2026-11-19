package kotlinx.coroutines.flow;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m17801f = "Share.kt", m17802l = {TbsListener.ErrorCode.INFO_INITX5_FALSE_DEFAULT, 419}, m17803m = "onSubscription")
/* loaded from: classes5.dex */
public final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f17974a;

    /* renamed from: b */
    public Object f17975b;

    /* renamed from: c */
    public /* synthetic */ Object f17976c;

    /* renamed from: d */
    public final /* synthetic */ SubscribedFlowCollector f17977d;

    /* renamed from: e */
    public int f17978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(SubscribedFlowCollector subscribedFlowCollector, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f17977d = subscribedFlowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17976c = obj;
        this.f17978e |= Integer.MIN_VALUE;
        return this.f17977d.m16690c(this);
    }
}
