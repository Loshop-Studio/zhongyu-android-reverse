package androidx.compose.p009ui.hapticfeedback;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, m7880d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class HapticFeedbackType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(m7879d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eR\u0017\u0010\u0003\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m7880d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;", "", "()V", "Confirm", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "getConfirm-5zf0vsI", "()I", "ContextClick", "getContextClick-5zf0vsI", "GestureEnd", "getGestureEnd-5zf0vsI", "GestureThresholdActivate", "getGestureThresholdActivate-5zf0vsI", "LongPress", "getLongPress-5zf0vsI", "Reject", "getReject-5zf0vsI", "SegmentFrequentTick", "getSegmentFrequentTick-5zf0vsI", "SegmentTick", "getSegmentTick-5zf0vsI", "TextHandleMove", "getTextHandleMove-5zf0vsI", "ToggleOff", "getToggleOff-5zf0vsI", "ToggleOn", "getToggleOn-5zf0vsI", "VirtualKey", "getVirtualKey-5zf0vsI", "values", "", "ui_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getConfirm-5zf0vsI, reason: not valid java name */
        public final int m14629getConfirm5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m14641getConfirm5zf0vsI();
        }

        /* renamed from: getContextClick-5zf0vsI, reason: not valid java name */
        public final int m14630getContextClick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m14642getContextClick5zf0vsI();
        }

        /* renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
        public final int m14631getGestureEnd5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m14643getGestureEnd5zf0vsI();
        }

        /* renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
        public final int m14632getGestureThresholdActivate5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m14644getGestureThresholdActivate5zf0vsI();
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m14633getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m14645getLongPress5zf0vsI();
        }

        /* renamed from: getReject-5zf0vsI, reason: not valid java name */
        public final int m14634getReject5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m14646getReject5zf0vsI();
        }

        /* renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
        public final int m14635getSegmentFrequentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m14647getSegmentFrequentTick5zf0vsI();
        }

        /* renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
        public final int m14636getSegmentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m14648getSegmentTick5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m14637getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m14649getTextHandleMove5zf0vsI();
        }

        /* renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
        public final int m14638getToggleOff5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m14650getToggleOff5zf0vsI();
        }

        /* renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
        public final int m14639getToggleOn5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m14651getToggleOn5zf0vsI();
        }

        /* renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
        public final int m14640getVirtualKey5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m14652getVirtualKey5zf0vsI();
        }

        public final List<HapticFeedbackType> values() {
            return CollectionsKt.listOf((Object[]) new HapticFeedbackType[]{HapticFeedbackType.m14622boximpl(m14629getConfirm5zf0vsI()), HapticFeedbackType.m14622boximpl(m14630getContextClick5zf0vsI()), HapticFeedbackType.m14622boximpl(m14631getGestureEnd5zf0vsI()), HapticFeedbackType.m14622boximpl(m14632getGestureThresholdActivate5zf0vsI()), HapticFeedbackType.m14622boximpl(m14633getLongPress5zf0vsI()), HapticFeedbackType.m14622boximpl(m14634getReject5zf0vsI()), HapticFeedbackType.m14622boximpl(m14635getSegmentFrequentTick5zf0vsI()), HapticFeedbackType.m14622boximpl(m14636getSegmentTick5zf0vsI()), HapticFeedbackType.m14622boximpl(m14637getTextHandleMove5zf0vsI()), HapticFeedbackType.m14622boximpl(m14638getToggleOff5zf0vsI()), HapticFeedbackType.m14622boximpl(m14639getToggleOn5zf0vsI()), HapticFeedbackType.m14622boximpl(m14640getVirtualKey5zf0vsI())});
        }

        private Companion() {
        }
    }

    private /* synthetic */ HapticFeedbackType(int i6) {
        this.value = i6;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m14622boximpl(int i6) {
        return new HapticFeedbackType(i6);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m14623constructorimpl(int i6) {
        return i6;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m14624equalsimpl(int i6, Object obj) {
        return (obj instanceof HapticFeedbackType) && i6 == ((HapticFeedbackType) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m14625equalsimpl0(int i6, int i7) {
        return i6 == i7;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m14626hashCodeimpl(int i6) {
        return Integer.hashCode(i6);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m14627toStringimpl(int i6) {
        Companion companion = INSTANCE;
        return m14625equalsimpl0(i6, companion.m14629getConfirm5zf0vsI()) ? "Confirm" : m14625equalsimpl0(i6, companion.m14630getContextClick5zf0vsI()) ? "ContextClick" : m14625equalsimpl0(i6, companion.m14631getGestureEnd5zf0vsI()) ? "GestureEnd" : m14625equalsimpl0(i6, companion.m14632getGestureThresholdActivate5zf0vsI()) ? "GestureThresholdActivate" : m14625equalsimpl0(i6, companion.m14633getLongPress5zf0vsI()) ? "LongPress" : m14625equalsimpl0(i6, companion.m14634getReject5zf0vsI()) ? "Reject" : m14625equalsimpl0(i6, companion.m14635getSegmentFrequentTick5zf0vsI()) ? "SegmentFrequentTick" : m14625equalsimpl0(i6, companion.m14636getSegmentTick5zf0vsI()) ? "SegmentTick" : m14625equalsimpl0(i6, companion.m14637getTextHandleMove5zf0vsI()) ? "TextHandleMove" : m14625equalsimpl0(i6, companion.m14638getToggleOff5zf0vsI()) ? "ToggleOff" : m14625equalsimpl0(i6, companion.m14639getToggleOn5zf0vsI()) ? "ToggleOn" : m14625equalsimpl0(i6, companion.m14640getVirtualKey5zf0vsI()) ? "VirtualKey" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m14624equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m14626hashCodeimpl(this.value);
    }

    public String toString() {
        return m14627toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
