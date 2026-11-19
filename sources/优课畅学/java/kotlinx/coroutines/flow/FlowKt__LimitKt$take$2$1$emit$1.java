package kotlinx.coroutines.flow;

import androidx.databinding.library.baseAdapters.C3721BR;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", m17801f = "Limit.kt", m17802l = {C3721BR.versionViewModel, C3721BR.webViewControlViewModel}, m17803m = "emit")
/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$take$2$1$emit$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f17826a;

    /* renamed from: b */
    public final /* synthetic */ FlowKt__LimitKt$take$2$1 f17827b;

    /* renamed from: c */
    public int f17828c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$take$2$1$emit$1(FlowKt__LimitKt$take$2$1 flowKt__LimitKt$take$2$1, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f17827b = flowKt__LimitKt$take$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17826a = obj;
        this.f17828c |= Integer.MIN_VALUE;
        return this.f17827b.emit(null, this);
    }
}
