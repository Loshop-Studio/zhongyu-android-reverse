package androidx.compose.p011ui.input.nestedscroll;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", m5303f = "NestedScrollNode.kt", m5304i = {0, 0, 0, 1}, m5305l = {103, 113}, m5306m = "onPostFling-RZ2iAVY", m5307n = {"this", "consumed", "available", "selfConsumed"}, m5308s = {"L$0", "J$0", "J$1", "J$0"})
/* loaded from: classes2.dex */
public final class NestedScrollNode$onPostFling$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPostFling$1(NestedScrollNode nestedScrollNode, InterfaceC5631c<? super NestedScrollNode$onPostFling$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7033onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
