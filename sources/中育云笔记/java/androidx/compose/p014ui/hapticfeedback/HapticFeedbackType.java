package androidx.compose.p014ui.hapticfeedback;

import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
public final class HapticFeedbackType {
    public static final Companion Companion = new Companion(null);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getConfirm-5zf0vsI, reason: not valid java name */
        public final int m31610getConfirm5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m31622getConfirm5zf0vsI();
        }

        /* renamed from: getContextClick-5zf0vsI, reason: not valid java name */
        public final int m31611getContextClick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m31623getContextClick5zf0vsI();
        }

        /* renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
        public final int m31612getGestureEnd5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m31624getGestureEnd5zf0vsI();
        }

        /* renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
        public final int m31613getGestureThresholdActivate5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m31625getGestureThresholdActivate5zf0vsI();
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m31614getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m31626getLongPress5zf0vsI();
        }

        /* renamed from: getReject-5zf0vsI, reason: not valid java name */
        public final int m31615getReject5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m31627getReject5zf0vsI();
        }

        /* renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
        public final int m31616getSegmentFrequentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m31628getSegmentFrequentTick5zf0vsI();
        }

        /* renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
        public final int m31617getSegmentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m31629getSegmentTick5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m31618getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m31630getTextHandleMove5zf0vsI();
        }

        /* renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
        public final int m31619getToggleOff5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m31631getToggleOff5zf0vsI();
        }

        /* renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
        public final int m31620getToggleOn5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m31632getToggleOn5zf0vsI();
        }

        /* renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
        public final int m31621getVirtualKey5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m31633getVirtualKey5zf0vsI();
        }

        public final List<HapticFeedbackType> values() {
            return AbstractC10978w.m24139q(HapticFeedbackType.m31603boximpl(m31610getConfirm5zf0vsI()), HapticFeedbackType.m31603boximpl(m31611getContextClick5zf0vsI()), HapticFeedbackType.m31603boximpl(m31612getGestureEnd5zf0vsI()), HapticFeedbackType.m31603boximpl(m31613getGestureThresholdActivate5zf0vsI()), HapticFeedbackType.m31603boximpl(m31614getLongPress5zf0vsI()), HapticFeedbackType.m31603boximpl(m31615getReject5zf0vsI()), HapticFeedbackType.m31603boximpl(m31616getSegmentFrequentTick5zf0vsI()), HapticFeedbackType.m31603boximpl(m31617getSegmentTick5zf0vsI()), HapticFeedbackType.m31603boximpl(m31618getTextHandleMove5zf0vsI()), HapticFeedbackType.m31603boximpl(m31619getToggleOff5zf0vsI()), HapticFeedbackType.m31603boximpl(m31620getToggleOn5zf0vsI()), HapticFeedbackType.m31603boximpl(m31621getVirtualKey5zf0vsI()));
        }

        private Companion() {
        }
    }

    private /* synthetic */ HapticFeedbackType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m31603boximpl(int i10) {
        return new HapticFeedbackType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31604constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31605equalsimpl(int i10, Object obj) {
        return (obj instanceof HapticFeedbackType) && i10 == ((HapticFeedbackType) obj).m31609unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31606equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31607hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31608toStringimpl(int i10) {
        Companion companion = Companion;
        return m31606equalsimpl0(i10, companion.m31610getConfirm5zf0vsI()) ? "Confirm" : m31606equalsimpl0(i10, companion.m31611getContextClick5zf0vsI()) ? "ContextClick" : m31606equalsimpl0(i10, companion.m31612getGestureEnd5zf0vsI()) ? "GestureEnd" : m31606equalsimpl0(i10, companion.m31613getGestureThresholdActivate5zf0vsI()) ? "GestureThresholdActivate" : m31606equalsimpl0(i10, companion.m31614getLongPress5zf0vsI()) ? "LongPress" : m31606equalsimpl0(i10, companion.m31615getReject5zf0vsI()) ? "Reject" : m31606equalsimpl0(i10, companion.m31616getSegmentFrequentTick5zf0vsI()) ? "SegmentFrequentTick" : m31606equalsimpl0(i10, companion.m31617getSegmentTick5zf0vsI()) ? "SegmentTick" : m31606equalsimpl0(i10, companion.m31618getTextHandleMove5zf0vsI()) ? "TextHandleMove" : m31606equalsimpl0(i10, companion.m31619getToggleOff5zf0vsI()) ? "ToggleOff" : m31606equalsimpl0(i10, companion.m31620getToggleOn5zf0vsI()) ? "ToggleOn" : m31606equalsimpl0(i10, companion.m31621getVirtualKey5zf0vsI()) ? "VirtualKey" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m31605equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31607hashCodeimpl(this.value);
    }

    public String toString() {
        return m31608toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31609unboximpl() {
        return this.value;
    }
}
