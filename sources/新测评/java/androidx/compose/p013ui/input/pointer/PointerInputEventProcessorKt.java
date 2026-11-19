package androidx.compose.p013ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0007*\u00020\u0003H\u0082\b¨\u0006\b"}, m13558d2 = {"ProcessResult", "Landroidx/compose/ui/input/pointer/ProcessResult;", "dispatchedToAPointerInputModifier", "", "anyMovementConsumed", "(ZZ)I", "toInt", "", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessorKt\n*L\n1#1,264:1\n263#1:265\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessorKt\n*L\n259#1:265\n*E\n"})
/* loaded from: classes2.dex */
public final class PointerInputEventProcessorKt {
    public static final int ProcessResult(boolean z9, boolean z10) {
        return ProcessResult.m22282constructorimpl((z9 ? 1 : 0) | ((z10 ? 1 : 0) << 1));
    }

    private static final int toInt(boolean z9) {
        return z9 ? 1 : 0;
    }
}
