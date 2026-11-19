package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.input.InputMode;
import androidx.compose.p013ui.input.InputModeManager;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class Focusability {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Always = m23965constructorimpl(1);
    private static final int SystemDefined = m23965constructorimpl(0);
    private static final int Never = m23965constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getAlways-LCbbffg, reason: not valid java name */
        public final int m23971getAlwaysLCbbffg() {
            return Focusability.Always;
        }

        /* renamed from: getNever-LCbbffg, reason: not valid java name */
        public final int m23972getNeverLCbbffg() {
            return Focusability.Never;
        }

        /* renamed from: getSystemDefined-LCbbffg, reason: not valid java name */
        public final int m23973getSystemDefinedLCbbffg() {
            return Focusability.SystemDefined;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Focusability(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Focusability m23963boximpl(int i10) {
        return new Focusability(i10);
    }

    /* renamed from: canFocus-impl$ui_release, reason: not valid java name */
    public static final boolean m23964canFocusimpl$ui_release(int i10, CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        if (m23967equalsimpl0(i10, Always)) {
            return true;
        }
        if (m23967equalsimpl0(i10, SystemDefined)) {
            return !InputMode.m25035equalsimpl0(((InputModeManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, CompositionLocalsKt.getLocalInputModeManager())).mo25041getInputModeaOaMEAU(), InputMode.Companion.m25040getTouchaOaMEAU());
        }
        if (m23967equalsimpl0(i10, Never)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m23965constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23966equalsimpl(int i10, Object obj) {
        return (obj instanceof Focusability) && i10 == ((Focusability) obj).m23970unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23967equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23968hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23969toStringimpl(int i10) {
        if (m23967equalsimpl0(i10, Always)) {
            return "Always";
        }
        if (m23967equalsimpl0(i10, SystemDefined)) {
            return "SystemDefined";
        }
        if (m23967equalsimpl0(i10, Never)) {
            return "Never";
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    public boolean equals(Object obj) {
        return m23966equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m23968hashCodeimpl(this.value);
    }

    public String toString() {
        return m23969toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m23970unboximpl() {
        return this.value;
    }
}
