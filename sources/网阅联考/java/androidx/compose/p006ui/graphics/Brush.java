package androidx.compose.p006ui.graphics;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m5174d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J-\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0003\u001a\u00020\u0004X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0012\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, m5175d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "()V", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "J", "applyTo", "", "size", C3335ai.f1707av, "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "Companion", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/SolidColor;", "ui-graphics_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class Brush {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long intrinsicSize;

    @Metadata(m5174d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J_\u0010\u0003\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0003\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0012J_\u0010\u0013\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u0013\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0019J_\u0010\u001a\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010\u001a\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001fJK\u0010 \u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J-\u0010 \u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010#J_\u0010$\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u000fJA\u0010$\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, m5175d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "()V", "horizontalGradient", "Landroidx/compose/ui/graphics/Brush;", "colorStops", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "startX", "endX", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "horizontalGradient-8A-3gB4", "([Lkotlin/Pair;FFI)Landroidx/compose/ui/graphics/Brush;", "colors", "", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;", "linearGradient", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "linearGradient-mHitzGk", "([Lkotlin/Pair;JJI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/Brush;", "radialGradient", "center", "radius", "radialGradient-P_Vx-Ks", "([Lkotlin/Pair;JFI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/Brush;", "sweepGradient", "sweepGradient-Uv8p0NA", "([Lkotlin/Pair;J)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;J)Landroidx/compose/ui/graphics/Brush;", "verticalGradient", "startY", "endY", "verticalGradient-8A-3gB4", "ui-graphics_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n1#2:656\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m9133horizontalGradient8A3gB4$default(Companion companion, List list, float f4, float f5, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                f4 = 0.0f;
            }
            if ((i5 & 4) != 0) {
                f5 = Float.POSITIVE_INFINITY;
            }
            if ((i5 & 8) != 0) {
                i4 = TileMode.INSTANCE.m9521getClamp3opZhB0();
            }
            return companion.m9143horizontalGradient8A3gB4((List<Color>) list, f4, f5, i4);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m9136linearGradientmHitzGk$default(Companion companion, Pair[] pairArr, long j4, long j5, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                j4 = Offset.INSTANCE.m8961getZeroF1C5BW0();
            }
            long j6 = j4;
            if ((i5 & 4) != 0) {
                j5 = Offset.INSTANCE.m8959getInfiniteF1C5BW0();
            }
            long j7 = j5;
            if ((i5 & 8) != 0) {
                i4 = TileMode.INSTANCE.m9521getClamp3opZhB0();
            }
            return companion.m9146linearGradientmHitzGk((Pair<Float, Color>[]) pairArr, j6, j7, i4);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m9138radialGradientP_VxKs$default(Companion companion, Pair[] pairArr, long j4, float f4, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                j4 = Offset.INSTANCE.m8960getUnspecifiedF1C5BW0();
            }
            long j5 = j4;
            if ((i5 & 4) != 0) {
                f4 = Float.POSITIVE_INFINITY;
            }
            float f5 = f4;
            if ((i5 & 8) != 0) {
                i4 = TileMode.INSTANCE.m9521getClamp3opZhB0();
            }
            return companion.m9148radialGradientP_VxKs((Pair<Float, Color>[]) pairArr, j5, f5, i4);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m9140sweepGradientUv8p0NA$default(Companion companion, Pair[] pairArr, long j4, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                j4 = Offset.INSTANCE.m8960getUnspecifiedF1C5BW0();
            }
            return companion.m9150sweepGradientUv8p0NA((Pair<Float, Color>[]) pairArr, j4);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m9141verticalGradient8A3gB4$default(Companion companion, List list, float f4, float f5, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                f4 = 0.0f;
            }
            if ((i5 & 4) != 0) {
                f5 = Float.POSITIVE_INFINITY;
            }
            if ((i5 & 8) != 0) {
                i4 = TileMode.INSTANCE.m9521getClamp3opZhB0();
            }
            return companion.m9151verticalGradient8A3gB4((List<Color>) list, f4, f5, i4);
        }

        @Stable
        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m9143horizontalGradient8A3gB4(List<Color> colors, float startX, float endX, int tileMode) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return m9145linearGradientmHitzGk(colors, OffsetKt.Offset(startX, 0.0f), OffsetKt.Offset(endX, 0.0f), tileMode);
        }

        @Stable
        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m9146linearGradientmHitzGk(Pair<Float, Color>[] colorStops, long start, long end, int tileMode) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m9168boximpl(pair.getSecond().m9188unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, start, end, tileMode, null);
        }

        @Stable
        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m9148radialGradientP_VxKs(Pair<Float, Color>[] colorStops, long center, float radius, int tileMode) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m9168boximpl(pair.getSecond().m9188unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new RadialGradient(arrayList, arrayList2, center, radius, tileMode, null);
        }

        @Stable
        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m9150sweepGradientUv8p0NA(Pair<Float, Color>[] colorStops, long center) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m9168boximpl(pair.getSecond().m9188unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new SweepGradient(center, arrayList, arrayList2, null);
        }

        @Stable
        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m9151verticalGradient8A3gB4(List<Color> colors, float startY, float endY, int tileMode) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return m9145linearGradientmHitzGk(colors, OffsetKt.Offset(0.0f, startY), OffsetKt.Offset(0.0f, endY), tileMode);
        }

        @Stable
        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m9144horizontalGradient8A3gB4(Pair<Float, Color>[] colorStops, float startX, float endX, int tileMode) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            return m9146linearGradientmHitzGk((Pair<Float, Color>[]) Arrays.copyOf(colorStops, colorStops.length), OffsetKt.Offset(startX, 0.0f), OffsetKt.Offset(endX, 0.0f), tileMode);
        }

        @Stable
        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m9152verticalGradient8A3gB4(Pair<Float, Color>[] colorStops, float startY, float endY, int tileMode) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            return m9146linearGradientmHitzGk((Pair<Float, Color>[]) Arrays.copyOf(colorStops, colorStops.length), OffsetKt.Offset(0.0f, startY), OffsetKt.Offset(0.0f, endY), tileMode);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m9134horizontalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f4, float f5, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                f4 = 0.0f;
            }
            if ((i5 & 4) != 0) {
                f5 = Float.POSITIVE_INFINITY;
            }
            if ((i5 & 8) != 0) {
                i4 = TileMode.INSTANCE.m9521getClamp3opZhB0();
            }
            return companion.m9144horizontalGradient8A3gB4((Pair<Float, Color>[]) pairArr, f4, f5, i4);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m9139sweepGradientUv8p0NA$default(Companion companion, List list, long j4, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                j4 = Offset.INSTANCE.m8960getUnspecifiedF1C5BW0();
            }
            return companion.m9149sweepGradientUv8p0NA((List<Color>) list, j4);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m9142verticalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f4, float f5, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                f4 = 0.0f;
            }
            if ((i5 & 4) != 0) {
                f5 = Float.POSITIVE_INFINITY;
            }
            if ((i5 & 8) != 0) {
                i4 = TileMode.INSTANCE.m9521getClamp3opZhB0();
            }
            return companion.m9152verticalGradient8A3gB4((Pair<Float, Color>[]) pairArr, f4, f5, i4);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m9137radialGradientP_VxKs$default(Companion companion, List list, long j4, float f4, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                j4 = Offset.INSTANCE.m8960getUnspecifiedF1C5BW0();
            }
            long j5 = j4;
            if ((i5 & 4) != 0) {
                f4 = Float.POSITIVE_INFINITY;
            }
            float f5 = f4;
            if ((i5 & 8) != 0) {
                i4 = TileMode.INSTANCE.m9521getClamp3opZhB0();
            }
            return companion.m9147radialGradientP_VxKs((List<Color>) list, j5, f5, i4);
        }

        @Stable
        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m9145linearGradientmHitzGk(List<Color> colors, long start, long end, int tileMode) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new LinearGradient(colors, null, start, end, tileMode, null);
        }

        @Stable
        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m9147radialGradientP_VxKs(List<Color> colors, long center, float radius, int tileMode) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new RadialGradient(colors, null, center, radius, tileMode, null);
        }

        @Stable
        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m9149sweepGradientUv8p0NA(List<Color> colors, long center) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new SweepGradient(center, colors, null, null);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m9135linearGradientmHitzGk$default(Companion companion, List list, long j4, long j5, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                j4 = Offset.INSTANCE.m8961getZeroF1C5BW0();
            }
            long j6 = j4;
            if ((i5 & 4) != 0) {
                j5 = Offset.INSTANCE.m8959getInfiniteF1C5BW0();
            }
            long j7 = j5;
            if ((i5 & 8) != 0) {
                i4 = TileMode.INSTANCE.m9521getClamp3opZhB0();
            }
            return companion.m9145linearGradientmHitzGk((List<Color>) list, j6, j7, i4);
        }
    }

    public /* synthetic */ Brush(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo9131applyToPq9zytI(long size, Paint p3, float alpha);

    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name and from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }

    private Brush() {
        this.intrinsicSize = Size.INSTANCE.m9022getUnspecifiedNHjbRc();
    }
}
