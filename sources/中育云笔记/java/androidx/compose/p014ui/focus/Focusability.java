package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.input.InputMode;
import androidx.compose.p014ui.input.InputModeManager;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class Focusability {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Always = m30567constructorimpl(1);
    private static final int SystemDefined = m30567constructorimpl(0);
    private static final int Never = m30567constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getAlways-LCbbffg, reason: not valid java name */
        public final int m30573getAlwaysLCbbffg() {
            return Focusability.Always;
        }

        /* renamed from: getNever-LCbbffg, reason: not valid java name */
        public final int m30574getNeverLCbbffg() {
            return Focusability.Never;
        }

        /* renamed from: getSystemDefined-LCbbffg, reason: not valid java name */
        public final int m30575getSystemDefinedLCbbffg() {
            return Focusability.SystemDefined;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Focusability(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Focusability m30565boximpl(int i10) {
        return new Focusability(i10);
    }

    /* renamed from: canFocus-impl$ui_release, reason: not valid java name */
    public static final boolean m30566canFocusimpl$ui_release(int i10, CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        if (m30569equalsimpl0(i10, Always)) {
            return true;
        }
        if (m30569equalsimpl0(i10, SystemDefined)) {
            return !InputMode.m31637equalsimpl0(((InputModeManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, CompositionLocalsKt.getLocalInputModeManager())).mo31643getInputModeaOaMEAU(), InputMode.Companion.m31642getTouchaOaMEAU());
        }
        if (m30569equalsimpl0(i10, Never)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m30567constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30568equalsimpl(int i10, Object obj) {
        return (obj instanceof Focusability) && i10 == ((Focusability) obj).m30572unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30569equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30570hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30571toStringimpl(int i10) {
        if (m30569equalsimpl0(i10, Always)) {
            return "Always";
        }
        if (m30569equalsimpl0(i10, SystemDefined)) {
            return "SystemDefined";
        }
        if (m30569equalsimpl0(i10, Never)) {
            return "Never";
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    public boolean equals(Object obj) {
        return m30568equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m30570hashCodeimpl(this.value);
    }

    public String toString() {
        return m30571toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m30572unboximpl() {
        return this.value;
    }
}
