package androidx.compose.foundation.gestures;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "androidx.compose.foundation.gestures.ScrollableKt", m5303f = "Scrollable.kt", m5304i = {0, 0}, m5305l = {1023}, m5306m = "semanticsScrollBy-d-4ec7I", m5307n = {"$this$semanticsScrollBy_u2dd_u2d4ec7I", "previousValue"}, m5308s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class ScrollableKt$semanticsScrollBy$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ScrollableKt$semanticsScrollBy$1(InterfaceC5631c<? super ScrollableKt$semanticsScrollBy$1> interfaceC5631c) {
        super(interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScrollableKt.m7032semanticsScrollByd4ec7I(null, 0L, this);
    }
}
