package androidx.compose.p012ui.hapticfeedback;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, m13413d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes2.dex */
public final class HapticFeedbackType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(m13412d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eR\u0017\u0010\u0003\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m13413d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;", "", "()V", "Confirm", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "getConfirm-5zf0vsI", "()I", "ContextClick", "getContextClick-5zf0vsI", "GestureEnd", "getGestureEnd-5zf0vsI", "GestureThresholdActivate", "getGestureThresholdActivate-5zf0vsI", "LongPress", "getLongPress-5zf0vsI", "Reject", "getReject-5zf0vsI", "SegmentFrequentTick", "getSegmentFrequentTick-5zf0vsI", "SegmentTick", "getSegmentTick-5zf0vsI", "TextHandleMove", "getTextHandleMove-5zf0vsI", "ToggleOff", "getToggleOff-5zf0vsI", "ToggleOn", "getToggleOn-5zf0vsI", "VirtualKey", "getVirtualKey-5zf0vsI", "values", "", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getConfirm-5zf0vsI, reason: not valid java name */
        public final int m22139getConfirm5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m22151getConfirm5zf0vsI();
        }

        /* renamed from: getContextClick-5zf0vsI, reason: not valid java name */
        public final int m22140getContextClick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m22152getContextClick5zf0vsI();
        }

        /* renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
        public final int m22141getGestureEnd5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m22153getGestureEnd5zf0vsI();
        }

        /* renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
        public final int m22142getGestureThresholdActivate5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m22154getGestureThresholdActivate5zf0vsI();
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m22143getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m22155getLongPress5zf0vsI();
        }

        /* renamed from: getReject-5zf0vsI, reason: not valid java name */
        public final int m22144getReject5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m22156getReject5zf0vsI();
        }

        /* renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
        public final int m22145getSegmentFrequentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m22157getSegmentFrequentTick5zf0vsI();
        }

        /* renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
        public final int m22146getSegmentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m22158getSegmentTick5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m22147getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m22159getTextHandleMove5zf0vsI();
        }

        /* renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
        public final int m22148getToggleOff5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m22160getToggleOff5zf0vsI();
        }

        /* renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
        public final int m22149getToggleOn5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m22161getToggleOn5zf0vsI();
        }

        /* renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
        public final int m22150getVirtualKey5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m22162getVirtualKey5zf0vsI();
        }

        public final List<HapticFeedbackType> values() {
            return CollectionsKt.listOf((Object[]) new HapticFeedbackType[]{HapticFeedbackType.m22132boximpl(m22139getConfirm5zf0vsI()), HapticFeedbackType.m22132boximpl(m22140getContextClick5zf0vsI()), HapticFeedbackType.m22132boximpl(m22141getGestureEnd5zf0vsI()), HapticFeedbackType.m22132boximpl(m22142getGestureThresholdActivate5zf0vsI()), HapticFeedbackType.m22132boximpl(m22143getLongPress5zf0vsI()), HapticFeedbackType.m22132boximpl(m22144getReject5zf0vsI()), HapticFeedbackType.m22132boximpl(m22145getSegmentFrequentTick5zf0vsI()), HapticFeedbackType.m22132boximpl(m22146getSegmentTick5zf0vsI()), HapticFeedbackType.m22132boximpl(m22147getTextHandleMove5zf0vsI()), HapticFeedbackType.m22132boximpl(m22148getToggleOff5zf0vsI()), HapticFeedbackType.m22132boximpl(m22149getToggleOn5zf0vsI()), HapticFeedbackType.m22132boximpl(m22150getVirtualKey5zf0vsI())});
        }

        private Companion() {
        }
    }

    private /* synthetic */ HapticFeedbackType(int i9) {
        this.value = i9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m22132boximpl(int i9) {
        return new HapticFeedbackType(i9);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m22133constructorimpl(int i9) {
        return i9;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m22134equalsimpl(int i9, Object obj) {
        return (obj instanceof HapticFeedbackType) && i9 == ((HapticFeedbackType) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m22135equalsimpl0(int i9, int i10) {
        return i9 == i10;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m22136hashCodeimpl(int i9) {
        return Integer.hashCode(i9);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m22137toStringimpl(int i9) {
        Companion companion = INSTANCE;
        return m22135equalsimpl0(i9, companion.m22139getConfirm5zf0vsI()) ? "Confirm" : m22135equalsimpl0(i9, companion.m22140getContextClick5zf0vsI()) ? "ContextClick" : m22135equalsimpl0(i9, companion.m22141getGestureEnd5zf0vsI()) ? "GestureEnd" : m22135equalsimpl0(i9, companion.m22142getGestureThresholdActivate5zf0vsI()) ? "GestureThresholdActivate" : m22135equalsimpl0(i9, companion.m22143getLongPress5zf0vsI()) ? "LongPress" : m22135equalsimpl0(i9, companion.m22144getReject5zf0vsI()) ? "Reject" : m22135equalsimpl0(i9, companion.m22145getSegmentFrequentTick5zf0vsI()) ? "SegmentFrequentTick" : m22135equalsimpl0(i9, companion.m22146getSegmentTick5zf0vsI()) ? "SegmentTick" : m22135equalsimpl0(i9, companion.m22147getTextHandleMove5zf0vsI()) ? "TextHandleMove" : m22135equalsimpl0(i9, companion.m22148getToggleOff5zf0vsI()) ? "ToggleOff" : m22135equalsimpl0(i9, companion.m22149getToggleOn5zf0vsI()) ? "ToggleOn" : m22135equalsimpl0(i9, companion.m22150getVirtualKey5zf0vsI()) ? "VirtualKey" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m22134equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m22136hashCodeimpl(this.value);
    }

    public String toString() {
        return m22137toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
