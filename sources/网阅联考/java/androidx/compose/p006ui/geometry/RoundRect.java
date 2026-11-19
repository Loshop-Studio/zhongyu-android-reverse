package androidx.compose.p006ui.geometry;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
@Metadata(m5174d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0001>BP\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0019\u0010!\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0011J\u0019\u0010#\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0011J\u0019\u0010%\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0011J\u0019\u0010'\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0011J\u001e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.Jf\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J(\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003H\u0002J\b\u0010;\u001a\u00020\u0000H\u0002J\b\u0010<\u001a\u00020=H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u000b\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\n\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, m5175d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "left", "", "top", "right", "bottom", "topLeftCornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_scaledRadiiRect", "getBottom", "()F", "getBottomLeftCornerRadius-kKHJgLs", "()J", "J", "getBottomRightCornerRadius-kKHJgLs", "height", "getHeight", "getLeft", "getRight", "getTop", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", "width", "getWidth", "component1", "component2", "component3", "component4", "component5", "component5-kKHJgLs", "component6", "component6-kKHJgLs", "component7", "component7-kKHJgLs", "component8", "component8-kKHJgLs", "contains", "", "point", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "copy", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "equals", "other", "hashCode", "", "minRadius", "min", "radius1", "radius2", "limit", "scaledRadiiRect", "toString", "", "Companion", "ui-geometry_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class RoundRect {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final RoundRect Zero = RoundRectKt.m8999RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.INSTANCE.m8930getZerokKHJgLs());
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    @Metadata(m5174d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5175d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }

        public final RoundRect getZero() {
            return RoundRect.Zero;
        }
    }

    public /* synthetic */ RoundRect(float f4, float f5, float f6, float f7, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f4, f5, f6, f7, j4, j5, j6, j7);
    }

    public static final RoundRect getZero() {
        return INSTANCE.getZero();
    }

    private final float minRadius(float min, float radius1, float radius2, float limit) {
        float f4 = radius1 + radius2;
        if (f4 > limit) {
            return !((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)) == 0) ? Math.min(min, limit / f4) : min;
        }
        return min;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float fMinRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m8921getYimpl(this.bottomLeftCornerRadius), CornerRadius.m8921getYimpl(this.topLeftCornerRadius), getHeight()), CornerRadius.m8920getXimpl(this.topLeftCornerRadius), CornerRadius.m8920getXimpl(this.topRightCornerRadius), getWidth()), CornerRadius.m8921getYimpl(this.topRightCornerRadius), CornerRadius.m8921getYimpl(this.bottomRightCornerRadius), getHeight()), CornerRadius.m8920getXimpl(this.bottomRightCornerRadius), CornerRadius.m8920getXimpl(this.bottomLeftCornerRadius), getWidth());
        RoundRect roundRect2 = new RoundRect(this.left * fMinRadius, this.top * fMinRadius, this.right * fMinRadius, this.bottom * fMinRadius, CornerRadiusKt.CornerRadius(CornerRadius.m8920getXimpl(this.topLeftCornerRadius) * fMinRadius, CornerRadius.m8921getYimpl(this.topLeftCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m8920getXimpl(this.topRightCornerRadius) * fMinRadius, CornerRadius.m8921getYimpl(this.topRightCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m8920getXimpl(this.bottomRightCornerRadius) * fMinRadius, CornerRadius.m8921getYimpl(this.bottomRightCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m8920getXimpl(this.bottomLeftCornerRadius) * fMinRadius, CornerRadius.m8921getYimpl(this.bottomLeftCornerRadius) * fMinRadius), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    /* renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m8991containsk4lQ0M(long point) {
        float fM8945getXimpl;
        float fM8946getYimpl;
        float fM8920getXimpl;
        float fM8921getYimpl;
        if (Offset.m8945getXimpl(point) < this.left || Offset.m8945getXimpl(point) >= this.right || Offset.m8946getYimpl(point) < this.top || Offset.m8946getYimpl(point) >= this.bottom) {
            return false;
        }
        RoundRect roundRectScaledRadiiRect = scaledRadiiRect();
        if (Offset.m8945getXimpl(point) < this.left + CornerRadius.m8920getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius) && Offset.m8946getYimpl(point) < this.top + CornerRadius.m8921getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius)) {
            fM8945getXimpl = (Offset.m8945getXimpl(point) - this.left) - CornerRadius.m8920getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
            fM8946getYimpl = (Offset.m8946getYimpl(point) - this.top) - CornerRadius.m8921getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
            fM8920getXimpl = CornerRadius.m8920getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
            fM8921getYimpl = CornerRadius.m8921getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
        } else if (Offset.m8945getXimpl(point) > this.right - CornerRadius.m8920getXimpl(roundRectScaledRadiiRect.topRightCornerRadius) && Offset.m8946getYimpl(point) < this.top + CornerRadius.m8921getYimpl(roundRectScaledRadiiRect.topRightCornerRadius)) {
            fM8945getXimpl = (Offset.m8945getXimpl(point) - this.right) + CornerRadius.m8920getXimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM8946getYimpl = (Offset.m8946getYimpl(point) - this.top) - CornerRadius.m8921getYimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM8920getXimpl = CornerRadius.m8920getXimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM8921getYimpl = CornerRadius.m8921getYimpl(roundRectScaledRadiiRect.topRightCornerRadius);
        } else if (Offset.m8945getXimpl(point) > this.right - CornerRadius.m8920getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius) && Offset.m8946getYimpl(point) > this.bottom - CornerRadius.m8921getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius)) {
            fM8945getXimpl = (Offset.m8945getXimpl(point) - this.right) + CornerRadius.m8920getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
            fM8946getYimpl = (Offset.m8946getYimpl(point) - this.bottom) + CornerRadius.m8921getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
            fM8920getXimpl = CornerRadius.m8920getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
            fM8921getYimpl = CornerRadius.m8921getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
        } else {
            if (Offset.m8945getXimpl(point) >= this.left + CornerRadius.m8920getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius) || Offset.m8946getYimpl(point) <= this.bottom - CornerRadius.m8921getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius)) {
                return true;
            }
            fM8945getXimpl = (Offset.m8945getXimpl(point) - this.left) - CornerRadius.m8920getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
            fM8946getYimpl = (Offset.m8946getYimpl(point) - this.bottom) + CornerRadius.m8921getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
            fM8920getXimpl = CornerRadius.m8920getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
            fM8921getYimpl = CornerRadius.m8921getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
        }
        float f4 = fM8945getXimpl / fM8920getXimpl;
        float f5 = fM8946getYimpl / fM8921getYimpl;
        return (f4 * f4) + (f5 * f5) <= 1.0f;
    }

    /* renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m8992copyMDFrsts(float left, float top, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
        return new RoundRect(left, top, right, bottom, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) other;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m8919equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m8919equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m8919equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m8919equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m8993getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m8994getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m8995getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m8996getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.floatToIntBits(this.left) * 31) + Float.floatToIntBits(this.top)) * 31) + Float.floatToIntBits(this.right)) * 31) + Float.floatToIntBits(this.bottom)) * 31) + CornerRadius.m8922hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m8922hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m8922hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m8922hashCodeimpl(this.bottomLeftCornerRadius);
    }

    public String toString() {
        long j4 = this.topLeftCornerRadius;
        long j5 = this.topRightCornerRadius;
        long j6 = this.bottomRightCornerRadius;
        long j7 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m8919equalsimpl0(j4, j5) || !CornerRadius.m8919equalsimpl0(j5, j6) || !CornerRadius.m8919equalsimpl0(j6, j7)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m8926toStringimpl(j4)) + ", topRight=" + ((Object) CornerRadius.m8926toStringimpl(j5)) + ", bottomRight=" + ((Object) CornerRadius.m8926toStringimpl(j6)) + ", bottomLeft=" + ((Object) CornerRadius.m8926toStringimpl(j7)) + ')';
        }
        if (CornerRadius.m8920getXimpl(j4) == CornerRadius.m8921getYimpl(j4)) {
            return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m8920getXimpl(j4), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m8920getXimpl(j4), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m8921getYimpl(j4), 1) + ')';
    }

    private RoundRect(float f4, float f5, float f6, float f7, long j4, long j5, long j6, long j7) {
        this.left = f4;
        this.top = f5;
        this.right = f6;
        this.bottom = f7;
        this.topLeftCornerRadius = j4;
        this.topRightCornerRadius = j5;
        this.bottomRightCornerRadius = j6;
        this.bottomLeftCornerRadius = j7;
    }

    public /* synthetic */ RoundRect(float f4, float f5, float f6, float f7, long j4, long j5, long j6, long j7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f4, f5, f6, f7, (i4 & 16) != 0 ? CornerRadius.INSTANCE.m8930getZerokKHJgLs() : j4, (i4 & 32) != 0 ? CornerRadius.INSTANCE.m8930getZerokKHJgLs() : j5, (i4 & 64) != 0 ? CornerRadius.INSTANCE.m8930getZerokKHJgLs() : j6, (i4 & 128) != 0 ? CornerRadius.INSTANCE.m8930getZerokKHJgLs() : j7, null);
    }
}
