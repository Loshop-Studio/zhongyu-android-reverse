package androidx.compose.p014ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

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
        private final float f1187x1;

        /* renamed from: x2 */
        private final float f1188x2;

        /* renamed from: x3 */
        private final float f1189x3;

        /* renamed from: y1 */
        private final float f1190y1;

        /* renamed from: y2 */
        private final float f1191y2;

        /* renamed from: y3 */
        private final float f1192y3;

        public CurveTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f1187x1 = f10;
            this.f1190y1 = f11;
            this.f1188x2 = f12;
            this.f1191y2 = f13;
            this.f1189x3 = f14;
            this.f1192y3 = f15;
        }

        public static /* synthetic */ CurveTo copy$default(CurveTo curveTo, float f10, float f11, float f12, float f13, float f14, float f15, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = curveTo.f1187x1;
            }
            if ((i10 & 2) != 0) {
                f11 = curveTo.f1190y1;
            }
            if ((i10 & 4) != 0) {
                f12 = curveTo.f1188x2;
            }
            if ((i10 & 8) != 0) {
                f13 = curveTo.f1191y2;
            }
            if ((i10 & 16) != 0) {
                f14 = curveTo.f1189x3;
            }
            if ((i10 & 32) != 0) {
                f15 = curveTo.f1192y3;
            }
            float f16 = f14;
            float f17 = f15;
            return curveTo.copy(f10, f11, f12, f13, f16, f17);
        }

        public final float component1() {
            return this.f1187x1;
        }

        public final float component2() {
            return this.f1190y1;
        }

        public final float component3() {
            return this.f1188x2;
        }

        public final float component4() {
            return this.f1191y2;
        }

        public final float component5() {
            return this.f1189x3;
        }

        public final float component6() {
            return this.f1192y3;
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
            return Float.compare(this.f1187x1, curveTo.f1187x1) == 0 && Float.compare(this.f1190y1, curveTo.f1190y1) == 0 && Float.compare(this.f1188x2, curveTo.f1188x2) == 0 && Float.compare(this.f1191y2, curveTo.f1191y2) == 0 && Float.compare(this.f1189x3, curveTo.f1189x3) == 0 && Float.compare(this.f1192y3, curveTo.f1192y3) == 0;
        }

        public final float getX1() {
            return this.f1187x1;
        }

        public final float getX2() {
            return this.f1188x2;
        }

        public final float getX3() {
            return this.f1189x3;
        }

        public final float getY1() {
            return this.f1190y1;
        }

        public final float getY2() {
            return this.f1191y2;
        }

        public final float getY3() {
            return this.f1192y3;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f1187x1) * 31) + Float.hashCode(this.f1190y1)) * 31) + Float.hashCode(this.f1188x2)) * 31) + Float.hashCode(this.f1191y2)) * 31) + Float.hashCode(this.f1189x3)) * 31) + Float.hashCode(this.f1192y3);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f1187x1 + ", y1=" + this.f1190y1 + ", x2=" + this.f1188x2 + ", y2=" + this.f1191y2 + ", x3=" + this.f1189x3 + ", y3=" + this.f1192y3 + ')';
        }
    }

    @Immutable
    public static final class HorizontalTo extends PathNode {

        /* renamed from: x */
        private final float f1193x;

        /* JADX WARN: Illegal instructions before constructor call */
        public HorizontalTo(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1193x = f10;
        }

        public static /* synthetic */ HorizontalTo copy$default(HorizontalTo horizontalTo, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = horizontalTo.f1193x;
            }
            return horizontalTo.copy(f10);
        }

        public final float component1() {
            return this.f1193x;
        }

        public final HorizontalTo copy(float f10) {
            return new HorizontalTo(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalTo) && Float.compare(this.f1193x, ((HorizontalTo) obj).f1193x) == 0;
        }

        public final float getX() {
            return this.f1193x;
        }

        public int hashCode() {
            return Float.hashCode(this.f1193x);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f1193x + ')';
        }
    }

    @Immutable
    public static final class LineTo extends PathNode {

        /* renamed from: x */
        private final float f1194x;

        /* renamed from: y */
        private final float f1195y;

        /* JADX WARN: Illegal instructions before constructor call */
        public LineTo(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1194x = f10;
            this.f1195y = f11;
        }

        public static /* synthetic */ LineTo copy$default(LineTo lineTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = lineTo.f1194x;
            }
            if ((i10 & 2) != 0) {
                f11 = lineTo.f1195y;
            }
            return lineTo.copy(f10, f11);
        }

        public final float component1() {
            return this.f1194x;
        }

        public final float component2() {
            return this.f1195y;
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
            return Float.compare(this.f1194x, lineTo.f1194x) == 0 && Float.compare(this.f1195y, lineTo.f1195y) == 0;
        }

        public final float getX() {
            return this.f1194x;
        }

        public final float getY() {
            return this.f1195y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f1194x) * 31) + Float.hashCode(this.f1195y);
        }

        public String toString() {
            return "LineTo(x=" + this.f1194x + ", y=" + this.f1195y + ')';
        }
    }

    @Immutable
    public static final class MoveTo extends PathNode {

        /* renamed from: x */
        private final float f1196x;

        /* renamed from: y */
        private final float f1197y;

        /* JADX WARN: Illegal instructions before constructor call */
        public MoveTo(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1196x = f10;
            this.f1197y = f11;
        }

        public static /* synthetic */ MoveTo copy$default(MoveTo moveTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = moveTo.f1196x;
            }
            if ((i10 & 2) != 0) {
                f11 = moveTo.f1197y;
            }
            return moveTo.copy(f10, f11);
        }

        public final float component1() {
            return this.f1196x;
        }

        public final float component2() {
            return this.f1197y;
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
            return Float.compare(this.f1196x, moveTo.f1196x) == 0 && Float.compare(this.f1197y, moveTo.f1197y) == 0;
        }

        public final float getX() {
            return this.f1196x;
        }

        public final float getY() {
            return this.f1197y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f1196x) * 31) + Float.hashCode(this.f1197y);
        }

        public String toString() {
            return "MoveTo(x=" + this.f1196x + ", y=" + this.f1197y + ')';
        }
    }

    @Immutable
    public static final class QuadTo extends PathNode {

        /* renamed from: x1 */
        private final float f1198x1;

        /* renamed from: x2 */
        private final float f1199x2;

        /* renamed from: y1 */
        private final float f1200y1;

        /* renamed from: y2 */
        private final float f1201y2;

        public QuadTo(float f10, float f11, float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f1198x1 = f10;
            this.f1200y1 = f11;
            this.f1199x2 = f12;
            this.f1201y2 = f13;
        }

        public static /* synthetic */ QuadTo copy$default(QuadTo quadTo, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = quadTo.f1198x1;
            }
            if ((i10 & 2) != 0) {
                f11 = quadTo.f1200y1;
            }
            if ((i10 & 4) != 0) {
                f12 = quadTo.f1199x2;
            }
            if ((i10 & 8) != 0) {
                f13 = quadTo.f1201y2;
            }
            return quadTo.copy(f10, f11, f12, f13);
        }

        public final float component1() {
            return this.f1198x1;
        }

        public final float component2() {
            return this.f1200y1;
        }

        public final float component3() {
            return this.f1199x2;
        }

        public final float component4() {
            return this.f1201y2;
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
            return Float.compare(this.f1198x1, quadTo.f1198x1) == 0 && Float.compare(this.f1200y1, quadTo.f1200y1) == 0 && Float.compare(this.f1199x2, quadTo.f1199x2) == 0 && Float.compare(this.f1201y2, quadTo.f1201y2) == 0;
        }

        public final float getX1() {
            return this.f1198x1;
        }

        public final float getX2() {
            return this.f1199x2;
        }

        public final float getY1() {
            return this.f1200y1;
        }

        public final float getY2() {
            return this.f1201y2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f1198x1) * 31) + Float.hashCode(this.f1200y1)) * 31) + Float.hashCode(this.f1199x2)) * 31) + Float.hashCode(this.f1201y2);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f1198x1 + ", y1=" + this.f1200y1 + ", x2=" + this.f1199x2 + ", y2=" + this.f1201y2 + ')';
        }
    }

    @Immutable
    public static final class ReflectiveCurveTo extends PathNode {

        /* renamed from: x1 */
        private final float f1202x1;

        /* renamed from: x2 */
        private final float f1203x2;

        /* renamed from: y1 */
        private final float f1204y1;

        /* renamed from: y2 */
        private final float f1205y2;

        public ReflectiveCurveTo(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f1202x1 = f10;
            this.f1204y1 = f11;
            this.f1203x2 = f12;
            this.f1205y2 = f13;
        }

        public static /* synthetic */ ReflectiveCurveTo copy$default(ReflectiveCurveTo reflectiveCurveTo, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = reflectiveCurveTo.f1202x1;
            }
            if ((i10 & 2) != 0) {
                f11 = reflectiveCurveTo.f1204y1;
            }
            if ((i10 & 4) != 0) {
                f12 = reflectiveCurveTo.f1203x2;
            }
            if ((i10 & 8) != 0) {
                f13 = reflectiveCurveTo.f1205y2;
            }
            return reflectiveCurveTo.copy(f10, f11, f12, f13);
        }

        public final float component1() {
            return this.f1202x1;
        }

        public final float component2() {
            return this.f1204y1;
        }

        public final float component3() {
            return this.f1203x2;
        }

        public final float component4() {
            return this.f1205y2;
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
            return Float.compare(this.f1202x1, reflectiveCurveTo.f1202x1) == 0 && Float.compare(this.f1204y1, reflectiveCurveTo.f1204y1) == 0 && Float.compare(this.f1203x2, reflectiveCurveTo.f1203x2) == 0 && Float.compare(this.f1205y2, reflectiveCurveTo.f1205y2) == 0;
        }

        public final float getX1() {
            return this.f1202x1;
        }

        public final float getX2() {
            return this.f1203x2;
        }

        public final float getY1() {
            return this.f1204y1;
        }

        public final float getY2() {
            return this.f1205y2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f1202x1) * 31) + Float.hashCode(this.f1204y1)) * 31) + Float.hashCode(this.f1203x2)) * 31) + Float.hashCode(this.f1205y2);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f1202x1 + ", y1=" + this.f1204y1 + ", x2=" + this.f1203x2 + ", y2=" + this.f1205y2 + ')';
        }
    }

    @Immutable
    public static final class ReflectiveQuadTo extends PathNode {

        /* renamed from: x */
        private final float f1206x;

        /* renamed from: y */
        private final float f1207y;

        public ReflectiveQuadTo(float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f1206x = f10;
            this.f1207y = f11;
        }

        public static /* synthetic */ ReflectiveQuadTo copy$default(ReflectiveQuadTo reflectiveQuadTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = reflectiveQuadTo.f1206x;
            }
            if ((i10 & 2) != 0) {
                f11 = reflectiveQuadTo.f1207y;
            }
            return reflectiveQuadTo.copy(f10, f11);
        }

        public final float component1() {
            return this.f1206x;
        }

        public final float component2() {
            return this.f1207y;
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
            return Float.compare(this.f1206x, reflectiveQuadTo.f1206x) == 0 && Float.compare(this.f1207y, reflectiveQuadTo.f1207y) == 0;
        }

        public final float getX() {
            return this.f1206x;
        }

        public final float getY() {
            return this.f1207y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f1206x) * 31) + Float.hashCode(this.f1207y);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f1206x + ", y=" + this.f1207y + ')';
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
        private final float f1208dx;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeHorizontalTo(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1208dx = f10;
        }

        public static /* synthetic */ RelativeHorizontalTo copy$default(RelativeHorizontalTo relativeHorizontalTo, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeHorizontalTo.f1208dx;
            }
            return relativeHorizontalTo.copy(f10);
        }

        public final float component1() {
            return this.f1208dx;
        }

        public final RelativeHorizontalTo copy(float f10) {
            return new RelativeHorizontalTo(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeHorizontalTo) && Float.compare(this.f1208dx, ((RelativeHorizontalTo) obj).f1208dx) == 0;
        }

        public final float getDx() {
            return this.f1208dx;
        }

        public int hashCode() {
            return Float.hashCode(this.f1208dx);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f1208dx + ')';
        }
    }

    @Immutable
    public static final class RelativeLineTo extends PathNode {

        /* renamed from: dx */
        private final float f1209dx;

        /* renamed from: dy */
        private final float f1210dy;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeLineTo(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1209dx = f10;
            this.f1210dy = f11;
        }

        public static /* synthetic */ RelativeLineTo copy$default(RelativeLineTo relativeLineTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeLineTo.f1209dx;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeLineTo.f1210dy;
            }
            return relativeLineTo.copy(f10, f11);
        }

        public final float component1() {
            return this.f1209dx;
        }

        public final float component2() {
            return this.f1210dy;
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
            return Float.compare(this.f1209dx, relativeLineTo.f1209dx) == 0 && Float.compare(this.f1210dy, relativeLineTo.f1210dy) == 0;
        }

        public final float getDx() {
            return this.f1209dx;
        }

        public final float getDy() {
            return this.f1210dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f1209dx) * 31) + Float.hashCode(this.f1210dy);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f1209dx + ", dy=" + this.f1210dy + ')';
        }
    }

    @Immutable
    public static final class RelativeMoveTo extends PathNode {

        /* renamed from: dx */
        private final float f1211dx;

        /* renamed from: dy */
        private final float f1212dy;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeMoveTo(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1211dx = f10;
            this.f1212dy = f11;
        }

        public static /* synthetic */ RelativeMoveTo copy$default(RelativeMoveTo relativeMoveTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeMoveTo.f1211dx;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeMoveTo.f1212dy;
            }
            return relativeMoveTo.copy(f10, f11);
        }

        public final float component1() {
            return this.f1211dx;
        }

        public final float component2() {
            return this.f1212dy;
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
            return Float.compare(this.f1211dx, relativeMoveTo.f1211dx) == 0 && Float.compare(this.f1212dy, relativeMoveTo.f1212dy) == 0;
        }

        public final float getDx() {
            return this.f1211dx;
        }

        public final float getDy() {
            return this.f1212dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f1211dx) * 31) + Float.hashCode(this.f1212dy);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f1211dx + ", dy=" + this.f1212dy + ')';
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
        private final float f1213dx;

        /* renamed from: dy */
        private final float f1214dy;

        public RelativeReflectiveQuadTo(float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f1213dx = f10;
            this.f1214dy = f11;
        }

        public static /* synthetic */ RelativeReflectiveQuadTo copy$default(RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeReflectiveQuadTo.f1213dx;
            }
            if ((i10 & 2) != 0) {
                f11 = relativeReflectiveQuadTo.f1214dy;
            }
            return relativeReflectiveQuadTo.copy(f10, f11);
        }

        public final float component1() {
            return this.f1213dx;
        }

        public final float component2() {
            return this.f1214dy;
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
            return Float.compare(this.f1213dx, relativeReflectiveQuadTo.f1213dx) == 0 && Float.compare(this.f1214dy, relativeReflectiveQuadTo.f1214dy) == 0;
        }

        public final float getDx() {
            return this.f1213dx;
        }

        public final float getDy() {
            return this.f1214dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f1213dx) * 31) + Float.hashCode(this.f1214dy);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f1213dx + ", dy=" + this.f1214dy + ')';
        }
    }

    @Immutable
    public static final class RelativeVerticalTo extends PathNode {

        /* renamed from: dy */
        private final float f1215dy;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeVerticalTo(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1215dy = f10;
        }

        public static /* synthetic */ RelativeVerticalTo copy$default(RelativeVerticalTo relativeVerticalTo, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = relativeVerticalTo.f1215dy;
            }
            return relativeVerticalTo.copy(f10);
        }

        public final float component1() {
            return this.f1215dy;
        }

        public final RelativeVerticalTo copy(float f10) {
            return new RelativeVerticalTo(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeVerticalTo) && Float.compare(this.f1215dy, ((RelativeVerticalTo) obj).f1215dy) == 0;
        }

        public final float getDy() {
            return this.f1215dy;
        }

        public int hashCode() {
            return Float.hashCode(this.f1215dy);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f1215dy + ')';
        }
    }

    @Immutable
    public static final class VerticalTo extends PathNode {

        /* renamed from: y */
        private final float f1216y;

        /* JADX WARN: Illegal instructions before constructor call */
        public VerticalTo(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f1216y = f10;
        }

        public static /* synthetic */ VerticalTo copy$default(VerticalTo verticalTo, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = verticalTo.f1216y;
            }
            return verticalTo.copy(f10);
        }

        public final float component1() {
            return this.f1216y;
        }

        public final VerticalTo copy(float f10) {
            return new VerticalTo(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalTo) && Float.compare(this.f1216y, ((VerticalTo) obj).f1216y) == 0;
        }

        public final float getY() {
            return this.f1216y;
        }

        public int hashCode() {
            return Float.hashCode(this.f1216y);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f1216y + ')';
        }
    }

    public /* synthetic */ PathNode(boolean z10, boolean z11, AbstractC9972n abstractC9972n) {
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

    public /* synthetic */ PathNode(boolean z10, boolean z11, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, null);
    }
}
