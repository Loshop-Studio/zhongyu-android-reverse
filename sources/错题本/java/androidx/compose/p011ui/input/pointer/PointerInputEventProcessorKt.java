package androidx.compose.p011ui.input.pointer;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0007*\u00020\u0003H\u0082\b¨\u0006\b"}, m5110d2 = {"ProcessResult", "Landroidx/compose/ui/input/pointer/ProcessResult;", "dispatchedToAPointerInputModifier", "", "anyMovementConsumed", "(ZZ)I", "toInt", "", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessorKt\n*L\n1#1,264:1\n263#1:265\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessorKt\n*L\n259#1:265\n*E\n"})
/* loaded from: classes2.dex */
public final class PointerInputEventProcessorKt {
    public static final int ProcessResult(boolean z8, boolean z9) {
        return ProcessResult.m11991constructorimpl((z8 ? 1 : 0) | ((z9 ? 1 : 0) << 1));
    }

    private static final int toInt(boolean z8) {
        return z8 ? 1 : 0;
    }
}
