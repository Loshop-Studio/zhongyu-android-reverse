package androidx.compose.foundation;

import androidx.compose.foundation.HoverableKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5191c = "androidx.compose.foundation.HoverableKt$hoverable$2", m5192f = "Hoverable.kt", m5193i = {0}, m5194l = {70}, m5195m = "invoke$emitExit", m5196n = {"hoverInteraction$delegate"}, m5197s = {"L$0"})
/* loaded from: classes.dex */
public final class HoverableKt$hoverable$2$invoke$emitExit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public HoverableKt$hoverable$2$invoke$emitExit$1(Continuation<? super HoverableKt$hoverable$2$invoke$emitExit$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HoverableKt.C04082.invoke$emitExit(null, null, this);
    }
}
