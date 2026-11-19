package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", m17801f = "Merge.kt", m17802l = {26}, m17803m = "emit")
/* loaded from: classes5.dex */
public final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f18016a;

    /* renamed from: b */
    public Object f18017b;

    /* renamed from: c */
    public Object f18018c;

    /* renamed from: d */
    public /* synthetic */ Object f18019d;

    /* renamed from: e */
    public final /* synthetic */ ChannelFlowTransformLatest$flowCollect$3.C92001 f18020e;

    /* renamed from: f */
    public int f18021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3$1$emit$1(ChannelFlowTransformLatest$flowCollect$3.C92001 c92001, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f18020e = c92001;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18019d = obj;
        this.f18021f |= Integer.MIN_VALUE;
        return this.f18020e.emit(null, this);
    }
}
