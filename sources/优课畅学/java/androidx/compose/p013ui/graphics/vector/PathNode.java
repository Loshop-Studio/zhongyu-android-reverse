package androidx.compose.p013ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public abstract class PathNode {
    private final boolean isCurve;
    private final boolean isQuad;

    @Immutable
    public static final class ArcTo extends PathNode {
        private final float arcStartX;
        private final float arcStartY;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        /* JADX WARN: Illegal instructions before constructor call */
        public ArcTo(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.horizontalEllipseRadius = f10;
            this.verticalEllipseRadius = f11;
            this.theta = f12;
            this.isMoreThanHalf = z10;
            this.isPositiveArc = z11;
            this.arcStartX = f13;
            this.arcStartY = f14;
        }

        public static /* synthetic */ ArcTo copy$default(ArcTo arcTo, float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = arcTo.horizontalEllipseRadius;
            }
            if ((i10 & 2) != 0) {
                f11 = arcTo.verticalEllipseRadius;
            }
            if ((i10 & 4) != 0) {
                f12 = arcTo.theta;
            }
            if ((i10 & 8) != 0) {
                z10 = arcTo.isMoreThanHalf;
            }
            if ((i10 & 16) != 0) {
                z11 = arcTo.isPositiveArc;
            }
            if ((i10 & 32) != 0) {
                f13 = arcTo.arcStartX;
            }
            if ((i10 & 64) != 0) {
                f14 = arcTo.arcStartY;
            }
            float f15 = f13;
            float f16 = f14;
            boolean z12 = z11;
            float f17 = f12;
            return arcTo.copy(f10, f11, f17, z10, z12, f15, f16);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartX;
        }

        public final float component7() {
            return this.arcStartY;
        }

        public final ArcTo copy(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            return new ArcTo(f10, f11, f12, z10, z11, f13, f14);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) obj;
            return Float.compare(this.horizontalEllipseRadius, arcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, arcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, arcTo.theta) == 0 && this.isMoreThanHalf == arcTo.isMoreThanHalf && this.isPositiveArc == arcTo.isPositiveArc && Float.compare(this.arcStartX, arcTo.arcStartX) == 0 && Float.compare(this.arcStartY, arcTo.arcStartY) == 0;
        }

        public final float getArcStartX() {
            return this.arcStartX;
        }

        public final float getArcStartY() {
            return this.arcStartY;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.horizontalEllipseRadius) * 31) + Float.hashCode(this.verticalEllipseRadius)) * 31) + Float.hashCode(this.theta)) * 31) + Boolean.hashCode(this.isMoreThanHalf)) * 31) + Boolean.hashCode(this.isPositiveArc)) * 31) + Float.hashCode(this.arcStartX)) * 31) + Float.hashCode(this.arcStartY);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartX=" + this.arcStartX + ", arcStartY=" + this.arcStartY + ')';
        }
    }

    @Immutable
    public static final class Close extends PathNode {
        public static final Close INSTANCE = new Close();

        /* JADX WARN: Illegal instructions before constructor call */
        private Close() {
            boolean z10 = false;
            super(z10, z10, 3, null);
        }
    }

    @Immutable
    public static final class CurveTo extends PathNode {

        /* renamed from: x1 */
        private final float f1257x1;

        /* renamed from: x2 */
        private final float f1258x2;

        /* renamed from: x3 */
        private final float f1259x3;

        /* renamed from: y1 */
        private final float f1260y1;

        /* renamed from: y2 */
        private final float f1261y2;

        /* renamed from: y3 */
        private final float f1262y3;

        public CurveTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f1257x1 = f10;
            this.f1260y1 = f11;
            this.f1258x2 = f12;
            this.f1261y2 = f13;
            this.f1259x3 = f14;
            this.f1262y3 = f15;
        }

        public static /* synthetic */ CurveTo copy$default(CurveTo curveTo, float f10, float f11, float f12, float f13, float f14, float f15, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = curveTo.f1257x1;
            }
            if ((i10 & 2) != 0) {
                f11 = curveTo.f1260y1;
            }
            if ((i10 & 4) != 0) {
                f12 = curveTo.f1258x2;
            }
            if ((i10 & 8) != 0) {
                f13 = curveTo.f1261y2;
            }
            if ((i10 & 16) != 0) {
                f14 = curveTo.f1259x3;
            }
            if ((i10 & 32) != 0) {
                f15 = curveTo.f1262y3;
            }
            float f16 = f14;
            float f17 = f15;
            return curveTo.copy(f10, f11, f12, f13, f16, f17);
        }

        public final float component1() {
            return this.f1257x1;
        }

        public final float component2() {
            return this.f1260y1;
        }

        public final float component3() {
            return this.f1258x2;
        }

        public final float component4() {
            return this.f1261y2;
        }

        public final float component5() {
            return this.f1259x3;
        }

        public final float component6() {
            return this.f1262y3;
        }

        public final CurveTo copy(float f10, float f11, float f12, float f13, float f14, float f15) {
            return new CurveTo(f10, f11, f12, f13, f14, f15);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) obj;
            return Float.compare(this.f1257x1, curveTo.f1257x1) == 0 && Float.compare(this.f1260y1, curveTo.f1260y1) == 0 && Float.compare(this.f1258x2, curveTo.f1258x2) == 0 && Float.compare(this.f1261y2, curveTo.f1261y2) == 0 && Float.compare(this.f1259x3, curveTo.f1259x3) == 0 && Float.compare(this.f1262y3, curveTo.f1262y3) == 0;
        }

        public final float getX1() {
            return this.f1257x1;
        }

        public final float getX2() {
            return this.f1258x2;
        }

        public final float getX3() {
            return this.f1259x3;
        }

        public final float getY1() {
            return this.f1260y1;
        }

        public final float getY2() {
            return this.f1261y2;
        }

        public final float getY3() {
            return this.f1262y3;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f1257x1) * 31) + Float.hashCode(this.f1260y1)) * 31) + Float.hashCode(this.f1258x2)) * 31) + Float.hashCode(this.f1261y2)) * 31) + Float.hashCode(this.f1259x3)) * 31) + Float.hashCode(this.f1262y3);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f1257x1 + ", y1=" + this.f1260y1 + ", x2=" + this.f1258x2 + ", y2=" + this.f1261y2 + ", x3=" + this.f1259x3 + ", y3=" + this.f1262y3 + ')';
        }
    }

    @Immutable
    public static final class HorizontalTo extends PathNode {

        /* renamed from: x */
        private final float f1263x;

        /* JADX WARN: Illegal instructions before constructor call */
        public HorizontalTo(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1263x = f10;
        }

        public static /* synthetic */ HorizontalTo copy$default(HorizontalTo horizontalTo, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = horizontalTo.f1263x;
            }
            return horizontalTo.copy(f10);
        }

        public final float component1() {
            return this.f1263x;
        }

        public final HorizontalTo copy(float f10) {
            return new HorizontalTo(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalTo) && Float.compare(this.f1263x, ((HorizontalTo) obj).f1263x) == 0;
        }

        public final float getX() {
            return this.f1263x;
        }

        public int hashCode() {
            return Float.hashCode(this.f1263x);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f1263x + ')';
        }
    }

    @Immutable
    public static final class LineTo extends PathNode {

        /* renamed from: x */
        private final float f1264x;

        /* renamed from: y */
        private final float f1265y;

        /* JADX WARN: Illegal instructions before constructor call */
        public LineTo(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1264x = f10;
            this.f1265y = f11;
        }

        public static /* synthetic */ LineTo copy$default(LineTo lineTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = lineTo.f1264x;
            }
            if ((i10 & 2) != 0) {
                f11 = lineTo.f1265y;
            }
            return lineTo.copy(f10, f11);
        }

        public final float component1() {
            return this.f1264x;
        }

        public final float component2() {
            return this.f1265y;
        }

        public final LineTo copy(float f10, float f11) {
            return new LineTo(f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) obj;
            return Float.compare(this.f1264x, lineTo.f1264x) == 0 && Float.compare(this.f1265y, lineTo.f1265y) == 0;
        }

        public final float getX() {
            return this.f1264x;
        }

        public final float getY() {
            return this.f1265y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f1264x) * 31) + Float.hashCode(this.f1265y);
        }

        public String toString() {
            return "LineTo(x=" + this.f1264x + ", y=" + this.f1265y + ')';
        }
    }

    @Immutable
    public static final class MoveTo extends PathNode {

        /* renamed from: x */
        private final float f1266x;

        /* renamed from: y */
        private final float f1267y;

        /* JADX WARN: Illegal instructions before constructor call */
        public MoveTo(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1266x = f10;
            this.f1267y = f11;
        }

        public static /* synthetic */ MoveTo copy$default(MoveTo moveTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = moveTo.f1266x;
            }
            if ((i10 & 2) != 0) {
                f11 = moveTo.f1267y;
            }
            return moveTo.copy(f10, f11);
        }

        public final float component1() {
            return this.f1266x;
        }

        public final float component2() {
            return this.f1267y;
        }

        public final MoveTo copy(float f10, float f11) {
            return new MoveTo(f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) obj;
            return Float.compare(this.f1266x, moveTo.f1266x) == 0 && Float.compare(this.f1267y, moveTo.f1267y) == 0;
        }

        public final float getX() {
            return this.f1266x;
        }

        public final float getY() {
            return this.f1267y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f1266x) * 31) + Float.hashCode(this.f1267y);
        }

        public String toString() {
            return "MoveTo(x=" + this.f1266x + ", y=" + this.f1267y + ')';
        }
    }

    @Immutable
    public static final class QuadTo extends PathNode {

        /* renamed from: x1 */
        private final float f1268x1;

        /* renamed from: x2 */
        private final float f1269x2;

        /* renamed from: y1 */
        private final float f1270y1;

        /* renamed from: y2 */
        private final float f1271y2;

        public QuadTo(float f10, float f11, float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f1268x1 = f10;
            this.f1270y1 = f11;
            this.f1269x2 = f12;
            this.f1271y2 = f13;
        }

        public static /* synthetic */ QuadTo copy$default(QuadTo quadTo, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = quadTo.f1268x1;
            }
            if ((i10 & 2) != 0) {
                f11 = quadTo.f1270y1;
            }
            if ((i10 & 4) != 0) {
                f12 = quadTo.f1269x2;
            }
            if ((i10 & 8) != 0) {
                f13 = quadTo.f1271y2;
            }
            return quadTo.copy(f10, f11, f12, f13);
        }

        public final float component1() {
            return this.f1268x1;
        }

        public final float component2() {
            return this.f1270y1;
        }

        public final float component3() {
            return this.f1269x2;
        }

        public final float component4() {
            return this.f1271y2;
        }

        public final QuadTo copy(float f10, float f11, float f12, float f13) {
            return new QuadTo(f10, f11, f12, f13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) obj;
            return Float.compare(this.f1268x1, quadTo.f1268x1) == 0 && Float.compare(this.f1270y1, quadTo.f1270y1) == 0 && Float.compare(this.f1269x2, quadTo.f1269x2) == 0 && Float.compare(this.f1271y2, quadTo.f1271y2) == 0;
        }

        public final float getX1() {
            return this.f1268x1;
        }

        public final float getX2() {
            return this.f1269x2;
        }

        public final float getY1() {
            return this.f1270y1;
        }

        public final float getY2() {
            return this.f1271y2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f1268x1) * 31) + Float.hashCode(this.f1270y1)) * 31) + Float.hashCode(this.f1269x2)) * 31) + Float.hashCode(this.f1271y2);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f1268x1 + ", y1=" + this.f1270y1 + ", x2=" + this.f1269x2 + ", y2=" + this.f1271y2 + ')';
        }
    }

    @Immutable
    public static final class ReflectiveCurveTo extends PathNode {

        /* renamed from: x1 */
        private final float f1272x1;

        /* renamed from: x2 */
        private final float f1273x2;

        /* renamed from: y1 */
        private final float f1274y1;

        /* renamed from: y2 */
        private final float f1275y2;

        public ReflectiveCurveTo(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f1272x1 = f10;
            this.f1274y1 = f11;
            this.f1273x2 = f12;
            this.f1275y2 = f13;
        }

        public static /* synthetic */ ReflectiveCurveTo copy$default(ReflectiveCurveTo reflectiveCurveTo, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = reflectiveCurveTo.f1272x1;
            }
            if ((i10 & 2) != 0) {
                f11 = reflectiveCurveTo.f1274y1;
            }
            if ((i10 & 4) != 0) {
                f12 = reflectiveCurveTo.f1273x2;
            }
            if ((i10 & 8) != 0) {
                f13 = reflectiveCurveTo.f1275y2;
            }
            return reflectiveCurveTo.copy(f10, f11, f12, f13);
        }

        public final float component1() {
            return this.f1272x1;
        }

        public final float component2() {
            return this.f1274y1;
        }

        public final float component3() {
            return this.f1273x2;
        }

        public final float component4() {
            return this.f1275y2;
        }

        public final ReflectiveCurveTo copy(float f10, float f11, float f12, float f13) {
            return new ReflectiveCurveTo(f10, f11, f12, f13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) obj;
            return Float.compare(this.f1272x1, reflectiveCurveTo.f1272x1) == 0 && Float.compare(this.f1274y1, reflectiveCurveTo.f1274y1) == 0 && Float.compare(this.f1273x2, reflectiveCurveTo.f1273x2) == 0 && Float.compare(this.f1275y2, reflectiveCurveTo.f1275y2) == 0;
        }

        public final float getX1() {
            return this.f1272x1;
        }

        public final float getX2() {
            return this.f1273x2;
        }

        public final float getY1() {
            return this.f1274y1;
        }

        public final float getY2() {
            return this.f1275y2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f1272x1) * 31) + Float.hashCode(this.f1274y1)) * 31) + Float.hashCode(this.f1273x2)) * 31) + Float.hashCode(this.f1275y2);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f1272x1 + ", y1=" + this.f1274y1 + ", x2=" + this.f1273x2 + ", y2=" + this.f1275y2 + ')';
        }
    }

    @Immutable
    public static final class ReflectiveQuadTo extends PathNode {

        /* renamed from: x */
        private final float f1276x;

        /* renamed from: y */
        private final float f1277y;

        public ReflectiveQuadTo(float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f1276x = f10;
            this.f1277y = f11;
        }

        public static /* synthetic */ ReflectiveQuadTo copy$default(ReflectiveQuadTo reflectiveQuadTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = reflectiveQuadTo.f1276x;
            }
            if ((i10 & 2) != 0) {
                f11 = reflectiveQuadTo.f1277y;
            }
            return reflectiveQuadTo.copy(f10, f11);
        }

        public final float component1() {
            return this.f1276x;
        }

        public final float component2() {
            return this.f1277y;
        }

        public final ReflectiveQuadTo copy(float f10, float f11) {
            return new ReflectiveQuadTo(f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) obj;
            return Float.compare(this.f1276x, reflectiveQuadTo.f1276x) == 0 && Float.compare(this.f1277y, reflectiveQuadTo.f1277y) == 0;
        }

        public final float getX() {
            return this.f1276x;
        }

        public final float getY() {
            return this.f1277y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f1276x) * 31) + Float.hashCode(this.f1277y);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f1276x + ", y=" + this.f1277y + ')';
        }
    }

    @Immutable
    public static final class RelativeArcTo extends PathNode {
        private final float arcStartDx;
        private final float arcStartDy;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeArcTo(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.horizontalEllipseRadius = f10;
            this.verticalEllipseRadius = f11;
            this.theta = f12;
            this.isMoreThanHalf = z10;
            this.isPositiveArc = z11;
            this.arcStartDx = f13;
            this.arcStartDy = f14;
        }

        public static /* synthetic */ RelativeArcTo copy$default(RelativeArcTo relativeArcTo, float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeArcTo.horizontalEllipseRadius;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeArcTo.verticalEllipseRadius;
            }
            if ((i10 & 4) != 0) {
                f12 = relativeArcTo.theta;
            }
            if ((i10 & 8) != 0) {
                z10 = relativeArcTo.isMoreThanHalf;
            }
            if ((i10 & 16) != 0) {
                z11 = relativeArcTo.isPositiveArc;
            }
            if ((i10 & 32) != 0) {
                f13 = relativeArcTo.arcStartDx;
            }
            if ((i10 & 64) != 0) {
                f14 = relativeArcTo.arcStartDy;
            }
            float f15 = f13;
            float f16 = f14;
            boolean z12 = z11;
            float f17 = f12;
            return relativeArcTo.copy(f10, f11, f17, z10, z12, f15, f16);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartDx;
        }

        public final float component7() {
            return this.arcStartDy;
        }

        public final RelativeArcTo copy(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            return new RelativeArcTo(f10, f11, f12, z10, z11, f13, f14);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) obj;
            return Float.compare(this.horizontalEllipseRadius, relativeArcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, relativeArcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, relativeArcTo.theta) == 0 && this.isMoreThanHalf == relativeArcTo.isMoreThanHalf && this.isPositiveArc == relativeArcTo.isPositiveArc && Float.compare(this.arcStartDx, relativeArcTo.arcStartDx) == 0 && Float.compare(this.arcStartDy, relativeArcTo.arcStartDy) == 0;
        }

        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.horizontalEllipseRadius) * 31) + Float.hashCode(this.verticalEllipseRadius)) * 31) + Float.hashCode(this.theta)) * 31) + Boolean.hashCode(this.isMoreThanHalf)) * 31) + Boolean.hashCode(this.isPositiveArc)) * 31) + Float.hashCode(this.arcStartDx)) * 31) + Float.hashCode(this.arcStartDy);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartDx=" + this.arcStartDx + ", arcStartDy=" + this.arcStartDy + ')';
        }
    }

    @Immutable
    public static final class RelativeCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dx3;
        private final float dy1;
        private final float dy2;
        private final float dy3;

        public RelativeCurveTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.dx1 = f10;
            this.dy1 = f11;
            this.dx2 = f12;
            this.dy2 = f13;
            this.dx3 = f14;
            this.dy3 = f15;
        }

        public static /* synthetic */ RelativeCurveTo copy$default(RelativeCurveTo relativeCurveTo, float f10, float f11, float f12, float f13, float f14, float f15, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeCurveTo.dx1;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeCurveTo.dy1;
            }
            if ((i10 & 4) != 0) {
                f12 = relativeCurveTo.dx2;
            }
            if ((i10 & 8) != 0) {
                f13 = relativeCurveTo.dy2;
            }
            if ((i10 & 16) != 0) {
                f14 = relativeCurveTo.dx3;
            }
            if ((i10 & 32) != 0) {
                f15 = relativeCurveTo.dy3;
            }
            float f16 = f14;
            float f17 = f15;
            return relativeCurveTo.copy(f10, f11, f12, f13, f16, f17);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final float component5() {
            return this.dx3;
        }

        public final float component6() {
            return this.dy3;
        }

        public final RelativeCurveTo copy(float f10, float f11, float f12, float f13, float f14, float f15) {
            return new RelativeCurveTo(f10, f11, f12, f13, f14, f15);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) obj;
            return Float.compare(this.dx1, relativeCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeCurveTo.dy2) == 0 && Float.compare(this.dx3, relativeCurveTo.dx3) == 0 && Float.compare(this.dy3, relativeCurveTo.dy3) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDx3() {
            return this.dx3;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public final float getDy3() {
            return this.dy3;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2)) * 31) + Float.hashCode(this.dx3)) * 31) + Float.hashCode(this.dy3);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ", dx3=" + this.dx3 + ", dy3=" + this.dy3 + ')';
        }
    }

    @Immutable
    public static final class RelativeHorizontalTo extends PathNode {

        /* renamed from: dx */
        private final float f1278dx;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeHorizontalTo(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1278dx = f10;
        }

        public static /* synthetic */ RelativeHorizontalTo copy$default(RelativeHorizontalTo relativeHorizontalTo, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeHorizontalTo.f1278dx;
            }
            return relativeHorizontalTo.copy(f10);
        }

        public final float component1() {
            return this.f1278dx;
        }

        public final RelativeHorizontalTo copy(float f10) {
            return new RelativeHorizontalTo(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeHorizontalTo) && Float.compare(this.f1278dx, ((RelativeHorizontalTo) obj).f1278dx) == 0;
        }

        public final float getDx() {
            return this.f1278dx;
        }

        public int hashCode() {
            return Float.hashCode(this.f1278dx);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f1278dx + ')';
        }
    }

    @Immutable
    public static final class RelativeLineTo extends PathNode {

        /* renamed from: dx */
        private final float f1279dx;

        /* renamed from: dy */
        private final float f1280dy;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeLineTo(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1279dx = f10;
            this.f1280dy = f11;
        }

        public static /* synthetic */ RelativeLineTo copy$default(RelativeLineTo relativeLineTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeLineTo.f1279dx;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeLineTo.f1280dy;
            }
            return relativeLineTo.copy(f10, f11);
        }

        public final float component1() {
            return this.f1279dx;
        }

        public final float component2() {
            return this.f1280dy;
        }

        public final RelativeLineTo copy(float f10, float f11) {
            return new RelativeLineTo(f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) obj;
            return Float.compare(this.f1279dx, relativeLineTo.f1279dx) == 0 && Float.compare(this.f1280dy, relativeLineTo.f1280dy) == 0;
        }

        public final float getDx() {
            return this.f1279dx;
        }

        public final float getDy() {
            return this.f1280dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f1279dx) * 31) + Float.hashCode(this.f1280dy);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f1279dx + ", dy=" + this.f1280dy + ')';
        }
    }

    @Immutable
    public static final class RelativeMoveTo extends PathNode {

        /* renamed from: dx */
        private final float f1281dx;

        /* renamed from: dy */
        private final float f1282dy;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeMoveTo(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1281dx = f10;
            this.f1282dy = f11;
        }

        public static /* synthetic */ RelativeMoveTo copy$default(RelativeMoveTo relativeMoveTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeMoveTo.f1281dx;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeMoveTo.f1282dy;
            }
            return relativeMoveTo.copy(f10, f11);
        }

        public final float component1() {
            return this.f1281dx;
        }

        public final float component2() {
            return this.f1282dy;
        }

        public final RelativeMoveTo copy(float f10, float f11) {
            return new RelativeMoveTo(f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) obj;
            return Float.compare(this.f1281dx, relativeMoveTo.f1281dx) == 0 && Float.compare(this.f1282dy, relativeMoveTo.f1282dy) == 0;
        }

        public final float getDx() {
            return this.f1281dx;
        }

        public final float getDy() {
            return this.f1282dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f1281dx) * 31) + Float.hashCode(this.f1282dy);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f1281dx + ", dy=" + this.f1282dy + ')';
        }
    }

    @Immutable
    public static final class RelativeQuadTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeQuadTo(float f10, float f11, float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx1 = f10;
            this.dy1 = f11;
            this.dx2 = f12;
            this.dy2 = f13;
        }

        public static /* synthetic */ RelativeQuadTo copy$default(RelativeQuadTo relativeQuadTo, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeQuadTo.dx1;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeQuadTo.dy1;
            }
            if ((i10 & 4) != 0) {
                f12 = relativeQuadTo.dx2;
            }
            if ((i10 & 8) != 0) {
                f13 = relativeQuadTo.dy2;
            }
            return relativeQuadTo.copy(f10, f11, f12, f13);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final RelativeQuadTo copy(float f10, float f11, float f12, float f13) {
            return new RelativeQuadTo(f10, f11, f12, f13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) obj;
            return Float.compare(this.dx1, relativeQuadTo.dx1) == 0 && Float.compare(this.dy1, relativeQuadTo.dy1) == 0 && Float.compare(this.dx2, relativeQuadTo.dx2) == 0 && Float.compare(this.dy2, relativeQuadTo.dy2) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    @Immutable
    public static final class RelativeReflectiveCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeReflectiveCurveTo(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.dx1 = f10;
            this.dy1 = f11;
            this.dx2 = f12;
            this.dy2 = f13;
        }

        public static /* synthetic */ RelativeReflectiveCurveTo copy$default(RelativeReflectiveCurveTo relativeReflectiveCurveTo, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeReflectiveCurveTo.dx1;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeReflectiveCurveTo.dy1;
            }
            if ((i10 & 4) != 0) {
                f12 = relativeReflectiveCurveTo.dx2;
            }
            if ((i10 & 8) != 0) {
                f13 = relativeReflectiveCurveTo.dy2;
            }
            return relativeReflectiveCurveTo.copy(f10, f11, f12, f13);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final RelativeReflectiveCurveTo copy(float f10, float f11, float f12, float f13) {
            return new RelativeReflectiveCurveTo(f10, f11, f12, f13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) obj;
            return Float.compare(this.dx1, relativeReflectiveCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeReflectiveCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeReflectiveCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeReflectiveCurveTo.dy2) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    @Immutable
    public static final class RelativeReflectiveQuadTo extends PathNode {

        /* renamed from: dx */
        private final float f1283dx;

        /* renamed from: dy */
        private final float f1284dy;

        public RelativeReflectiveQuadTo(float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f1283dx = f10;
            this.f1284dy = f11;
        }

        public static /* synthetic */ RelativeReflectiveQuadTo copy$default(RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeReflectiveQuadTo.f1283dx;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeReflectiveQuadTo.f1284dy;
            }
            return relativeReflectiveQuadTo.copy(f10, f11);
        }

        public final float component1() {
            return this.f1283dx;
        }

        public final float component2() {
            return this.f1284dy;
        }

        public final RelativeReflectiveQuadTo copy(float f10, float f11) {
            return new RelativeReflectiveQuadTo(f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) obj;
            return Float.compare(this.f1283dx, relativeReflectiveQuadTo.f1283dx) == 0 && Float.compare(this.f1284dy, relativeReflectiveQuadTo.f1284dy) == 0;
        }

        public final float getDx() {
            return this.f1283dx;
        }

        public final float getDy() {
            return this.f1284dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f1283dx) * 31) + Float.hashCode(this.f1284dy);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f1283dx + ", dy=" + this.f1284dy + ')';
        }
    }

    @Immutable
    public static final class RelativeVerticalTo extends PathNode {

        /* renamed from: dy */
        private final float f1285dy;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeVerticalTo(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1285dy = f10;
        }

        public static /* synthetic */ RelativeVerticalTo copy$default(RelativeVerticalTo relativeVerticalTo, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeVerticalTo.f1285dy;
            }
            return relativeVerticalTo.copy(f10);
        }

        public final float component1() {
            return this.f1285dy;
        }

        public final RelativeVerticalTo copy(float f10) {
            return new RelativeVerticalTo(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeVerticalTo) && Float.compare(this.f1285dy, ((RelativeVerticalTo) obj).f1285dy) == 0;
        }

        public final float getDy() {
            return this.f1285dy;
        }

        public int hashCode() {
            return Float.hashCode(this.f1285dy);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f1285dy + ')';
        }
    }

    @Immutable
    public static final class VerticalTo extends PathNode {

        /* renamed from: y */
        private final float f1286y;

        /* JADX WARN: Illegal instructions before constructor call */
        public VerticalTo(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1286y = f10;
        }

        public static /* synthetic */ VerticalTo copy$default(VerticalTo verticalTo, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = verticalTo.f1286y;
            }
            return verticalTo.copy(f10);
        }

        public final float component1() {
            return this.f1286y;
        }

        public final VerticalTo copy(float f10) {
            return new VerticalTo(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalTo) && Float.compare(this.f1286y, ((VerticalTo) obj).f1286y) == 0;
        }

        public final float getY() {
            return this.f1286y;
        }

        public int hashCode() {
            return Float.hashCode(this.f1286y);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f1286y + ')';
        }
    }

    public /* synthetic */ PathNode(boolean z10, boolean z11, AbstractC9126n abstractC9126n) {
        this(z10, z11);
    }

    public final boolean isCurve() {
        return this.isCurve;
    }

    public final boolean isQuad() {
        return this.isQuad;
    }

    private PathNode(boolean z10, boolean z11) {
        this.isCurve = z10;
        this.isQuad = z11;
    }

    public /* synthetic */ PathNode(boolean z10, boolean z11, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, null);
    }
}
