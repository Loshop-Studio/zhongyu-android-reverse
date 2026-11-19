package androidx.compose.p013ui.input.pointer;

/* loaded from: classes2.dex */
public final class PointerInputEventProcessorKt {
    public static final int ProcessResult(boolean z10, boolean z11) {
        return ProcessResult.m25585constructorimpl((z10 ? 1 : 0) | ((z11 ? 1 : 0) << 1));
    }

    private static final int toInt(boolean z10) {
        return z10 ? 1 : 0;
    }
}
