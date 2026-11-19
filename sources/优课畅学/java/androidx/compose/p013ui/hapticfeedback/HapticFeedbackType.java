package androidx.compose.p013ui.hapticfeedback;

import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import p134i7.AbstractC8809v;

/* loaded from: classes2.dex */
public final class HapticFeedbackType {
    public static final Companion Companion = new Companion(null);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getConfirm-5zf0vsI, reason: not valid java name */
        public final int m25008getConfirm5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m25020getConfirm5zf0vsI();
        }

        /* renamed from: getContextClick-5zf0vsI, reason: not valid java name */
        public final int m25009getContextClick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m25021getContextClick5zf0vsI();
        }

        /* renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
        public final int m25010getGestureEnd5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m25022getGestureEnd5zf0vsI();
        }

        /* renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
        public final int m25011getGestureThresholdActivate5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m25023getGestureThresholdActivate5zf0vsI();
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m25012getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m25024getLongPress5zf0vsI();
        }

        /* renamed from: getReject-5zf0vsI, reason: not valid java name */
        public final int m25013getReject5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m25025getReject5zf0vsI();
        }

        /* renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
        public final int m25014getSegmentFrequentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m25026getSegmentFrequentTick5zf0vsI();
        }

        /* renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
        public final int m25015getSegmentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m25027getSegmentTick5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m25016getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m25028getTextHandleMove5zf0vsI();
        }

        /* renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
        public final int m25017getToggleOff5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m25029getToggleOff5zf0vsI();
        }

        /* renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
        public final int m25018getToggleOn5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m25030getToggleOn5zf0vsI();
        }

        /* renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
        public final int m25019getVirtualKey5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m25031getVirtualKey5zf0vsI();
        }

        public final List<HapticFeedbackType> values() {
            return AbstractC8809v.m14774q(HapticFeedbackType.m25001boximpl(m25008getConfirm5zf0vsI()), HapticFeedbackType.m25001boximpl(m25009getContextClick5zf0vsI()), HapticFeedbackType.m25001boximpl(m25010getGestureEnd5zf0vsI()), HapticFeedbackType.m25001boximpl(m25011getGestureThresholdActivate5zf0vsI()), HapticFeedbackType.m25001boximpl(m25012getLongPress5zf0vsI()), HapticFeedbackType.m25001boximpl(m25013getReject5zf0vsI()), HapticFeedbackType.m25001boximpl(m25014getSegmentFrequentTick5zf0vsI()), HapticFeedbackType.m25001boximpl(m25015getSegmentTick5zf0vsI()), HapticFeedbackType.m25001boximpl(m25016getTextHandleMove5zf0vsI()), HapticFeedbackType.m25001boximpl(m25017getToggleOff5zf0vsI()), HapticFeedbackType.m25001boximpl(m25018getToggleOn5zf0vsI()), HapticFeedbackType.m25001boximpl(m25019getVirtualKey5zf0vsI()));
        }

        private Companion() {
        }
    }

    private /* synthetic */ HapticFeedbackType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m25001boximpl(int i10) {
        return new HapticFeedbackType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m25002constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25003equalsimpl(int i10, Object obj) {
        return (obj instanceof HapticFeedbackType) && i10 == ((HapticFeedbackType) obj).m25007unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25004equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25005hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25006toStringimpl(int i10) {
        Companion companion = Companion;
        return m25004equalsimpl0(i10, companion.m25008getConfirm5zf0vsI()) ? "Confirm" : m25004equalsimpl0(i10, companion.m25009getContextClick5zf0vsI()) ? "ContextClick" : m25004equalsimpl0(i10, companion.m25010getGestureEnd5zf0vsI()) ? "GestureEnd" : m25004equalsimpl0(i10, companion.m25011getGestureThresholdActivate5zf0vsI()) ? "GestureThresholdActivate" : m25004equalsimpl0(i10, companion.m25012getLongPress5zf0vsI()) ? "LongPress" : m25004equalsimpl0(i10, companion.m25013getReject5zf0vsI()) ? "Reject" : m25004equalsimpl0(i10, companion.m25014getSegmentFrequentTick5zf0vsI()) ? "SegmentFrequentTick" : m25004equalsimpl0(i10, companion.m25015getSegmentTick5zf0vsI()) ? "SegmentTick" : m25004equalsimpl0(i10, companion.m25016getTextHandleMove5zf0vsI()) ? "TextHandleMove" : m25004equalsimpl0(i10, companion.m25017getToggleOff5zf0vsI()) ? "ToggleOff" : m25004equalsimpl0(i10, companion.m25018getToggleOn5zf0vsI()) ? "ToggleOn" : m25004equalsimpl0(i10, companion.m25019getVirtualKey5zf0vsI()) ? "VirtualKey" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m25003equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m25005hashCodeimpl(this.value);
    }

    public String toString() {
        return m25006toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m25007unboximpl() {
        return this.value;
    }
}
