package androidx.compose.runtime;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class PausedCompositionState {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ PausedCompositionState[] $VALUES;
    public static final PausedCompositionState Invalid = new PausedCompositionState("Invalid", 0);
    public static final PausedCompositionState Cancelled = new PausedCompositionState("Cancelled", 1);
    public static final PausedCompositionState InitialPending = new PausedCompositionState("InitialPending", 2);
    public static final PausedCompositionState RecomposePending = new PausedCompositionState("RecomposePending", 3);
    public static final PausedCompositionState ApplyPending = new PausedCompositionState("ApplyPending", 4);
    public static final PausedCompositionState Applied = new PausedCompositionState("Applied", 5);

    private static final /* synthetic */ PausedCompositionState[] $values() {
        return new PausedCompositionState[]{Invalid, Cancelled, InitialPending, RecomposePending, ApplyPending, Applied};
    }

    static {
        PausedCompositionState[] pausedCompositionStateArr$values = $values();
        $VALUES = pausedCompositionStateArr$values;
        $ENTRIES = AbstractC9108a.m16085a(pausedCompositionStateArr$values);
    }

    private PausedCompositionState(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static PausedCompositionState valueOf(String str) {
        return (PausedCompositionState) Enum.valueOf(PausedCompositionState.class, str);
    }

    public static PausedCompositionState[] values() {
        return (PausedCompositionState[]) $VALUES.clone();
    }
}
