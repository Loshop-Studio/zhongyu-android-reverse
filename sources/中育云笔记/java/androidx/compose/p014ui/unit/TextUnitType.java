package androidx.compose.p014ui.unit;

import kotlin.jvm.internal.AbstractC9972n;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes2.dex */
public final class TextUnitType {
    private final long type;
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m33721constructorimpl(0);

    /* renamed from: Sp */
    private static final long f1291Sp = m33721constructorimpl(IjkMediaMeta.AV_CH_WIDE_RIGHT);

    /* renamed from: Em */
    private static final long f1290Em = m33721constructorimpl(IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getEm-UIouoOA, reason: not valid java name */
        public final long m33727getEmUIouoOA() {
            return TextUnitType.f1290Em;
        }

        /* renamed from: getSp-UIouoOA, reason: not valid java name */
        public final long m33728getSpUIouoOA() {
            return TextUnitType.f1291Sp;
        }

        /* renamed from: getUnspecified-UIouoOA, reason: not valid java name */
        public final long m33729getUnspecifiedUIouoOA() {
            return TextUnitType.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextUnitType(long j10) {
        this.type = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnitType m33720boximpl(long j10) {
        return new TextUnitType(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m33721constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33722equalsimpl(long j10, Object obj) {
        return (obj instanceof TextUnitType) && j10 == ((TextUnitType) obj).m33726unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33723equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33724hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33725toStringimpl(long j10) {
        return m33723equalsimpl0(j10, Unspecified) ? "Unspecified" : m33723equalsimpl0(j10, f1291Sp) ? "Sp" : m33723equalsimpl0(j10, f1290Em) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m33722equalsimpl(this.type, obj);
    }

    public int hashCode() {
        return m33724hashCodeimpl(this.type);
    }

    public String toString() {
        return m33725toStringimpl(this.type);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m33726unboximpl() {
        return this.type;
    }
}
