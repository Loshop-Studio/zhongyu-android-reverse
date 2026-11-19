package androidx.compose.p006ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.p006ui.geometry.CornerRadius;
import androidx.compose.p006ui.geometry.CornerRadiusKt;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.geometry.RoundRect;
import androidx.compose.p006ui.geometry.RoundRectKt;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.geometry.SizeKt;
import androidx.compose.p006ui.graphics.AbstractC1291c1;
import androidx.compose.p006ui.graphics.AndroidPath;
import androidx.compose.p006ui.graphics.AndroidPath_androidKt;
import androidx.compose.p006ui.graphics.Canvas;
import androidx.compose.p006ui.graphics.Outline;
import androidx.compose.p006ui.graphics.Path;
import androidx.compose.p006ui.graphics.RectangleShapeKt;
import androidx.compose.p006ui.graphics.Shape;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(m5174d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u001b\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u001fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\u00020,2\u0006\u0010$\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J6\u00103\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#2\u0006\u00106\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00062\u0006\u00107\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003J\b\u00108\u001a\u00020,H\u0002J\u0010\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020\nH\u0002J\u0010\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020(H\u0002J3\u0010@\u001a\u00020\u0006*\u0004\u0018\u00010(2\u0006\u0010A\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020!H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u001b\u001a\u00020\u001cX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001dR\u0019\u0010\u001e\u001a\u00020\u001fX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010$\u001a\u00020\u001cX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001dR\u0010\u0010%\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, m5175d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "cacheIsDirty", "", "cachedOutline", "Landroid/graphics/Outline;", "cachedRrectPath", "Landroidx/compose/ui/graphics/Path;", "calculatedOutline", "Landroidx/compose/ui/graphics/Outline;", "clipPath", "getClipPath", "()Landroidx/compose/ui/graphics/Path;", "isSupportedOutline", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outline", "getOutline", "()Landroid/graphics/Outline;", "outlineClipSupported", "getOutlineClipSupported", "()Z", "outlineNeeded", "outlinePath", "rectSize", "Landroidx/compose/ui/geometry/Size;", "J", "rectTopLeft", "Landroidx/compose/ui/geometry/Offset;", "roundedCornerRadius", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "size", "tmpOpPath", "tmpPath", "tmpRoundRect", "Landroidx/compose/ui/geometry/RoundRect;", "tmpTouchPointPath", "usePathForClip", "clipToOutline", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "isInOutline", "position", "isInOutline-k-4lQ0M", "(J)Z", "update", "update-uvyYCjk", "(J)V", "alpha", "elevation", "updateCache", "updateCacheWithPath", "composePath", "updateCacheWithRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "updateCacheWithRoundRect", "roundRect", "isSameBounds", "offset", "radius", "isSameBounds-4L21HEs", "(Landroidx/compose/ui/geometry/RoundRect;JJF)Z", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,356:1\n1#2:357\n35#3,5:358\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n330#1:358,5\n*E\n"})
/* loaded from: classes.dex */
public final class OutlineResolver {
    private boolean cacheIsDirty;
    private final Outline cachedOutline;
    private Path cachedRrectPath;
    private androidx.compose.p006ui.graphics.Outline calculatedOutline;
    private Density density;
    private boolean isSupportedOutline;
    private LayoutDirection layoutDirection;
    private boolean outlineNeeded;
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    private Shape shape;
    private long size;
    private Path tmpOpPath;
    private Path tmpPath;
    private RoundRect tmpRoundRect;
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.density = density;
        this.isSupportedOutline = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        Size.Companion companion = Size.INSTANCE;
        this.size = companion.m9023getZeroNHjbRc();
        this.shape = RectangleShapeKt.getRectangleShape();
        this.rectTopLeft = Offset.INSTANCE.m8961getZeroF1C5BW0();
        this.rectSize = companion.m9023getZeroNHjbRc();
        this.layoutDirection = LayoutDirection.Ltr;
    }

    /* renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m10899isSameBounds4L21HEs(RoundRect roundRect, long j4, long j5, float f4) {
        if (roundRect == null || !RoundRectKt.isSimple(roundRect)) {
            return false;
        }
        if (!(roundRect.getLeft() == Offset.m8945getXimpl(j4))) {
            return false;
        }
        if (!(roundRect.getTop() == Offset.m8946getYimpl(j4))) {
            return false;
        }
        if (!(roundRect.getRight() == Offset.m8945getXimpl(j4) + Size.m9014getWidthimpl(j5))) {
            return false;
        }
        if (roundRect.getBottom() == Offset.m8946getYimpl(j4) + Size.m9011getHeightimpl(j5)) {
            return (CornerRadius.m8920getXimpl(roundRect.m8995getTopLeftCornerRadiuskKHJgLs()) > f4 ? 1 : (CornerRadius.m8920getXimpl(roundRect.m8995getTopLeftCornerRadiuskKHJgLs()) == f4 ? 0 : -1)) == 0;
        }
        return false;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.INSTANCE.m8961getZeroF1C5BW0();
            long j4 = this.size;
            this.rectSize = j4;
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            if (!this.outlineNeeded || Size.m9014getWidthimpl(j4) <= 0.0f || Size.m9011getHeightimpl(this.size) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            androidx.compose.p006ui.graphics.Outline outlineMo7110createOutlinePq9zytI = this.shape.mo7110createOutlinePq9zytI(this.size, this.layoutDirection, this.density);
            this.calculatedOutline = outlineMo7110createOutlinePq9zytI;
            if (outlineMo7110createOutlinePq9zytI instanceof Outline.Rectangle) {
                updateCacheWithRect(((Outline.Rectangle) outlineMo7110createOutlinePq9zytI).getRect());
            } else if (outlineMo7110createOutlinePq9zytI instanceof Outline.Rounded) {
                updateCacheWithRoundRect(((Outline.Rounded) outlineMo7110createOutlinePq9zytI).getRoundRect());
            } else if (outlineMo7110createOutlinePq9zytI instanceof Outline.Generic) {
                updateCacheWithPath(((Outline.Generic) outlineMo7110createOutlinePq9zytI).getPath());
            }
        }
    }

    private final void updateCacheWithPath(Path composePath) {
        if (Build.VERSION.SDK_INT > 28 || composePath.isConvex()) {
            android.graphics.Outline outline = this.cachedOutline;
            if (!(composePath instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((AndroidPath) composePath).getInternalPath());
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = composePath;
    }

    private final void updateCacheWithRect(Rect rect) {
        this.rectTopLeft = OffsetKt.Offset(rect.getLeft(), rect.getTop());
        this.rectSize = SizeKt.Size(rect.getWidth(), rect.getHeight());
        this.cachedOutline.setRect(MathKt__MathJVMKt.roundToInt(rect.getLeft()), MathKt__MathJVMKt.roundToInt(rect.getTop()), MathKt__MathJVMKt.roundToInt(rect.getRight()), MathKt__MathJVMKt.roundToInt(rect.getBottom()));
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        float fM8920getXimpl = CornerRadius.m8920getXimpl(roundRect.m8995getTopLeftCornerRadiuskKHJgLs());
        this.rectTopLeft = OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
        this.rectSize = SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
        if (RoundRectKt.isSimple(roundRect)) {
            this.cachedOutline.setRoundRect(MathKt__MathJVMKt.roundToInt(roundRect.getLeft()), MathKt__MathJVMKt.roundToInt(roundRect.getTop()), MathKt__MathJVMKt.roundToInt(roundRect.getRight()), MathKt__MathJVMKt.roundToInt(roundRect.getBottom()), fM8920getXimpl);
            this.roundedCornerRadius = fM8920getXimpl;
            return;
        }
        Path Path = this.cachedRrectPath;
        if (Path == null) {
            Path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = Path;
        }
        Path.reset();
        Path.addRoundRect(roundRect);
        updateCacheWithPath(Path);
    }

    public final void clipToOutline(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path clipPath = getClipPath();
        if (clipPath != null) {
            AbstractC1291c1.m387m(canvas, clipPath, 0, 2, null);
            return;
        }
        float f4 = this.roundedCornerRadius;
        if (f4 <= 0.0f) {
            AbstractC1291c1.m388n(canvas, Offset.m8945getXimpl(this.rectTopLeft), Offset.m8946getYimpl(this.rectTopLeft), Offset.m8945getXimpl(this.rectTopLeft) + Size.m9014getWidthimpl(this.rectSize), Offset.m8946getYimpl(this.rectTopLeft) + Size.m9011getHeightimpl(this.rectSize), 0, 16, null);
            return;
        }
        Path Path = this.tmpPath;
        RoundRect roundRect = this.tmpRoundRect;
        if (Path == null || !m10899isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f4)) {
            RoundRect roundRectM8999RoundRectgG7oq9Y = RoundRectKt.m8999RoundRectgG7oq9Y(Offset.m8945getXimpl(this.rectTopLeft), Offset.m8946getYimpl(this.rectTopLeft), Offset.m8945getXimpl(this.rectTopLeft) + Size.m9014getWidthimpl(this.rectSize), Offset.m8946getYimpl(this.rectTopLeft) + Size.m9011getHeightimpl(this.rectSize), CornerRadiusKt.CornerRadius$default(this.roundedCornerRadius, 0.0f, 2, null));
            if (Path == null) {
                Path = AndroidPath_androidKt.Path();
            } else {
                Path.reset();
            }
            Path.addRoundRect(roundRectM8999RoundRectgG7oq9Y);
            this.tmpRoundRect = roundRectM8999RoundRectgG7oq9Y;
            this.tmpPath = Path;
        }
        AbstractC1291c1.m387m(canvas, Path, 0, 2, null);
    }

    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    public final android.graphics.Outline getOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    /* renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m10900isInOutlinek4lQ0M(long position) {
        androidx.compose.p006ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.calculatedOutline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Offset.m8945getXimpl(position), Offset.m8946getYimpl(position), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final boolean update(Shape shape, float alpha, boolean clipToOutline, float elevation, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.cachedOutline.setAlpha(alpha);
        boolean z3 = !Intrinsics.areEqual(this.shape, shape);
        if (z3) {
            this.shape = shape;
            this.cacheIsDirty = true;
        }
        boolean z4 = clipToOutline || elevation > 0.0f;
        if (this.outlineNeeded != z4) {
            this.outlineNeeded = z4;
            this.cacheIsDirty = true;
        }
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            this.cacheIsDirty = true;
        }
        if (!Intrinsics.areEqual(this.density, density)) {
            this.density = density;
            this.cacheIsDirty = true;
        }
        return z3;
    }

    /* renamed from: update-uvyYCjk, reason: not valid java name */
    public final void m10901updateuvyYCjk(long size) {
        if (Size.m9010equalsimpl0(this.size, size)) {
            return;
        }
        this.size = size;
        this.cacheIsDirty = true;
    }
}
