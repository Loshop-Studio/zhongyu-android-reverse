package androidx.paging;

import androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1", m17801f = "FlowExt.kt", m17802l = {148, 151}, m17803m = "emit")
/* loaded from: classes3.dex */
public final class FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowExtKt$combineWithoutBatching$2$1$1.C43001<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1(FlowExtKt$combineWithoutBatching$2$1$1.C43001<? super T> c43001, InterfaceC9324c<? super FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = c43001;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
