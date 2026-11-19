package kotlinx.coroutines.channels;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "kotlinx.coroutines.channels.BufferedChannel", m5303f = "BufferedChannel.kt", m5304i = {}, m5305l = {759}, m5306m = "receiveCatching-JP2dKIU$suspendImpl", m5307n = {}, m5308s = {})
/* loaded from: classes4.dex */
final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5873b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(C5873b c5873b, InterfaceC5631c<? super BufferedChannel$receiveCatching$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = c5873b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM5468B = C5873b.m5468B(this.this$0, this);
        return objM5468B == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5468B : new C5879h(objM5468B);
    }
}
