package androidx.compose.p011ui.graphics;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RoundRect;
import androidx.compose.p011ui.graphics.PathIterator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.enums.AbstractC5817a;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

@Metadata(m5109d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 l2\u00020\u0001:\u0002lmJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0007J/\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J/\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0012J/\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J?\u0010\u001c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010 \u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u001dJ/\u0010'\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J/\u0010+\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b+\u0010(J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H'¢\u0006\u0004\b,\u0010-J!\u0010,\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010/\u001a\u00020.H&¢\u0006\u0004\b,\u00100J\u0017\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u00020!H'¢\u0006\u0004\b2\u0010-J!\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u00020!2\b\b\u0002\u0010/\u001a\u00020.H&¢\u0006\u0004\b2\u00100J\u0017\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u000203H'¢\u0006\u0004\b5\u00106J!\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u0002032\b\b\u0002\u0010/\u001a\u00020.H&¢\u0006\u0004\b5\u00107J'\u00108\u001a\u00020\u00052\u0006\u00101\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H&¢\u0006\u0004\b8\u00109J'\u0010:\u001a\u00020\u00052\u0006\u00101\u001a\u00020!2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H&¢\u0006\u0004\b:\u00109J$\u0010@\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u00002\b\b\u0002\u0010=\u001a\u00020<H&ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020\u0005H&¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0005H&¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\u0005H\u0016¢\u0006\u0004\bD\u0010BJ\u001a\u0010G\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<H&ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u001a\u0010L\u001a\u00020\u00052\u0006\u0010I\u001a\u00020HH\u0016ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020!H&¢\u0006\u0004\bM\u0010NJ\u0010\u0010P\u001a\u00020OH\u0096\u0002¢\u0006\u0004\bP\u0010QJ!\u0010P\u001a\u00020O2\u0006\u0010S\u001a\u00020R2\b\b\u0002\u0010T\u001a\u00020\u0002H\u0016¢\u0006\u0004\bP\u0010UJ*\u0010\\\u001a\u00020%2\u0006\u0010V\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020XH&ø\u0001\u0000¢\u0006\u0004\bZ\u0010[J\u0018\u0010]\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b]\u0010^J\u0018\u0010_\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b_\u0010^J\u0018\u0010`\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\b`\u0010^J\u0018\u0010a\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\ba\u0010^J\u0018\u0010b\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\bb\u0010^R\"\u0010h\u001a\u00020c8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010jø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006nÀ\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/graphics/Path;", "", "", "x", "y", "Ld6/s;", "moveTo", "(FF)V", "dx", "dy", "relativeMoveTo", "lineTo", "relativeLineTo", "x1", "y1", "x2", "y2", "quadraticBezierTo", "(FFFF)V", "quadraticTo", "dx1", "dy1", "dx2", "dy2", "relativeQuadraticBezierTo", "relativeQuadraticTo", "x3", "y3", "cubicTo", "(FFFFFF)V", "dx3", "dy3", "relativeCubicTo", "Landroidx/compose/ui/geometry/Rect;", "rect", "startAngleRadians", "sweepAngleRadians", "", "forceMoveTo", "arcToRad", "(Landroidx/compose/ui/geometry/Rect;FFZ)V", "startAngleDegrees", "sweepAngleDegrees", "arcTo", "addRect", "(Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/ui/graphics/Path$Direction;", "direction", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Path$Direction;)V", "oval", "addOval", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "addRoundRect", "(Landroidx/compose/ui/geometry/RoundRect;)V", "(Landroidx/compose/ui/geometry/RoundRect;Landroidx/compose/ui/graphics/Path$Direction;)V", "addArcRad", "(Landroidx/compose/ui/geometry/Rect;FF)V", "addArc", "path", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addPath", "close", "()V", "reset", "rewind", "translate-k-4lQ0M", "(J)V", "translate", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/PathIterator;", "iterator", "()Landroidx/compose/ui/graphics/PathIterator;", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "conicEvaluation", "tolerance", "(Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;F)Landroidx/compose/ui/graphics/PathIterator;", "path1", "path2", "Landroidx/compose/ui/graphics/PathOperation;", "operation", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "op", "plus", "(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "minus", "or", "and", "xor", "Landroidx/compose/ui/graphics/PathFillType;", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "fillType", "isConvex", "()Z", "isEmpty", "Companion", "Direction", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/compose/ui/graphics/Path\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n1#2:365\n*E\n"})
/* loaded from: classes.dex */
public interface Path {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, m5110d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "()V", "combine", "Landroidx/compose/ui/graphics/Path;", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "path1", "path2", "combine-xh6zSI8", "(ILandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        /* renamed from: combine-xh6zSI8, reason: not valid java name */
        public final Path m10953combinexh6zSI8(int operation, @NotNull Path path1, @NotNull Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo10574opN5in7k0(path1, path2, operation)) {
                return Path;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static Path and(@NotNull Path path, @NotNull Path path2) {
            return Path.super.and(path2);
        }

        @Deprecated
        public static void arcToRad(@NotNull Path path, @NotNull Rect rect, float f, float f7, boolean z8) {
            Path.super.arcToRad(rect, f, f7, z8);
        }

        @Deprecated
        @NotNull
        public static PathIterator iterator(@NotNull Path path) {
            return Path.super.iterator();
        }

        @Deprecated
        @NotNull
        public static Path minus(@NotNull Path path, @NotNull Path path2) {
            return Path.super.minus(path2);
        }

        @Deprecated
        @NotNull
        /* renamed from: or */
        public static Path m1143or(@NotNull Path path, @NotNull Path path2) {
            return Path.super.m1142or(path2);
        }

        @Deprecated
        @NotNull
        public static Path plus(@NotNull Path path, @NotNull Path path2) {
            return Path.super.plus(path2);
        }

        @Deprecated
        public static void quadraticTo(@NotNull Path path, float f, float f7, float f8, float f9) {
            Path.super.quadraticTo(f, f7, f8, f9);
        }

        @Deprecated
        public static void relativeQuadraticTo(@NotNull Path path, float f, float f7, float f8, float f9) {
            Path.super.relativeQuadraticTo(f, f7, f8, f9);
        }

        @Deprecated
        public static void rewind(@NotNull Path path) {
            Path.super.rewind();
        }

        @Deprecated
        /* renamed from: transform-58bKbWc, reason: not valid java name */
        public static void m10955transform58bKbWc(@NotNull Path path, @NotNull float[] fArr) {
            Path.super.mo10576transform58bKbWc(fArr);
        }

        @Deprecated
        @NotNull
        public static Path xor(@NotNull Path path, @NotNull Path path2) {
            return Path.super.xor(path2);
        }

        @Deprecated
        @NotNull
        public static PathIterator iterator(@NotNull Path path, @NotNull PathIterator.ConicEvaluation conicEvaluation, float f) {
            return Path.super.iterator(conicEvaluation, f);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"Landroidx/compose/ui/graphics/Path$Direction;", "", "(Ljava/lang/String;I)V", "CounterClockwise", "Clockwise", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Direction {
        private static final /* synthetic */ InterfaceC5748a $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction CounterClockwise = new Direction("CounterClockwise", 0);
        public static final Direction Clockwise = new Direction("Clockwise", 1);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{CounterClockwise, Clockwise};
        }

        static {
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = AbstractC5817a.m5310a(directionArr$values);
        }

        private Direction(String str, int i) {
        }

        @NotNull
        public static InterfaceC5748a getEntries() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    static /* synthetic */ void addOval$default(Path path, Rect rect, Direction direction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
        }
        if ((i & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addOval(rect, direction);
    }

    /* renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m10952addPathUv8p0NA$default(Path path, Path path2, long j7, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j7 = Offset.INSTANCE.m10457getZeroF1C5BW0();
        }
        path.mo10572addPathUv8p0NA(path2, j7);
    }

    static /* synthetic */ void addRect$default(Path path, Rect rect, Direction direction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addRect(rect, direction);
    }

    static /* synthetic */ void addRoundRect$default(Path path, RoundRect roundRect, Direction direction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addRoundRect(roundRect, direction);
    }

    static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: iterator");
        }
        if ((i & 2) != 0) {
            f = 0.25f;
        }
        return path.iterator(conicEvaluation, f);
    }

    void addArc(@NotNull Rect oval, float startAngleDegrees, float sweepAngleDegrees);

    void addArcRad(@NotNull Rect oval, float startAngleRadians, float sweepAngleRadians);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addOval() with a winding direction", replaceWith = @ReplaceWith(expression = "addOval(oval)", imports = {}))
    /* synthetic */ void addOval(Rect oval);

    void addOval(@NotNull Rect oval, @NotNull Direction direction);

    /* renamed from: addPath-Uv8p0NA */
    void mo10572addPathUv8p0NA(@NotNull Path path, long offset);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addRect() with a winding direction", replaceWith = @ReplaceWith(expression = "addRect(rect)", imports = {}))
    /* synthetic */ void addRect(Rect rect);

    void addRect(@NotNull Rect rect, @NotNull Direction direction);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addRoundRect() with a winding direction", replaceWith = @ReplaceWith(expression = "addRoundRect(roundRect)", imports = {}))
    /* synthetic */ void addRoundRect(RoundRect roundRect);

    void addRoundRect(@NotNull RoundRect roundRect, @NotNull Direction direction);

    @NotNull
    default Path and(@NotNull Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo10574opN5in7k0(this, path, PathOperation.INSTANCE.m10975getIntersectb3I0S0c());
        return Path;
    }

    void arcTo(@NotNull Rect rect, float startAngleDegrees, float sweepAngleDegrees, boolean forceMoveTo);

    default void arcToRad(@NotNull Rect rect, float startAngleRadians, float sweepAngleRadians, boolean forceMoveTo) {
        arcTo(rect, DegreesKt.degrees(startAngleRadians), DegreesKt.degrees(sweepAngleRadians), forceMoveTo);
    }

    void close();

    void cubicTo(float x12, float y12, float x22, float y2, float x3, float y3);

    @NotNull
    Rect getBounds();

    /* renamed from: getFillType-Rg-k1Os */
    int mo10573getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    @NotNull
    default PathIterator iterator() {
        return AndroidPathIterator_androidKt.PathIterator$default(this, null, 0.0f, 6, null);
    }

    void lineTo(float x3, float y2);

    @NotNull
    default Path minus(@NotNull Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo10574opN5in7k0(this, path, PathOperation.INSTANCE.m10974getDifferenceb3I0S0c());
        return Path;
    }

    void moveTo(float x3, float y2);

    /* renamed from: op-N5in7k0 */
    boolean mo10574opN5in7k0(@NotNull Path path1, @NotNull Path path2, int operation);

    @NotNull
    /* renamed from: or */
    default Path m1142or(@NotNull Path path) {
        return plus(path);
    }

    @NotNull
    default Path plus(@NotNull Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo10574opN5in7k0(this, path, PathOperation.INSTANCE.m10977getUnionb3I0S0c());
        return Path;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use quadraticTo() for consistency with cubicTo()", replaceWith = @ReplaceWith(expression = "quadraticTo(x1, y1, x2, y2)", imports = {}))
    void quadraticBezierTo(float x12, float y12, float x22, float y2);

    default void quadraticTo(float x12, float y12, float x22, float y2) {
        quadraticBezierTo(x12, y12, x22, y2);
    }

    void relativeCubicTo(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3);

    void relativeLineTo(float dx, float dy);

    void relativeMoveTo(float dx, float dy);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use relativeQuadraticTo() for consistency with relativeCubicTo()", replaceWith = @ReplaceWith(expression = "relativeQuadraticTo(dx1, dy1, dx2, dy2)", imports = {}))
    void relativeQuadraticBezierTo(float dx1, float dy1, float dx2, float dy2);

    default void relativeQuadraticTo(float dx1, float dy1, float dx2, float dy2) {
        relativeQuadraticBezierTo(dx1, dy1, dx2, dy2);
    }

    void reset();

    default void rewind() {
        reset();
    }

    /* renamed from: setFillType-oQ8Xj4U */
    void mo10575setFillTypeoQ8Xj4U(int i);

    /* renamed from: transform-58bKbWc */
    default void mo10576transform58bKbWc(@NotNull float[] matrix) {
    }

    /* renamed from: translate-k-4lQ0M */
    void mo10577translatek4lQ0M(long offset);

    @NotNull
    default Path xor(@NotNull Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo10574opN5in7k0(this, path, PathOperation.INSTANCE.m10978getXorb3I0S0c());
        return Path;
    }

    @NotNull
    default PathIterator iterator(@NotNull PathIterator.ConicEvaluation conicEvaluation, float tolerance) {
        return AndroidPathIterator_androidKt.PathIterator(this, conicEvaluation, tolerance);
    }
}
