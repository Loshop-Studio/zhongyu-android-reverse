package androidx.compose.p011ui.graphics;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\u00048\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0013\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m5110d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/Paint;", "p", "", "alpha", "Ld6/s;", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "intrinsicSize", "J", "getIntrinsicSize-NH-jbRc", "()J", "Companion", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/SolidColor;", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class Brush {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long intrinsicSize;

    @Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010\u0003\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0003\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0012J\\\u0010\u0013\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0013\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0019J\\\u0010\u001a\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010\u001a\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001fJH\u0010 \u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J*\u0010 \u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010#J\\\u0010$\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010\u000fJ>\u0010$\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, m5110d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "()V", "horizontalGradient", "Landroidx/compose/ui/graphics/Brush;", "colorStops", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "startX", "endX", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "horizontalGradient-8A-3gB4", "([Lkotlin/Pair;FFI)Landroidx/compose/ui/graphics/Brush;", "colors", "", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;", "linearGradient", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "linearGradient-mHitzGk", "([Lkotlin/Pair;JJI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/Brush;", "radialGradient", "center", "radius", "radialGradient-P_Vx-Ks", "([Lkotlin/Pair;JFI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/Brush;", "sweepGradient", "sweepGradient-Uv8p0NA", "([Lkotlin/Pair;J)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;J)Landroidx/compose/ui/graphics/Brush;", "verticalGradient", "startY", "endY", "verticalGradient-8A-3gB4", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,658:1\n1#2:659\n30#3:660\n30#3:664\n30#3:668\n30#3:672\n30#3:676\n30#3:680\n53#4,3:661\n53#4,3:665\n53#4,3:669\n53#4,3:673\n53#4,3:677\n53#4,3:681\n*S KotlinDebug\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n*L\n149#1:660\n186#1:664\n187#1:668\n218#1:672\n255#1:676\n256#1:680\n149#1:661,3\n186#1:665,3\n187#1:669,3\n218#1:673,3\n255#1:677,3\n256#1:681,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m10631horizontalGradient8A3gB4$default(Companion companion, List list, float f, float f7, int i, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                f = 0.0f;
            }
            if ((i8 & 4) != 0) {
                f7 = Float.POSITIVE_INFINITY;
            }
            if ((i8 & 8) != 0) {
                i = TileMode.INSTANCE.m11055getClamp3opZhB0();
            }
            return companion.m10641horizontalGradient8A3gB4((List<Color>) list, f, f7, i);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m10634linearGradientmHitzGk$default(Companion companion, Pair[] pairArr, long j7, long j8, int i, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                j7 = Offset.INSTANCE.m10457getZeroF1C5BW0();
            }
            long j9 = j7;
            if ((i8 & 4) != 0) {
                j8 = Offset.INSTANCE.m10455getInfiniteF1C5BW0();
            }
            long j10 = j8;
            if ((i8 & 8) != 0) {
                i = TileMode.INSTANCE.m11055getClamp3opZhB0();
            }
            return companion.m10644linearGradientmHitzGk((Pair<Float, Color>[]) pairArr, j9, j10, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m10636radialGradientP_VxKs$default(Companion companion, Pair[] pairArr, long j7, float f, int i, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                j7 = Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
            }
            long j8 = j7;
            if ((i8 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f7 = f;
            if ((i8 & 8) != 0) {
                i = TileMode.INSTANCE.m11055getClamp3opZhB0();
            }
            return companion.m10646radialGradientP_VxKs((Pair<Float, Color>[]) pairArr, j8, f7, i);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m10638sweepGradientUv8p0NA$default(Companion companion, Pair[] pairArr, long j7, int i, Object obj) {
            if ((i & 2) != 0) {
                j7 = Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
            }
            return companion.m10648sweepGradientUv8p0NA((Pair<Float, Color>[]) pairArr, j7);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m10639verticalGradient8A3gB4$default(Companion companion, List list, float f, float f7, int i, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                f = 0.0f;
            }
            if ((i8 & 4) != 0) {
                f7 = Float.POSITIVE_INFINITY;
            }
            if ((i8 & 8) != 0) {
                i = TileMode.INSTANCE.m11055getClamp3opZhB0();
            }
            return companion.m10649verticalGradient8A3gB4((List<Color>) list, f, f7, i);
        }

        @Stable
        @NotNull
        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m10642horizontalGradient8A3gB4(@NotNull Pair<Float, Color>[] colorStops, float startX, float endX, int tileMode) {
            return m10644linearGradientmHitzGk((Pair<Float, Color>[]) Arrays.copyOf(colorStops, colorStops.length), Offset.m10433constructorimpl((Float.floatToRawIntBits(startX) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m10433constructorimpl((Float.floatToRawIntBits(endX) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), tileMode);
        }

        @Stable
        @NotNull
        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m10644linearGradientmHitzGk(@NotNull Pair<Float, Color>[] colorStops, long start, long end, int tileMode) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m10672boximpl(pair.getSecond().m10692unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, start, end, tileMode, null);
        }

        @Stable
        @NotNull
        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m10646radialGradientP_VxKs(@NotNull Pair<Float, Color>[] colorStops, long center, float radius, int tileMode) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m10672boximpl(pair.getSecond().m10692unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new RadialGradient(arrayList, arrayList2, center, radius, tileMode, null);
        }

        @Stable
        @NotNull
        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m10648sweepGradientUv8p0NA(@NotNull Pair<Float, Color>[] colorStops, long center) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m10672boximpl(pair.getSecond().m10692unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new SweepGradient(center, arrayList, arrayList2, null);
        }

        @Stable
        @NotNull
        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m10650verticalGradient8A3gB4(@NotNull Pair<Float, Color>[] colorStops, float startY, float endY, int tileMode) {
            return m10644linearGradientmHitzGk((Pair<Float, Color>[]) Arrays.copyOf(colorStops, colorStops.length), Offset.m10433constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(startY) & 4294967295L)), Offset.m10433constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(endY) & 4294967295L)), tileMode);
        }

        private Companion() {
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m10632horizontalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f, float f7, int i, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                f = 0.0f;
            }
            if ((i8 & 4) != 0) {
                f7 = Float.POSITIVE_INFINITY;
            }
            if ((i8 & 8) != 0) {
                i = TileMode.INSTANCE.m11055getClamp3opZhB0();
            }
            return companion.m10642horizontalGradient8A3gB4((Pair<Float, Color>[]) pairArr, f, f7, i);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m10637sweepGradientUv8p0NA$default(Companion companion, List list, long j7, int i, Object obj) {
            if ((i & 2) != 0) {
                j7 = Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
            }
            return companion.m10647sweepGradientUv8p0NA((List<Color>) list, j7);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m10640verticalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f, float f7, int i, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                f = 0.0f;
            }
            if ((i8 & 4) != 0) {
                f7 = Float.POSITIVE_INFINITY;
            }
            if ((i8 & 8) != 0) {
                i = TileMode.INSTANCE.m11055getClamp3opZhB0();
            }
            return companion.m10650verticalGradient8A3gB4((Pair<Float, Color>[]) pairArr, f, f7, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m10635radialGradientP_VxKs$default(Companion companion, List list, long j7, float f, int i, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                j7 = Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
            }
            long j8 = j7;
            if ((i8 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f7 = f;
            if ((i8 & 8) != 0) {
                i = TileMode.INSTANCE.m11055getClamp3opZhB0();
            }
            return companion.m10645radialGradientP_VxKs((List<Color>) list, j8, f7, i);
        }

        @Stable
        @NotNull
        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m10643linearGradientmHitzGk(@NotNull List<Color> colors, long start, long end, int tileMode) {
            return new LinearGradient(colors, null, start, end, tileMode, null);
        }

        @Stable
        @NotNull
        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m10645radialGradientP_VxKs(@NotNull List<Color> colors, long center, float radius, int tileMode) {
            return new RadialGradient(colors, null, center, radius, tileMode, null);
        }

        @Stable
        @NotNull
        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m10647sweepGradientUv8p0NA(@NotNull List<Color> colors, long center) {
            return new SweepGradient(center, colors, null, null);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m10633linearGradientmHitzGk$default(Companion companion, List list, long j7, long j8, int i, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                j7 = Offset.INSTANCE.m10457getZeroF1C5BW0();
            }
            long j9 = j7;
            if ((i8 & 4) != 0) {
                j8 = Offset.INSTANCE.m10455getInfiniteF1C5BW0();
            }
            long j10 = j8;
            if ((i8 & 8) != 0) {
                i = TileMode.INSTANCE.m11055getClamp3opZhB0();
            }
            return companion.m10643linearGradientmHitzGk((List<Color>) list, j9, j10, i);
        }

        @Stable
        @NotNull
        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m10641horizontalGradient8A3gB4(@NotNull List<Color> colors, float startX, float endX, int tileMode) {
            return m10643linearGradientmHitzGk(colors, Offset.m10433constructorimpl((Float.floatToRawIntBits(startX) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m10433constructorimpl((Float.floatToRawIntBits(endX) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), tileMode);
        }

        @Stable
        @NotNull
        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m10649verticalGradient8A3gB4(@NotNull List<Color> colors, float startY, float endY, int tileMode) {
            return m10643linearGradientmHitzGk(colors, Offset.m10433constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(startY) & 4294967295L)), Offset.m10433constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(endY) & 4294967295L)), tileMode);
        }
    }

    public /* synthetic */ Brush(AbstractC5824e abstractC5824e) {
        this();
    }

    /* renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo10629applyToPq9zytI(long size, @NotNull Paint p6, float alpha);

    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name and from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }

    private Brush() {
        this.intrinsicSize = Size.INSTANCE.m10518getUnspecifiedNHjbRc();
    }
}
