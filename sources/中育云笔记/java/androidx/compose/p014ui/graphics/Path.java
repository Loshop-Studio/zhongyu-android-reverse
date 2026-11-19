package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RoundRect;
import androidx.compose.p014ui.graphics.PathIterator;
import kotlin.enums.AbstractC9953a;
import p309qc.InterfaceC10770a;
import p425yc.InterfaceC11943a;

/* loaded from: classes2.dex */
public interface Path {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: combine-xh6zSI8, reason: not valid java name */
        public final Path m31149combinexh6zSI8(int i10, Path path, Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo30770opN5in7k0(path, path2, i10)) {
                return Path;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    public static final class DefaultImpls {
        @Deprecated
        public static Path and(Path path, Path path2) {
            return Path.super.and(path2);
        }

        @Deprecated
        public static void arcToRad(Path path, Rect rect, float f10, float f11, boolean z10) {
            Path.super.arcToRad(rect, f10, f11, z10);
        }

        @Deprecated
        public static PathIterator iterator(Path path) {
            return Path.super.iterator();
        }

        @Deprecated
        public static Path minus(Path path, Path path2) {
            return Path.super.minus(path2);
        }

        @Deprecated
        /* renamed from: or */
        public static Path m1106or(Path path, Path path2) {
            return Path.super.m1105or(path2);
        }

        @Deprecated
        public static Path plus(Path path, Path path2) {
            return Path.super.plus(path2);
        }

        @Deprecated
        public static void quadraticTo(Path path, float f10, float f11, float f12, float f13) {
            Path.super.quadraticTo(f10, f11, f12, f13);
        }

        @Deprecated
        public static void relativeQuadraticTo(Path path, float f10, float f11, float f12, float f13) {
            Path.super.relativeQuadraticTo(f10, f11, f12, f13);
        }

        @Deprecated
        public static void rewind(Path path) {
            Path.super.rewind();
        }

        @Deprecated
        /* renamed from: transform-58bKbWc, reason: not valid java name */
        public static void m31151transform58bKbWc(Path path, float[] fArr) {
            Path.super.mo30772transform58bKbWc(fArr);
        }

        @Deprecated
        public static Path xor(Path path, Path path2) {
            return Path.super.xor(path2);
        }

        @Deprecated
        public static PathIterator iterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10) {
            return Path.super.iterator(conicEvaluation, f10);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Direction {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction CounterClockwise = new Direction("CounterClockwise", 0);
        public static final Direction Clockwise = new Direction("Clockwise", 1);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{CounterClockwise, Clockwise};
        }

        static {
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = AbstractC9953a.m20230a(directionArr$values);
        }

        private Direction(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    static /* synthetic */ void addOval$default(Path path, Rect rect, Direction direction, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
        }
        if ((i10 & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addOval(rect, direction);
    }

    /* renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m31148addPathUv8p0NA$default(Path path, Path path2, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = Offset.Companion.m30653getZeroF1C5BW0();
        }
        path.mo30768addPathUv8p0NA(path2, j10);
    }

    static /* synthetic */ void addRect$default(Path path, Rect rect, Direction direction, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i10 & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addRect(rect, direction);
    }

    static /* synthetic */ void addRoundRect$default(Path path, RoundRect roundRect, Direction direction, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i10 & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addRoundRect(roundRect, direction);
    }

    static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: iterator");
        }
        if ((i10 & 2) != 0) {
            f10 = 0.25f;
        }
        return path.iterator(conicEvaluation, f10);
    }

    void addArc(Rect rect, float f10, float f11);

    void addArcRad(Rect rect, float f10, float f11);

    @InterfaceC10770a
    /* synthetic */ void addOval(Rect rect);

    void addOval(Rect rect, Direction direction);

    /* renamed from: addPath-Uv8p0NA */
    void mo30768addPathUv8p0NA(Path path, long j10);

    @InterfaceC10770a
    /* synthetic */ void addRect(Rect rect);

    void addRect(Rect rect, Direction direction);

    @InterfaceC10770a
    /* synthetic */ void addRoundRect(RoundRect roundRect);

    void addRoundRect(RoundRect roundRect, Direction direction);

    default Path and(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo30770opN5in7k0(this, path, PathOperation.Companion.m31171getIntersectb3I0S0c());
        return Path;
    }

    void arcTo(Rect rect, float f10, float f11, boolean z10);

    default void arcToRad(Rect rect, float f10, float f11, boolean z10) {
        arcTo(rect, DegreesKt.degrees(f10), DegreesKt.degrees(f11), z10);
    }

    void close();

    void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15);

    Rect getBounds();

    /* renamed from: getFillType-Rg-k1Os */
    int mo30769getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    default PathIterator iterator() {
        return AndroidPathIterator_androidKt.PathIterator$default(this, null, 0.0f, 6, null);
    }

    void lineTo(float f10, float f11);

    default Path minus(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo30770opN5in7k0(this, path, PathOperation.Companion.m31170getDifferenceb3I0S0c());
        return Path;
    }

    void moveTo(float f10, float f11);

    /* renamed from: op-N5in7k0 */
    boolean mo30770opN5in7k0(Path path, Path path2, int i10);

    /* renamed from: or */
    default Path m1105or(Path path) {
        return plus(path);
    }

    default Path plus(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo30770opN5in7k0(this, path, PathOperation.Companion.m31173getUnionb3I0S0c());
        return Path;
    }

    @InterfaceC10770a
    void quadraticBezierTo(float f10, float f11, float f12, float f13);

    default void quadraticTo(float f10, float f11, float f12, float f13) {
        quadraticBezierTo(f10, f11, f12, f13);
    }

    void relativeCubicTo(float f10, float f11, float f12, float f13, float f14, float f15);

    void relativeLineTo(float f10, float f11);

    void relativeMoveTo(float f10, float f11);

    @InterfaceC10770a
    void relativeQuadraticBezierTo(float f10, float f11, float f12, float f13);

    default void relativeQuadraticTo(float f10, float f11, float f12, float f13) {
        relativeQuadraticBezierTo(f10, f11, f12, f13);
    }

    void reset();

    default void rewind() {
        reset();
    }

    /* renamed from: setFillType-oQ8Xj4U */
    void mo30771setFillTypeoQ8Xj4U(int i10);

    /* renamed from: transform-58bKbWc */
    default void mo30772transform58bKbWc(float[] fArr) {
    }

    /* renamed from: translate-k-4lQ0M */
    void mo30773translatek4lQ0M(long j10);

    default Path xor(Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo30770opN5in7k0(this, path, PathOperation.Companion.m31174getXorb3I0S0c());
        return Path;
    }

    default PathIterator iterator(PathIterator.ConicEvaluation conicEvaluation, float f10) {
        return AndroidPathIterator_androidKt.PathIterator(this, conicEvaluation, f10);
    }
}
