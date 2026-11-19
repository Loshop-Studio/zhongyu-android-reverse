package androidx.paging;

import androidx.paging.FlowExtKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$1", m17801f = "FlowExt.kt", m17802l = {73, 76}, m17803m = "emit")
/* loaded from: classes3.dex */
public final class FlowExtKt$simpleRunningReduce$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowExtKt.C43031.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$simpleRunningReduce$1$1$emit$1(FlowExtKt.C43031.AnonymousClass1<? super T> anonymousClass1, InterfaceC9324c<? super FlowExtKt$simpleRunningReduce$1$1$emit$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
