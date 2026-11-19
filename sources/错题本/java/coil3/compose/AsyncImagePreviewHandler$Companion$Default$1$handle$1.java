package coil3.compose;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "coil3.compose.AsyncImagePreviewHandler$Companion$Default$1", m5303f = "LocalAsyncImagePreviewHandler.kt", m5304i = {0}, m5305l = {38}, m5306m = "handle", m5307n = {"request"}, m5308s = {"L$0"})
/* loaded from: classes2.dex */
final class AsyncImagePreviewHandler$Companion$Default$1$handle$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3253j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePreviewHandler$Companion$Default$1$handle$1(C3253j c3253j, InterfaceC5631c<? super AsyncImagePreviewHandler$Companion$Default$1$handle$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = c3253j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m2187a(null, null, this);
    }
}
