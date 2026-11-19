package androidx.compose.p009ui.focus;

import androidx.compose.p009ui.input.InputMode;
import androidx.compose.p009ui.input.InputModeManager;
import androidx.compose.p009ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p009ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p009ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0017"}, m7880d2 = {"Landroidx/compose/ui/focus/Focusability;", "", "value", "", "constructor-impl", "(I)I", "canFocus", "", "node", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "canFocus-impl$ui_release", "(ILandroidx/compose/ui/node/CompositionLocalConsumerModifierNode;)Z", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nFocusability.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusability.kt\nandroidx/compose/ui/focus/Focusability\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes2.dex */
public final class Focusability {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Always = m13588constructorimpl(1);
    private static final int SystemDefined = m13588constructorimpl(0);
    private static final int Never = m13588constructorimpl(2);

    @Metadata(m7879d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m7880d2 = {"Landroidx/compose/ui/focus/Focusability$Companion;", "", "()V", "Always", "Landroidx/compose/ui/focus/Focusability;", "getAlways-LCbbffg", "()I", "I", "Never", "getNever-LCbbffg", "SystemDefined", "getSystemDefined-LCbbffg", "ui_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAlways-LCbbffg, reason: not valid java name */
        public final int m13594getAlwaysLCbbffg() {
            return Focusability.Always;
        }

        /* renamed from: getNever-LCbbffg, reason: not valid java name */
        public final int m13595getNeverLCbbffg() {
            return Focusability.Never;
        }

        /* renamed from: getSystemDefined-LCbbffg, reason: not valid java name */
        public final int m13596getSystemDefinedLCbbffg() {
            return Focusability.SystemDefined;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Focusability(int i6) {
        this.value = i6;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Focusability m13586boximpl(int i6) {
        return new Focusability(i6);
    }

    /* renamed from: canFocus-impl$ui_release, reason: not valid java name */
    public static final boolean m13587canFocusimpl$ui_release(int i6, CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        if (m13590equalsimpl0(i6, Always)) {
            return true;
        }
        if (m13590equalsimpl0(i6, SystemDefined)) {
            return !InputMode.m14656equalsimpl0(((InputModeManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, CompositionLocalsKt.getLocalInputModeManager())).mo14662getInputModeaOaMEAU(), InputMode.INSTANCE.m14661getTouchaOaMEAU());
        }
        if (m13590equalsimpl0(i6, Never)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m13588constructorimpl(int i6) {
        return i6;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13589equalsimpl(int i6, Object obj) {
        return (obj instanceof Focusability) && i6 == ((Focusability) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13590equalsimpl0(int i6, int i7) {
        return i6 == i7;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13591hashCodeimpl(int i6) {
        return Integer.hashCode(i6);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13592toStringimpl(int i6) {
        if (m13590equalsimpl0(i6, Always)) {
            return "Always";
        }
        if (m13590equalsimpl0(i6, SystemDefined)) {
            return "SystemDefined";
        }
        if (m13590equalsimpl0(i6, Never)) {
            return "Never";
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    public boolean equals(Object obj) {
        return m13589equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m13591hashCodeimpl(this.value);
    }

    public String toString() {
        return m13592toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
