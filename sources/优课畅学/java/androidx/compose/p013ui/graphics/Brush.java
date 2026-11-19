package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public abstract class Brush {
    public static final Companion Companion = new Companion(null);
    private final long intrinsicSize;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m24225horizontalGradient8A3gB4$default(Companion companion, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = TileMode.Companion.m24649getClamp3opZhB0();
            }
            return companion.m24235horizontalGradient8A3gB4((List<Color>) list, f10, f11, i10);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m24228linearGradientmHitzGk$default(Companion companion, Pair[] pairArr, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = Offset.Companion.m24051getZeroF1C5BW0();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = Offset.Companion.m24049getInfiniteF1C5BW0();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = TileMode.Companion.m24649getClamp3opZhB0();
            }
            return companion.m24238linearGradientmHitzGk((Pair<Float, Color>[]) pairArr, j12, j13, i10);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m24230radialGradientP_VxKs$default(Companion companion, Pair[] pairArr, long j10, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = Offset.Companion.m24050getUnspecifiedF1C5BW0();
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                i10 = TileMode.Companion.m24649getClamp3opZhB0();
            }
            return companion.m24240radialGradientP_VxKs((Pair<Float, Color>[]) pairArr, j11, f11, i10);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m24232sweepGradientUv8p0NA$default(Companion companion, Pair[] pairArr, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = Offset.Companion.m24050getUnspecifiedF1C5BW0();
            }
            return companion.m24242sweepGradientUv8p0NA((Pair<Float, Color>[]) pairArr, j10);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m24233verticalGradient8A3gB4$default(Companion companion, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = TileMode.Companion.m24649getClamp3opZhB0();
            }
            return companion.m24243verticalGradient8A3gB4((List<Color>) list, f10, f11, i10);
        }

        @Stable
        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m24236horizontalGradient8A3gB4(Pair<Float, Color>[] pairArr, float f10, float f11, int i10) {
            return m24238linearGradientmHitzGk((Pair<Float, Color>[]) Arrays.copyOf(pairArr, pairArr.length), Offset.m24027constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m24027constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), i10);
        }

        @Stable
        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m24238linearGradientmHitzGk(Pair<Float, Color>[] pairArr, long j10, long j11, int i10) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair : pairArr) {
                arrayList.add(Color.m24266boximpl(((Color) pair.m15907g()).m24286unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair2 : pairArr) {
                arrayList2.add(Float.valueOf(((Number) pair2.m15906e()).floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, j10, j11, i10, null);
        }

        @Stable
        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m24240radialGradientP_VxKs(Pair<Float, Color>[] pairArr, long j10, float f10, int i10) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair : pairArr) {
                arrayList.add(Color.m24266boximpl(((Color) pair.m15907g()).m24286unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair2 : pairArr) {
                arrayList2.add(Float.valueOf(((Number) pair2.m15906e()).floatValue()));
            }
            return new RadialGradient(arrayList, arrayList2, j10, f10, i10, null);
        }

        @Stable
        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m24242sweepGradientUv8p0NA(Pair<Float, Color>[] pairArr, long j10) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair : pairArr) {
                arrayList.add(Color.m24266boximpl(((Color) pair.m15907g()).m24286unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair2 : pairArr) {
                arrayList2.add(Float.valueOf(((Number) pair2.m15906e()).floatValue()));
            }
            return new SweepGradient(j10, arrayList, arrayList2, null);
        }

        @Stable
        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m24244verticalGradient8A3gB4(Pair<Float, Color>[] pairArr, float f10, float f11, int i10) {
            return m24238linearGradientmHitzGk((Pair<Float, Color>[]) Arrays.copyOf(pairArr, pairArr.length), Offset.m24027constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)), Offset.m24027constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), i10);
        }

        private Companion() {
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m24226horizontalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = TileMode.Companion.m24649getClamp3opZhB0();
            }
            return companion.m24236horizontalGradient8A3gB4((Pair<Float, Color>[]) pairArr, f10, f11, i10);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m24231sweepGradientUv8p0NA$default(Companion companion, List list, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = Offset.Companion.m24050getUnspecifiedF1C5BW0();
            }
            return companion.m24241sweepGradientUv8p0NA((List<Color>) list, j10);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m24234verticalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = TileMode.Companion.m24649getClamp3opZhB0();
            }
            return companion.m24244verticalGradient8A3gB4((Pair<Float, Color>[]) pairArr, f10, f11, i10);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m24229radialGradientP_VxKs$default(Companion companion, List list, long j10, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = Offset.Companion.m24050getUnspecifiedF1C5BW0();
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                i10 = TileMode.Companion.m24649getClamp3opZhB0();
            }
            return companion.m24239radialGradientP_VxKs((List<Color>) list, j11, f11, i10);
        }

        @Stable
        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m24237linearGradientmHitzGk(List<Color> list, long j10, long j11, int i10) {
            return new LinearGradient(list, null, j10, j11, i10, null);
        }

        @Stable
        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m24239radialGradientP_VxKs(List<Color> list, long j10, float f10, int i10) {
            return new RadialGradient(list, null, j10, f10, i10, null);
        }

        @Stable
        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m24241sweepGradientUv8p0NA(List<Color> list, long j10) {
            return new SweepGradient(j10, list, null, null);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m24227linearGradientmHitzGk$default(Companion companion, List list, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = Offset.Companion.m24051getZeroF1C5BW0();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = Offset.Companion.m24049getInfiniteF1C5BW0();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = TileMode.Companion.m24649getClamp3opZhB0();
            }
            return companion.m24237linearGradientmHitzGk((List<Color>) list, j12, j13, i10);
        }

        @Stable
        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m24235horizontalGradient8A3gB4(List<Color> list, float f10, float f11, int i10) {
            return m24237linearGradientmHitzGk(list, Offset.m24027constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m24027constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), i10);
        }

        @Stable
        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m24243verticalGradient8A3gB4(List<Color> list, float f10, float f11, int i10) {
            return m24237linearGradientmHitzGk(list, Offset.m24027constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)), Offset.m24027constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), i10);
        }
    }

    public /* synthetic */ Brush(AbstractC9126n abstractC9126n) {
        this();
    }

    /* renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo24223applyToPq9zytI(long j10, Paint paint, float f10);

    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo24224getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    private Brush() {
        this.intrinsicSize = Size.Companion.m24112getUnspecifiedNHjbRc();
    }
}
