package androidx.compose.p013ui.unit;

import com.tencent.ijk.media.player.IjkMediaMeta;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class TextUnitType {
    private final long type;
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m27119constructorimpl(0);

    /* renamed from: Sp */
    private static final long f1361Sp = m27119constructorimpl(IjkMediaMeta.AV_CH_WIDE_RIGHT);

    /* renamed from: Em */
    private static final long f1360Em = m27119constructorimpl(IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getEm-UIouoOA, reason: not valid java name */
        public final long m27125getEmUIouoOA() {
            return TextUnitType.f1360Em;
        }

        /* renamed from: getSp-UIouoOA, reason: not valid java name */
        public final long m27126getSpUIouoOA() {
            return TextUnitType.f1361Sp;
        }

        /* renamed from: getUnspecified-UIouoOA, reason: not valid java name */
        public final long m27127getUnspecifiedUIouoOA() {
            return TextUnitType.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextUnitType(long j10) {
        this.type = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnitType m27118boximpl(long j10) {
        return new TextUnitType(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m27119constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27120equalsimpl(long j10, Object obj) {
        return (obj instanceof TextUnitType) && j10 == ((TextUnitType) obj).m27124unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27121equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27122hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27123toStringimpl(long j10) {
        return m27121equalsimpl0(j10, Unspecified) ? "Unspecified" : m27121equalsimpl0(j10, f1361Sp) ? "Sp" : m27121equalsimpl0(j10, f1360Em) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m27120equalsimpl(this.type, obj);
    }

    public int hashCode() {
        return m27122hashCodeimpl(this.type);
    }

    public String toString() {
        return m27123toStringimpl(this.type);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m27124unboximpl() {
        return this.type;
    }
}
