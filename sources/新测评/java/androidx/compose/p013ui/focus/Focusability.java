package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.input.InputMode;
import androidx.compose.p013ui.input.InputModeManager;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0017"}, m13558d2 = {"Landroidx/compose/ui/focus/Focusability;", "", "value", "", "constructor-impl", "(I)I", "canFocus", "", "node", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "canFocus-impl$ui_release", "(ILandroidx/compose/ui/node/CompositionLocalConsumerModifierNode;)Z", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nFocusability.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusability.kt\nandroidx/compose/ui/focus/Focusability\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes2.dex */
public final class Focusability {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Always = m20665constructorimpl(1);
    private static final int SystemDefined = m20665constructorimpl(0);
    private static final int Never = m20665constructorimpl(2);

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m13558d2 = {"Landroidx/compose/ui/focus/Focusability$Companion;", "", "()V", "Always", "Landroidx/compose/ui/focus/Focusability;", "getAlways-LCbbffg", "()I", "I", "Never", "getNever-LCbbffg", "SystemDefined", "getSystemDefined-LCbbffg", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAlways-LCbbffg, reason: not valid java name */
        public final int m20671getAlwaysLCbbffg() {
            return Focusability.Always;
        }

        /* renamed from: getNever-LCbbffg, reason: not valid java name */
        public final int m20672getNeverLCbbffg() {
            return Focusability.Never;
        }

        /* renamed from: getSystemDefined-LCbbffg, reason: not valid java name */
        public final int m20673getSystemDefinedLCbbffg() {
            return Focusability.SystemDefined;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Focusability(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Focusability m20663boximpl(int i10) {
        return new Focusability(i10);
    }

    /* renamed from: canFocus-impl$ui_release, reason: not valid java name */
    public static final boolean m20664canFocusimpl$ui_release(int i10, CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        if (m20667equalsimpl0(i10, Always)) {
            return true;
        }
        if (m20667equalsimpl0(i10, SystemDefined)) {
            return !InputMode.m21733equalsimpl0(((InputModeManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, CompositionLocalsKt.getLocalInputModeManager())).mo21739getInputModeaOaMEAU(), InputMode.INSTANCE.m21738getTouchaOaMEAU());
        }
        if (m20667equalsimpl0(i10, Never)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m20665constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20666equalsimpl(int i10, Object obj) {
        return (obj instanceof Focusability) && i10 == ((Focusability) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20667equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20668hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20669toStringimpl(int i10) {
        if (m20667equalsimpl0(i10, Always)) {
            return "Always";
        }
        if (m20667equalsimpl0(i10, SystemDefined)) {
            return "SystemDefined";
        }
        if (m20667equalsimpl0(i10, Never)) {
            return "Never";
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    public boolean equals(Object obj) {
        return m20666equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m20668hashCodeimpl(this.value);
    }

    public String toString() {
        return m20669toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
